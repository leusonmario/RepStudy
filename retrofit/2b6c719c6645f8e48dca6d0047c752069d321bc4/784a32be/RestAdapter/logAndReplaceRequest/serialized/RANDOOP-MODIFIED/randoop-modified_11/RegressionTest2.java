import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.Profiler profiler40 = null;
        builder14.profiler = profiler40;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = builder42.serializedObjectSupporter;
        retrofit.RestAdapter.Log log44 = retrofit.RestAdapter.Log.NONE;
        builder42.log = log44;
        builder14.log = log44;
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        java.lang.String str48 = serializedObjectSupporter47.deserializeObjectString9();
        retrofit.Server server49 = serializedObjectSupporter47.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter47.deserializeObjectConverter6();
        java.lang.String str51 = serializedObjectSupporter47.deserializeObjectString2();
        java.lang.String str52 = serializedObjectSupporter47.deserializeObjectString4();
        java.lang.String str53 = serializedObjectSupporter47.deserializeObjectString4();
        retrofit.client.Response response54 = serializedObjectSupporter47.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter47.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder56 = builder14.setConverter((retrofit.converter.Converter) gsonConverter55);
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        java.lang.String str58 = serializedObjectSupporter57.deserializeObjectString9();
        retrofit.Server server59 = serializedObjectSupporter57.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter57.deserializeObjectConverter6();
        java.lang.String str61 = serializedObjectSupporter57.deserializeObjectString2();
        builder56.serializedObjectSupporter = serializedObjectSupporter57;
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter57.deserializeObjectConverter7();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(server49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Retrofit-Idle" + "'", str51, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "http://example.com/" + "'", str58, "http://example.com/");
        org.junit.Assert.assertNotNull(server59);
        org.junit.Assert.assertNotNull(gsonConverter60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Retrofit-Idle" + "'", str61, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter63);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder13 = builder8.setConverter((retrofit.converter.Converter) gsonConverter12);
        builder8.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder8.httpExecutor = executor15;
        retrofit.client.Client.Provider provider17 = builder8.getclientProvider();
        builder0.setclientProvider(provider17);
        java.util.concurrent.Executor executor19 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider20 = builder0.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(provider17);
        org.junit.Assert.assertNotNull(executor19);
        org.junit.Assert.assertNotNull(provider20);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        retrofit.RestAdapter.LogLevel logLevel92 = restAdapter91.logLevel;
        retrofit.RestAdapter.Log log93 = restAdapter91.log;
        java.lang.String str94 = restAdapter91.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler95 = restAdapter91.getprofiler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel92 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel92.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(log93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Retrofit-Idle" + "'", str94, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler95);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.Server server12 = new retrofit.Server("Retrofit-", "http://example.com/");
        java.lang.String str13 = server12.apiUrl;
        builder0.server = server12;
        java.util.concurrent.Executor executor15 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log16 = builder0.log;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(executor8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str3 = server2.getapiUrl();
        java.lang.String str4 = server2.apiUrl;
        java.lang.String str5 = server2.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        java.lang.String str25 = restAdapter20.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log26 = restAdapter20.log;
        retrofit.Server server27 = restAdapter20.server;
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter20.logLevel;
        retrofit.Server server29 = restAdapter20.server;
        java.lang.String str30 = server29.getapiUrl();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-" + "'", str25, "Retrofit-");
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-" + "'", str30, "Retrofit-");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.client.Client.Provider provider17 = restAdapter12.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter12.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter12.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter12.logLevel;
        retrofit.converter.Converter converter21 = restAdapter12.getconverter();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(converter21);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.converter.Converter converter21 = restAdapter20.getconverter();
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter20.logLevel;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter20.new RestHandler();
        java.util.List<retrofit.client.Header> headerList32 = null;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        java.util.List<retrofit.client.Header> headerList35 = request34.getHeaders();
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("http://example.com/", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "Retrofit-", headerList35, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList35, typedOutput40);
        java.lang.String str42 = request41.getUrl();
        java.util.List<retrofit.client.Header> headerList43 = request41.getHeaders();
        java.lang.String str44 = request41.getMethod();
        retrofit.client.Request request45 = restAdapter20.logAndReplaceRequest(request41);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(converter21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Retrofit-Idle" + "'", str42, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(request45);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("http://example.com/", "", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "Retrofit-", headerList11, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("default", "http://example.com/", headerList11, typedOutput16);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.ErrorHandler errorHandler23 = restAdapter20.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter20.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter20.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter20.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter20.new RestHandler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server7 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.Class class9 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter10 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.List<retrofit.client.Header> headerList14 = null;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "Retrofit-", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("http://example.com", "default", headerList17, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-Idle", "", headerList17, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.String str29 = request27.getMethod();
        java.util.List<retrofit.client.Header> headerList30 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("default", "default", headerList30, typedOutput31);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(headerList30);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler8 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response9 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(errorHandler8);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("default", "default", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("Retrofit-", "hi!", headerList13, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", headerList13, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restHandler13.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        retrofit.Profiler profiler9 = null;
        builder8.profiler = profiler9;
        retrofit.RequestInterceptor requestInterceptor11 = builder8.requestInterceptor;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor11);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("Retrofit-", "default", headerList2, typedOutput3);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.client.Client.Provider provider17 = restAdapter12.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter12.serializedObjectSupporter;
        retrofit.client.Client.Provider provider20 = restAdapter12.clientProvider;
        retrofit.Server server21 = restAdapter12.getserver();
        retrofit.RestAdapter.Log log22 = restAdapter12.log;
        retrofit.converter.Converter converter23 = restAdapter12.converter;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNull(log22);
        org.junit.Assert.assertNull(converter23);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        retrofit.RestAdapter.LogLevel logLevel92 = restAdapter91.logLevel;
        retrofit.RestAdapter.Log log93 = restAdapter91.log;
        retrofit.RequestInterceptor requestInterceptor94 = restAdapter91.requestInterceptor;
        java.util.concurrent.Executor executor95 = restAdapter91.gethttpExecutor();
        java.lang.String str96 = restAdapter91.getTHREAD_PREFIX();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel92 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel92.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(log93);
        org.junit.Assert.assertNotNull(requestInterceptor94);
        org.junit.Assert.assertNull(executor95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Retrofit-" + "'", str96, "Retrofit-");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.Profiler profiler17 = restAdapter12.profiler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter12.getLogLevel();
        retrofit.ErrorHandler errorHandler19 = restAdapter12.errorHandler;
        retrofit.Server server22 = new retrofit.Server("", "");
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
        java.lang.String str33 = restAdapter32.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor34 = restAdapter32.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler35 = restAdapter32.new RestHandler();
        retrofit.client.Client.Provider provider36 = restAdapter32.getclientProvider();
        retrofit.Profiler profiler37 = restAdapter32.profiler;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter32.logLevel;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = builder39.serializedObjectSupporter;
        retrofit.Server server43 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider44 = null;
        java.util.concurrent.Executor executor45 = null;
        java.util.concurrent.Executor executor46 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        java.lang.String str48 = serializedObjectSupporter47.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor49 = serializedObjectSupporter47.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString9();
        retrofit.Server server52 = serializedObjectSupporter50.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter50.deserializeObjectConverter6();
        retrofit.Profiler profiler54 = null;
        retrofit.ErrorHandler errorHandler55 = null;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = builder56.serializedObjectSupporter;
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        builder56.log = log58;
        retrofit.RestAdapter.LogLevel logLevel60 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter61 = new retrofit.RestAdapter(server43, provider44, executor45, executor46, requestInterceptor49, (retrofit.converter.Converter) gsonConverter53, profiler54, errorHandler55, log58, logLevel60);
        retrofit.RestAdapter.Builder builder62 = builder39.setRequestInterceptor(requestInterceptor49);
        retrofit.Server server63 = builder39.server;
        retrofit.RestAdapter.LogLevel logLevel64 = builder39.logLevel;
        restAdapter32.logLevel = logLevel64;
        restAdapter12.logLevel = logLevel64;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Retrofit-Idle" + "'", str33, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor34);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNull(profiler37);
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(server52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNull(serializedObjectSupporter57);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNull(server63);
        org.junit.Assert.assertTrue("'" + logLevel64 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel64.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        java.lang.Class<?> wildcardClass16 = restAdapter10.getClass();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.ErrorHandler errorHandler23 = restAdapter20.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter20.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor28 = serializedObjectSupporter26.deserializeObjectRequestInterceptor1();
        retrofit.ErrorHandler errorHandler29 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        retrofit.client.Response response30 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str31 = serializedObjectSupporter26.deserializeObjectString2();
        retrofit.client.Response response32 = serializedObjectSupporter26.deserializeObjectResponse3();
        retrofit.client.Response response34 = restAdapter20.logAndReplaceResponse("Retrofit-", response32, (-1L));
        retrofit.client.Client.Provider provider35 = restAdapter20.clientProvider;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor28);
        org.junit.Assert.assertNotNull(errorHandler29);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-Idle" + "'", str31, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(provider35);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        retrofit.RestAdapter.LogLevel logLevel92 = restAdapter91.logLevel;
        retrofit.Server server93 = restAdapter91.getserver();
        retrofit.RestAdapter.RestHandler restHandler94 = restAdapter91.new RestHandler();
        retrofit.RestAdapter.Log log95 = restAdapter91.log;
        retrofit.RestAdapter.LogLevel logLevel96 = restAdapter91.logLevel;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel92 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel92.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server93);
        org.junit.Assert.assertNotNull(log95);
        org.junit.Assert.assertTrue("'" + logLevel96 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel96.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("http://example.com/");
        retrofit.Server server44 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider45 = null;
        java.util.concurrent.Executor executor46 = null;
        java.util.concurrent.Executor executor47 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor50 = serializedObjectSupporter48.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString9();
        retrofit.Server server53 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter51.deserializeObjectConverter6();
        retrofit.Profiler profiler55 = null;
        retrofit.ErrorHandler errorHandler56 = null;
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = builder57.serializedObjectSupporter;
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        builder57.log = log59;
        retrofit.RestAdapter.LogLevel logLevel61 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter62 = new retrofit.RestAdapter(server44, provider45, executor46, executor47, requestInterceptor50, (retrofit.converter.Converter) gsonConverter54, profiler55, errorHandler56, log59, logLevel61);
        retrofit.RestAdapter.Builder builder63 = builder41.setLog(log59);
        retrofit.RestAdapter.Builder builder65 = builder63.setServer("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertNull(serializedObjectSupporter58);
        org.junit.Assert.assertNotNull(log59);
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log2;
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.Server server9 = new retrofit.Server("", "");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer(server9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        retrofit.Server server14 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder16 = builder11.setConverter((retrofit.converter.Converter) gsonConverter15);
        builder11.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        retrofit.Server server20 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter6();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString2();
        java.lang.String str23 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler24 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder25 = builder11.setErrorHandler(errorHandler24);
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder26.serializedObjectSupporter;
        retrofit.Server server30 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor36 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString9();
        retrofit.Server server39 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter37.deserializeObjectConverter6();
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = builder43.serializedObjectSupporter;
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        builder43.log = log45;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server30, provider31, executor32, executor33, requestInterceptor36, (retrofit.converter.Converter) gsonConverter40, profiler41, errorHandler42, log45, logLevel47);
        retrofit.RestAdapter.Builder builder49 = builder26.setRequestInterceptor(requestInterceptor36);
        builder25.requestInterceptor = requestInterceptor36;
        retrofit.RestAdapter.Builder builder51 = builder10.setRequestInterceptor(requestInterceptor36);
        builder51.ensureSaneDefaults();
        retrofit.client.Client.Provider provider53 = builder51.getclientProvider();
        builder51.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel55 = builder51.logLevel;
        boolean boolean56 = logLevel55.log();
        boolean boolean57 = logLevel55.log();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNull(serializedObjectSupporter44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(provider53);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log2;
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.Server server9 = new retrofit.Server("", "");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer(server9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        retrofit.Server server14 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder16 = builder11.setConverter((retrofit.converter.Converter) gsonConverter15);
        builder11.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        retrofit.Server server20 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter6();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString2();
        java.lang.String str23 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler24 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder25 = builder11.setErrorHandler(errorHandler24);
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder26.serializedObjectSupporter;
        retrofit.Server server30 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor36 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString9();
        retrofit.Server server39 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter37.deserializeObjectConverter6();
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = builder43.serializedObjectSupporter;
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        builder43.log = log45;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server30, provider31, executor32, executor33, requestInterceptor36, (retrofit.converter.Converter) gsonConverter40, profiler41, errorHandler42, log45, logLevel47);
        retrofit.RestAdapter.Builder builder49 = builder26.setRequestInterceptor(requestInterceptor36);
        builder25.requestInterceptor = requestInterceptor36;
        retrofit.RestAdapter.Builder builder51 = builder10.setRequestInterceptor(requestInterceptor36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        retrofit.Server server54 = serializedObjectSupporter52.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter6();
        java.lang.String str56 = serializedObjectSupporter52.deserializeObjectString2();
        java.lang.String str57 = serializedObjectSupporter52.deserializeObjectString4();
        java.lang.String str58 = serializedObjectSupporter52.deserializeObjectString2();
        builder10.serializedObjectSupporter = serializedObjectSupporter52;
        retrofit.client.Client.Provider provider60 = builder10.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNull(serializedObjectSupporter44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(server54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Retrofit-Idle" + "'", str56, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "http://example.com/" + "'", str57, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Retrofit-Idle" + "'", str58, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider60);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        builder14.ensureSaneDefaults();
        java.util.concurrent.Executor executor16 = builder14.getcallbackExecutor();
        builder14.ensureSaneDefaults();
        java.util.concurrent.Executor executor18 = builder14.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(executor16);
        org.junit.Assert.assertNotNull(executor18);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.Server server7 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder9 = builder4.setConverter((retrofit.converter.Converter) gsonConverter8);
        builder4.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter11.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder18 = builder4.setErrorHandler(errorHandler17);
        builder18.ensureSaneDefaults();
        java.util.concurrent.Executor executor20 = builder18.getcallbackExecutor();
        builder0.httpExecutor = executor20;
        retrofit.RequestInterceptor requestInterceptor22 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = builder23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        builder23.log = log25;
        retrofit.Server server27 = builder23.server;
        java.util.concurrent.Executor executor28 = null;
        builder23.httpExecutor = executor28;
        retrofit.Server server32 = new retrofit.Server("", "");
        retrofit.RestAdapter.Builder builder33 = builder23.setServer(server32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder36 = builder34.setLogLevel(logLevel35);
        retrofit.converter.Converter converter37 = builder36.converter;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = builder38.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler40 = builder38.errorHandler;
        builder38.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler42 = builder38.errorHandler;
        retrofit.RestAdapter.Builder builder43 = builder36.setErrorHandler(errorHandler42);
        retrofit.RestAdapter.Builder builder44 = builder33.setErrorHandler(errorHandler42);
        retrofit.RestAdapter.Builder builder45 = builder0.setErrorHandler(errorHandler42);
        builder45.ensureSaneDefaults();
        retrofit.client.Client.Provider provider47 = builder45.clientProvider;
        retrofit.RestAdapter.Log log48 = builder45.log;
        java.util.concurrent.Executor executor49 = builder45.getcallbackExecutor();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(executor20);
        org.junit.Assert.assertNotNull(requestInterceptor22);
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(converter37);
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNull(errorHandler40);
        org.junit.Assert.assertNotNull(errorHandler42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(provider47);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(executor49);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        java.util.concurrent.Executor executor17 = restAdapter12.gethttpExecutor();
        retrofit.Server server18 = restAdapter12.getserver();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter12.getLogLevel();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter12.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        java.lang.String str14 = restAdapter12.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter12.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        java.util.concurrent.Executor executor92 = restAdapter91.httpExecutor;
        retrofit.converter.Converter converter93 = restAdapter91.converter;
        retrofit.Server server94 = restAdapter91.server;
        java.lang.String str95 = server94.getDEFAULT_NAME();
        java.lang.String str96 = server94.name;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor92);
        org.junit.Assert.assertNotNull(converter93);
        org.junit.Assert.assertNotNull(server94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "default" + "'", str95, "default");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "default" + "'", str96, "default");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        retrofit.Server server8 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor14 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        retrofit.Server server17 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter6();
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = builder21.serializedObjectSupporter;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        builder21.log = log23;
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter26 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor14, (retrofit.converter.Converter) gsonConverter18, profiler19, errorHandler20, log23, logLevel25);
        retrofit.Server server27 = restAdapter26.server;
        retrofit.RestAdapter.Log log28 = restAdapter26.log;
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter26.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter26.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.Server server34 = serializedObjectSupporter32.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter32.deserializeObjectConverter6();
        java.lang.String str36 = serializedObjectSupporter32.deserializeObjectString2();
        java.lang.String str37 = serializedObjectSupporter32.deserializeObjectString4();
        java.lang.String str38 = serializedObjectSupporter32.deserializeObjectString4();
        retrofit.client.Response response39 = serializedObjectSupporter32.deserializeObjectResponse2();
        retrofit.client.Response response41 = restAdapter26.logAndReplaceResponse("", response39, (long) '#');
        retrofit.RestAdapter.LogLevel logLevel42 = restAdapter26.logLevel;
        retrofit.RestAdapter.Builder builder43 = builder0.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString9();
        retrofit.Server server47 = serializedObjectSupporter45.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter45.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder49 = builder44.setConverter((retrofit.converter.Converter) gsonConverter48);
        builder44.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString9();
        retrofit.Server server53 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter51.deserializeObjectConverter6();
        java.lang.String str55 = serializedObjectSupporter51.deserializeObjectString2();
        java.lang.String str56 = serializedObjectSupporter51.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler57 = serializedObjectSupporter51.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder58 = builder44.setErrorHandler(errorHandler57);
        builder58.ensureSaneDefaults();
        java.util.concurrent.Executor executor60 = builder58.getcallbackExecutor();
        java.util.concurrent.Executor executor61 = builder58.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor62 = builder58.requestInterceptor;
        retrofit.client.Client.Provider provider63 = builder58.getclientProvider();
        retrofit.RestAdapter.Builder builder64 = builder43.setClient(provider63);
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter66 = builder64.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://example.com/" + "'", str46, "http://example.com/");
        org.junit.Assert.assertNotNull(server47);
        org.junit.Assert.assertNotNull(gsonConverter48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Retrofit-Idle" + "'", str55, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(executor60);
        org.junit.Assert.assertNotNull(executor61);
        org.junit.Assert.assertNotNull(requestInterceptor62);
        org.junit.Assert.assertNotNull(provider63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("default", "default", headerList9, typedOutput10);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-Idle", headerList9, typedOutput12);
        java.lang.String str14 = request13.getMethod();
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler6 = builder4.errorHandler;
        builder4.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder13 = builder8.setConverter((retrofit.converter.Converter) gsonConverter12);
        builder8.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        retrofit.Server server17 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter6();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString2();
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter15.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder22 = builder8.setErrorHandler(errorHandler21);
        builder22.ensureSaneDefaults();
        java.util.concurrent.Executor executor24 = builder22.getcallbackExecutor();
        builder4.httpExecutor = executor24;
        builder0.httpExecutor = executor24;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = builder27.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler29 = builder27.errorHandler;
        builder27.ensureSaneDefaults();
        retrofit.RestAdapter.Log log31 = builder27.log;
        retrofit.Profiler profiler32 = null;
        builder27.profiler = profiler32;
        retrofit.client.Client.Provider provider34 = builder27.getclientProvider();
        retrofit.RestAdapter.Builder builder35 = builder0.setClient(provider34);
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = builder36.serializedObjectSupporter;
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        builder36.log = log38;
        retrofit.Server server40 = builder36.server;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter42 = builder41.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString9();
        retrofit.Server server45 = serializedObjectSupporter43.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter43.deserializeObjectConverter6();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString2();
        java.lang.String str48 = serializedObjectSupporter43.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler49 = serializedObjectSupporter43.deserializeObjectErrorHandler1();
        builder41.errorHandler = errorHandler49;
        retrofit.RestAdapter.Builder builder51 = builder36.setErrorHandler(errorHandler49);
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = builder53.serializedObjectSupporter;
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        builder53.log = log55;
        log55.log("default");
        builder52.log = log55;
        builder51.log = log55;
        retrofit.RestAdapter.Builder builder61 = builder35.setLog(log55);
        retrofit.Server server64 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider65 = null;
        java.util.concurrent.Executor executor66 = null;
        java.util.concurrent.Executor executor67 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        java.lang.String str69 = serializedObjectSupporter68.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor70 = serializedObjectSupporter68.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter71 = new retrofit.SerializedObjectSupporter();
        java.lang.String str72 = serializedObjectSupporter71.deserializeObjectString9();
        retrofit.Server server73 = serializedObjectSupporter71.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter74 = serializedObjectSupporter71.deserializeObjectConverter6();
        retrofit.Profiler profiler75 = null;
        retrofit.ErrorHandler errorHandler76 = null;
        retrofit.RestAdapter.Builder builder77 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = builder77.serializedObjectSupporter;
        retrofit.RestAdapter.Log log79 = retrofit.RestAdapter.Log.NONE;
        builder77.log = log79;
        retrofit.RestAdapter.LogLevel logLevel81 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter82 = new retrofit.RestAdapter(server64, provider65, executor66, executor67, requestInterceptor70, (retrofit.converter.Converter) gsonConverter74, profiler75, errorHandler76, log79, logLevel81);
        retrofit.Server server83 = restAdapter82.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter84 = restAdapter82.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel85 = restAdapter82.logLevel;
        retrofit.RestAdapter.LogLevel logLevel86 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter82.setLogLevel(logLevel86);
        builder61.logLevel = logLevel86;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(executor24);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(serializedObjectSupporter37);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNull(server40);
        org.junit.Assert.assertNull(converter42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Retrofit-Idle" + "'", str47, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(serializedObjectSupporter54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "http://example.com/" + "'", str69, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "http://example.com/" + "'", str72, "http://example.com/");
        org.junit.Assert.assertNotNull(server73);
        org.junit.Assert.assertNotNull(gsonConverter74);
        org.junit.Assert.assertNull(serializedObjectSupporter78);
        org.junit.Assert.assertNotNull(log79);
        org.junit.Assert.assertTrue("'" + logLevel81 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel81.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server83);
        org.junit.Assert.assertNull(serializedObjectSupporter84);
        org.junit.Assert.assertTrue("'" + logLevel85 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel85.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel86 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel86.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("default", "default", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "http://example.com", headerList24, typedOutput27);
        java.lang.String str29 = request28.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request30 = restAdapter10.logAndReplaceRequest(request28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com" + "'", str29, "http://example.com");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter11 = builder10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        retrofit.Server server14 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter6();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler18 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        builder10.errorHandler = errorHandler18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString9();
        retrofit.Server server23 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter21.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder25 = builder20.setConverter((retrofit.converter.Converter) gsonConverter24);
        builder20.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        java.lang.String str31 = serializedObjectSupporter27.deserializeObjectString2();
        java.lang.String str32 = serializedObjectSupporter27.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler33 = serializedObjectSupporter27.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder34 = builder20.setErrorHandler(errorHandler33);
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = builder35.serializedObjectSupporter;
        retrofit.Server server39 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider40 = null;
        java.util.concurrent.Executor executor41 = null;
        java.util.concurrent.Executor executor42 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor45 = serializedObjectSupporter43.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        java.lang.String str47 = serializedObjectSupporter46.deserializeObjectString9();
        retrofit.Server server48 = serializedObjectSupporter46.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter6();
        retrofit.Profiler profiler50 = null;
        retrofit.ErrorHandler errorHandler51 = null;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = builder52.serializedObjectSupporter;
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        builder52.log = log54;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server39, provider40, executor41, executor42, requestInterceptor45, (retrofit.converter.Converter) gsonConverter49, profiler50, errorHandler51, log54, logLevel56);
        retrofit.RestAdapter.Builder builder58 = builder35.setRequestInterceptor(requestInterceptor45);
        builder34.requestInterceptor = requestInterceptor45;
        builder10.requestInterceptor = requestInterceptor45;
        retrofit.RequestInterceptor requestInterceptor61 = builder10.requestInterceptor;
        retrofit.RestAdapter.Builder builder62 = builder0.setRequestInterceptor(requestInterceptor61);
        retrofit.client.Client.Provider provider63 = builder62.clientProvider;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.Server server68 = builder64.server;
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter70 = builder69.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter71 = new retrofit.SerializedObjectSupporter();
        java.lang.String str72 = serializedObjectSupporter71.deserializeObjectString9();
        retrofit.Server server73 = serializedObjectSupporter71.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter74 = serializedObjectSupporter71.deserializeObjectConverter6();
        java.lang.String str75 = serializedObjectSupporter71.deserializeObjectString2();
        java.lang.String str76 = serializedObjectSupporter71.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler77 = serializedObjectSupporter71.deserializeObjectErrorHandler1();
        builder69.errorHandler = errorHandler77;
        retrofit.RestAdapter.Builder builder79 = builder64.setErrorHandler(errorHandler77);
        builder62.errorHandler = errorHandler77;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-Idle" + "'", str31, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(serializedObjectSupporter36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "http://example.com/" + "'", str47, "http://example.com/");
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNull(serializedObjectSupporter53);
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(requestInterceptor61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNull(provider63);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNull(server68);
        org.junit.Assert.assertNull(converter70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "http://example.com/" + "'", str72, "http://example.com/");
        org.junit.Assert.assertNotNull(server73);
        org.junit.Assert.assertNotNull(gsonConverter74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Retrofit-Idle" + "'", str75, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "http://example.com/" + "'", str76, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler77);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        restAdapter12.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.converter.Converter converter16 = restAdapter12.converter;
        retrofit.Server server17 = restAdapter12.getserver();
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("http://example.com", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request34 = restAdapter12.logAndReplaceRequest(request32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.List<retrofit.client.Header> headerList16 = null;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com/", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "Retrofit-", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList19, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com", "default", headerList19, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com", "Retrofit-", headerList19, typedOutput32);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("http://example.com/", "default", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.Profiler profiler15 = restAdapter12.profiler;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter12.getrequestInterceptor();
        retrofit.client.Client.Provider provider17 = restAdapter12.clientProvider;
        retrofit.converter.Converter converter18 = restAdapter12.converter;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter12.new RestHandler();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        builder23.logLevel = logLevel24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        java.util.concurrent.Executor executor33 = null;
        builder26.httpExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder26.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = builder23.setClient(provider35);
        retrofit.RestAdapter.Builder builder38 = builder23.setServer("default");
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString9();
        retrofit.Server server42 = serializedObjectSupporter40.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter40.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder44 = builder39.setConverter((retrofit.converter.Converter) gsonConverter43);
        builder39.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        java.lang.String str47 = serializedObjectSupporter46.deserializeObjectString9();
        retrofit.Server server48 = serializedObjectSupporter46.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter6();
        java.lang.String str50 = serializedObjectSupporter46.deserializeObjectString2();
        java.lang.String str51 = serializedObjectSupporter46.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler52 = serializedObjectSupporter46.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder53 = builder39.setErrorHandler(errorHandler52);
        builder53.ensureSaneDefaults();
        java.util.concurrent.Executor executor55 = builder53.getcallbackExecutor();
        builder53.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder62 = builder57.setConverter((retrofit.converter.Converter) gsonConverter61);
        builder57.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = new retrofit.SerializedObjectSupporter();
        java.lang.String str65 = serializedObjectSupporter64.deserializeObjectString9();
        retrofit.Server server66 = serializedObjectSupporter64.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter64.deserializeObjectConverter6();
        java.lang.String str68 = serializedObjectSupporter64.deserializeObjectString2();
        java.lang.String str69 = serializedObjectSupporter64.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler70 = serializedObjectSupporter64.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder71 = builder57.setErrorHandler(errorHandler70);
        builder71.ensureSaneDefaults();
        java.util.concurrent.Executor executor73 = builder71.getcallbackExecutor();
        builder53.sethttpExecutor(executor73);
        builder38.setcallbackExecutor(executor73);
        java.util.concurrent.Executor executor76 = builder38.callbackExecutor;
        retrofit.RestAdapter.Builder builder77 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = new retrofit.SerializedObjectSupporter();
        java.lang.String str79 = serializedObjectSupporter78.deserializeObjectString9();
        retrofit.Server server80 = serializedObjectSupporter78.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter81 = serializedObjectSupporter78.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder82 = builder77.setConverter((retrofit.converter.Converter) gsonConverter81);
        builder77.ensureSaneDefaults();
        java.util.concurrent.Executor executor84 = null;
        builder77.httpExecutor = executor84;
        retrofit.client.Client.Provider provider86 = builder77.getclientProvider();
        retrofit.RestAdapter.Builder builder87 = builder38.setClient(provider86);
        retrofit.SerializedObjectSupporter serializedObjectSupporter88 = new retrofit.SerializedObjectSupporter();
        java.lang.String str89 = serializedObjectSupporter88.deserializeObjectString9();
        retrofit.Server server90 = serializedObjectSupporter88.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter91 = serializedObjectSupporter88.deserializeObjectConverter6();
        java.lang.String str92 = serializedObjectSupporter88.deserializeObjectString2();
        java.lang.String str93 = serializedObjectSupporter88.deserializeObjectString4();
        java.lang.String str94 = serializedObjectSupporter88.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter95 = serializedObjectSupporter88.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter96 = serializedObjectSupporter88.deserializeObjectConverter3();
        builder38.serializedObjectSupporter = serializedObjectSupporter88;
        java.lang.String str98 = serializedObjectSupporter88.deserializeObjectString6();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "http://example.com/" + "'", str47, "http://example.com/");
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Retrofit-Idle" + "'", str50, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(executor55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "http://example.com/" + "'", str65, "http://example.com/");
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Retrofit-Idle" + "'", str68, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "http://example.com/" + "'", str69, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(executor73);
        org.junit.Assert.assertNotNull(executor76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "http://example.com/" + "'", str79, "http://example.com/");
        org.junit.Assert.assertNotNull(server80);
        org.junit.Assert.assertNotNull(gsonConverter81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(provider86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "http://example.com/" + "'", str89, "http://example.com/");
        org.junit.Assert.assertNotNull(server90);
        org.junit.Assert.assertNotNull(gsonConverter91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Retrofit-Idle" + "'", str92, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "http://example.com/" + "'", str93, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "http://example.com/" + "'", str94, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter95);
        org.junit.Assert.assertNotNull(gsonConverter96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "http://example.com/" + "'", str98, "http://example.com/");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "Retrofit-", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList13, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        java.util.List<retrofit.client.Header> headerList21 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "Retrofit-", headerList21, typedOutput22);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = builder42.serializedObjectSupporter;
        retrofit.Server server46 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider47 = null;
        java.util.concurrent.Executor executor48 = null;
        java.util.concurrent.Executor executor49 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor52 = serializedObjectSupporter50.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString9();
        retrofit.Server server55 = serializedObjectSupporter53.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter56 = serializedObjectSupporter53.deserializeObjectConverter6();
        retrofit.Profiler profiler57 = null;
        retrofit.ErrorHandler errorHandler58 = null;
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = builder59.serializedObjectSupporter;
        retrofit.RestAdapter.Log log61 = retrofit.RestAdapter.Log.NONE;
        builder59.log = log61;
        retrofit.RestAdapter.LogLevel logLevel63 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter64 = new retrofit.RestAdapter(server46, provider47, executor48, executor49, requestInterceptor52, (retrofit.converter.Converter) gsonConverter56, profiler57, errorHandler58, log61, logLevel63);
        retrofit.RestAdapter.Builder builder65 = builder42.setRequestInterceptor(requestInterceptor52);
        retrofit.RestAdapter.LogLevel logLevel66 = retrofit.RestAdapter.LogLevel.BASIC;
        builder65.logLevel = logLevel66;
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        java.lang.String str70 = serializedObjectSupporter69.deserializeObjectString9();
        retrofit.Server server71 = serializedObjectSupporter69.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter69.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder73 = builder68.setConverter((retrofit.converter.Converter) gsonConverter72);
        builder68.ensureSaneDefaults();
        java.util.concurrent.Executor executor75 = null;
        builder68.httpExecutor = executor75;
        retrofit.client.Client.Provider provider77 = builder68.getclientProvider();
        builder65.clientProvider = provider77;
        retrofit.RestAdapter.Builder builder79 = builder41.setClient(provider77);
        retrofit.client.Client client80 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder81 = builder79.setClient(client80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(server55);
        org.junit.Assert.assertNotNull(gsonConverter56);
        org.junit.Assert.assertNull(serializedObjectSupporter60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertTrue("'" + logLevel63 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel63.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + logLevel66 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel66.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(server71);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(provider77);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        java.util.concurrent.Executor executor92 = restAdapter91.httpExecutor;
        retrofit.converter.Converter converter93 = restAdapter91.converter;
        retrofit.Server server94 = restAdapter91.server;
        retrofit.RestAdapter.RestHandler restHandler95 = restAdapter91.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler96 = restAdapter91.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor92);
        org.junit.Assert.assertNotNull(converter93);
        org.junit.Assert.assertNotNull(server94);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter12.requestInterceptor;
        java.lang.String str14 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.Server server15 = restAdapter12.server;
        java.lang.String str16 = restAdapter12.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider17 = restAdapter12.clientProvider;
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter12.requestInterceptor;
        retrofit.client.Client.Provider provider19 = restAdapter12.getclientProvider();
        java.lang.Class<?> wildcardClass20 = restAdapter12.getClass();
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString9();
        retrofit.Server server45 = serializedObjectSupporter43.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter43.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder47 = builder42.setConverter((retrofit.converter.Converter) gsonConverter46);
        builder42.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.Server server51 = serializedObjectSupporter49.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter49.deserializeObjectConverter6();
        java.lang.String str53 = serializedObjectSupporter49.deserializeObjectString2();
        java.lang.String str54 = serializedObjectSupporter49.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler55 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder56 = builder42.setErrorHandler(errorHandler55);
        retrofit.client.Client.Provider provider57 = builder56.clientProvider;
        retrofit.RestAdapter.Builder builder58 = builder41.setClient(provider57);
        retrofit.client.Client.Provider provider59 = builder41.getclientProvider();
        java.util.concurrent.Executor executor60 = builder41.httpExecutor;
        retrofit.Profiler profiler61 = null;
        builder41.profiler = profiler61;
        retrofit.client.Client.Provider provider63 = builder41.getclientProvider();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(server51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Retrofit-Idle" + "'", str53, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(provider57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(provider59);
        org.junit.Assert.assertNotNull(executor60);
        org.junit.Assert.assertNotNull(provider63);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        retrofit.ErrorHandler errorHandler25 = restAdapter20.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter20.new RestHandler();
        retrofit.ErrorHandler errorHandler27 = restAdapter20.geterrorHandler();
        java.lang.Throwable throwable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter20.logException(throwable28, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNull(errorHandler27);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.Profiler profiler15 = restAdapter12.getprofiler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter12.requestInterceptor;
        retrofit.Server server17 = restAdapter12.server;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(server17);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        java.lang.String str25 = restAdapter20.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log26 = restAdapter20.log;
        retrofit.Server server27 = restAdapter20.server;
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter20.logLevel;
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter20.new RestHandler();
        retrofit.Server server30 = restAdapter20.getserver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-" + "'", str25, "Retrofit-");
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server30);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.Profiler profiler22 = restAdapter20.profiler;
        java.util.concurrent.Executor executor23 = restAdapter20.getcallbackExecutor();
        java.util.concurrent.Executor executor24 = restAdapter20.gethttpExecutor();
        java.lang.Throwable throwable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter20.logException(throwable25, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(executor24);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class9 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        retrofit.ErrorHandler errorHandler25 = restAdapter20.errorHandler;
        java.util.concurrent.Executor executor26 = restAdapter20.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter20.new RestHandler();
        retrofit.ErrorHandler errorHandler28 = restAdapter20.errorHandler;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(errorHandler28);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.Server server8 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder10 = builder5.setConverter((retrofit.converter.Converter) gsonConverter9);
        builder5.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        retrofit.Server server14 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter6();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler18 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder19 = builder5.setErrorHandler(errorHandler18);
        builder19.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString9();
        retrofit.Server server24 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder26 = builder21.setConverter((retrofit.converter.Converter) gsonConverter25);
        builder21.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString9();
        retrofit.Server server30 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter28.deserializeObjectConverter6();
        java.lang.String str32 = serializedObjectSupporter28.deserializeObjectString2();
        java.lang.String str33 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler34 = serializedObjectSupporter28.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder35 = builder21.setErrorHandler(errorHandler34);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString9();
        retrofit.Server server38 = serializedObjectSupporter36.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter36.deserializeObjectConverter6();
        java.lang.String str40 = serializedObjectSupporter36.deserializeObjectString2();
        java.lang.String str41 = serializedObjectSupporter36.deserializeObjectString4();
        java.lang.String str42 = serializedObjectSupporter36.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter36.deserializeObjectConverter7();
        builder35.converter = gsonConverter43;
        retrofit.client.Client.Provider provider45 = builder35.clientProvider;
        builder19.setclientProvider(provider45);
        builder0.setclientProvider(provider45);
        retrofit.Server server48 = builder0.server;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter49 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-Idle" + "'", str32, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-Idle" + "'", str40, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(server48);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString2();
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString4();
        retrofit.Server server20 = serializedObjectSupporter14.deserializeObjectServer1();
        java.lang.String str21 = serializedObjectSupporter14.deserializeObjectString4();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = restHandler13.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString8();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter24.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter24.deserializeObjectConverter8();
        java.lang.String str29 = serializedObjectSupporter24.deserializeObjectString8();
        retrofit.Server server30 = serializedObjectSupporter24.deserializeObjectServer1();
        java.lang.String str31 = serializedObjectSupporter24.deserializeObjectString1();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.String str33 = serializedObjectSupporter24.deserializeObjectString7();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("http://example.com/");
        retrofit.Server server44 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider45 = null;
        java.util.concurrent.Executor executor46 = null;
        java.util.concurrent.Executor executor47 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor50 = serializedObjectSupporter48.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString9();
        retrofit.Server server53 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter51.deserializeObjectConverter6();
        retrofit.Profiler profiler55 = null;
        retrofit.ErrorHandler errorHandler56 = null;
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = builder57.serializedObjectSupporter;
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        builder57.log = log59;
        retrofit.RestAdapter.LogLevel logLevel61 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter62 = new retrofit.RestAdapter(server44, provider45, executor46, executor47, requestInterceptor50, (retrofit.converter.Converter) gsonConverter54, profiler55, errorHandler56, log59, logLevel61);
        retrofit.RestAdapter.Builder builder63 = builder41.setLog(log59);
        retrofit.Profiler profiler64 = builder41.profiler;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertNull(serializedObjectSupporter58);
        org.junit.Assert.assertNotNull(log59);
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(profiler64);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString9();
        retrofit.Server server45 = serializedObjectSupporter43.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter43.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder47 = builder42.setConverter((retrofit.converter.Converter) gsonConverter46);
        builder42.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.Server server51 = serializedObjectSupporter49.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter49.deserializeObjectConverter6();
        java.lang.String str53 = serializedObjectSupporter49.deserializeObjectString2();
        java.lang.String str54 = serializedObjectSupporter49.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler55 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder56 = builder42.setErrorHandler(errorHandler55);
        retrofit.client.Client.Provider provider57 = builder56.clientProvider;
        retrofit.RestAdapter.Builder builder58 = builder41.setClient(provider57);
        retrofit.Profiler profiler59 = null;
        builder58.profiler = profiler59;
        retrofit.ErrorHandler errorHandler61 = null;
        builder58.errorHandler = errorHandler61;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(server51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Retrofit-Idle" + "'", str53, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(provider57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter12.requestInterceptor;
        java.lang.String str14 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.Server server15 = restAdapter12.server;
        retrofit.ErrorHandler errorHandler16 = restAdapter12.geterrorHandler();
        retrofit.Profiler profiler17 = restAdapter12.getprofiler();
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
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
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        java.lang.String str27 = restAdapter24.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean29 = logLevel28.log();
        restAdapter24.logLevel = logLevel28;
        restAdapter10.logLevel = logLevel28;
        retrofit.client.Client.Provider provider32 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = restAdapter10.serializedObjectSupporter;
        java.lang.String str35 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler36 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNull(serializedObjectSupporter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-Idle" + "'", str35, "Retrofit-Idle");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(log17);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter12.httpExecutor;
        java.util.concurrent.Executor executor16 = restAdapter12.httpExecutor;
        retrofit.ErrorHandler errorHandler17 = restAdapter12.geterrorHandler();
        retrofit.Profiler profiler18 = restAdapter12.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter12.serializedObjectSupporter;
        java.lang.String str20 = restAdapter12.getIDLE_THREAD_NAME();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.List<retrofit.client.Header> headerList18 = null;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList18, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "Retrofit-", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList21, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com", "default", headerList21, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList21, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList21, typedOutput36);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "Retrofit-", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("default", "", headerList13, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        java.util.List<retrofit.client.Header> headerList21 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput22);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        java.util.concurrent.Executor executor92 = restAdapter91.httpExecutor;
        java.util.concurrent.Executor executor93 = restAdapter91.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler94 = restAdapter91.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor92);
        org.junit.Assert.assertNull(executor93);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.Profiler profiler22 = restAdapter20.profiler;
        java.util.concurrent.Executor executor23 = restAdapter20.getcallbackExecutor();
        java.util.concurrent.Executor executor24 = restAdapter20.httpExecutor;
        retrofit.ErrorHandler errorHandler25 = restAdapter20.errorHandler;
        java.util.concurrent.Executor executor26 = restAdapter20.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNull(executor26);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.Server server14 = restAdapter12.server;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter12.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString2();
        java.lang.String str22 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler23 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        retrofit.Server server24 = serializedObjectSupporter17.deserializeObjectServer1();
        java.lang.String str25 = serializedObjectSupporter17.deserializeObjectString2();
        retrofit.Server server26 = serializedObjectSupporter17.deserializeObjectServer1();
        restHandler16.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restHandler16.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter29 = serializedObjectSupporter28.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler23);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(serializedObjectSupporter28);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler6 = builder4.errorHandler;
        builder4.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder13 = builder8.setConverter((retrofit.converter.Converter) gsonConverter12);
        builder8.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        retrofit.Server server17 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter6();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString2();
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter15.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder22 = builder8.setErrorHandler(errorHandler21);
        builder22.ensureSaneDefaults();
        java.util.concurrent.Executor executor24 = builder22.getcallbackExecutor();
        builder4.httpExecutor = executor24;
        builder0.httpExecutor = executor24;
        retrofit.RequestInterceptor requestInterceptor27 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString9();
        retrofit.Server server31 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter29.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder33 = builder28.setConverter((retrofit.converter.Converter) gsonConverter32);
        builder28.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        java.lang.String str39 = serializedObjectSupporter35.deserializeObjectString2();
        java.lang.String str40 = serializedObjectSupporter35.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler41 = serializedObjectSupporter35.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder42 = builder28.setErrorHandler(errorHandler41);
        builder0.errorHandler = errorHandler41;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString9();
        retrofit.Server server47 = serializedObjectSupporter45.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter45.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder49 = builder44.setConverter((retrofit.converter.Converter) gsonConverter48);
        builder44.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString9();
        retrofit.Server server53 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter51.deserializeObjectConverter6();
        java.lang.String str55 = serializedObjectSupporter51.deserializeObjectString2();
        java.lang.String str56 = serializedObjectSupporter51.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler57 = serializedObjectSupporter51.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder58 = builder44.setErrorHandler(errorHandler57);
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = builder59.serializedObjectSupporter;
        retrofit.Server server63 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider64 = null;
        java.util.concurrent.Executor executor65 = null;
        java.util.concurrent.Executor executor66 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        java.lang.String str68 = serializedObjectSupporter67.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor69 = serializedObjectSupporter67.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter70 = new retrofit.SerializedObjectSupporter();
        java.lang.String str71 = serializedObjectSupporter70.deserializeObjectString9();
        retrofit.Server server72 = serializedObjectSupporter70.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter73 = serializedObjectSupporter70.deserializeObjectConverter6();
        retrofit.Profiler profiler74 = null;
        retrofit.ErrorHandler errorHandler75 = null;
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = builder76.serializedObjectSupporter;
        retrofit.RestAdapter.Log log78 = retrofit.RestAdapter.Log.NONE;
        builder76.log = log78;
        retrofit.RestAdapter.LogLevel logLevel80 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter81 = new retrofit.RestAdapter(server63, provider64, executor65, executor66, requestInterceptor69, (retrofit.converter.Converter) gsonConverter73, profiler74, errorHandler75, log78, logLevel80);
        retrofit.RestAdapter.Builder builder82 = builder59.setRequestInterceptor(requestInterceptor69);
        builder58.requestInterceptor = requestInterceptor69;
        retrofit.RestAdapter.Builder builder85 = builder58.setServer("http://example.com/");
        java.util.concurrent.Executor executor86 = builder85.httpExecutor;
        builder0.httpExecutor = executor86;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter88 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Retrofit-Idle" + "'", str39, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://example.com/" + "'", str46, "http://example.com/");
        org.junit.Assert.assertNotNull(server47);
        org.junit.Assert.assertNotNull(gsonConverter48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Retrofit-Idle" + "'", str55, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNull(serializedObjectSupporter60);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "http://example.com/" + "'", str68, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "http://example.com/" + "'", str71, "http://example.com/");
        org.junit.Assert.assertNotNull(server72);
        org.junit.Assert.assertNotNull(gsonConverter73);
        org.junit.Assert.assertNull(serializedObjectSupporter77);
        org.junit.Assert.assertNotNull(log78);
        org.junit.Assert.assertTrue("'" + logLevel80 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel80.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(executor86);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "Retrofit-", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList13, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.Profiler profiler12 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter12.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter12.logLevel = logLevel15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter12.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter12.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = builder24.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler26 = builder24.errorHandler;
        builder24.ensureSaneDefaults();
        retrofit.RestAdapter.Log log28 = builder24.log;
        retrofit.Profiler profiler29 = null;
        builder24.profiler = profiler29;
        retrofit.client.Client.Provider provider31 = builder24.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel32 = builder24.logLevel;
        boolean boolean33 = logLevel32.log();
        retrofit.RestAdapter.Builder builder34 = builder23.setLogLevel(logLevel32);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNull(errorHandler26);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("default", "Retrofit-Idle", headerList9, typedOutput10);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("default", "", headerList9, typedOutput12);
        org.junit.Assert.assertNotNull(headerList9);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.Server server8 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder10 = builder5.setConverter((retrofit.converter.Converter) gsonConverter9);
        builder5.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        retrofit.Server server14 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter6();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler18 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder19 = builder5.setErrorHandler(errorHandler18);
        builder19.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString9();
        retrofit.Server server24 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder26 = builder21.setConverter((retrofit.converter.Converter) gsonConverter25);
        builder21.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString9();
        retrofit.Server server30 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter28.deserializeObjectConverter6();
        java.lang.String str32 = serializedObjectSupporter28.deserializeObjectString2();
        java.lang.String str33 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler34 = serializedObjectSupporter28.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder35 = builder21.setErrorHandler(errorHandler34);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString9();
        retrofit.Server server38 = serializedObjectSupporter36.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter36.deserializeObjectConverter6();
        java.lang.String str40 = serializedObjectSupporter36.deserializeObjectString2();
        java.lang.String str41 = serializedObjectSupporter36.deserializeObjectString4();
        java.lang.String str42 = serializedObjectSupporter36.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter36.deserializeObjectConverter7();
        builder35.converter = gsonConverter43;
        retrofit.client.Client.Provider provider45 = builder35.clientProvider;
        builder19.setclientProvider(provider45);
        builder0.setclientProvider(provider45);
        retrofit.Profiler profiler48 = builder0.profiler;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-Idle" + "'", str32, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-Idle" + "'", str40, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(profiler48);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        builder23.logLevel = logLevel24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        java.util.concurrent.Executor executor33 = null;
        builder26.httpExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder26.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = builder23.setClient(provider35);
        retrofit.Profiler profiler37 = builder23.profiler;
        retrofit.ErrorHandler errorHandler38 = builder23.errorHandler;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(profiler37);
        org.junit.Assert.assertNull(errorHandler38);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "Retrofit-", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList13, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        java.util.List<retrofit.client.Header> headerList23 = request21.getHeaders();
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.client.Client.Provider provider17 = restAdapter12.getclientProvider();
        retrofit.Server server18 = restAdapter12.getserver();
        retrofit.Server server19 = restAdapter12.getserver();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(server19);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.Profiler profiler17 = restAdapter12.profiler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter12.getLogLevel();
        retrofit.ErrorHandler errorHandler19 = restAdapter12.errorHandler;
        java.lang.String str20 = restAdapter12.getIDLE_THREAD_NAME();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.Profiler profiler15 = restAdapter12.profiler;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter12.getrequestInterceptor();
        retrofit.client.Client.Provider provider17 = restAdapter12.clientProvider;
        retrofit.converter.Converter converter18 = restAdapter12.converter;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter12.new RestHandler();
        java.util.List<retrofit.client.Header> headerList26 = null;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", headerList26, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList29, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", headerList29, typedOutput32);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request34 = restAdapter12.logAndReplaceRequest(request33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNotNull(headerList29);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.Server server14 = restAdapter12.server;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter12.getrequestInterceptor();
        retrofit.Server server17 = restAdapter12.server;
        java.util.concurrent.Executor executor18 = restAdapter12.gethttpExecutor();
        retrofit.Profiler profiler19 = restAdapter12.getprofiler();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(profiler19);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str7 = server6.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "default" + "'", str7, "default");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        retrofit.Server server7 = new retrofit.Server("hi!");
        builder0.server = server7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor11 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder14 = builder0.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.Server server15 = builder0.server;
        retrofit.Server server18 = new retrofit.Server("Retrofit-Idle", "hi!");
        builder0.server = server18;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(server15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("http://example.com/");
        retrofit.converter.Converter converter42 = builder41.converter;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        java.lang.String str45 = serializedObjectSupporter44.deserializeObjectString9();
        retrofit.Server server46 = serializedObjectSupporter44.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter44.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder48 = builder43.setConverter((retrofit.converter.Converter) gsonConverter47);
        builder43.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString9();
        retrofit.Server server52 = serializedObjectSupporter50.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter50.deserializeObjectConverter6();
        java.lang.String str54 = serializedObjectSupporter50.deserializeObjectString2();
        java.lang.String str55 = serializedObjectSupporter50.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler56 = serializedObjectSupporter50.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder57 = builder43.setErrorHandler(errorHandler56);
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = builder58.serializedObjectSupporter;
        retrofit.Server server62 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider63 = null;
        java.util.concurrent.Executor executor64 = null;
        java.util.concurrent.Executor executor65 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor68 = serializedObjectSupporter66.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        java.lang.String str70 = serializedObjectSupporter69.deserializeObjectString9();
        retrofit.Server server71 = serializedObjectSupporter69.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter69.deserializeObjectConverter6();
        retrofit.Profiler profiler73 = null;
        retrofit.ErrorHandler errorHandler74 = null;
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = builder75.serializedObjectSupporter;
        retrofit.RestAdapter.Log log77 = retrofit.RestAdapter.Log.NONE;
        builder75.log = log77;
        retrofit.RestAdapter.LogLevel logLevel79 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter80 = new retrofit.RestAdapter(server62, provider63, executor64, executor65, requestInterceptor68, (retrofit.converter.Converter) gsonConverter72, profiler73, errorHandler74, log77, logLevel79);
        retrofit.RestAdapter.Builder builder81 = builder58.setRequestInterceptor(requestInterceptor68);
        builder57.requestInterceptor = requestInterceptor68;
        retrofit.RestAdapter.Builder builder83 = builder41.setRequestInterceptor(requestInterceptor68);
        retrofit.client.Client.Provider provider84 = builder41.getclientProvider();
        retrofit.client.Client.Provider provider85 = builder41.clientProvider;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(converter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
        org.junit.Assert.assertNotNull(server46);
        org.junit.Assert.assertNotNull(gsonConverter47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(server52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Retrofit-Idle" + "'", str54, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://example.com/" + "'", str55, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(serializedObjectSupporter59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(server71);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNull(serializedObjectSupporter76);
        org.junit.Assert.assertNotNull(log77);
        org.junit.Assert.assertTrue("'" + logLevel79 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel79.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(provider84);
        org.junit.Assert.assertNotNull(provider85);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList13, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-", "", headerList19, typedOutput22);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.converter.Converter converter3 = builder2.converter;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler6 = builder4.errorHandler;
        builder4.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler8 = builder4.errorHandler;
        retrofit.RestAdapter.Builder builder9 = builder2.setErrorHandler(errorHandler8);
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder10.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler12 = builder10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean14 = logLevel13.log();
        builder10.logLevel = logLevel13;
        retrofit.Server server17 = new retrofit.Server("hi!");
        builder10.server = server17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor21 = serializedObjectSupporter19.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response22 = serializedObjectSupporter19.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder24 = builder10.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.converter.Converter converter25 = builder10.converter;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString9();
        retrofit.Server server35 = serializedObjectSupporter33.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter6();
        java.lang.String str37 = serializedObjectSupporter33.deserializeObjectString2();
        java.lang.String str38 = serializedObjectSupporter33.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler39 = serializedObjectSupporter33.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder40 = builder26.setErrorHandler(errorHandler39);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.Server server45 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor51 = serializedObjectSupporter49.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        retrofit.Server server54 = serializedObjectSupporter52.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter6();
        retrofit.Profiler profiler56 = null;
        retrofit.ErrorHandler errorHandler57 = null;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = builder58.serializedObjectSupporter;
        retrofit.RestAdapter.Log log60 = retrofit.RestAdapter.Log.NONE;
        builder58.log = log60;
        retrofit.RestAdapter.LogLevel logLevel62 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter63 = new retrofit.RestAdapter(server45, provider46, executor47, executor48, requestInterceptor51, (retrofit.converter.Converter) gsonConverter55, profiler56, errorHandler57, log60, logLevel62);
        retrofit.RestAdapter.Builder builder64 = builder41.setRequestInterceptor(requestInterceptor51);
        builder40.requestInterceptor = requestInterceptor51;
        retrofit.RestAdapter.Builder builder67 = builder40.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        java.lang.String str70 = serializedObjectSupporter69.deserializeObjectString9();
        retrofit.Server server71 = serializedObjectSupporter69.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter69.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder73 = builder68.setConverter((retrofit.converter.Converter) gsonConverter72);
        builder68.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        java.lang.String str76 = serializedObjectSupporter75.deserializeObjectString9();
        retrofit.Server server77 = serializedObjectSupporter75.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter78 = serializedObjectSupporter75.deserializeObjectConverter6();
        java.lang.String str79 = serializedObjectSupporter75.deserializeObjectString2();
        java.lang.String str80 = serializedObjectSupporter75.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler81 = serializedObjectSupporter75.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder82 = builder68.setErrorHandler(errorHandler81);
        retrofit.client.Client.Provider provider83 = builder82.clientProvider;
        retrofit.RestAdapter.Builder builder84 = builder67.setClient(provider83);
        builder10.setclientProvider(provider83);
        retrofit.RestAdapter.Builder builder86 = builder9.setClient(provider83);
        retrofit.RestAdapter.Builder builder87 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter88 = builder87.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler89 = builder87.errorHandler;
        builder87.ensureSaneDefaults();
        retrofit.RestAdapter.Log log91 = builder87.log;
        retrofit.Profiler profiler92 = null;
        builder87.profiler = profiler92;
        retrofit.client.Client.Provider provider94 = builder87.getclientProvider();
        retrofit.RestAdapter.Builder builder95 = builder86.setClient(provider94);
        java.util.concurrent.Executor executor96 = builder86.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNotNull(errorHandler8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(server54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNull(serializedObjectSupporter59);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(server71);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "http://example.com/" + "'", str76, "http://example.com/");
        org.junit.Assert.assertNotNull(server77);
        org.junit.Assert.assertNotNull(gsonConverter78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Retrofit-Idle" + "'", str79, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(provider83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNull(serializedObjectSupporter88);
        org.junit.Assert.assertNull(errorHandler89);
        org.junit.Assert.assertNotNull(log91);
        org.junit.Assert.assertNotNull(provider94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNull(executor96);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("Retrofit-Idle", "", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "Retrofit-Idle", headerList13, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com/", "hi!", headerList13, typedOutput20);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter20.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter20.logLevel;
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter20.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter20.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter20.new RestHandler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("default", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput29);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        retrofit.ErrorHandler errorHandler25 = restAdapter20.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter20.new RestHandler();
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList36, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList36, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList36, typedOutput44);
        retrofit.client.Request request46 = restAdapter20.logAndReplaceRequest(request45);
        retrofit.ErrorHandler errorHandler47 = restAdapter20.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler48 = restAdapter20.new RestHandler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNull(errorHandler47);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        retrofit.converter.Converter converter10 = builder0.converter;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(converter10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter24 = builder23.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.Server server12 = new retrofit.Server("Retrofit-", "http://example.com/");
        java.lang.String str13 = server12.apiUrl;
        builder0.server = server12;
        java.lang.String str15 = server12.getDEFAULT_NAME();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(executor8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "default" + "'", str15, "default");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler19 = builder17.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean21 = logLevel20.log();
        builder17.logLevel = logLevel20;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean24 = logLevel23.log();
        builder17.logLevel = logLevel23;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        java.lang.String str3 = server2.name;
        java.lang.String str4 = server2.getapiUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "default", headerList11, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList11, typedOutput16);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        retrofit.Server server7 = new retrofit.Server("hi!");
        builder0.server = server7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor11 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder14 = builder0.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.converter.Converter converter15 = builder0.converter;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder21 = builder16.setConverter((retrofit.converter.Converter) gsonConverter20);
        builder16.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.Server server25 = serializedObjectSupporter23.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter23.deserializeObjectConverter6();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString2();
        java.lang.String str28 = serializedObjectSupporter23.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler29 = serializedObjectSupporter23.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder30 = builder16.setErrorHandler(errorHandler29);
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = builder31.serializedObjectSupporter;
        retrofit.Server server35 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        java.lang.String str40 = serializedObjectSupporter39.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor41 = serializedObjectSupporter39.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        java.lang.String str43 = serializedObjectSupporter42.deserializeObjectString9();
        retrofit.Server server44 = serializedObjectSupporter42.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter42.deserializeObjectConverter6();
        retrofit.Profiler profiler46 = null;
        retrofit.ErrorHandler errorHandler47 = null;
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = builder48.serializedObjectSupporter;
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        builder48.log = log50;
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter53 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor41, (retrofit.converter.Converter) gsonConverter45, profiler46, errorHandler47, log50, logLevel52);
        retrofit.RestAdapter.Builder builder54 = builder31.setRequestInterceptor(requestInterceptor41);
        builder30.requestInterceptor = requestInterceptor41;
        retrofit.RestAdapter.Builder builder57 = builder30.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        retrofit.Server server61 = serializedObjectSupporter59.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter59.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder63 = builder58.setConverter((retrofit.converter.Converter) gsonConverter62);
        builder58.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        java.lang.String str66 = serializedObjectSupporter65.deserializeObjectString9();
        retrofit.Server server67 = serializedObjectSupporter65.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter68 = serializedObjectSupporter65.deserializeObjectConverter6();
        java.lang.String str69 = serializedObjectSupporter65.deserializeObjectString2();
        java.lang.String str70 = serializedObjectSupporter65.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler71 = serializedObjectSupporter65.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder72 = builder58.setErrorHandler(errorHandler71);
        retrofit.client.Client.Provider provider73 = builder72.clientProvider;
        retrofit.RestAdapter.Builder builder74 = builder57.setClient(provider73);
        builder0.setclientProvider(provider73);
        retrofit.RestAdapter restAdapter76 = builder0.build();
        java.util.concurrent.Executor executor77 = restAdapter76.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = restAdapter76.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(converter15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-Idle" + "'", str27, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(server44);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNull(serializedObjectSupporter49);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(server61);
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "http://example.com/" + "'", str66, "http://example.com/");
        org.junit.Assert.assertNotNull(server67);
        org.junit.Assert.assertNotNull(gsonConverter68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Retrofit-Idle" + "'", str69, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(provider73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(restAdapter76);
        org.junit.Assert.assertNotNull(executor77);
        org.junit.Assert.assertNull(serializedObjectSupporter78);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = builder2.gethttpExecutor();
        java.util.concurrent.Executor executor4 = builder2.callbackExecutor;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder2.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        java.lang.String str25 = restAdapter20.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider26 = restAdapter20.getclientProvider();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-" + "'", str25, "Retrofit-");
        org.junit.Assert.assertNull(provider26);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server4 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.Server server10 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider11 = null;
        java.util.concurrent.Executor executor12 = null;
        java.util.concurrent.Executor executor13 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor16 = serializedObjectSupporter14.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = builder23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        builder23.log = log25;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server10, provider11, executor12, executor13, requestInterceptor16, (retrofit.converter.Converter) gsonConverter20, profiler21, errorHandler22, log25, logLevel27);
        retrofit.Server server31 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider32 = null;
        java.util.concurrent.Executor executor33 = null;
        java.util.concurrent.Executor executor34 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor37 = serializedObjectSupporter35.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        retrofit.Server server40 = serializedObjectSupporter38.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter38.deserializeObjectConverter6();
        retrofit.Profiler profiler42 = null;
        retrofit.ErrorHandler errorHandler43 = null;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = builder44.serializedObjectSupporter;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        builder44.log = log46;
        retrofit.RestAdapter.LogLevel logLevel48 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter49 = new retrofit.RestAdapter(server31, provider32, executor33, executor34, requestInterceptor37, (retrofit.converter.Converter) gsonConverter41, profiler42, errorHandler43, log46, logLevel48);
        retrofit.Profiler profiler50 = null;
        retrofit.ErrorHandler errorHandler51 = null;
        retrofit.Server server54 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider55 = null;
        java.util.concurrent.Executor executor56 = null;
        java.util.concurrent.Executor executor57 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor60 = serializedObjectSupporter58.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        java.lang.String str62 = serializedObjectSupporter61.deserializeObjectString9();
        retrofit.Server server63 = serializedObjectSupporter61.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter61.deserializeObjectConverter6();
        retrofit.Profiler profiler65 = null;
        retrofit.ErrorHandler errorHandler66 = null;
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = builder67.serializedObjectSupporter;
        retrofit.RestAdapter.Log log69 = retrofit.RestAdapter.Log.NONE;
        builder67.log = log69;
        retrofit.RestAdapter.LogLevel logLevel71 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter72 = new retrofit.RestAdapter(server54, provider55, executor56, executor57, requestInterceptor60, (retrofit.converter.Converter) gsonConverter64, profiler65, errorHandler66, log69, logLevel71);
        retrofit.Server server75 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider76 = null;
        java.util.concurrent.Executor executor77 = null;
        java.util.concurrent.Executor executor78 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor81 = serializedObjectSupporter79.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter82 = new retrofit.SerializedObjectSupporter();
        java.lang.String str83 = serializedObjectSupporter82.deserializeObjectString9();
        retrofit.Server server84 = serializedObjectSupporter82.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter85 = serializedObjectSupporter82.deserializeObjectConverter6();
        retrofit.Profiler profiler86 = null;
        retrofit.ErrorHandler errorHandler87 = null;
        retrofit.RestAdapter.Builder builder88 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter89 = builder88.serializedObjectSupporter;
        retrofit.RestAdapter.Log log90 = retrofit.RestAdapter.Log.NONE;
        builder88.log = log90;
        retrofit.RestAdapter.LogLevel logLevel92 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter93 = new retrofit.RestAdapter(server75, provider76, executor77, executor78, requestInterceptor81, (retrofit.converter.Converter) gsonConverter85, profiler86, errorHandler87, log90, logLevel92);
        retrofit.RestAdapter restAdapter94 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor16, (retrofit.converter.Converter) gsonConverter41, profiler50, errorHandler51, log69, logLevel92);
        retrofit.RestAdapter.Builder builder95 = builder0.setServer(server4);
        java.util.concurrent.Executor executor96 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel97 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(server40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNull(serializedObjectSupporter45);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "http://example.com/" + "'", str62, "http://example.com/");
        org.junit.Assert.assertNotNull(server63);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNull(serializedObjectSupporter68);
        org.junit.Assert.assertNotNull(log69);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "http://example.com/" + "'", str83, "http://example.com/");
        org.junit.Assert.assertNotNull(server84);
        org.junit.Assert.assertNotNull(gsonConverter85);
        org.junit.Assert.assertNull(serializedObjectSupporter89);
        org.junit.Assert.assertNotNull(log90);
        org.junit.Assert.assertTrue("'" + logLevel92 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel92.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNull(executor96);
        org.junit.Assert.assertTrue("'" + logLevel97 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel97.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.Server server11 = new retrofit.Server("", "");
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
        java.lang.String str22 = restAdapter21.getIDLE_THREAD_NAME();
        retrofit.Server server23 = restAdapter21.server;
        retrofit.RestAdapter.Builder builder24 = builder0.setServer(server23);
        retrofit.RestAdapter.Builder builder26 = builder0.setServer("http://example.com/");
        retrofit.Profiler profiler27 = builder0.profiler;
        retrofit.RestAdapter.LogLevel logLevel28 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        retrofit.Server server32 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter30.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder34 = builder29.setConverter((retrofit.converter.Converter) gsonConverter33);
        builder29.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString9();
        retrofit.Server server38 = serializedObjectSupporter36.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter36.deserializeObjectConverter6();
        java.lang.String str40 = serializedObjectSupporter36.deserializeObjectString2();
        java.lang.String str41 = serializedObjectSupporter36.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler42 = serializedObjectSupporter36.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder43 = builder29.setErrorHandler(errorHandler42);
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = builder44.serializedObjectSupporter;
        retrofit.Server server48 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider49 = null;
        java.util.concurrent.Executor executor50 = null;
        java.util.concurrent.Executor executor51 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor54 = serializedObjectSupporter52.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.Server server57 = serializedObjectSupporter55.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter58 = serializedObjectSupporter55.deserializeObjectConverter6();
        retrofit.Profiler profiler59 = null;
        retrofit.ErrorHandler errorHandler60 = null;
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = builder61.serializedObjectSupporter;
        retrofit.RestAdapter.Log log63 = retrofit.RestAdapter.Log.NONE;
        builder61.log = log63;
        retrofit.RestAdapter.LogLevel logLevel65 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter66 = new retrofit.RestAdapter(server48, provider49, executor50, executor51, requestInterceptor54, (retrofit.converter.Converter) gsonConverter58, profiler59, errorHandler60, log63, logLevel65);
        retrofit.RestAdapter.Builder builder67 = builder44.setRequestInterceptor(requestInterceptor54);
        builder43.requestInterceptor = requestInterceptor54;
        retrofit.RestAdapter.Builder builder70 = builder43.setServer("Retrofit-Idle");
        retrofit.ErrorHandler errorHandler71 = builder70.errorHandler;
        retrofit.RestAdapter.Builder builder72 = builder0.setErrorHandler(errorHandler71);
        retrofit.client.Client.Provider provider73 = builder72.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(executor8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-Idle" + "'", str40, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(serializedObjectSupporter45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(server57);
        org.junit.Assert.assertNotNull(gsonConverter58);
        org.junit.Assert.assertNull(serializedObjectSupporter62);
        org.junit.Assert.assertNotNull(log63);
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(errorHandler71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(provider73);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        restAdapter12.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.Profiler profiler16 = restAdapter12.profiler;
        java.util.concurrent.Executor executor17 = restAdapter12.httpExecutor;
        retrofit.Server server18 = restAdapter12.getserver();
        java.util.concurrent.Executor executor19 = restAdapter12.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter12.requestInterceptor;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(requestInterceptor20);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
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
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        java.lang.String str27 = restAdapter24.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean29 = logLevel28.log();
        restAdapter24.logLevel = logLevel28;
        restAdapter10.logLevel = logLevel28;
        retrofit.client.Client.Provider provider32 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter10.new RestHandler();
        retrofit.Server server34 = restAdapter10.getserver();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertNull(server34);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter16 = builder15.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString2();
        java.lang.String str22 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler23 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder15.errorHandler = errorHandler23;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder30 = builder25.setConverter((retrofit.converter.Converter) gsonConverter29);
        builder25.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.Server server34 = serializedObjectSupporter32.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter32.deserializeObjectConverter6();
        java.lang.String str36 = serializedObjectSupporter32.deserializeObjectString2();
        java.lang.String str37 = serializedObjectSupporter32.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler38 = serializedObjectSupporter32.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder39 = builder25.setErrorHandler(errorHandler38);
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = builder40.serializedObjectSupporter;
        retrofit.Server server44 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider45 = null;
        java.util.concurrent.Executor executor46 = null;
        java.util.concurrent.Executor executor47 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor50 = serializedObjectSupporter48.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString9();
        retrofit.Server server53 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter51.deserializeObjectConverter6();
        retrofit.Profiler profiler55 = null;
        retrofit.ErrorHandler errorHandler56 = null;
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = builder57.serializedObjectSupporter;
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        builder57.log = log59;
        retrofit.RestAdapter.LogLevel logLevel61 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter62 = new retrofit.RestAdapter(server44, provider45, executor46, executor47, requestInterceptor50, (retrofit.converter.Converter) gsonConverter54, profiler55, errorHandler56, log59, logLevel61);
        retrofit.RestAdapter.Builder builder63 = builder40.setRequestInterceptor(requestInterceptor50);
        builder39.requestInterceptor = requestInterceptor50;
        builder15.requestInterceptor = requestInterceptor50;
        retrofit.Profiler profiler66 = builder15.profiler;
        retrofit.RestAdapter.LogLevel logLevel67 = builder15.logLevel;
        restAdapter10.logLevel = logLevel67;
        retrofit.client.Client.Provider provider69 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(serializedObjectSupporter41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertNull(serializedObjectSupporter58);
        org.junit.Assert.assertNotNull(log59);
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(profiler66);
        org.junit.Assert.assertTrue("'" + logLevel67 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel67.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider69);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class9 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response10 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response12 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean15 = logLevel14.log();
        restAdapter10.logLevel = logLevel14;
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server19 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.ErrorHandler errorHandler24 = restAdapter20.errorHandler;
        retrofit.Server server25 = restAdapter20.getserver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(errorHandler24);
        org.junit.Assert.assertNotNull(server25);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class9 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response10 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
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
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        java.lang.String str27 = restAdapter24.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean29 = logLevel28.log();
        restAdapter24.logLevel = logLevel28;
        restAdapter10.logLevel = logLevel28;
        retrofit.client.Client.Provider provider32 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor35 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNull(serializedObjectSupporter34);
        org.junit.Assert.assertNull(requestInterceptor35);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        builder23.logLevel = logLevel24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        java.util.concurrent.Executor executor33 = null;
        builder26.httpExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder26.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = builder23.setClient(provider35);
        retrofit.RestAdapter.Builder builder38 = builder23.setServer("default");
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString9();
        retrofit.Server server42 = serializedObjectSupporter40.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter40.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder44 = builder39.setConverter((retrofit.converter.Converter) gsonConverter43);
        builder39.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        java.lang.String str47 = serializedObjectSupporter46.deserializeObjectString9();
        retrofit.Server server48 = serializedObjectSupporter46.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter6();
        java.lang.String str50 = serializedObjectSupporter46.deserializeObjectString2();
        java.lang.String str51 = serializedObjectSupporter46.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler52 = serializedObjectSupporter46.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder53 = builder39.setErrorHandler(errorHandler52);
        builder53.ensureSaneDefaults();
        java.util.concurrent.Executor executor55 = builder53.getcallbackExecutor();
        builder53.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder62 = builder57.setConverter((retrofit.converter.Converter) gsonConverter61);
        builder57.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = new retrofit.SerializedObjectSupporter();
        java.lang.String str65 = serializedObjectSupporter64.deserializeObjectString9();
        retrofit.Server server66 = serializedObjectSupporter64.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter64.deserializeObjectConverter6();
        java.lang.String str68 = serializedObjectSupporter64.deserializeObjectString2();
        java.lang.String str69 = serializedObjectSupporter64.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler70 = serializedObjectSupporter64.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder71 = builder57.setErrorHandler(errorHandler70);
        builder71.ensureSaneDefaults();
        java.util.concurrent.Executor executor73 = builder71.getcallbackExecutor();
        builder53.sethttpExecutor(executor73);
        builder38.setcallbackExecutor(executor73);
        java.util.concurrent.Executor executor76 = builder38.callbackExecutor;
        retrofit.RestAdapter.Builder builder77 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = new retrofit.SerializedObjectSupporter();
        java.lang.String str79 = serializedObjectSupporter78.deserializeObjectString9();
        retrofit.Server server80 = serializedObjectSupporter78.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter81 = serializedObjectSupporter78.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder82 = builder77.setConverter((retrofit.converter.Converter) gsonConverter81);
        builder77.ensureSaneDefaults();
        java.util.concurrent.Executor executor84 = null;
        builder77.httpExecutor = executor84;
        retrofit.client.Client.Provider provider86 = builder77.getclientProvider();
        retrofit.RestAdapter.Builder builder87 = builder38.setClient(provider86);
        retrofit.SerializedObjectSupporter serializedObjectSupporter88 = builder87.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "http://example.com/" + "'", str47, "http://example.com/");
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Retrofit-Idle" + "'", str50, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(executor55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "http://example.com/" + "'", str65, "http://example.com/");
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Retrofit-Idle" + "'", str68, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "http://example.com/" + "'", str69, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(executor73);
        org.junit.Assert.assertNotNull(executor76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "http://example.com/" + "'", str79, "http://example.com/");
        org.junit.Assert.assertNotNull(server80);
        org.junit.Assert.assertNotNull(gsonConverter81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(provider86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNull(serializedObjectSupporter88);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.ErrorHandler errorHandler23 = restAdapter20.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter20.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor28 = serializedObjectSupporter26.deserializeObjectRequestInterceptor1();
        retrofit.ErrorHandler errorHandler29 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        retrofit.client.Response response30 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str31 = serializedObjectSupporter26.deserializeObjectString2();
        retrofit.client.Response response32 = serializedObjectSupporter26.deserializeObjectResponse3();
        retrofit.client.Response response34 = restAdapter20.logAndReplaceResponse("Retrofit-", response32, (-1L));
        retrofit.RestAdapter.Log log35 = restAdapter20.log;
        retrofit.client.Client.Provider provider36 = restAdapter20.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor37 = restAdapter20.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor28);
        org.junit.Assert.assertNotNull(errorHandler29);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-Idle" + "'", str31, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNotNull(requestInterceptor37);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.Profiler profiler15 = restAdapter12.profiler;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter12.getrequestInterceptor();
        retrofit.Server server17 = restAdapter12.server;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter12.getLogLevel();
        java.util.concurrent.Executor executor19 = restAdapter12.callbackExecutor;
        java.util.concurrent.Executor executor20 = restAdapter12.callbackExecutor;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean4 = logLevel3.log();
        builder0.logLevel = logLevel3;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        retrofit.Server server12 = serializedObjectSupporter10.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter10.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder14 = builder9.setConverter((retrofit.converter.Converter) gsonConverter13);
        builder9.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString9();
        retrofit.Server server18 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter6();
        java.lang.String str20 = serializedObjectSupporter16.deserializeObjectString2();
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler22 = serializedObjectSupporter16.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder23 = builder9.setErrorHandler(errorHandler22);
        builder23.ensureSaneDefaults();
        java.util.concurrent.Executor executor25 = builder23.getcallbackExecutor();
        java.util.concurrent.Executor executor26 = builder23.callbackExecutor;
        retrofit.Server server29 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider30 = null;
        java.util.concurrent.Executor executor31 = null;
        java.util.concurrent.Executor executor32 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor35 = serializedObjectSupporter33.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString9();
        retrofit.Server server38 = serializedObjectSupporter36.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter36.deserializeObjectConverter6();
        retrofit.Profiler profiler40 = null;
        retrofit.ErrorHandler errorHandler41 = null;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = builder42.serializedObjectSupporter;
        retrofit.RestAdapter.Log log44 = retrofit.RestAdapter.Log.NONE;
        builder42.log = log44;
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter47 = new retrofit.RestAdapter(server29, provider30, executor31, executor32, requestInterceptor35, (retrofit.converter.Converter) gsonConverter39, profiler40, errorHandler41, log44, logLevel46);
        retrofit.Server server48 = restAdapter47.server;
        retrofit.RestAdapter.Log log49 = restAdapter47.log;
        retrofit.RestAdapter.Builder builder50 = builder23.setLog(log49);
        retrofit.RestAdapter.Log log51 = builder50.log;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString9();
        retrofit.Server server55 = serializedObjectSupporter53.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter56 = serializedObjectSupporter53.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder57 = builder52.setConverter((retrofit.converter.Converter) gsonConverter56);
        builder52.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        retrofit.Server server61 = serializedObjectSupporter59.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter59.deserializeObjectConverter6();
        java.lang.String str63 = serializedObjectSupporter59.deserializeObjectString2();
        java.lang.String str64 = serializedObjectSupporter59.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler65 = serializedObjectSupporter59.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder66 = builder52.setErrorHandler(errorHandler65);
        builder66.ensureSaneDefaults();
        java.util.concurrent.Executor executor68 = builder66.getcallbackExecutor();
        java.util.concurrent.Executor executor69 = builder66.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor70 = builder66.requestInterceptor;
        retrofit.client.Client.Provider provider71 = builder66.getclientProvider();
        builder50.clientProvider = provider71;
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = new retrofit.SerializedObjectSupporter();
        java.lang.String str74 = serializedObjectSupporter73.deserializeObjectString9();
        retrofit.Server server75 = serializedObjectSupporter73.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter76 = serializedObjectSupporter73.deserializeObjectConverter6();
        java.lang.String str77 = serializedObjectSupporter73.deserializeObjectString2();
        java.lang.String str78 = serializedObjectSupporter73.deserializeObjectString4();
        java.lang.String str79 = serializedObjectSupporter73.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter80 = serializedObjectSupporter73.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter81 = serializedObjectSupporter73.deserializeObjectConverter3();
        retrofit.RestAdapter.Builder builder82 = builder50.setConverter((retrofit.converter.Converter) gsonConverter81);
        java.util.concurrent.Executor executor83 = builder50.gethttpExecutor();
        builder0.callbackExecutor = executor83;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(executor25);
        org.junit.Assert.assertNotNull(executor26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(server55);
        org.junit.Assert.assertNotNull(gsonConverter56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(server61);
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Retrofit-Idle" + "'", str63, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "http://example.com/" + "'", str64, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(executor68);
        org.junit.Assert.assertNotNull(executor69);
        org.junit.Assert.assertNotNull(requestInterceptor70);
        org.junit.Assert.assertNotNull(provider71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "http://example.com/" + "'", str74, "http://example.com/");
        org.junit.Assert.assertNotNull(server75);
        org.junit.Assert.assertNotNull(gsonConverter76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Retrofit-Idle" + "'", str77, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "http://example.com/" + "'", str78, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "http://example.com/" + "'", str79, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter80);
        org.junit.Assert.assertNotNull(gsonConverter81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(executor83);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("http://example.com/", "default", headerList2, typedOutput3);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        java.lang.String str25 = restAdapter20.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log26 = restAdapter20.log;
        retrofit.Server server27 = restAdapter20.server;
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter20.new RestHandler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-" + "'", str25, "Retrofit-");
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(server27);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.Server server9 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(server9);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.Profiler profiler12 = restAdapter10.profiler;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter20.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter20.new RestHandler();
        retrofit.client.Request request25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request26 = restAdapter20.logAndReplaceRequest(request25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log2;
        retrofit.Server server4 = builder0.server;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter6 = builder5.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        builder5.errorHandler = errorHandler13;
        retrofit.RestAdapter.Builder builder15 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        log19.log("default");
        builder16.log = log19;
        builder15.log = log19;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder30 = builder25.setConverter((retrofit.converter.Converter) gsonConverter29);
        builder25.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.Server server34 = serializedObjectSupporter32.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter32.deserializeObjectConverter6();
        java.lang.String str36 = serializedObjectSupporter32.deserializeObjectString2();
        java.lang.String str37 = serializedObjectSupporter32.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler38 = serializedObjectSupporter32.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder39 = builder25.setErrorHandler(errorHandler38);
        builder39.ensureSaneDefaults();
        java.util.concurrent.Executor executor41 = builder39.getcallbackExecutor();
        java.util.concurrent.Executor executor42 = builder39.callbackExecutor;
        retrofit.Server server45 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor51 = serializedObjectSupporter49.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        retrofit.Server server54 = serializedObjectSupporter52.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter6();
        retrofit.Profiler profiler56 = null;
        retrofit.ErrorHandler errorHandler57 = null;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = builder58.serializedObjectSupporter;
        retrofit.RestAdapter.Log log60 = retrofit.RestAdapter.Log.NONE;
        builder58.log = log60;
        retrofit.RestAdapter.LogLevel logLevel62 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter63 = new retrofit.RestAdapter(server45, provider46, executor47, executor48, requestInterceptor51, (retrofit.converter.Converter) gsonConverter55, profiler56, errorHandler57, log60, logLevel62);
        retrofit.Server server64 = restAdapter63.server;
        retrofit.RestAdapter.Log log65 = restAdapter63.log;
        retrofit.RestAdapter.Builder builder66 = builder39.setLog(log65);
        retrofit.RestAdapter.Log log67 = builder66.log;
        log67.log("");
        log67.log("");
        retrofit.RestAdapter.Builder builder72 = builder15.setLog(log67);
        java.util.concurrent.Executor executor73 = builder15.callbackExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(executor41);
        org.junit.Assert.assertNotNull(executor42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(server54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNull(serializedObjectSupporter59);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server64);
        org.junit.Assert.assertNotNull(log65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(log67);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNull(executor73);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.Profiler profiler40 = null;
        builder14.profiler = profiler40;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = builder42.serializedObjectSupporter;
        retrofit.RestAdapter.Log log44 = retrofit.RestAdapter.Log.NONE;
        builder42.log = log44;
        builder14.log = log44;
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        java.lang.String str48 = serializedObjectSupporter47.deserializeObjectString9();
        retrofit.Server server49 = serializedObjectSupporter47.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter47.deserializeObjectConverter6();
        java.lang.String str51 = serializedObjectSupporter47.deserializeObjectString2();
        java.lang.String str52 = serializedObjectSupporter47.deserializeObjectString4();
        java.lang.String str53 = serializedObjectSupporter47.deserializeObjectString4();
        retrofit.client.Response response54 = serializedObjectSupporter47.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter47.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder56 = builder14.setConverter((retrofit.converter.Converter) gsonConverter55);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter57 = builder56.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(server49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Retrofit-Idle" + "'", str51, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "Retrofit-", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder15 = builder10.setConverter((retrofit.converter.Converter) gsonConverter14);
        builder10.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString2();
        java.lang.String str22 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler23 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder24 = builder10.setErrorHandler(errorHandler23);
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = builder25.serializedObjectSupporter;
        retrofit.Server server29 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider30 = null;
        java.util.concurrent.Executor executor31 = null;
        java.util.concurrent.Executor executor32 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor35 = serializedObjectSupporter33.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString9();
        retrofit.Server server38 = serializedObjectSupporter36.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter36.deserializeObjectConverter6();
        retrofit.Profiler profiler40 = null;
        retrofit.ErrorHandler errorHandler41 = null;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = builder42.serializedObjectSupporter;
        retrofit.RestAdapter.Log log44 = retrofit.RestAdapter.Log.NONE;
        builder42.log = log44;
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter47 = new retrofit.RestAdapter(server29, provider30, executor31, executor32, requestInterceptor35, (retrofit.converter.Converter) gsonConverter39, profiler40, errorHandler41, log44, logLevel46);
        retrofit.RestAdapter.Builder builder48 = builder25.setRequestInterceptor(requestInterceptor35);
        builder24.requestInterceptor = requestInterceptor35;
        retrofit.Profiler profiler50 = null;
        builder24.profiler = profiler50;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = builder52.serializedObjectSupporter;
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        builder52.log = log54;
        builder24.log = log54;
        log54.log("Retrofit-Idle");
        builder9.log = log54;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(serializedObjectSupporter26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(serializedObjectSupporter53);
        org.junit.Assert.assertNotNull(log54);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString9();
        retrofit.Server server5 = serializedObjectSupporter3.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder2.setServer(server5);
        retrofit.Server server9 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider10 = null;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor15 = serializedObjectSupporter13.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString9();
        retrofit.Server server18 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter6();
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = builder22.serializedObjectSupporter;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder22.log = log24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server9, provider10, executor11, executor12, requestInterceptor15, (retrofit.converter.Converter) gsonConverter19, profiler20, errorHandler21, log24, logLevel26);
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean29 = logLevel28.log();
        restAdapter27.setLogLevel(logLevel28);
        retrofit.client.Client.Provider provider31 = restAdapter27.getclientProvider();
        java.lang.String str32 = restAdapter27.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log33 = restAdapter27.log;
        retrofit.RestAdapter.Builder builder34 = builder6.setLog(log33);
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = builder35.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler37 = builder35.errorHandler;
        builder35.ensureSaneDefaults();
        retrofit.RestAdapter.Log log39 = builder35.log;
        retrofit.Profiler profiler40 = null;
        builder35.profiler = profiler40;
        retrofit.client.Client.Provider provider42 = builder35.getclientProvider();
        java.util.concurrent.Executor executor43 = builder35.callbackExecutor;
        retrofit.Profiler profiler44 = builder35.profiler;
        retrofit.RestAdapter.Log log45 = builder35.log;
        retrofit.RequestInterceptor requestInterceptor46 = builder35.requestInterceptor;
        builder6.requestInterceptor = requestInterceptor46;
        java.util.concurrent.Executor executor48 = builder6.getcallbackExecutor();
        retrofit.client.Client client49 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder50 = builder6.setClient(client49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-" + "'", str32, "Retrofit-");
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(serializedObjectSupporter36);
        org.junit.Assert.assertNull(errorHandler37);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(executor43);
        org.junit.Assert.assertNull(profiler44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNotNull(requestInterceptor46);
        org.junit.Assert.assertNull(executor48);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.Server server12 = new retrofit.Server("Retrofit-", "http://example.com/");
        java.lang.String str13 = server12.apiUrl;
        builder0.server = server12;
        java.util.concurrent.Executor executor15 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = builder16.serializedObjectSupporter;
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        builder16.log = log18;
        retrofit.Server server20 = builder16.server;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString9();
        retrofit.Server server24 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder26 = builder21.setConverter((retrofit.converter.Converter) gsonConverter25);
        builder21.ensureSaneDefaults();
        java.util.concurrent.Executor executor28 = null;
        builder21.httpExecutor = executor28;
        retrofit.client.Client.Provider provider30 = builder21.getclientProvider();
        builder16.setclientProvider(provider30);
        retrofit.Server server34 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider35 = null;
        java.util.concurrent.Executor executor36 = null;
        java.util.concurrent.Executor executor37 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor40 = serializedObjectSupporter38.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        retrofit.Server server43 = serializedObjectSupporter41.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter44 = serializedObjectSupporter41.deserializeObjectConverter6();
        retrofit.Profiler profiler45 = null;
        retrofit.ErrorHandler errorHandler46 = null;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = builder47.serializedObjectSupporter;
        retrofit.RestAdapter.Log log49 = retrofit.RestAdapter.Log.NONE;
        builder47.log = log49;
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter52 = new retrofit.RestAdapter(server34, provider35, executor36, executor37, requestInterceptor40, (retrofit.converter.Converter) gsonConverter44, profiler45, errorHandler46, log49, logLevel51);
        retrofit.Server server53 = restAdapter52.server;
        retrofit.Profiler profiler54 = restAdapter52.profiler;
        retrofit.RequestInterceptor requestInterceptor55 = restAdapter52.getrequestInterceptor();
        retrofit.RestAdapter.Builder builder56 = builder16.setRequestInterceptor(requestInterceptor55);
        retrofit.RestAdapter.Builder builder57 = builder0.setRequestInterceptor(requestInterceptor55);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(executor8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(server20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(server43);
        org.junit.Assert.assertNotNull(gsonConverter44);
        org.junit.Assert.assertNull(serializedObjectSupporter48);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertNull(profiler54);
        org.junit.Assert.assertNotNull(requestInterceptor55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        builder23.logLevel = logLevel24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        java.util.concurrent.Executor executor33 = null;
        builder26.httpExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder26.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = builder23.setClient(provider35);
        retrofit.Profiler profiler37 = builder23.profiler;
        retrofit.RequestInterceptor requestInterceptor38 = builder23.requestInterceptor;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = builder39.serializedObjectSupporter;
        retrofit.Server server43 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider44 = null;
        java.util.concurrent.Executor executor45 = null;
        java.util.concurrent.Executor executor46 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        java.lang.String str48 = serializedObjectSupporter47.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor49 = serializedObjectSupporter47.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString9();
        retrofit.Server server52 = serializedObjectSupporter50.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter50.deserializeObjectConverter6();
        retrofit.Profiler profiler54 = null;
        retrofit.ErrorHandler errorHandler55 = null;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = builder56.serializedObjectSupporter;
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        builder56.log = log58;
        retrofit.RestAdapter.LogLevel logLevel60 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter61 = new retrofit.RestAdapter(server43, provider44, executor45, executor46, requestInterceptor49, (retrofit.converter.Converter) gsonConverter53, profiler54, errorHandler55, log58, logLevel60);
        retrofit.RestAdapter.Builder builder62 = builder39.setRequestInterceptor(requestInterceptor49);
        retrofit.RestAdapter.LogLevel logLevel63 = retrofit.RestAdapter.LogLevel.BASIC;
        builder62.logLevel = logLevel63;
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        retrofit.Server server68 = serializedObjectSupporter66.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter69 = serializedObjectSupporter66.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder70 = builder65.setConverter((retrofit.converter.Converter) gsonConverter69);
        builder65.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        java.lang.String str73 = serializedObjectSupporter72.deserializeObjectString9();
        retrofit.Server server74 = serializedObjectSupporter72.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter75 = serializedObjectSupporter72.deserializeObjectConverter6();
        java.lang.String str76 = serializedObjectSupporter72.deserializeObjectString2();
        java.lang.String str77 = serializedObjectSupporter72.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler78 = serializedObjectSupporter72.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder79 = builder65.setErrorHandler(errorHandler78);
        builder79.ensureSaneDefaults();
        java.util.concurrent.Executor executor81 = builder79.getcallbackExecutor();
        builder62.sethttpExecutor(executor81);
        retrofit.client.Client.Provider provider83 = builder62.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor84 = builder62.requestInterceptor;
        builder23.requestInterceptor = requestInterceptor84;
        retrofit.Profiler profiler86 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder87 = builder23.setProfiler(profiler86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(profiler37);
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(server52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNull(serializedObjectSupporter57);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + logLevel63 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel63.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(server68);
        org.junit.Assert.assertNotNull(gsonConverter69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "http://example.com/" + "'", str73, "http://example.com/");
        org.junit.Assert.assertNotNull(server74);
        org.junit.Assert.assertNotNull(gsonConverter75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Retrofit-Idle" + "'", str76, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(executor81);
        org.junit.Assert.assertNull(provider83);
        org.junit.Assert.assertNotNull(requestInterceptor84);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.RestAdapter.Log log10 = builder0.log;
        retrofit.client.Client.Provider provider11 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        retrofit.Server server15 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter13.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder17 = builder12.setConverter((retrofit.converter.Converter) gsonConverter16);
        builder12.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        retrofit.Server server21 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter19.deserializeObjectConverter6();
        java.lang.String str23 = serializedObjectSupporter19.deserializeObjectString2();
        java.lang.String str24 = serializedObjectSupporter19.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler25 = serializedObjectSupporter19.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder26 = builder12.setErrorHandler(errorHandler25);
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = builder27.serializedObjectSupporter;
        retrofit.Server server31 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider32 = null;
        java.util.concurrent.Executor executor33 = null;
        java.util.concurrent.Executor executor34 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor37 = serializedObjectSupporter35.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        retrofit.Server server40 = serializedObjectSupporter38.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter38.deserializeObjectConverter6();
        retrofit.Profiler profiler42 = null;
        retrofit.ErrorHandler errorHandler43 = null;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = builder44.serializedObjectSupporter;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        builder44.log = log46;
        retrofit.RestAdapter.LogLevel logLevel48 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter49 = new retrofit.RestAdapter(server31, provider32, executor33, executor34, requestInterceptor37, (retrofit.converter.Converter) gsonConverter41, profiler42, errorHandler43, log46, logLevel48);
        retrofit.RestAdapter.Builder builder50 = builder27.setRequestInterceptor(requestInterceptor37);
        builder26.requestInterceptor = requestInterceptor37;
        retrofit.RestAdapter.Builder builder53 = builder26.setServer("http://example.com/");
        java.util.concurrent.Executor executor54 = builder53.httpExecutor;
        builder0.setcallbackExecutor(executor54);
        retrofit.ErrorHandler errorHandler56 = builder0.errorHandler;
        java.util.concurrent.Executor executor57 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Log log58 = builder0.log;
        retrofit.RestAdapter.Log log59 = builder0.log;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter60 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(executor8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Retrofit-Idle" + "'", str23, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(server40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNull(serializedObjectSupporter45);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(executor54);
        org.junit.Assert.assertNotNull(errorHandler56);
        org.junit.Assert.assertNotNull(executor57);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertNotNull(log59);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler6 = builder4.errorHandler;
        builder4.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder13 = builder8.setConverter((retrofit.converter.Converter) gsonConverter12);
        builder8.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        retrofit.Server server17 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter6();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString2();
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter15.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder22 = builder8.setErrorHandler(errorHandler21);
        builder22.ensureSaneDefaults();
        java.util.concurrent.Executor executor24 = builder22.getcallbackExecutor();
        builder4.httpExecutor = executor24;
        builder0.httpExecutor = executor24;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = builder27.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler29 = builder27.errorHandler;
        builder27.ensureSaneDefaults();
        retrofit.RestAdapter.Log log31 = builder27.log;
        retrofit.Profiler profiler32 = null;
        builder27.profiler = profiler32;
        retrofit.client.Client.Provider provider34 = builder27.getclientProvider();
        retrofit.RestAdapter.Builder builder35 = builder0.setClient(provider34);
        java.util.concurrent.Executor executor36 = builder35.callbackExecutor;
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = builder37.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler39 = builder37.errorHandler;
        builder37.ensureSaneDefaults();
        retrofit.RestAdapter.Log log41 = builder37.log;
        retrofit.Profiler profiler42 = null;
        builder37.profiler = profiler42;
        retrofit.client.Client.Provider provider44 = builder37.getclientProvider();
        java.util.concurrent.Executor executor45 = builder37.callbackExecutor;
        retrofit.Profiler profiler46 = builder37.profiler;
        retrofit.RestAdapter.Log log47 = builder37.log;
        retrofit.client.Client.Provider provider48 = builder37.getclientProvider();
        retrofit.RestAdapter.Builder builder49 = builder35.setClient(provider48);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(executor24);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(executor36);
        org.junit.Assert.assertNull(serializedObjectSupporter38);
        org.junit.Assert.assertNull(errorHandler39);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(provider44);
        org.junit.Assert.assertNotNull(executor45);
        org.junit.Assert.assertNull(profiler46);
        org.junit.Assert.assertNotNull(log47);
        org.junit.Assert.assertNotNull(provider48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter12.logLevel;
        retrofit.Server server18 = restAdapter12.server;
        java.util.concurrent.Executor executor19 = restAdapter12.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.Class class8 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.Server server24 = builder0.server;
        retrofit.RestAdapter.LogLevel logLevel25 = builder0.logLevel;
        java.util.concurrent.Executor executor26 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor26);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log2;
        retrofit.Server server4 = builder0.server;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter6 = builder5.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        builder5.errorHandler = errorHandler13;
        retrofit.RestAdapter.Builder builder15 = builder0.setErrorHandler(errorHandler13);
        retrofit.RequestInterceptor requestInterceptor16 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter20.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter20.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        java.lang.String str30 = serializedObjectSupporter26.deserializeObjectString2();
        java.lang.String str31 = serializedObjectSupporter26.deserializeObjectString4();
        java.lang.String str32 = serializedObjectSupporter26.deserializeObjectString4();
        retrofit.client.Response response33 = serializedObjectSupporter26.deserializeObjectResponse2();
        retrofit.client.Response response35 = restAdapter20.logAndReplaceResponse("", response33, (long) '#');
        retrofit.RestAdapter.LogLevel logLevel36 = restAdapter20.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString9();
        retrofit.Server server39 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter37.deserializeObjectConverter6();
        java.lang.String str41 = serializedObjectSupporter37.deserializeObjectString2();
        java.lang.String str42 = serializedObjectSupporter37.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler43 = serializedObjectSupporter37.deserializeObjectErrorHandler1();
        retrofit.Server server44 = serializedObjectSupporter37.deserializeObjectServer1();
        java.lang.String str45 = serializedObjectSupporter37.deserializeObjectString3();
        java.lang.Class class46 = serializedObjectSupporter37.deserializeObjectClass1();
        restAdapter20.serializedObjectSupporter = serializedObjectSupporter37;
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter37.deserializeObjectConverter4();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-Idle" + "'", str30, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Retrofit-Idle" + "'", str41, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler43);
        org.junit.Assert.assertNotNull(server44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(gsonConverter48);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Server server4 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log19, logLevel21);
        retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor10);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        builder23.logLevel = logLevel24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        java.util.concurrent.Executor executor33 = null;
        builder26.httpExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder26.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = builder23.setClient(provider35);
        retrofit.Profiler profiler37 = builder23.profiler;
        builder23.ensureSaneDefaults();
        builder23.ensureSaneDefaults();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(profiler37);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log2;
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder7.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler9 = builder7.errorHandler;
        builder7.ensureSaneDefaults();
        retrofit.RestAdapter.Log log11 = builder7.log;
        retrofit.Profiler profiler12 = null;
        builder7.profiler = profiler12;
        retrofit.client.Client.Provider provider14 = builder7.getclientProvider();
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString9();
        retrofit.Server server18 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder20 = builder15.setConverter((retrofit.converter.Converter) gsonConverter19);
        builder15.ensureSaneDefaults();
        java.util.concurrent.Executor executor22 = null;
        builder15.httpExecutor = executor22;
        retrofit.client.Client.Provider provider24 = builder15.getclientProvider();
        builder7.setclientProvider(provider24);
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder26.serializedObjectSupporter;
        retrofit.Server server30 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor36 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString9();
        retrofit.Server server39 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter37.deserializeObjectConverter6();
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = builder43.serializedObjectSupporter;
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        builder43.log = log45;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server30, provider31, executor32, executor33, requestInterceptor36, (retrofit.converter.Converter) gsonConverter40, profiler41, errorHandler42, log45, logLevel47);
        retrofit.RestAdapter.Builder builder49 = builder26.setRequestInterceptor(requestInterceptor36);
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.BASIC;
        builder49.logLevel = logLevel50;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString9();
        retrofit.Server server55 = serializedObjectSupporter53.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter56 = serializedObjectSupporter53.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder57 = builder52.setConverter((retrofit.converter.Converter) gsonConverter56);
        builder52.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        retrofit.Server server61 = serializedObjectSupporter59.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter59.deserializeObjectConverter6();
        java.lang.String str63 = serializedObjectSupporter59.deserializeObjectString2();
        java.lang.String str64 = serializedObjectSupporter59.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler65 = serializedObjectSupporter59.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder66 = builder52.setErrorHandler(errorHandler65);
        builder66.ensureSaneDefaults();
        java.util.concurrent.Executor executor68 = builder66.getcallbackExecutor();
        builder49.sethttpExecutor(executor68);
        java.util.concurrent.Executor executor70 = builder49.gethttpExecutor();
        builder7.sethttpExecutor(executor70);
        builder0.httpExecutor = executor70;
        retrofit.Profiler profiler73 = null;
        builder0.profiler = profiler73;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNull(serializedObjectSupporter44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(server55);
        org.junit.Assert.assertNotNull(gsonConverter56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(server61);
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Retrofit-Idle" + "'", str63, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "http://example.com/" + "'", str64, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(executor68);
        org.junit.Assert.assertNotNull(executor70);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        retrofit.Server server2 = new retrofit.Server("default", "http://example.com/");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.Server server7 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder9 = builder4.setConverter((retrofit.converter.Converter) gsonConverter8);
        builder4.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter11.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder18 = builder4.setErrorHandler(errorHandler17);
        builder18.ensureSaneDefaults();
        java.util.concurrent.Executor executor20 = builder18.getcallbackExecutor();
        builder0.httpExecutor = executor20;
        retrofit.RequestInterceptor requestInterceptor22 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = builder23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        builder23.log = log25;
        retrofit.Server server27 = builder23.server;
        java.util.concurrent.Executor executor28 = null;
        builder23.httpExecutor = executor28;
        retrofit.Server server32 = new retrofit.Server("", "");
        retrofit.RestAdapter.Builder builder33 = builder23.setServer(server32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder36 = builder34.setLogLevel(logLevel35);
        retrofit.converter.Converter converter37 = builder36.converter;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = builder38.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler40 = builder38.errorHandler;
        builder38.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler42 = builder38.errorHandler;
        retrofit.RestAdapter.Builder builder43 = builder36.setErrorHandler(errorHandler42);
        retrofit.RestAdapter.Builder builder44 = builder33.setErrorHandler(errorHandler42);
        retrofit.RestAdapter.Builder builder45 = builder0.setErrorHandler(errorHandler42);
        retrofit.client.Client.Provider provider46 = builder0.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(executor20);
        org.junit.Assert.assertNotNull(requestInterceptor22);
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(converter37);
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNull(errorHandler40);
        org.junit.Assert.assertNotNull(errorHandler42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(provider46);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        restAdapter12.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.converter.Converter converter16 = restAdapter12.converter;
        retrofit.client.Client.Provider provider17 = restAdapter12.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter12.httpExecutor;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter12.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        retrofit.client.Client.Provider provider17 = restAdapter12.getclientProvider();
        retrofit.ErrorHandler errorHandler18 = restAdapter12.errorHandler;
        retrofit.Profiler profiler19 = restAdapter12.profiler;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNull(profiler19);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.client.Client.Provider provider3 = null;
        builder2.clientProvider = provider3;
        retrofit.ErrorHandler errorHandler5 = null;
        builder2.errorHandler = errorHandler5;
        java.util.concurrent.Executor executor7 = builder2.getcallbackExecutor();
        retrofit.Server server10 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider11 = null;
        java.util.concurrent.Executor executor12 = null;
        java.util.concurrent.Executor executor13 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor16 = serializedObjectSupporter14.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = builder23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        builder23.log = log25;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server10, provider11, executor12, executor13, requestInterceptor16, (retrofit.converter.Converter) gsonConverter20, profiler21, errorHandler22, log25, logLevel27);
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean30 = logLevel29.log();
        restAdapter28.setLogLevel(logLevel29);
        retrofit.client.Client.Provider provider32 = restAdapter28.getclientProvider();
        java.lang.String str33 = restAdapter28.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log34 = restAdapter28.log;
        retrofit.RestAdapter.Builder builder35 = builder2.setLog(log34);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Retrofit-" + "'", str33, "Retrofit-");
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "http://example.com", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        java.lang.String str25 = restAdapter20.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log26 = restAdapter20.log;
        retrofit.Server server27 = restAdapter20.server;
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter20.logLevel;
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter20.new RestHandler();
        retrofit.converter.Converter converter30 = restAdapter20.converter;
        java.util.concurrent.Executor executor31 = restAdapter20.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler32 = restAdapter20.new RestHandler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-" + "'", str25, "Retrofit-");
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(converter30);
        org.junit.Assert.assertNull(executor31);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("default", "default", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList11, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "http://example.com/", headerList11, typedOutput16);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        retrofit.Server server1 = new retrofit.Server("hi!");
        retrofit.client.Client.Provider provider2 = null;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        retrofit.Server server7 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter11.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.Server server16 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter6();
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor13, (retrofit.converter.Converter) gsonConverter17, profiler18, errorHandler19, log22, logLevel24);
        retrofit.Server server28 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor34 = serializedObjectSupporter32.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        retrofit.Server server37 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter6();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        builder41.log = log43;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log43, logLevel45);
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.Server server51 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider52 = null;
        java.util.concurrent.Executor executor53 = null;
        java.util.concurrent.Executor executor54 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor57 = serializedObjectSupporter55.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        java.lang.String str59 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.Server server60 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter58.deserializeObjectConverter6();
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder64.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server51, provider52, executor53, executor54, requestInterceptor57, (retrofit.converter.Converter) gsonConverter61, profiler62, errorHandler63, log66, logLevel68);
        retrofit.Server server72 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider73 = null;
        java.util.concurrent.Executor executor74 = null;
        java.util.concurrent.Executor executor75 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor78 = serializedObjectSupporter76.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        retrofit.Server server81 = serializedObjectSupporter79.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter79.deserializeObjectConverter6();
        retrofit.Profiler profiler83 = null;
        retrofit.ErrorHandler errorHandler84 = null;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = builder85.serializedObjectSupporter;
        retrofit.RestAdapter.Log log87 = retrofit.RestAdapter.Log.NONE;
        builder85.log = log87;
        retrofit.RestAdapter.LogLevel logLevel89 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter90 = new retrofit.RestAdapter(server72, provider73, executor74, executor75, requestInterceptor78, (retrofit.converter.Converter) gsonConverter82, profiler83, errorHandler84, log87, logLevel89);
        retrofit.RestAdapter restAdapter91 = new retrofit.RestAdapter(server1, provider2, executor3, executor4, requestInterceptor13, (retrofit.converter.Converter) gsonConverter38, profiler47, errorHandler48, log66, logLevel89);
        java.util.concurrent.Executor executor92 = restAdapter91.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter93 = restAdapter91.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "http://example.com/" + "'", str77, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(server81);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNull(serializedObjectSupporter86);
        org.junit.Assert.assertNotNull(log87);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor92);
        org.junit.Assert.assertNull(serializedObjectSupporter93);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString9();
        retrofit.Server server3 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter6();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.Server server19 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        retrofit.Server server28 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter6();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder32.serializedObjectSupporter;
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log34, logLevel36);
        retrofit.RestAdapter.Builder builder38 = builder15.setRequestInterceptor(requestInterceptor25);
        builder14.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder41 = builder14.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString9();
        retrofit.Server server45 = serializedObjectSupporter43.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter43.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder47 = builder42.setConverter((retrofit.converter.Converter) gsonConverter46);
        builder42.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.Server server51 = serializedObjectSupporter49.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter49.deserializeObjectConverter6();
        java.lang.String str53 = serializedObjectSupporter49.deserializeObjectString2();
        java.lang.String str54 = serializedObjectSupporter49.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler55 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder56 = builder42.setErrorHandler(errorHandler55);
        retrofit.client.Client.Provider provider57 = builder56.clientProvider;
        retrofit.RestAdapter.Builder builder58 = builder41.setClient(provider57);
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = new retrofit.SerializedObjectSupporter();
        java.lang.String str61 = serializedObjectSupporter60.deserializeObjectString9();
        retrofit.Server server62 = serializedObjectSupporter60.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter60.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder64 = builder59.setConverter((retrofit.converter.Converter) gsonConverter63);
        builder59.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        retrofit.Server server68 = serializedObjectSupporter66.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter69 = serializedObjectSupporter66.deserializeObjectConverter6();
        java.lang.String str70 = serializedObjectSupporter66.deserializeObjectString2();
        java.lang.String str71 = serializedObjectSupporter66.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler72 = serializedObjectSupporter66.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder73 = builder59.setErrorHandler(errorHandler72);
        builder73.ensureSaneDefaults();
        java.util.concurrent.Executor executor75 = builder73.getcallbackExecutor();
        java.util.concurrent.Executor executor76 = builder73.callbackExecutor;
        builder58.httpExecutor = executor76;
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = builder58.serializedObjectSupporter;
        retrofit.Profiler profiler79 = builder58.profiler;
        retrofit.Profiler profiler80 = null;
        builder58.profiler = profiler80;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(server51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Retrofit-Idle" + "'", str53, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(provider57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "http://example.com/" + "'", str61, "http://example.com/");
        org.junit.Assert.assertNotNull(server62);
        org.junit.Assert.assertNotNull(gsonConverter63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(server68);
        org.junit.Assert.assertNotNull(gsonConverter69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Retrofit-Idle" + "'", str70, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "http://example.com/" + "'", str71, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(executor75);
        org.junit.Assert.assertNotNull(executor76);
        org.junit.Assert.assertNull(serializedObjectSupporter78);
        org.junit.Assert.assertNull(profiler79);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        restAdapter12.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter12.getLogLevel();
        java.util.concurrent.Executor executor17 = restAdapter12.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter12.callbackExecutor;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.client.Client.Provider provider3 = null;
        builder2.clientProvider = provider3;
        retrofit.ErrorHandler errorHandler5 = null;
        builder2.errorHandler = errorHandler5;
        retrofit.Server server7 = builder2.server;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("hi!");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        java.util.List<retrofit.client.Header> headerList20 = null;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", headerList20, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request26 = restAdapter10.logAndReplaceRequest(request25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        retrofit.Server server2 = new retrofit.Server("", "");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = null;
        retrofit.RestAdapter.LogLevel logLevel11 = null;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel11);
        java.lang.String str13 = restAdapter12.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        restAdapter12.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.Profiler profiler16 = restAdapter12.profiler;
        java.util.concurrent.Executor executor17 = restAdapter12.httpExecutor;
        retrofit.converter.Converter converter18 = restAdapter12.getconverter();
        retrofit.RestAdapter.Log log19 = restAdapter12.log;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder20.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler22 = builder20.errorHandler;
        builder20.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler24 = builder20.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        retrofit.Server server27 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter25.deserializeObjectConverter6();
        java.lang.String str29 = serializedObjectSupporter25.deserializeObjectString2();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.Profiler profiler31 = builder20.profiler;
        retrofit.RestAdapter.LogLevel logLevel32 = builder20.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter12.setLogLevel(logLevel32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNull(errorHandler22);
        org.junit.Assert.assertNotNull(errorHandler24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.Server server7 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder9 = builder4.setConverter((retrofit.converter.Converter) gsonConverter8);
        builder4.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter6();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter11.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder18 = builder4.setErrorHandler(errorHandler17);
        builder18.ensureSaneDefaults();
        java.util.concurrent.Executor executor20 = builder18.getcallbackExecutor();
        builder0.httpExecutor = executor20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = builder22.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler24 = builder22.errorHandler;
        builder22.ensureSaneDefaults();
        retrofit.RestAdapter.Log log26 = builder22.log;
        retrofit.Profiler profiler27 = null;
        builder22.profiler = profiler27;
        retrofit.client.Client.Provider provider29 = builder22.getclientProvider();
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        java.lang.String str32 = serializedObjectSupporter31.deserializeObjectString9();
        retrofit.Server server33 = serializedObjectSupporter31.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter31.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder35 = builder30.setConverter((retrofit.converter.Converter) gsonConverter34);
        builder30.ensureSaneDefaults();
        java.util.concurrent.Executor executor37 = null;
        builder30.httpExecutor = executor37;
        retrofit.client.Client.Provider provider39 = builder30.getclientProvider();
        builder22.setclientProvider(provider39);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.Server server45 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor51 = serializedObjectSupporter49.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        retrofit.Server server54 = serializedObjectSupporter52.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter6();
        retrofit.Profiler profiler56 = null;
        retrofit.ErrorHandler errorHandler57 = null;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = builder58.serializedObjectSupporter;
        retrofit.RestAdapter.Log log60 = retrofit.RestAdapter.Log.NONE;
        builder58.log = log60;
        retrofit.RestAdapter.LogLevel logLevel62 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter63 = new retrofit.RestAdapter(server45, provider46, executor47, executor48, requestInterceptor51, (retrofit.converter.Converter) gsonConverter55, profiler56, errorHandler57, log60, logLevel62);
        retrofit.RestAdapter.Builder builder64 = builder41.setRequestInterceptor(requestInterceptor51);
        retrofit.RestAdapter.LogLevel logLevel65 = retrofit.RestAdapter.LogLevel.BASIC;
        builder64.logLevel = logLevel65;
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        java.lang.String str69 = serializedObjectSupporter68.deserializeObjectString9();
        retrofit.Server server70 = serializedObjectSupporter68.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter71 = serializedObjectSupporter68.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder72 = builder67.setConverter((retrofit.converter.Converter) gsonConverter71);
        builder67.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        java.lang.String str75 = serializedObjectSupporter74.deserializeObjectString9();
        retrofit.Server server76 = serializedObjectSupporter74.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter77 = serializedObjectSupporter74.deserializeObjectConverter6();
        java.lang.String str78 = serializedObjectSupporter74.deserializeObjectString2();
        java.lang.String str79 = serializedObjectSupporter74.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler80 = serializedObjectSupporter74.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder81 = builder67.setErrorHandler(errorHandler80);
        builder81.ensureSaneDefaults();
        java.util.concurrent.Executor executor83 = builder81.getcallbackExecutor();
        builder64.sethttpExecutor(executor83);
        java.util.concurrent.Executor executor85 = builder64.gethttpExecutor();
        builder22.sethttpExecutor(executor85);
        builder0.httpExecutor = executor85;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(executor20);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNull(errorHandler24);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(server33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(server54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNull(serializedObjectSupporter59);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "http://example.com/" + "'", str69, "http://example.com/");
        org.junit.Assert.assertNotNull(server70);
        org.junit.Assert.assertNotNull(gsonConverter71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "http://example.com/" + "'", str75, "http://example.com/");
        org.junit.Assert.assertNotNull(server76);
        org.junit.Assert.assertNotNull(gsonConverter77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Retrofit-Idle" + "'", str78, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "http://example.com/" + "'", str79, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(executor83);
        org.junit.Assert.assertNotNull(executor85);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.Profiler profiler22 = restAdapter20.profiler;
        java.util.concurrent.Executor executor23 = restAdapter20.getcallbackExecutor();
        java.util.concurrent.Executor executor24 = restAdapter20.callbackExecutor;
        retrofit.Profiler profiler25 = restAdapter20.profiler;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(profiler25);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.Server server21 = restAdapter20.server;
        retrofit.RestAdapter.Log log22 = restAdapter20.log;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter20.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter20.logLevel;
        retrofit.client.Client.Provider provider25 = restAdapter20.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter20.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor27 = restAdapter20.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(requestInterceptor27);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler20 = restAdapter10.getprofiler();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(profiler20);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor8 = serializedObjectSupporter6.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        retrofit.Server server11 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter6();
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder15.log = log17;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server2, provider3, executor4, executor5, requestInterceptor8, (retrofit.converter.Converter) gsonConverter12, profiler13, errorHandler14, log17, logLevel19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean22 = logLevel21.log();
        restAdapter20.setLogLevel(logLevel21);
        retrofit.client.Client.Provider provider24 = restAdapter20.getclientProvider();
        retrofit.ErrorHandler errorHandler25 = restAdapter20.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter20.new RestHandler();
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList36, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList36, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList36, typedOutput44);
        retrofit.client.Request request46 = restAdapter20.logAndReplaceRequest(request45);
        retrofit.converter.Converter converter47 = restAdapter20.getconverter();
        retrofit.Profiler profiler48 = restAdapter20.getprofiler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(converter47);
        org.junit.Assert.assertNull(profiler48);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server19 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter6();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString2();
        java.lang.String str22 = serializedObjectSupporter17.deserializeObjectString4();
        java.lang.String str23 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.client.Response response24 = serializedObjectSupporter17.deserializeObjectResponse3();
        retrofit.client.Response response25 = serializedObjectSupporter17.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response27 = restAdapter10.logAndReplaceResponse("Retrofit-", response25, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "http://example.com");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.converter.Converter converter3 = builder2.converter;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler6 = builder4.errorHandler;
        builder4.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler8 = builder4.errorHandler;
        retrofit.RestAdapter.Builder builder9 = builder2.setErrorHandler(errorHandler8);
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder10.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler12 = builder10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean14 = logLevel13.log();
        builder10.logLevel = logLevel13;
        retrofit.Server server17 = new retrofit.Server("hi!");
        builder10.server = server17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor21 = serializedObjectSupporter19.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response22 = serializedObjectSupporter19.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder24 = builder10.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.converter.Converter converter25 = builder10.converter;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        retrofit.Server server29 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder31 = builder26.setConverter((retrofit.converter.Converter) gsonConverter30);
        builder26.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString9();
        retrofit.Server server35 = serializedObjectSupporter33.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter6();
        java.lang.String str37 = serializedObjectSupporter33.deserializeObjectString2();
        java.lang.String str38 = serializedObjectSupporter33.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler39 = serializedObjectSupporter33.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder40 = builder26.setErrorHandler(errorHandler39);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = builder41.serializedObjectSupporter;
        retrofit.Server server45 = new retrofit.Server("Retrofit-", "http://example.com/");
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor51 = serializedObjectSupporter49.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        retrofit.Server server54 = serializedObjectSupporter52.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter6();
        retrofit.Profiler profiler56 = null;
        retrofit.ErrorHandler errorHandler57 = null;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = builder58.serializedObjectSupporter;
        retrofit.RestAdapter.Log log60 = retrofit.RestAdapter.Log.NONE;
        builder58.log = log60;
        retrofit.RestAdapter.LogLevel logLevel62 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter63 = new retrofit.RestAdapter(server45, provider46, executor47, executor48, requestInterceptor51, (retrofit.converter.Converter) gsonConverter55, profiler56, errorHandler57, log60, logLevel62);
        retrofit.RestAdapter.Builder builder64 = builder41.setRequestInterceptor(requestInterceptor51);
        builder40.requestInterceptor = requestInterceptor51;
        retrofit.RestAdapter.Builder builder67 = builder40.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        java.lang.String str70 = serializedObjectSupporter69.deserializeObjectString9();
        retrofit.Server server71 = serializedObjectSupporter69.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter69.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder73 = builder68.setConverter((retrofit.converter.Converter) gsonConverter72);
        builder68.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        java.lang.String str76 = serializedObjectSupporter75.deserializeObjectString9();
        retrofit.Server server77 = serializedObjectSupporter75.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter78 = serializedObjectSupporter75.deserializeObjectConverter6();
        java.lang.String str79 = serializedObjectSupporter75.deserializeObjectString2();
        java.lang.String str80 = serializedObjectSupporter75.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler81 = serializedObjectSupporter75.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder82 = builder68.setErrorHandler(errorHandler81);
        retrofit.client.Client.Provider provider83 = builder82.clientProvider;
        retrofit.RestAdapter.Builder builder84 = builder67.setClient(provider83);
        builder10.setclientProvider(provider83);
        retrofit.RestAdapter.Builder builder86 = builder9.setClient(provider83);
        retrofit.RestAdapter.Builder builder87 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter88 = builder87.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler89 = builder87.errorHandler;
        builder87.ensureSaneDefaults();
        retrofit.RestAdapter.Log log91 = builder87.log;
        retrofit.Profiler profiler92 = null;
        builder87.profiler = profiler92;
        retrofit.client.Client.Provider provider94 = builder87.getclientProvider();
        retrofit.RestAdapter.Builder builder95 = builder86.setClient(provider94);
        retrofit.Profiler profiler96 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder97 = builder86.setProfiler(profiler96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNotNull(errorHandler8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(server54);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNull(serializedObjectSupporter59);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(server71);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "http://example.com/" + "'", str76, "http://example.com/");
        org.junit.Assert.assertNotNull(server77);
        org.junit.Assert.assertNotNull(gsonConverter78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Retrofit-Idle" + "'", str79, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(provider83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNull(serializedObjectSupporter88);
        org.junit.Assert.assertNull(errorHandler89);
        org.junit.Assert.assertNotNull(log91);
        org.junit.Assert.assertNotNull(provider94);
        org.junit.Assert.assertNotNull(builder95);
    }
}

