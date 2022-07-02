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
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request11 = serializedObjectSupporter10.deserializeObjectRequest1();
        retrofit.client.Request request12 = serializedObjectSupporter10.deserializeObjectRequest5();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter10.deserializeObjectConverter7();
        retrofit.Server server15 = serializedObjectSupporter10.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder16 = builder0.setServer(server15);
        retrofit.RestAdapter.LogLevel logLevel17 = builder0.logLevel;
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "POST" + "'", str13, "POST");
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter26 = restAdapter23.converter;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request29 = serializedObjectSupporter28.deserializeObjectRequest8();
        retrofit.client.Request request30 = serializedObjectSupporter28.deserializeObjectRequest7();
        retrofit.client.Request request31 = serializedObjectSupporter28.deserializeObjectRequest2();
        retrofit.client.Request request32 = serializedObjectSupporter28.deserializeObjectRequest8();
        restHandler27.serializedObjectSupporter = serializedObjectSupporter28;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = restHandler27.serializedObjectSupporter;
        retrofit.client.Request request35 = serializedObjectSupporter34.deserializeObjectRequest6();
        retrofit.client.Request request36 = serializedObjectSupporter34.deserializeObjectRequest5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(serializedObjectSupporter34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request36);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.converter;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = builder27.serializedObjectSupporter;
        retrofit.Profiler profiler29 = builder27.profiler;
        retrofit.RestAdapter.LogLevel logLevel30 = builder27.logLevel;
        restAdapter23.logLevel = logLevel30;
        retrofit.Profiler profiler32 = restAdapter23.profiler;
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNull(profiler29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder3.logLevel = logLevel5;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        retrofit.client.Request request12 = serializedObjectSupporter8.deserializeObjectRequest6();
        retrofit.Server server13 = serializedObjectSupporter8.deserializeObjectServer1();
        builder3.server = server13;
        java.util.concurrent.Executor executor15 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel16 = builder3.logLevel;
        java.util.concurrent.Executor executor17 = builder3.httpExecutor;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GET" + "'", str9, "GET");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.client.Client.Provider provider28 = restAdapter23.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter2();
        retrofit.client.Request request32 = serializedObjectSupporter29.deserializeObjectRequest2();
        retrofit.mime.TypedOutput typedOutput33 = request32.getBody();
        retrofit.client.Request request34 = restAdapter23.logAndReplaceRequest(request32);
        java.util.concurrent.Executor executor35 = restAdapter23.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNull(typedOutput33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNull(executor35);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GET" + "'", str7, "GET");
        org.junit.Assert.assertNotNull(request8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter3();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.Server server11 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.client.Client.Provider provider12 = null;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor17 = serializedObjectSupporter15.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest1();
        retrofit.client.Request request20 = serializedObjectSupporter18.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = null;
        builder24.sethttpExecutor(executor25);
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        builder24.log = log27;
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter30 = new retrofit.RestAdapter(server11, provider12, executor13, executor14, requestInterceptor17, (retrofit.converter.Converter) gsonConverter21, profiler22, errorHandler23, log27, logLevel29);
        java.util.concurrent.Executor executor31 = restAdapter30.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter30.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter30.logLevel;
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = builder34.serializedObjectSupporter;
        retrofit.Profiler profiler36 = builder34.profiler;
        retrofit.RestAdapter.LogLevel logLevel37 = builder34.logLevel;
        boolean boolean38 = logLevel37.log();
        restAdapter30.setLogLevel(logLevel37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request41 = serializedObjectSupporter40.deserializeObjectRequest1();
        retrofit.client.Request request42 = serializedObjectSupporter40.deserializeObjectRequest8();
        retrofit.client.Request request43 = serializedObjectSupporter40.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        restAdapter30.serializedObjectSupporter = serializedObjectSupporter40;
        retrofit.RestAdapter.LogLevel logLevel46 = restAdapter30.getLogLevel();
        builder0.logLevel = logLevel46;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter35);
        org.junit.Assert.assertNull(profiler36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.client.Client.Provider provider28 = restAdapter23.getclientProvider();
        java.lang.String str29 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.logLevel;
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter23.logLevel;
        retrofit.RestAdapter.RestHandler restHandler32 = restAdapter23.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter23.new RestHandler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter23.logLevel = logLevel25;
        retrofit.Profiler profiler27 = restAdapter23.profiler;
        retrofit.client.Client.Provider provider28 = restAdapter23.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = restAdapter23.serializedObjectSupporter;
        retrofit.Profiler profiler30 = restAdapter23.getprofiler();
        java.util.concurrent.Executor executor31 = restAdapter23.callbackExecutor;
        java.util.concurrent.Executor executor32 = restAdapter23.httpExecutor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNull(profiler30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(executor32);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.client.Client.Provider provider28 = restAdapter23.getclientProvider();
        java.lang.String str29 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.logLevel;
        retrofit.client.Client.Provider provider31 = restAdapter23.clientProvider;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider31);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder7.serializedObjectSupporter;
        retrofit.Profiler profiler9 = builder7.profiler;
        retrofit.RestAdapter.LogLevel logLevel10 = builder7.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter.Log log12 = null;
        builder0.log = log12;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = builder14.serializedObjectSupporter;
        retrofit.client.Client.Provider provider16 = null;
        builder14.setclientProvider(provider16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = null;
        builder18.sethttpExecutor(executor19);
        retrofit.RestAdapter.Log log21 = null;
        builder18.log = log21;
        java.util.concurrent.Executor executor23 = builder18.callbackExecutor;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder18.log = log24;
        retrofit.RestAdapter.Builder builder26 = builder14.setLog(log24);
        retrofit.RestAdapter.Builder builder27 = builder0.setLog(log24);
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = builder28.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = builder28.serializedObjectSupporter;
        java.util.concurrent.Executor executor31 = null;
        builder28.httpExecutor = executor31;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter33.deserializeObjectConverter2();
        builder28.serializedObjectSupporter = serializedObjectSupporter33;
        retrofit.client.Client.Provider provider37 = builder28.getclientProvider();
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = builder38.serializedObjectSupporter;
        retrofit.client.Client.Provider provider40 = null;
        builder38.setclientProvider(provider40);
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor43 = null;
        builder42.sethttpExecutor(executor43);
        retrofit.RestAdapter.Log log45 = null;
        builder42.log = log45;
        java.util.concurrent.Executor executor47 = builder42.callbackExecutor;
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        builder42.log = log48;
        retrofit.RestAdapter.Builder builder50 = builder38.setLog(log48);
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter51.deserializeObjectConverter3();
        java.lang.String str54 = serializedObjectSupporter51.deserializeObjectString4();
        retrofit.client.Request request55 = serializedObjectSupporter51.deserializeObjectRequest6();
        retrofit.Server server56 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder57 = builder50.setServer(server56);
        retrofit.client.Client.Provider provider58 = null;
        java.util.concurrent.Executor executor59 = null;
        java.util.concurrent.Executor executor60 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request62 = serializedObjectSupporter61.deserializeObjectRequest1();
        retrofit.client.Request request63 = serializedObjectSupporter61.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor64 = serializedObjectSupporter61.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request66 = serializedObjectSupporter65.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter65.deserializeObjectConverter2();
        retrofit.Profiler profiler68 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        java.lang.String str70 = serializedObjectSupporter69.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter71 = serializedObjectSupporter69.deserializeObjectConverter3();
        java.lang.String str72 = serializedObjectSupporter69.deserializeObjectString4();
        retrofit.client.Request request73 = serializedObjectSupporter69.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler74 = serializedObjectSupporter69.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = builder75.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = builder75.serializedObjectSupporter;
        retrofit.client.Client.Provider provider78 = null;
        builder75.clientProvider = provider78;
        retrofit.RestAdapter.Log log80 = retrofit.RestAdapter.Log.NONE;
        builder75.log = log80;
        retrofit.RestAdapter.Builder builder82 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor83 = null;
        builder82.setcallbackExecutor(executor83);
        java.util.concurrent.Executor executor85 = null;
        builder82.setcallbackExecutor(executor85);
        retrofit.client.Client.Provider provider87 = null;
        builder82.clientProvider = provider87;
        retrofit.RestAdapter.Builder builder89 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter90 = builder89.serializedObjectSupporter;
        retrofit.Profiler profiler91 = builder89.profiler;
        retrofit.RestAdapter.LogLevel logLevel92 = builder89.logLevel;
        builder82.logLevel = logLevel92;
        retrofit.RestAdapter restAdapter94 = new retrofit.RestAdapter(server56, provider58, executor59, executor60, requestInterceptor64, (retrofit.converter.Converter) gsonConverter67, profiler68, errorHandler74, log80, logLevel92);
        retrofit.RestAdapter.Builder builder95 = builder28.setErrorHandler(errorHandler74);
        retrofit.RestAdapter.Builder builder96 = builder27.setErrorHandler(errorHandler74);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNull(serializedObjectSupporter30);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNull(executor47);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "GET" + "'", str52, "GET");
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertNotNull(server56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(request62);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(requestInterceptor64);
        org.junit.Assert.assertNotNull(request66);
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "GET" + "'", str70, "GET");
        org.junit.Assert.assertNotNull(gsonConverter71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "http://example.com/" + "'", str72, "http://example.com/");
        org.junit.Assert.assertNotNull(request73);
        org.junit.Assert.assertNotNull(errorHandler74);
        org.junit.Assert.assertNull(serializedObjectSupporter76);
        org.junit.Assert.assertNull(serializedObjectSupporter77);
        org.junit.Assert.assertNotNull(log80);
        org.junit.Assert.assertNull(serializedObjectSupporter90);
        org.junit.Assert.assertNull(profiler91);
        org.junit.Assert.assertTrue("'" + logLevel92 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel92.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(errorHandler3);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter23.getLogLevel();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        java.util.concurrent.Executor executor27 = restAdapter23.gethttpExecutor();
        retrofit.ErrorHandler errorHandler28 = restAdapter23.geterrorHandler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(errorHandler28);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        retrofit.Profiler profiler26 = restAdapter23.getprofiler();
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.Server server32 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter36.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request40 = serializedObjectSupporter39.deserializeObjectRequest1();
        retrofit.client.Request request41 = serializedObjectSupporter39.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter39.deserializeObjectConverter5();
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = null;
        builder45.sethttpExecutor(executor46);
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        builder45.log = log48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor38, (retrofit.converter.Converter) gsonConverter42, profiler43, errorHandler44, log48, logLevel50);
        java.util.concurrent.Executor executor52 = restAdapter51.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter53.deserializeObjectConverter3();
        java.lang.String str56 = serializedObjectSupporter53.deserializeObjectString4();
        restAdapter51.serializedObjectSupporter = serializedObjectSupporter53;
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter53;
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request60 = serializedObjectSupporter59.deserializeObjectRequest1();
        retrofit.client.Request request61 = serializedObjectSupporter59.deserializeObjectRequest8();
        java.util.List<retrofit.client.Header> headerList62 = request61.headers;
        retrofit.client.Request request63 = restAdapter23.logAndReplaceRequest(request61);
        retrofit.RestAdapter.LogLevel logLevel64 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-" + "'", str37, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "GET" + "'", str54, "GET");
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(request60);
        org.junit.Assert.assertNotNull(request61);
        org.junit.Assert.assertNotNull(headerList62);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertTrue("'" + logLevel64 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel64.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        retrofit.Profiler profiler27 = restAdapter23.profiler;
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter23.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter23.new RestHandler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request14 = serializedObjectSupporter13.deserializeObjectRequest1();
        retrofit.Server server15 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder16 = builder12.setServer(server15);
        builder12.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        java.lang.String str27 = restAdapter23.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restAdapter23.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter23.logLevel;
        java.lang.String str30 = restAdapter23.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider31 = restAdapter23.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter23.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter23.server;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-" + "'", str30, "Retrofit-");
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertNotNull(server33);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.client.Client.Provider provider28 = restAdapter23.getclientProvider();
        java.lang.String str29 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.logLevel;
        retrofit.Server server31 = restAdapter23.getserver();
        retrofit.converter.Converter converter32 = restAdapter23.converter;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(converter32);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        builder11.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler13 = builder11.errorHandler;
        java.util.concurrent.Executor executor14 = builder11.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = builder15.serializedObjectSupporter;
        java.util.concurrent.Executor executor18 = null;
        builder15.httpExecutor = executor18;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request21 = serializedObjectSupporter20.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter20.deserializeObjectConverter2();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider25 = builder24.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder27 = builder24.setLogLevel(logLevel26);
        retrofit.converter.Converter converter28 = builder27.converter;
        java.util.concurrent.Executor executor29 = null;
        builder27.sethttpExecutor(executor29);
        retrofit.RestAdapter.Builder builder32 = builder27.setServer("GET");
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = null;
        builder33.setcallbackExecutor(executor34);
        java.util.concurrent.Executor executor36 = null;
        builder33.setcallbackExecutor(executor36);
        builder33.ensureSaneDefaults();
        java.util.concurrent.Executor executor39 = builder33.callbackExecutor;
        builder32.setcallbackExecutor(executor39);
        builder15.httpExecutor = executor39;
        retrofit.RestAdapter.Builder builder42 = builder0.setExecutors(executor14, executor39);
        retrofit.Profiler profiler43 = null;
        builder0.profiler = profiler43;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter45.deserializeObjectConverter3();
        java.lang.String str48 = serializedObjectSupporter45.deserializeObjectString4();
        retrofit.Server server49 = serializedObjectSupporter45.deserializeObjectServer1();
        retrofit.client.Client.Provider provider50 = null;
        java.util.concurrent.Executor executor51 = null;
        java.util.concurrent.Executor executor52 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor55 = serializedObjectSupporter53.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request57 = serializedObjectSupporter56.deserializeObjectRequest1();
        retrofit.client.Request request58 = serializedObjectSupporter56.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter56.deserializeObjectConverter5();
        retrofit.Profiler profiler60 = null;
        retrofit.ErrorHandler errorHandler61 = null;
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor63 = null;
        builder62.sethttpExecutor(executor63);
        retrofit.RestAdapter.Log log65 = retrofit.RestAdapter.Log.NONE;
        builder62.log = log65;
        retrofit.RestAdapter.LogLevel logLevel67 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter68 = new retrofit.RestAdapter(server49, provider50, executor51, executor52, requestInterceptor55, (retrofit.converter.Converter) gsonConverter59, profiler60, errorHandler61, log65, logLevel67);
        java.util.concurrent.Executor executor69 = restAdapter68.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor70 = restAdapter68.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel71 = restAdapter68.logLevel;
        java.util.concurrent.Executor executor72 = restAdapter68.getcallbackExecutor();
        retrofit.Server server73 = restAdapter68.server;
        retrofit.RestAdapter.Builder builder74 = builder0.setServer(server73);
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(executor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(executor39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "GET" + "'", str46, "GET");
        org.junit.Assert.assertNotNull(gsonConverter47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(server49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Retrofit-" + "'", str54, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor55);
        org.junit.Assert.assertNotNull(request57);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(log65);
        org.junit.Assert.assertTrue("'" + logLevel67 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel67.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor69);
        org.junit.Assert.assertNotNull(requestInterceptor70);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor72);
        org.junit.Assert.assertNotNull(server73);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.ErrorHandler errorHandler3 = builder0.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request5 = serializedObjectSupporter4.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter4.deserializeObjectConverter4();
        retrofit.client.Request request8 = serializedObjectSupporter4.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter4.deserializeObjectConverter2();
        builder0.converter = gsonConverter9;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertNull(errorHandler3);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request6 = serializedObjectSupporter5.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.client.Request request9 = serializedObjectSupporter5.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter5();
        retrofit.Server server11 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.client.Request request14 = serializedObjectSupporter5.deserializeObjectRequest8();
        java.lang.String str15 = serializedObjectSupporter5.deserializeObjectString1();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider27 = restAdapter23.clientProvider;
        retrofit.Profiler profiler28 = restAdapter23.getprofiler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertNull(profiler28);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder8.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder8.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = null;
        builder8.httpExecutor = executor11;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request14 = serializedObjectSupporter13.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter2();
        builder8.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.client.Request request17 = serializedObjectSupporter13.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter13.deserializeObjectConverter5();
        retrofit.Server server19 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter13.deserializeObjectConverter2();
        builder0.converter = gsonConverter20;
        java.util.concurrent.Executor executor22 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider23 = builder0.getclientProvider();
        retrofit.Profiler profiler24 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder25 = builder0.setProfiler(profiler24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter2();
        retrofit.client.Request request12 = serializedObjectSupporter9.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        builder0.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString4();
        retrofit.client.Request request16 = serializedObjectSupporter9.deserializeObjectRequest6();
        java.lang.String str17 = request16.method;
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GET" + "'", str17, "GET");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter23.logLevel;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = builder27.serializedObjectSupporter;
        retrofit.Profiler profiler29 = builder27.profiler;
        retrofit.RestAdapter.LogLevel logLevel30 = builder27.logLevel;
        boolean boolean31 = logLevel30.log();
        restAdapter23.setLogLevel(logLevel30);
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.client.Request request35 = serializedObjectSupporter33.deserializeObjectRequest8();
        retrofit.client.Request request36 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler37 = serializedObjectSupporter33.deserializeObjectErrorHandler1();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter33;
        retrofit.mime.TypedString typedString39 = serializedObjectSupporter33.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter33.deserializeObjectConverter7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNull(profiler29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(errorHandler37);
        org.junit.Assert.assertNotNull(typedString39);
        org.junit.Assert.assertNotNull(gsonConverter40);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder3.logLevel = logLevel5;
        retrofit.RestAdapter.Builder builder8 = builder3.setServer("POST");
        java.util.concurrent.Executor executor9 = builder8.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder8.serializedObjectSupporter;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder3.logLevel = logLevel5;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        retrofit.client.Request request12 = serializedObjectSupporter8.deserializeObjectRequest6();
        retrofit.Server server13 = serializedObjectSupporter8.deserializeObjectServer1();
        builder3.server = server13;
        java.util.concurrent.Executor executor15 = builder3.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor16 = null;
        builder3.requestInterceptor = requestInterceptor16;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GET" + "'", str9, "GET");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.mime.TypedOutput typedOutput4 = request3.body;
        java.lang.String str5 = request3.url;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNull(typedOutput4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str5 = request4.method;
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.lang.String str7 = request4.url;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request3 = serializedObjectSupporter2.deserializeObjectRequest1();
        retrofit.client.Request request4 = serializedObjectSupporter2.deserializeObjectRequest5();
        java.lang.String str5 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList6 = request4.headers;
        java.util.List<retrofit.client.Header> headerList9 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request11 = serializedObjectSupporter10.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        retrofit.client.Request request13 = serializedObjectSupporter10.deserializeObjectRequest6();
        retrofit.mime.TypedString typedString14 = serializedObjectSupporter10.deserializeObjectTypedOutput2();
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList9, (retrofit.mime.TypedOutput) typedString14);
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "Retrofit-", headerList6, (retrofit.mime.TypedOutput) typedString14);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(typedString14);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString5 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(typedString5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "POST" + "'", str6, "POST");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-Idle" + "'", str7, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest5();
        java.util.List<retrofit.client.Header> headerList3 = request2.getHeaders();
        retrofit.mime.TypedOutput typedOutput4 = request2.getBody();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertNull(typedOutput4);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter23.logLevel = logLevel25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log28 = restAdapter23.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter29.deserializeObjectConverter8();
        java.lang.String str33 = serializedObjectSupporter29.deserializeObjectString4();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.RestAdapter.RestHandler restHandler35 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request37 = serializedObjectSupporter36.deserializeObjectRequest8();
        retrofit.client.Request request38 = serializedObjectSupporter36.deserializeObjectRequest7();
        java.util.List<retrofit.client.Header> headerList39 = request38.getHeaders();
        retrofit.client.Request request40 = restAdapter23.logAndReplaceRequest(request38);
        java.lang.String str41 = request38.url;
        java.lang.String str42 = request38.method;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "GET" + "'", str42, "GET");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        retrofit.Profiler profiler26 = restAdapter23.getprofiler();
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.Server server32 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter36.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request40 = serializedObjectSupporter39.deserializeObjectRequest1();
        retrofit.client.Request request41 = serializedObjectSupporter39.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter39.deserializeObjectConverter5();
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = null;
        builder45.sethttpExecutor(executor46);
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        builder45.log = log48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor38, (retrofit.converter.Converter) gsonConverter42, profiler43, errorHandler44, log48, logLevel50);
        java.util.concurrent.Executor executor52 = restAdapter51.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter53.deserializeObjectConverter3();
        java.lang.String str56 = serializedObjectSupporter53.deserializeObjectString4();
        restAdapter51.serializedObjectSupporter = serializedObjectSupporter53;
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter53;
        retrofit.client.Request request59 = serializedObjectSupporter53.deserializeObjectRequest7();
        java.lang.String str60 = request59.getMethod();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-" + "'", str37, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "GET" + "'", str54, "GET");
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GET" + "'", str60, "GET");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.Profiler profiler5 = builder0.profiler;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("hi!");
        retrofit.converter.Converter converter8 = builder7.converter;
        retrofit.RestAdapter restAdapter9 = builder7.build();
        retrofit.RestAdapter.RestHandler restHandler10 = restAdapter9.new RestHandler();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(restAdapter9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter23.logLevel = logLevel25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log28 = restAdapter23.log;
        retrofit.RequestInterceptor requestInterceptor29 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor30 = restAdapter23.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler31 = restAdapter23.new RestHandler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertNotNull(requestInterceptor30);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString6 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(typedString6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.RestAdapter restAdapter22 = builder0.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        retrofit.client.Request request26 = serializedObjectSupporter23.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor27 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        java.lang.String str28 = serializedObjectSupporter23.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter23.deserializeObjectConverter3();
        restAdapter22.serializedObjectSupporter = serializedObjectSupporter23;
        java.util.concurrent.Executor executor31 = restAdapter22.getcallbackExecutor();
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(requestInterceptor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(executor31);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter3();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString4();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.getLogLevel();
        java.lang.String str31 = restAdapter23.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor32 = restAdapter23.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor33 = restAdapter23.requestInterceptor;
        retrofit.ErrorHandler errorHandler34 = restAdapter23.errorHandler;
        retrofit.ErrorHandler errorHandler35 = restAdapter23.errorHandler;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GET" + "'", str26, "GET");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(requestInterceptor33);
        org.junit.Assert.assertNull(errorHandler34);
        org.junit.Assert.assertNull(errorHandler35);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-Idle" + "'", str7, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(errorHandler5);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter23.logLevel;
        java.util.concurrent.Executor executor27 = restAdapter23.getcallbackExecutor();
        retrofit.Server server28 = restAdapter23.server;
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter23.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler30 = restAdapter23.new RestHandler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(server28);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.mime.TypedOutput typedOutput4 = request3.getBody();
        java.lang.String str5 = request3.method;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNull(typedOutput4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider5 = builder4.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder7 = builder4.setLogLevel(logLevel6);
        retrofit.RestAdapter.Log log8 = builder7.log;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder7.logLevel = logLevel9;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString3();
        retrofit.client.Request request15 = serializedObjectSupporter11.deserializeObjectRequest4();
        retrofit.client.Request request16 = serializedObjectSupporter11.deserializeObjectRequest6();
        builder7.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor20 = serializedObjectSupporter18.deserializeObjectRequestInterceptor1();
        builder7.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = builder22.serializedObjectSupporter;
        retrofit.Profiler profiler24 = builder22.profiler;
        retrofit.ErrorHandler errorHandler25 = builder22.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter3();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString4();
        retrofit.Server server30 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor36 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request38 = serializedObjectSupporter37.deserializeObjectRequest1();
        retrofit.client.Request request39 = serializedObjectSupporter37.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter37.deserializeObjectConverter5();
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = null;
        builder43.sethttpExecutor(executor44);
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        builder43.log = log46;
        retrofit.RestAdapter.LogLevel logLevel48 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter49 = new retrofit.RestAdapter(server30, provider31, executor32, executor33, requestInterceptor36, (retrofit.converter.Converter) gsonConverter40, profiler41, errorHandler42, log46, logLevel48);
        java.util.concurrent.Executor executor50 = restAdapter49.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor51 = restAdapter49.requestInterceptor;
        retrofit.RestAdapter.Builder builder52 = builder22.setRequestInterceptor(requestInterceptor51);
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider54 = builder53.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder56 = builder53.setLogLevel(logLevel55);
        retrofit.RestAdapter.Log log57 = builder56.log;
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder56.logLevel = logLevel58;
        retrofit.ErrorHandler errorHandler60 = builder56.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        java.lang.String str62 = serializedObjectSupporter61.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter61.deserializeObjectConverter3();
        java.lang.String str64 = serializedObjectSupporter61.deserializeObjectString4();
        retrofit.client.Request request65 = serializedObjectSupporter61.deserializeObjectRequest6();
        retrofit.Server server66 = serializedObjectSupporter61.deserializeObjectServer1();
        builder56.server = server66;
        retrofit.RestAdapter.Builder builder68 = builder52.setServer(server66);
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor70 = null;
        builder69.sethttpExecutor(executor70);
        builder69.ensureSaneDefaults();
        retrofit.client.Client.Provider provider73 = null;
        builder69.setclientProvider(provider73);
        retrofit.client.Client.Provider provider75 = null;
        builder69.setclientProvider(provider75);
        java.util.concurrent.Executor executor77 = builder69.httpExecutor;
        retrofit.RestAdapter.Builder builder78 = new retrofit.RestAdapter.Builder();
        builder78.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler80 = builder78.errorHandler;
        java.util.concurrent.Executor executor81 = builder78.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder82 = builder68.setExecutors(executor77, executor81);
        builder7.httpExecutor = executor77;
        builder0.sethttpExecutor(executor77);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(executor3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor20);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNull(profiler24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GET" + "'", str27, "GET");
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-" + "'", str35, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor36);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(requestInterceptor51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(provider54);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "GET" + "'", str62, "GET");
        org.junit.Assert.assertNotNull(gsonConverter63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "http://example.com/" + "'", str64, "http://example.com/");
        org.junit.Assert.assertNotNull(request65);
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(executor77);
        org.junit.Assert.assertNotNull(errorHandler80);
        org.junit.Assert.assertNotNull(executor81);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter26 = restAdapter23.converter;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.Server server32 = serializedObjectSupporter28.deserializeObjectServer1();
        restHandler27.serializedObjectSupporter = serializedObjectSupporter28;
        retrofit.mime.TypedString typedString34 = serializedObjectSupporter28.deserializeObjectTypedOutput2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter35 = serializedObjectSupporter28.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(typedString34);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        retrofit.converter.Converter converter5 = builder0.converter;
        java.util.concurrent.Executor executor6 = null;
        builder0.httpExecutor = executor6;
        retrofit.RestAdapter.LogLevel logLevel8 = builder0.logLevel;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.Server server10 = builder0.server;
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.converter.Converter converter4 = builder3.converter;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter3();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.Server server11 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.client.Client.Provider provider12 = null;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor17 = serializedObjectSupporter15.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest1();
        retrofit.client.Request request20 = serializedObjectSupporter18.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = null;
        builder24.sethttpExecutor(executor25);
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        builder24.log = log27;
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter30 = new retrofit.RestAdapter(server11, provider12, executor13, executor14, requestInterceptor17, (retrofit.converter.Converter) gsonConverter21, profiler22, errorHandler23, log27, logLevel29);
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter30.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter30.getLogLevel();
        retrofit.RestAdapter.Log log33 = restAdapter30.log;
        java.util.concurrent.Executor executor34 = restAdapter30.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter30.setLogLevel(logLevel35);
        builder3.logLevel = logLevel35;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(provider6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString4();
        retrofit.Server server26 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.client.Client.Provider provider27 = null;
        java.util.concurrent.Executor executor28 = null;
        java.util.concurrent.Executor executor29 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor32 = serializedObjectSupporter30.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.client.Request request35 = serializedObjectSupporter33.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter5();
        retrofit.Profiler profiler37 = null;
        retrofit.ErrorHandler errorHandler38 = null;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = null;
        builder39.sethttpExecutor(executor40);
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        builder39.log = log42;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server26, provider27, executor28, executor29, requestInterceptor32, (retrofit.converter.Converter) gsonConverter36, profiler37, errorHandler38, log42, logLevel44);
        java.util.concurrent.Executor executor46 = restAdapter45.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor47 = restAdapter45.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor48 = restAdapter45.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor49 = restAdapter45.getrequestInterceptor();
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = null;
        builder50.sethttpExecutor(executor51);
        retrofit.RequestInterceptor requestInterceptor53 = null;
        builder50.requestInterceptor = requestInterceptor53;
        retrofit.converter.Converter converter55 = builder50.converter;
        java.util.concurrent.Executor executor56 = null;
        builder50.httpExecutor = executor56;
        retrofit.RestAdapter.LogLevel logLevel58 = builder50.logLevel;
        restAdapter45.logLevel = logLevel58;
        builder0.logLevel = logLevel58;
        java.util.concurrent.Executor executor61 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler62 = null;
        builder0.profiler = profiler62;
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GET" + "'", str23, "GET");
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(requestInterceptor48);
        org.junit.Assert.assertNotNull(requestInterceptor49);
        org.junit.Assert.assertNull(converter55);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor61);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log6;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        retrofit.Profiler profiler10 = builder0.profiler;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "POST" + "'", str5, "POST");
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GET" + "'", str7, "GET");
        org.junit.Assert.assertNotNull(request8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter3();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        retrofit.Server server17 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter21.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request25 = serializedObjectSupporter24.deserializeObjectRequest1();
        retrofit.client.Request request26 = serializedObjectSupporter24.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter24.deserializeObjectConverter5();
        retrofit.Profiler profiler28 = null;
        retrofit.ErrorHandler errorHandler29 = null;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = null;
        builder30.sethttpExecutor(executor31);
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        builder30.log = log33;
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter36 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor23, (retrofit.converter.Converter) gsonConverter27, profiler28, errorHandler29, log33, logLevel35);
        retrofit.RestAdapter.LogLevel logLevel37 = restAdapter36.getLogLevel();
        retrofit.converter.Converter converter38 = restAdapter36.converter;
        retrofit.RequestInterceptor requestInterceptor39 = restAdapter36.requestInterceptor;
        builder12.requestInterceptor = requestInterceptor39;
        retrofit.converter.Converter converter41 = builder12.converter;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = builder42.serializedObjectSupporter;
        retrofit.client.Client.Provider provider44 = null;
        builder42.setclientProvider(provider44);
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor47 = null;
        builder46.sethttpExecutor(executor47);
        retrofit.RestAdapter.Log log49 = null;
        builder46.log = log49;
        java.util.concurrent.Executor executor51 = builder46.callbackExecutor;
        retrofit.RestAdapter.Log log52 = retrofit.RestAdapter.Log.NONE;
        builder46.log = log52;
        retrofit.RestAdapter.Builder builder54 = builder42.setLog(log52);
        retrofit.RestAdapter.Builder builder55 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor56 = null;
        builder55.setcallbackExecutor(executor56);
        java.util.concurrent.Executor executor58 = null;
        builder55.setcallbackExecutor(executor58);
        retrofit.RestAdapter.LogLevel logLevel60 = retrofit.RestAdapter.LogLevel.FULL;
        builder55.logLevel = logLevel60;
        retrofit.client.Client.Provider provider62 = builder55.getclientProvider();
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor64 = null;
        builder63.sethttpExecutor(executor64);
        retrofit.RestAdapter.Log log66 = null;
        builder63.log = log66;
        retrofit.RestAdapter.Log log68 = builder63.log;
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor70 = null;
        builder69.sethttpExecutor(executor70);
        retrofit.RequestInterceptor requestInterceptor72 = null;
        builder69.requestInterceptor = requestInterceptor72;
        java.util.concurrent.Executor executor74 = null;
        builder69.httpExecutor = executor74;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        java.lang.String str77 = serializedObjectSupporter76.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter78 = serializedObjectSupporter76.deserializeObjectConverter3();
        java.lang.String str79 = serializedObjectSupporter76.deserializeObjectString4();
        retrofit.client.Request request80 = serializedObjectSupporter76.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler81 = serializedObjectSupporter76.deserializeObjectErrorHandler1();
        builder69.errorHandler = errorHandler81;
        retrofit.RestAdapter.Builder builder83 = builder63.setErrorHandler(errorHandler81);
        retrofit.RestAdapter.Builder builder84 = builder55.setErrorHandler(errorHandler81);
        retrofit.SerializedObjectSupporter serializedObjectSupporter85 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request86 = serializedObjectSupporter85.deserializeObjectRequest1();
        java.lang.String str87 = serializedObjectSupporter85.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor88 = serializedObjectSupporter85.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder89 = builder84.setRequestInterceptor(requestInterceptor88);
        retrofit.SerializedObjectSupporter serializedObjectSupporter90 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request91 = serializedObjectSupporter90.deserializeObjectRequest8();
        retrofit.client.Request request92 = serializedObjectSupporter90.deserializeObjectRequest7();
        java.lang.String str93 = serializedObjectSupporter90.deserializeObjectString1();
        java.lang.String str94 = serializedObjectSupporter90.deserializeObjectString5();
        retrofit.RequestInterceptor requestInterceptor95 = serializedObjectSupporter90.deserializeObjectRequestInterceptor1();
        builder89.requestInterceptor = requestInterceptor95;
        retrofit.RestAdapter.Builder builder97 = builder54.setRequestInterceptor(requestInterceptor95);
        retrofit.RestAdapter.Builder builder98 = builder12.setRequestInterceptor(requestInterceptor95);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-" + "'", str22, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter38);
        org.junit.Assert.assertNotNull(requestInterceptor39);
        org.junit.Assert.assertNull(converter41);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertNotNull(log52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider62);
        org.junit.Assert.assertNull(log68);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "GET" + "'", str77, "GET");
        org.junit.Assert.assertNotNull(gsonConverter78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "http://example.com/" + "'", str79, "http://example.com/");
        org.junit.Assert.assertNotNull(request80);
        org.junit.Assert.assertNotNull(errorHandler81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(request86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Retrofit-" + "'", str87, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(request91);
        org.junit.Assert.assertNotNull(request92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Retrofit-" + "'", str93, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "POST" + "'", str94, "POST");
        org.junit.Assert.assertNotNull(requestInterceptor95);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        java.util.concurrent.Executor executor6 = null;
        builder0.httpExecutor = executor6;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        retrofit.converter.Converter converter10 = builder0.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider2 = null;
        builder0.setclientProvider(provider2);
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = null;
        builder4.sethttpExecutor(executor5);
        retrofit.RestAdapter.Log log7 = null;
        builder4.log = log7;
        java.util.concurrent.Executor executor9 = builder4.callbackExecutor;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        builder4.log = log10;
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter3();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        retrofit.client.Request request17 = serializedObjectSupporter13.deserializeObjectRequest6();
        retrofit.Server server18 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder19 = builder12.setServer(server18);
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.client.Request request25 = serializedObjectSupporter23.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor26 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request28 = serializedObjectSupporter27.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter27.deserializeObjectConverter2();
        retrofit.Profiler profiler30 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        java.lang.String str32 = serializedObjectSupporter31.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter3();
        java.lang.String str34 = serializedObjectSupporter31.deserializeObjectString4();
        retrofit.client.Request request35 = serializedObjectSupporter31.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler36 = serializedObjectSupporter31.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = builder37.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = builder37.serializedObjectSupporter;
        retrofit.client.Client.Provider provider40 = null;
        builder37.clientProvider = provider40;
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        builder37.log = log42;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor45 = null;
        builder44.setcallbackExecutor(executor45);
        java.util.concurrent.Executor executor47 = null;
        builder44.setcallbackExecutor(executor47);
        retrofit.client.Client.Provider provider49 = null;
        builder44.clientProvider = provider49;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = builder51.serializedObjectSupporter;
        retrofit.Profiler profiler53 = builder51.profiler;
        retrofit.RestAdapter.LogLevel logLevel54 = builder51.logLevel;
        builder44.logLevel = logLevel54;
        retrofit.RestAdapter restAdapter56 = new retrofit.RestAdapter(server18, provider20, executor21, executor22, requestInterceptor26, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler36, log42, logLevel54);
        retrofit.Server server57 = restAdapter56.server;
        retrofit.RestAdapter.LogLevel logLevel58 = null;
        restAdapter56.setLogLevel(logLevel58);
        retrofit.RequestInterceptor requestInterceptor60 = restAdapter56.getrequestInterceptor();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GET" + "'", str32, "GET");
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(errorHandler36);
        org.junit.Assert.assertNull(serializedObjectSupporter38);
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNull(serializedObjectSupporter52);
        org.junit.Assert.assertNull(profiler53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server57);
        org.junit.Assert.assertNotNull(requestInterceptor60);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString4();
        retrofit.client.Request request12 = serializedObjectSupporter10.deserializeObjectRequest2();
        retrofit.ErrorHandler errorHandler13 = serializedObjectSupporter10.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder14 = builder0.setErrorHandler(errorHandler13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.Server server19 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter15.deserializeObjectConverter6();
        retrofit.client.Request request21 = serializedObjectSupporter15.deserializeObjectRequest7();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter15.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter15.deserializeObjectConverter8();
        retrofit.mime.TypedString typedString24 = serializedObjectSupporter15.deserializeObjectTypedOutput2();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter15.deserializeObjectRequestInterceptor1();
        builder0.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.client.Request request27 = serializedObjectSupporter15.deserializeObjectRequest2();
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(executor9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(typedString24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        retrofit.converter.Converter converter8 = builder0.converter;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(converter8);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.RestAdapter restAdapter22 = builder0.build();
        retrofit.RestAdapter.LogLevel logLevel23 = restAdapter22.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor24 = restAdapter22.requestInterceptor;
        retrofit.Server server25 = restAdapter22.server;
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(requestInterceptor24);
        org.junit.Assert.assertNotNull(server25);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GET" + "'", str7, "GET");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.Server server28 = restAdapter23.getserver();
        retrofit.RequestInterceptor requestInterceptor29 = restAdapter23.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(requestInterceptor29);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        java.lang.String str27 = restAdapter23.getTHREAD_PREFIX();
        retrofit.Server server28 = restAdapter23.server;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertNotNull(server28);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = null;
        builder5.sethttpExecutor(executor6);
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = null;
        builder5.setclientProvider(provider9);
        retrofit.client.Client.Provider provider11 = null;
        builder5.setclientProvider(provider11);
        java.util.concurrent.Executor executor13 = builder5.httpExecutor;
        builder3.callbackExecutor = executor13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.Server server19 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request27 = serializedObjectSupporter26.deserializeObjectRequest1();
        retrofit.client.Request request28 = serializedObjectSupporter26.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter5();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = null;
        builder32.sethttpExecutor(executor33);
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log35;
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter38 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log35, logLevel37);
        builder3.log = log35;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter3();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString4();
        retrofit.Server server44 = serializedObjectSupporter40.deserializeObjectServer1();
        retrofit.client.Client.Provider provider45 = null;
        java.util.concurrent.Executor executor46 = null;
        java.util.concurrent.Executor executor47 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor50 = serializedObjectSupporter48.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request52 = serializedObjectSupporter51.deserializeObjectRequest1();
        retrofit.client.Request request53 = serializedObjectSupporter51.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter51.deserializeObjectConverter5();
        retrofit.Profiler profiler55 = null;
        retrofit.ErrorHandler errorHandler56 = null;
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor58 = null;
        builder57.sethttpExecutor(executor58);
        retrofit.RestAdapter.Log log60 = retrofit.RestAdapter.Log.NONE;
        builder57.log = log60;
        retrofit.RestAdapter.LogLevel logLevel62 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter63 = new retrofit.RestAdapter(server44, provider45, executor46, executor47, requestInterceptor50, (retrofit.converter.Converter) gsonConverter54, profiler55, errorHandler56, log60, logLevel62);
        retrofit.RestAdapter.LogLevel logLevel64 = restAdapter63.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel65 = restAdapter63.getLogLevel();
        retrofit.RestAdapter.Log log66 = restAdapter63.log;
        retrofit.RequestInterceptor requestInterceptor67 = restAdapter63.requestInterceptor;
        retrofit.RestAdapter.Builder builder68 = builder3.setRequestInterceptor(requestInterceptor67);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Retrofit-" + "'", str24, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "GET" + "'", str41, "GET");
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(server44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Retrofit-" + "'", str49, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor50);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel64 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel64.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(requestInterceptor67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = null;
        builder2.setcallbackExecutor(executor3);
        java.util.concurrent.Executor executor5 = null;
        builder2.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = null;
        builder2.clientProvider = provider7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder9.serializedObjectSupporter;
        retrofit.Profiler profiler11 = builder9.profiler;
        retrofit.RestAdapter.LogLevel logLevel12 = builder9.logLevel;
        builder2.logLevel = logLevel12;
        builder0.logLevel = logLevel12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.Server server19 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor25 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request27 = serializedObjectSupporter26.deserializeObjectRequest1();
        retrofit.client.Request request28 = serializedObjectSupporter26.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter5();
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = null;
        builder32.sethttpExecutor(executor33);
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        builder32.log = log35;
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter38 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor25, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler31, log35, logLevel37);
        retrofit.RestAdapter.LogLevel logLevel39 = restAdapter38.getLogLevel();
        retrofit.converter.Converter converter40 = restAdapter38.getconverter();
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean42 = logLevel41.log();
        boolean boolean43 = logLevel41.log();
        restAdapter38.setLogLevel(logLevel41);
        retrofit.RestAdapter.Builder builder45 = builder0.setLogLevel(logLevel41);
        retrofit.Server server46 = builder45.server;
        retrofit.Profiler profiler47 = builder45.profiler;
        retrofit.converter.Converter converter48 = builder45.converter;
        retrofit.Server server49 = builder45.server;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Retrofit-" + "'", str24, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter40);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(server46);
        org.junit.Assert.assertNull(profiler47);
        org.junit.Assert.assertNull(converter48);
        org.junit.Assert.assertNull(server49);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.converter.Converter converter4 = builder3.converter;
        java.util.concurrent.Executor executor5 = null;
        builder3.sethttpExecutor(executor5);
        retrofit.RestAdapter.Builder builder8 = builder3.setServer("GET");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString4();
        retrofit.Server server13 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor19 = serializedObjectSupporter17.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request21 = serializedObjectSupporter20.deserializeObjectRequest1();
        retrofit.client.Request request22 = serializedObjectSupporter20.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter20.deserializeObjectConverter5();
        retrofit.Profiler profiler24 = null;
        retrofit.ErrorHandler errorHandler25 = null;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor27 = null;
        builder26.sethttpExecutor(executor27);
        retrofit.RestAdapter.Log log29 = retrofit.RestAdapter.Log.NONE;
        builder26.log = log29;
        retrofit.RestAdapter.LogLevel logLevel31 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor19, (retrofit.converter.Converter) gsonConverter23, profiler24, errorHandler25, log29, logLevel31);
        retrofit.RestAdapter.Builder builder33 = builder3.setLog(log29);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = null;
        builder34.sethttpExecutor(executor35);
        retrofit.RestAdapter.Log log37 = null;
        builder34.log = log37;
        retrofit.RestAdapter.Log log39 = builder34.log;
        retrofit.Profiler profiler40 = builder34.profiler;
        retrofit.RestAdapter.Builder builder42 = builder34.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request44 = serializedObjectSupporter43.deserializeObjectRequest1();
        retrofit.client.Request request45 = serializedObjectSupporter43.deserializeObjectRequest5();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter43.deserializeObjectConverter7();
        builder34.converter = gsonConverter47;
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = null;
        builder49.sethttpExecutor(executor50);
        retrofit.RequestInterceptor requestInterceptor52 = null;
        builder49.requestInterceptor = requestInterceptor52;
        retrofit.converter.Converter converter54 = builder49.converter;
        java.util.concurrent.Executor executor55 = null;
        builder49.httpExecutor = executor55;
        java.util.concurrent.Executor executor57 = null;
        builder49.httpExecutor = executor57;
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor60 = null;
        builder59.sethttpExecutor(executor60);
        retrofit.RestAdapter.Log log62 = retrofit.RestAdapter.Log.NONE;
        builder59.log = log62;
        log62.log("");
        log62.log("POST");
        builder49.log = log62;
        builder34.log = log62;
        retrofit.RestAdapter.Builder builder70 = builder3.setLog(log62);
        retrofit.client.Client.Provider provider71 = builder3.getclientProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(log39);
        org.junit.Assert.assertNull(profiler40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(request45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "POST" + "'", str46, "POST");
        org.junit.Assert.assertNotNull(gsonConverter47);
        org.junit.Assert.assertNull(converter54);
        org.junit.Assert.assertNotNull(log62);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNull(provider71);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.client.Client.Provider provider6 = null;
        builder4.setclientProvider(provider6);
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Log log11 = null;
        builder8.log = log11;
        java.util.concurrent.Executor executor13 = builder8.callbackExecutor;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        builder8.log = log14;
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter3();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.client.Request request21 = serializedObjectSupporter17.deserializeObjectRequest6();
        retrofit.Server server22 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder23 = builder16.setServer(server22);
        retrofit.RestAdapter.Builder builder24 = builder0.setServer(server22);
        retrofit.Profiler profiler25 = builder24.profiler;
        retrofit.RestAdapter.Builder builder27 = builder24.setServer("GET");
        retrofit.RestAdapter.Builder builder29 = builder24.setServer("POST");
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GET" + "'", str18, "GET");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(profiler25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        retrofit.Server server5 = builder0.server;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        retrofit.converter.Converter converter9 = builder6.converter;
        retrofit.RestAdapter.Builder builder11 = builder6.setServer("GET");
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        builder12.converter = gsonConverter17;
        retrofit.client.Client.Provider provider19 = null;
        builder12.clientProvider = provider19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter21.deserializeObjectConverter3();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter21.deserializeObjectConverter6();
        builder12.converter = gsonConverter25;
        builder6.converter = gsonConverter25;
        retrofit.RestAdapter restAdapter28 = builder6.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.Server server31 = serializedObjectSupporter29.deserializeObjectServer1();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString3();
        retrofit.client.Request request33 = serializedObjectSupporter29.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter29.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter29.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter29.deserializeObjectConverter1();
        java.lang.String str37 = serializedObjectSupporter29.deserializeObjectString2();
        retrofit.ErrorHandler errorHandler38 = serializedObjectSupporter29.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder39 = builder6.setErrorHandler(errorHandler38);
        builder0.errorHandler = errorHandler38;
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GET" + "'", str22, "GET");
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GET" + "'", str32, "GET");
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(errorHandler38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder3.logLevel = logLevel5;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        retrofit.client.Request request12 = serializedObjectSupporter8.deserializeObjectRequest6();
        retrofit.Server server13 = serializedObjectSupporter8.deserializeObjectServer1();
        builder3.server = server13;
        java.util.concurrent.Executor executor15 = builder3.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler16 = builder3.errorHandler;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider18 = builder17.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder20 = builder17.setLogLevel(logLevel19);
        retrofit.RestAdapter.Log log21 = builder20.log;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder20.logLevel = logLevel22;
        retrofit.ErrorHandler errorHandler24 = builder20.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter3();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString4();
        retrofit.client.Request request29 = serializedObjectSupporter25.deserializeObjectRequest6();
        retrofit.Server server30 = serializedObjectSupporter25.deserializeObjectServer1();
        builder20.server = server30;
        builder3.server = server30;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder3.serializedObjectSupporter;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GET" + "'", str9, "GET");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(log21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GET" + "'", str26, "GET");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Log log11 = null;
        builder8.log = log11;
        retrofit.RestAdapter.Log log13 = builder8.log;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = null;
        builder14.sethttpExecutor(executor15);
        retrofit.RequestInterceptor requestInterceptor17 = null;
        builder14.requestInterceptor = requestInterceptor17;
        java.util.concurrent.Executor executor19 = null;
        builder14.httpExecutor = executor19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter21.deserializeObjectConverter3();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString4();
        retrofit.client.Request request25 = serializedObjectSupporter21.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler26 = serializedObjectSupporter21.deserializeObjectErrorHandler1();
        builder14.errorHandler = errorHandler26;
        retrofit.RestAdapter.Builder builder28 = builder8.setErrorHandler(errorHandler26);
        retrofit.RestAdapter.Builder builder29 = builder0.setErrorHandler(errorHandler26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request31 = serializedObjectSupporter30.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter30.deserializeObjectConverter4();
        retrofit.client.Request request34 = serializedObjectSupporter30.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter30.deserializeObjectConverter5();
        builder0.converter = gsonConverter35;
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GET" + "'", str22, "GET");
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(errorHandler26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(gsonConverter35);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider5 = builder4.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder7 = builder4.setLogLevel(logLevel6);
        retrofit.converter.Converter converter8 = builder7.converter;
        java.util.concurrent.Executor executor9 = null;
        builder7.sethttpExecutor(executor9);
        retrofit.RestAdapter.Builder builder12 = builder7.setServer("GET");
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter3();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        retrofit.Server server17 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter21.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request25 = serializedObjectSupporter24.deserializeObjectRequest1();
        retrofit.client.Request request26 = serializedObjectSupporter24.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter24.deserializeObjectConverter5();
        retrofit.Profiler profiler28 = null;
        retrofit.ErrorHandler errorHandler29 = null;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = null;
        builder30.sethttpExecutor(executor31);
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        builder30.log = log33;
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter36 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor23, (retrofit.converter.Converter) gsonConverter27, profiler28, errorHandler29, log33, logLevel35);
        retrofit.RestAdapter.Builder builder37 = builder7.setLog(log33);
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor39 = null;
        builder38.sethttpExecutor(executor39);
        retrofit.RestAdapter.Log log41 = null;
        builder38.log = log41;
        retrofit.RestAdapter.Log log43 = builder38.log;
        retrofit.Profiler profiler44 = builder38.profiler;
        retrofit.RestAdapter.Builder builder46 = builder38.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request48 = serializedObjectSupporter47.deserializeObjectRequest1();
        retrofit.client.Request request49 = serializedObjectSupporter47.deserializeObjectRequest5();
        java.lang.String str50 = serializedObjectSupporter47.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter47.deserializeObjectConverter7();
        builder38.converter = gsonConverter51;
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor54 = null;
        builder53.sethttpExecutor(executor54);
        retrofit.RequestInterceptor requestInterceptor56 = null;
        builder53.requestInterceptor = requestInterceptor56;
        retrofit.converter.Converter converter58 = builder53.converter;
        java.util.concurrent.Executor executor59 = null;
        builder53.httpExecutor = executor59;
        java.util.concurrent.Executor executor61 = null;
        builder53.httpExecutor = executor61;
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor64 = null;
        builder63.sethttpExecutor(executor64);
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder63.log = log66;
        log66.log("");
        log66.log("POST");
        builder53.log = log66;
        builder38.log = log66;
        retrofit.RestAdapter.Builder builder74 = builder7.setLog(log66);
        retrofit.RestAdapter.Builder builder75 = builder0.setLog(log66);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-" + "'", str22, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(log43);
        org.junit.Assert.assertNull(profiler44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "POST" + "'", str50, "POST");
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNull(converter58);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString4();
        retrofit.Server server26 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.client.Client.Provider provider27 = null;
        java.util.concurrent.Executor executor28 = null;
        java.util.concurrent.Executor executor29 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor32 = serializedObjectSupporter30.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.client.Request request35 = serializedObjectSupporter33.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter5();
        retrofit.Profiler profiler37 = null;
        retrofit.ErrorHandler errorHandler38 = null;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = null;
        builder39.sethttpExecutor(executor40);
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        builder39.log = log42;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server26, provider27, executor28, executor29, requestInterceptor32, (retrofit.converter.Converter) gsonConverter36, profiler37, errorHandler38, log42, logLevel44);
        java.util.concurrent.Executor executor46 = restAdapter45.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor47 = restAdapter45.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor48 = restAdapter45.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor49 = restAdapter45.getrequestInterceptor();
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = null;
        builder50.sethttpExecutor(executor51);
        retrofit.RequestInterceptor requestInterceptor53 = null;
        builder50.requestInterceptor = requestInterceptor53;
        retrofit.converter.Converter converter55 = builder50.converter;
        java.util.concurrent.Executor executor56 = null;
        builder50.httpExecutor = executor56;
        retrofit.RestAdapter.LogLevel logLevel58 = builder50.logLevel;
        restAdapter45.logLevel = logLevel58;
        builder0.logLevel = logLevel58;
        java.util.concurrent.Executor executor61 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor62 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor63 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GET" + "'", str23, "GET");
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(requestInterceptor48);
        org.junit.Assert.assertNotNull(requestInterceptor49);
        org.junit.Assert.assertNull(converter55);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor61);
        org.junit.Assert.assertNull(requestInterceptor62);
        org.junit.Assert.assertNull(executor63);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.client.Client.Provider provider28 = restAdapter23.getclientProvider();
        java.lang.String str29 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.logLevel;
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter23.logLevel;
        retrofit.client.Request request32 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request33 = restAdapter23.logAndReplaceRequest(request32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        retrofit.Profiler profiler10 = builder0.profiler;
        retrofit.client.Client.Provider provider11 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.Server server13 = builder0.server;
        java.util.concurrent.Executor executor14 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.util.List<retrofit.client.Header> headerList2 = request1.headers;
        java.lang.String str3 = request1.getMethod();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GET" + "'", str3, "GET");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        retrofit.Server server27 = restAdapter23.getserver();
        retrofit.converter.Converter converter28 = restAdapter23.getconverter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(converter28);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.ErrorHandler errorHandler7 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertNotNull(errorHandler7);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter2();
        retrofit.client.Request request12 = serializedObjectSupporter9.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        builder0.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString4();
        retrofit.client.Request request16 = serializedObjectSupporter9.deserializeObjectRequest6();
        retrofit.mime.TypedOutput typedOutput17 = request16.body;
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNull(typedOutput17);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.client.Request request11 = serializedObjectSupporter9.deserializeObjectRequest5();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter7();
        builder0.converter = gsonConverter13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = null;
        builder15.sethttpExecutor(executor16);
        retrofit.RequestInterceptor requestInterceptor18 = null;
        builder15.requestInterceptor = requestInterceptor18;
        retrofit.converter.Converter converter20 = builder15.converter;
        java.util.concurrent.Executor executor21 = null;
        builder15.httpExecutor = executor21;
        java.util.concurrent.Executor executor23 = null;
        builder15.httpExecutor = executor23;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = null;
        builder25.sethttpExecutor(executor26);
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        builder25.log = log28;
        log28.log("");
        log28.log("POST");
        builder15.log = log28;
        builder0.log = log28;
        retrofit.RestAdapter.LogLevel logLevel36 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString4();
        retrofit.Server server41 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.client.Client.Provider provider42 = null;
        java.util.concurrent.Executor executor43 = null;
        java.util.concurrent.Executor executor44 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor47 = serializedObjectSupporter45.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest1();
        retrofit.client.Request request50 = serializedObjectSupporter48.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter48.deserializeObjectConverter5();
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = null;
        builder54.sethttpExecutor(executor55);
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        builder54.log = log57;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server41, provider42, executor43, executor44, requestInterceptor47, (retrofit.converter.Converter) gsonConverter51, profiler52, errorHandler53, log57, logLevel59);
        retrofit.RestAdapter.LogLevel logLevel61 = restAdapter60.getLogLevel();
        java.lang.String str62 = restAdapter60.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler63 = restAdapter60.profiler;
        java.util.concurrent.Executor executor64 = restAdapter60.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor65 = restAdapter60.getrequestInterceptor();
        retrofit.RestAdapter.Builder builder66 = builder0.setRequestInterceptor(requestInterceptor65);
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "POST" + "'", str12, "POST");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GET" + "'", str38, "GET");
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Retrofit-" + "'", str46, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Retrofit-Idle" + "'", str62, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler63);
        org.junit.Assert.assertNull(executor64);
        org.junit.Assert.assertNotNull(requestInterceptor65);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.client.Request request8 = serializedObjectSupporter4.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter4.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler9;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = builder11.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder14 = builder11.setLogLevel(logLevel13);
        retrofit.converter.Converter converter15 = builder14.converter;
        builder14.ensureSaneDefaults();
        retrofit.client.Client.Provider provider17 = builder14.clientProvider;
        builder0.setclientProvider(provider17);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNotNull(provider17);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter3();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString4();
        retrofit.Server server15 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor21 = serializedObjectSupporter19.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request23 = serializedObjectSupporter22.deserializeObjectRequest1();
        retrofit.client.Request request24 = serializedObjectSupporter22.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.Profiler profiler26 = null;
        retrofit.ErrorHandler errorHandler27 = null;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = null;
        builder28.sethttpExecutor(executor29);
        retrofit.RestAdapter.Log log31 = retrofit.RestAdapter.Log.NONE;
        builder28.log = log31;
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter34 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor21, (retrofit.converter.Converter) gsonConverter25, profiler26, errorHandler27, log31, logLevel33);
        retrofit.RestAdapter.LogLevel logLevel35 = restAdapter34.getLogLevel();
        java.lang.String str36 = restAdapter34.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler37 = restAdapter34.profiler;
        java.util.concurrent.Executor executor38 = restAdapter34.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor39 = restAdapter34.getrequestInterceptor();
        retrofit.converter.Converter converter40 = restAdapter34.converter;
        builder0.converter = converter40;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler37);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(requestInterceptor39);
        org.junit.Assert.assertNotNull(converter40);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "POST" + "'", str5, "POST");
        org.junit.Assert.assertNotNull(requestInterceptor6);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest7();
        java.util.List<retrofit.client.Header> headerList3 = request2.getHeaders();
        java.util.List<retrofit.client.Header> headerList4 = request2.getHeaders();
        java.lang.Class<?> wildcardClass5 = request2.getClass();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = null;
        builder10.sethttpExecutor(executor11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter3();
        builder10.converter = gsonConverter15;
        retrofit.client.Client.Provider provider17 = null;
        builder10.clientProvider = provider17;
        retrofit.RestAdapter.LogLevel logLevel19 = builder10.logLevel;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.sethttpExecutor(executor21);
        retrofit.RequestInterceptor requestInterceptor23 = null;
        builder20.requestInterceptor = requestInterceptor23;
        retrofit.converter.Converter converter25 = builder20.converter;
        java.util.concurrent.Executor executor26 = null;
        builder20.httpExecutor = executor26;
        retrofit.RestAdapter.LogLevel logLevel28 = builder20.logLevel;
        builder10.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder10.callbackExecutor;
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider32 = builder31.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder34 = builder31.setLogLevel(logLevel33);
        retrofit.converter.Converter converter35 = builder34.converter;
        builder34.ensureSaneDefaults();
        retrofit.client.Client.Provider provider37 = builder34.clientProvider;
        builder10.setclientProvider(provider37);
        builder0.setclientProvider(provider37);
        retrofit.ErrorHandler errorHandler40 = builder0.errorHandler;
        retrofit.Profiler profiler41 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder42 = builder0.setProfiler(profiler41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(converter25);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(converter35);
        org.junit.Assert.assertNotNull(provider37);
        org.junit.Assert.assertNull(errorHandler40);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest8();
        retrofit.client.Request request11 = serializedObjectSupporter9.deserializeObjectRequest3();
        retrofit.client.Request request12 = serializedObjectSupporter9.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder0.converter = gsonConverter13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = null;
        builder15.setcallbackExecutor(executor16);
        retrofit.RequestInterceptor requestInterceptor18 = builder15.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter19.deserializeObjectConverter3();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString4();
        retrofit.client.Request request23 = serializedObjectSupporter19.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler24 = serializedObjectSupporter19.deserializeObjectErrorHandler1();
        builder15.errorHandler = errorHandler24;
        retrofit.RestAdapter.Log log26 = builder15.log;
        retrofit.Profiler profiler27 = null;
        builder15.profiler = profiler27;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = null;
        builder29.setcallbackExecutor(executor30);
        java.util.concurrent.Executor executor32 = null;
        builder29.setcallbackExecutor(executor32);
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.FULL;
        builder29.logLevel = logLevel34;
        retrofit.client.Client.Provider provider36 = builder29.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = builder29.serializedObjectSupporter;
        java.util.concurrent.Executor executor38 = builder29.callbackExecutor;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = builder39.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = builder39.serializedObjectSupporter;
        java.util.concurrent.Executor executor42 = null;
        builder39.httpExecutor = executor42;
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request45 = serializedObjectSupporter44.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter44.deserializeObjectConverter2();
        builder39.serializedObjectSupporter = serializedObjectSupporter44;
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider49 = builder48.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder51 = builder48.setLogLevel(logLevel50);
        retrofit.converter.Converter converter52 = builder51.converter;
        java.util.concurrent.Executor executor53 = null;
        builder51.sethttpExecutor(executor53);
        retrofit.RestAdapter.Builder builder56 = builder51.setServer("GET");
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor58 = null;
        builder57.setcallbackExecutor(executor58);
        java.util.concurrent.Executor executor60 = null;
        builder57.setcallbackExecutor(executor60);
        builder57.ensureSaneDefaults();
        java.util.concurrent.Executor executor63 = builder57.callbackExecutor;
        builder56.setcallbackExecutor(executor63);
        builder39.httpExecutor = executor63;
        builder29.sethttpExecutor(executor63);
        builder15.httpExecutor = executor63;
        builder0.callbackExecutor = executor63;
        retrofit.client.Client.Provider provider69 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(executor8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GET" + "'", str20, "GET");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(errorHandler24);
        org.junit.Assert.assertNull(log26);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNull(serializedObjectSupporter37);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertNull(serializedObjectSupporter41);
        org.junit.Assert.assertNotNull(request45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(converter52);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(executor63);
        org.junit.Assert.assertNull(provider69);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean27 = logLevel26.log();
        boolean boolean28 = logLevel26.log();
        restAdapter23.setLogLevel(logLevel26);
        retrofit.Server server30 = restAdapter23.getserver();
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter23.logLevel;
        java.util.concurrent.Executor executor32 = restAdapter23.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(executor32);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log6;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        retrofit.Server server10 = builder0.server;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.Profiler profiler5 = builder0.profiler;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = builder7.log;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = null;
        builder9.setcallbackExecutor(executor10);
        java.util.concurrent.Executor executor12 = null;
        builder9.setcallbackExecutor(executor12);
        retrofit.client.Client.Provider provider14 = null;
        builder9.clientProvider = provider14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = builder16.serializedObjectSupporter;
        retrofit.Profiler profiler18 = builder16.profiler;
        retrofit.RestAdapter.LogLevel logLevel19 = builder16.logLevel;
        builder9.logLevel = logLevel19;
        builder7.logLevel = logLevel19;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider23 = builder22.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder25 = builder22.setLogLevel(logLevel24);
        retrofit.converter.Converter converter26 = builder25.converter;
        java.util.concurrent.Executor executor27 = null;
        builder25.sethttpExecutor(executor27);
        retrofit.RestAdapter.Builder builder30 = builder25.setServer("GET");
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        java.lang.String str32 = serializedObjectSupporter31.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter3();
        java.lang.String str34 = serializedObjectSupporter31.deserializeObjectString4();
        retrofit.Server server35 = serializedObjectSupporter31.deserializeObjectServer1();
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        java.lang.String str40 = serializedObjectSupporter39.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor41 = serializedObjectSupporter39.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request43 = serializedObjectSupporter42.deserializeObjectRequest1();
        retrofit.client.Request request44 = serializedObjectSupporter42.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter42.deserializeObjectConverter5();
        retrofit.Profiler profiler46 = null;
        retrofit.ErrorHandler errorHandler47 = null;
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor49 = null;
        builder48.sethttpExecutor(executor49);
        retrofit.RestAdapter.Log log51 = retrofit.RestAdapter.Log.NONE;
        builder48.log = log51;
        retrofit.RestAdapter.LogLevel logLevel53 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter54 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor41, (retrofit.converter.Converter) gsonConverter45, profiler46, errorHandler47, log51, logLevel53);
        retrofit.RestAdapter.Builder builder55 = builder25.setLog(log51);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor57 = null;
        builder56.sethttpExecutor(executor57);
        retrofit.RestAdapter.Log log59 = null;
        builder56.log = log59;
        retrofit.RestAdapter.Log log61 = builder56.log;
        retrofit.Profiler profiler62 = builder56.profiler;
        retrofit.RestAdapter.Builder builder64 = builder56.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request66 = serializedObjectSupporter65.deserializeObjectRequest1();
        retrofit.client.Request request67 = serializedObjectSupporter65.deserializeObjectRequest5();
        java.lang.String str68 = serializedObjectSupporter65.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter69 = serializedObjectSupporter65.deserializeObjectConverter7();
        builder56.converter = gsonConverter69;
        retrofit.RestAdapter.Builder builder71 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor72 = null;
        builder71.sethttpExecutor(executor72);
        retrofit.RequestInterceptor requestInterceptor74 = null;
        builder71.requestInterceptor = requestInterceptor74;
        retrofit.converter.Converter converter76 = builder71.converter;
        java.util.concurrent.Executor executor77 = null;
        builder71.httpExecutor = executor77;
        java.util.concurrent.Executor executor79 = null;
        builder71.httpExecutor = executor79;
        retrofit.RestAdapter.Builder builder81 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor82 = null;
        builder81.sethttpExecutor(executor82);
        retrofit.RestAdapter.Log log84 = retrofit.RestAdapter.Log.NONE;
        builder81.log = log84;
        log84.log("");
        log84.log("POST");
        builder71.log = log84;
        builder56.log = log84;
        retrofit.RestAdapter.Builder builder92 = builder25.setLog(log84);
        log84.log("hi!");
        builder7.log = log84;
        retrofit.RestAdapter.Builder builder96 = builder0.setLog(log84);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(converter26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GET" + "'", str32, "GET");
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-" + "'", str40, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(log61);
        org.junit.Assert.assertNull(profiler62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(request66);
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "POST" + "'", str68, "POST");
        org.junit.Assert.assertNotNull(gsonConverter69);
        org.junit.Assert.assertNull(converter76);
        org.junit.Assert.assertNotNull(log84);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.client.Request request11 = serializedObjectSupporter9.deserializeObjectRequest5();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter7();
        builder0.converter = gsonConverter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.Server server19 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter15.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter15.deserializeObjectConverter6();
        retrofit.client.Request request22 = serializedObjectSupporter15.deserializeObjectRequest7();
        builder0.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.RestAdapter restAdapter24 = builder0.build();
        java.util.concurrent.Executor executor25 = restAdapter24.getcallbackExecutor();
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "POST" + "'", str12, "POST");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(restAdapter24);
        org.junit.Assert.assertNotNull(executor25);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        java.lang.String str27 = restAdapter23.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restAdapter23.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler29 = restAdapter23.geterrorHandler();
        retrofit.converter.Converter converter30 = restAdapter23.getconverter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertNotNull(converter30);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter2();
        retrofit.client.Request request12 = serializedObjectSupporter9.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        builder0.serializedObjectSupporter = serializedObjectSupporter9;
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter9.deserializeObjectConverter1();
        java.lang.String str16 = serializedObjectSupporter9.deserializeObjectString2();
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        java.lang.String str27 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter23.getrequestInterceptor();
        java.util.concurrent.Executor executor29 = restAdapter23.callbackExecutor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-Idle" + "'", str27, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(requestInterceptor28);
        org.junit.Assert.assertNull(executor29);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(typedString9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler26 = restAdapter23.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter27.deserializeObjectConverter3();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString4();
        retrofit.Server server31 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.client.Client.Provider provider32 = null;
        java.util.concurrent.Executor executor33 = null;
        java.util.concurrent.Executor executor34 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor37 = serializedObjectSupporter35.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request39 = serializedObjectSupporter38.deserializeObjectRequest1();
        retrofit.client.Request request40 = serializedObjectSupporter38.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter38.deserializeObjectConverter5();
        retrofit.Profiler profiler42 = null;
        retrofit.ErrorHandler errorHandler43 = null;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor45 = null;
        builder44.sethttpExecutor(executor45);
        retrofit.RestAdapter.Log log47 = retrofit.RestAdapter.Log.NONE;
        builder44.log = log47;
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter50 = new retrofit.RestAdapter(server31, provider32, executor33, executor34, requestInterceptor37, (retrofit.converter.Converter) gsonConverter41, profiler42, errorHandler43, log47, logLevel49);
        java.util.concurrent.Executor executor51 = restAdapter50.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter50.logLevel = logLevel52;
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = restAdapter50.serializedObjectSupporter;
        retrofit.RestAdapter.Log log55 = restAdapter50.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request57 = serializedObjectSupporter56.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter58 = serializedObjectSupporter56.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter56.deserializeObjectConverter8();
        java.lang.String str60 = serializedObjectSupporter56.deserializeObjectString4();
        restAdapter50.serializedObjectSupporter = serializedObjectSupporter56;
        retrofit.client.Request request62 = serializedObjectSupporter56.deserializeObjectRequest7();
        retrofit.client.Request request63 = restAdapter23.logAndReplaceRequest(request62);
        retrofit.mime.TypedOutput typedOutput64 = request62.body;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GET" + "'", str28, "GET");
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-" + "'", str36, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor37);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(log47);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNotNull(request57);
        org.junit.Assert.assertNotNull(gsonConverter58);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(request62);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNull(typedOutput64);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request6 = serializedObjectSupporter5.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.client.Request request9 = serializedObjectSupporter5.deserializeObjectRequest6();
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.client.Request request11 = serializedObjectSupporter5.deserializeObjectRequest8();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.Profiler profiler5 = builder3.profiler;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = null;
        builder7.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = null;
        builder7.setcallbackExecutor(executor10);
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.FULL;
        builder7.logLevel = logLevel12;
        retrofit.client.Client.Provider provider14 = builder7.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = builder7.serializedObjectSupporter;
        java.util.concurrent.Executor executor16 = builder7.callbackExecutor;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder17.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = builder17.serializedObjectSupporter;
        java.util.concurrent.Executor executor20 = null;
        builder17.httpExecutor = executor20;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request23 = serializedObjectSupporter22.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter2();
        builder17.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider27 = builder26.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder29 = builder26.setLogLevel(logLevel28);
        retrofit.converter.Converter converter30 = builder29.converter;
        java.util.concurrent.Executor executor31 = null;
        builder29.sethttpExecutor(executor31);
        retrofit.RestAdapter.Builder builder34 = builder29.setServer("GET");
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor36 = null;
        builder35.setcallbackExecutor(executor36);
        java.util.concurrent.Executor executor38 = null;
        builder35.setcallbackExecutor(executor38);
        builder35.ensureSaneDefaults();
        java.util.concurrent.Executor executor41 = builder35.callbackExecutor;
        builder34.setcallbackExecutor(executor41);
        builder17.httpExecutor = executor41;
        builder7.sethttpExecutor(executor41);
        builder3.callbackExecutor = executor41;
        retrofit.ErrorHandler errorHandler46 = builder3.errorHandler;
        java.util.concurrent.Executor executor47 = builder3.httpExecutor;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(converter30);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(executor41);
        org.junit.Assert.assertNull(errorHandler46);
        org.junit.Assert.assertNull(executor47);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.client.Request request11 = serializedObjectSupporter9.deserializeObjectRequest5();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter7();
        builder0.converter = gsonConverter13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = null;
        builder15.sethttpExecutor(executor16);
        retrofit.RequestInterceptor requestInterceptor18 = null;
        builder15.requestInterceptor = requestInterceptor18;
        retrofit.converter.Converter converter20 = builder15.converter;
        java.util.concurrent.Executor executor21 = null;
        builder15.httpExecutor = executor21;
        java.util.concurrent.Executor executor23 = null;
        builder15.httpExecutor = executor23;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = null;
        builder25.sethttpExecutor(executor26);
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        builder25.log = log28;
        log28.log("");
        log28.log("POST");
        builder15.log = log28;
        builder0.log = log28;
        retrofit.RestAdapter.LogLevel logLevel36 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString4();
        retrofit.Server server41 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.client.Client.Provider provider42 = null;
        java.util.concurrent.Executor executor43 = null;
        java.util.concurrent.Executor executor44 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor47 = serializedObjectSupporter45.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest1();
        retrofit.client.Request request50 = serializedObjectSupporter48.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter48.deserializeObjectConverter5();
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = null;
        builder54.sethttpExecutor(executor55);
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        builder54.log = log57;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server41, provider42, executor43, executor44, requestInterceptor47, (retrofit.converter.Converter) gsonConverter51, profiler52, errorHandler53, log57, logLevel59);
        retrofit.RestAdapter.LogLevel logLevel61 = restAdapter60.getLogLevel();
        java.lang.String str62 = restAdapter60.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler63 = restAdapter60.profiler;
        java.util.concurrent.Executor executor64 = restAdapter60.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor65 = restAdapter60.getrequestInterceptor();
        retrofit.RestAdapter.Builder builder66 = builder0.setRequestInterceptor(requestInterceptor65);
        java.util.concurrent.Executor executor67 = builder66.gethttpExecutor();
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor69 = null;
        builder68.setcallbackExecutor(executor69);
        java.util.concurrent.Executor executor71 = null;
        builder68.setcallbackExecutor(executor71);
        builder68.ensureSaneDefaults();
        java.util.concurrent.Executor executor74 = builder68.callbackExecutor;
        builder66.httpExecutor = executor74;
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "POST" + "'", str12, "POST");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GET" + "'", str38, "GET");
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Retrofit-" + "'", str46, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Retrofit-Idle" + "'", str62, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler63);
        org.junit.Assert.assertNull(executor64);
        org.junit.Assert.assertNotNull(requestInterceptor65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(executor67);
        org.junit.Assert.assertNotNull(executor74);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter3.deserializeObjectConverter3();
        builder0.converter = gsonConverter5;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder11.serializedObjectSupporter;
        java.util.concurrent.Executor executor14 = null;
        builder11.httpExecutor = executor14;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request17 = serializedObjectSupporter16.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter2();
        builder11.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.client.Request request20 = serializedObjectSupporter16.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.Server server22 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server22);
        retrofit.ErrorHandler errorHandler24 = builder23.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request26 = serializedObjectSupporter25.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter25.deserializeObjectConverter8();
        java.lang.String str29 = serializedObjectSupporter25.deserializeObjectString4();
        retrofit.client.Request request30 = serializedObjectSupporter25.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString31 = serializedObjectSupporter25.deserializeObjectTypedOutput2();
        retrofit.Server server32 = serializedObjectSupporter25.deserializeObjectServer1();
        builder23.server = server32;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GET" + "'", str4, "GET");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(errorHandler24);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(typedString31);
        org.junit.Assert.assertNotNull(server32);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        retrofit.Server server27 = restAdapter23.getserver();
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        java.util.concurrent.Executor executor6 = null;
        builder0.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider9 = builder8.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder11 = builder8.setLogLevel(logLevel10);
        retrofit.converter.Converter converter12 = builder11.converter;
        retrofit.Profiler profiler13 = builder11.profiler;
        java.util.concurrent.Executor executor14 = builder11.callbackExecutor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = null;
        builder15.setcallbackExecutor(executor16);
        java.util.concurrent.Executor executor18 = null;
        builder15.setcallbackExecutor(executor18);
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.FULL;
        builder15.logLevel = logLevel20;
        retrofit.client.Client.Provider provider22 = builder15.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = builder15.serializedObjectSupporter;
        java.util.concurrent.Executor executor24 = builder15.callbackExecutor;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = builder25.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder25.serializedObjectSupporter;
        java.util.concurrent.Executor executor28 = null;
        builder25.httpExecutor = executor28;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request31 = serializedObjectSupporter30.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter2();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider35 = builder34.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder37 = builder34.setLogLevel(logLevel36);
        retrofit.converter.Converter converter38 = builder37.converter;
        java.util.concurrent.Executor executor39 = null;
        builder37.sethttpExecutor(executor39);
        retrofit.RestAdapter.Builder builder42 = builder37.setServer("GET");
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = null;
        builder43.setcallbackExecutor(executor44);
        java.util.concurrent.Executor executor46 = null;
        builder43.setcallbackExecutor(executor46);
        builder43.ensureSaneDefaults();
        java.util.concurrent.Executor executor49 = builder43.callbackExecutor;
        builder42.setcallbackExecutor(executor49);
        builder25.httpExecutor = executor49;
        builder15.sethttpExecutor(executor49);
        builder11.callbackExecutor = executor49;
        builder0.httpExecutor = executor49;
        retrofit.client.Client client55 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder56 = builder0.setClient(client55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(serializedObjectSupporter26);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(converter38);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(executor49);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest2();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GET" + "'", str3, "GET");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.Profiler profiler5 = builder0.profiler;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("hi!");
        retrofit.converter.Converter converter8 = builder7.converter;
        retrofit.RestAdapter restAdapter9 = builder7.build();
        retrofit.Profiler profiler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder7.setProfiler(profiler10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(restAdapter9);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter23.logLevel;
        java.util.concurrent.Executor executor27 = restAdapter23.getcallbackExecutor();
        retrofit.Server server28 = restAdapter23.server;
        java.lang.String str29 = restAdapter23.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-" + "'", str29, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter3();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString4();
        retrofit.Server server11 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.client.Client.Provider provider12 = null;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor17 = serializedObjectSupporter15.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest1();
        retrofit.client.Request request20 = serializedObjectSupporter18.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = null;
        builder24.sethttpExecutor(executor25);
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        builder24.log = log27;
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter30 = new retrofit.RestAdapter(server11, provider12, executor13, executor14, requestInterceptor17, (retrofit.converter.Converter) gsonConverter21, profiler22, errorHandler23, log27, logLevel29);
        retrofit.RestAdapter.Builder builder31 = builder0.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request33 = serializedObjectSupporter32.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter32.deserializeObjectConverter2();
        retrofit.client.Request request35 = serializedObjectSupporter32.deserializeObjectRequest2();
        retrofit.client.Request request36 = serializedObjectSupporter32.deserializeObjectRequest2();
        builder0.serializedObjectSupporter = serializedObjectSupporter32;
        retrofit.client.Request request38 = serializedObjectSupporter32.deserializeObjectRequest6();
        retrofit.mime.TypedOutput typedOutput39 = request38.getBody();
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNull(typedOutput39);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider10 = builder9.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder12 = builder9.setLogLevel(logLevel11);
        retrofit.converter.Converter converter13 = builder12.converter;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider15 = builder12.clientProvider;
        retrofit.RestAdapter.Builder builder16 = builder0.setClient(provider15);
        java.util.concurrent.Executor executor17 = builder0.getcallbackExecutor();
        retrofit.converter.Converter converter18 = builder0.converter;
        java.util.concurrent.Executor executor19 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.sethttpExecutor(executor21);
        retrofit.RestAdapter.Log log23 = null;
        builder20.log = log23;
        java.util.concurrent.Executor executor25 = builder20.callbackExecutor;
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        builder20.log = log26;
        log26.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder30 = builder0.setLog(log26);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(typedString4);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = null;
        builder7.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = builder7.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.Profiler profiler12 = builder7.profiler;
        retrofit.RestAdapter.Builder builder14 = builder7.setServer("hi!");
        retrofit.converter.Converter converter15 = builder14.converter;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider17 = builder16.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel18);
        retrofit.converter.Converter converter20 = builder19.converter;
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder19.clientProvider;
        builder14.clientProvider = provider22;
        builder0.clientProvider = provider22;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(executor6);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest2();
        java.lang.String str6 = request5.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request5.getHeaders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GET" + "'", str6, "GET");
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request5 = serializedObjectSupporter4.deserializeObjectRequest1();
        retrofit.client.Request request6 = serializedObjectSupporter4.deserializeObjectRequest5();
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder8.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder8.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = null;
        builder8.httpExecutor = executor11;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request14 = serializedObjectSupporter13.deserializeObjectRequest1();
        retrofit.Server server15 = serializedObjectSupporter13.deserializeObjectServer1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString3();
        builder8.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.mime.TypedString typedString18 = serializedObjectSupporter13.deserializeObjectTypedOutput2();
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "Retrofit-Idle", headerList7, (retrofit.mime.TypedOutput) typedString18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request23 = serializedObjectSupporter22.deserializeObjectRequest8();
        retrofit.client.Request request24 = serializedObjectSupporter22.deserializeObjectRequest7();
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request32 = serializedObjectSupporter31.deserializeObjectRequest1();
        java.util.List<retrofit.client.Header> headerList33 = request32.headers;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request36 = serializedObjectSupporter35.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter35.deserializeObjectConverter2();
        retrofit.client.Request request38 = serializedObjectSupporter35.deserializeObjectRequest6();
        retrofit.client.Request request39 = serializedObjectSupporter35.deserializeObjectRequest8();
        retrofit.client.Request request40 = serializedObjectSupporter35.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString41 = serializedObjectSupporter35.deserializeObjectTypedOutput2();
        retrofit.client.Request request42 = new retrofit.client.Request("", "Retrofit-", headerList34, (retrofit.mime.TypedOutput) typedString41);
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request46 = serializedObjectSupporter45.deserializeObjectRequest1();
        java.util.List<retrofit.client.Header> headerList47 = request46.headers;
        java.util.List<retrofit.client.Header> headerList48 = request46.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request50 = serializedObjectSupporter49.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter2();
        retrofit.client.Request request52 = serializedObjectSupporter49.deserializeObjectRequest6();
        retrofit.client.Request request53 = serializedObjectSupporter49.deserializeObjectRequest8();
        retrofit.client.Request request54 = serializedObjectSupporter49.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString55 = serializedObjectSupporter49.deserializeObjectTypedOutput2();
        retrofit.client.Request request56 = new retrofit.client.Request("", "Retrofit-", headerList48, (retrofit.mime.TypedOutput) typedString55);
        retrofit.client.Request request57 = new retrofit.client.Request("GET", "POST", headerList34, (retrofit.mime.TypedOutput) typedString55);
        retrofit.client.Request request58 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-Idle", headerList26, (retrofit.mime.TypedOutput) typedString55);
        retrofit.client.Request request59 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList7, (retrofit.mime.TypedOutput) typedString55);
        java.lang.String str60 = request59.getMethod();
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(typedString18);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(typedString41);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertNotNull(typedString55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Retrofit-" + "'", str60, "Retrofit-");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean27 = logLevel26.log();
        boolean boolean28 = logLevel26.log();
        restAdapter23.setLogLevel(logLevel26);
        retrofit.RequestInterceptor requestInterceptor30 = restAdapter23.requestInterceptor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(requestInterceptor30);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = builder28.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = builder28.serializedObjectSupporter;
        java.util.concurrent.Executor executor31 = null;
        builder28.httpExecutor = executor31;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter33.deserializeObjectConverter2();
        builder28.serializedObjectSupporter = serializedObjectSupporter33;
        retrofit.client.Request request37 = serializedObjectSupporter33.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter33.deserializeObjectConverter5();
        retrofit.client.Request request39 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.mime.TypedOutput typedOutput40 = request39.body;
        retrofit.client.Request request41 = restAdapter23.logAndReplaceRequest(request39);
        retrofit.RestAdapter.LogLevel logLevel42 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNull(serializedObjectSupporter30);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str6 = request5.getUrl();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder8.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder8.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = null;
        builder8.httpExecutor = executor11;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request14 = serializedObjectSupporter13.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter2();
        builder8.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.client.Request request17 = serializedObjectSupporter13.deserializeObjectRequest6();
        retrofit.client.Request request18 = serializedObjectSupporter13.deserializeObjectRequest4();
        retrofit.mime.TypedString typedString19 = serializedObjectSupporter13.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter13.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder21 = builder0.setConverter((retrofit.converter.Converter) gsonConverter20);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = null;
        builder22.sethttpExecutor(executor23);
        retrofit.RestAdapter.Log log25 = null;
        builder22.log = log25;
        retrofit.RestAdapter.Log log27 = builder22.log;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = null;
        builder28.sethttpExecutor(executor29);
        retrofit.RequestInterceptor requestInterceptor31 = null;
        builder28.requestInterceptor = requestInterceptor31;
        java.util.concurrent.Executor executor33 = null;
        builder28.httpExecutor = executor33;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter35.deserializeObjectConverter3();
        java.lang.String str38 = serializedObjectSupporter35.deserializeObjectString4();
        retrofit.client.Request request39 = serializedObjectSupporter35.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler40 = serializedObjectSupporter35.deserializeObjectErrorHandler1();
        builder28.errorHandler = errorHandler40;
        retrofit.RestAdapter.Builder builder42 = builder22.setErrorHandler(errorHandler40);
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = null;
        builder43.sethttpExecutor(executor44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        java.lang.String str47 = serializedObjectSupporter46.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter46.deserializeObjectConverter3();
        builder43.converter = gsonConverter48;
        retrofit.client.Client.Provider provider50 = null;
        builder43.clientProvider = provider50;
        retrofit.RestAdapter.LogLevel logLevel52 = builder43.logLevel;
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor54 = null;
        builder53.sethttpExecutor(executor54);
        retrofit.RequestInterceptor requestInterceptor56 = null;
        builder53.requestInterceptor = requestInterceptor56;
        retrofit.converter.Converter converter58 = builder53.converter;
        java.util.concurrent.Executor executor59 = null;
        builder53.httpExecutor = executor59;
        retrofit.RestAdapter.LogLevel logLevel61 = builder53.logLevel;
        builder43.logLevel = logLevel61;
        java.util.concurrent.Executor executor63 = builder43.callbackExecutor;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider65 = builder64.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel66 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder67 = builder64.setLogLevel(logLevel66);
        retrofit.converter.Converter converter68 = builder67.converter;
        builder67.ensureSaneDefaults();
        retrofit.client.Client.Provider provider70 = builder67.clientProvider;
        builder43.setclientProvider(provider70);
        builder22.setclientProvider(provider70);
        builder21.setclientProvider(provider70);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(typedString19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "GET" + "'", str36, "GET");
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(errorHandler40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GET" + "'", str47, "GET");
        org.junit.Assert.assertNotNull(gsonConverter48);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(converter58);
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertNull(provider65);
        org.junit.Assert.assertTrue("'" + logLevel66 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel66.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(converter68);
        org.junit.Assert.assertNotNull(provider70);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = null;
        builder28.setcallbackExecutor(executor29);
        java.util.concurrent.Executor executor31 = builder28.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel32 = builder28.logLevel;
        boolean boolean33 = logLevel32.log();
        restAdapter23.logLevel = logLevel32;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter35.deserializeObjectConverter3();
        java.lang.String str38 = serializedObjectSupporter35.deserializeObjectString4();
        retrofit.Server server39 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.client.Client.Provider provider40 = null;
        java.util.concurrent.Executor executor41 = null;
        java.util.concurrent.Executor executor42 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor45 = serializedObjectSupporter43.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request47 = serializedObjectSupporter46.deserializeObjectRequest1();
        retrofit.client.Request request48 = serializedObjectSupporter46.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter5();
        retrofit.Profiler profiler50 = null;
        retrofit.ErrorHandler errorHandler51 = null;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor53 = null;
        builder52.sethttpExecutor(executor53);
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        builder52.log = log55;
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter58 = new retrofit.RestAdapter(server39, provider40, executor41, executor42, requestInterceptor45, (retrofit.converter.Converter) gsonConverter49, profiler50, errorHandler51, log55, logLevel57);
        retrofit.RestAdapter.LogLevel logLevel59 = restAdapter58.getLogLevel();
        retrofit.converter.Converter converter60 = restAdapter58.converter;
        java.util.concurrent.Executor executor61 = restAdapter58.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel62 = restAdapter58.getLogLevel();
        java.util.concurrent.Executor executor63 = restAdapter58.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = new retrofit.SerializedObjectSupporter();
        java.lang.String str65 = serializedObjectSupporter64.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter64.deserializeObjectConverter3();
        java.lang.String str67 = serializedObjectSupporter64.deserializeObjectString4();
        retrofit.Server server68 = serializedObjectSupporter64.deserializeObjectServer1();
        retrofit.client.Client.Provider provider69 = null;
        java.util.concurrent.Executor executor70 = null;
        java.util.concurrent.Executor executor71 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        java.lang.String str73 = serializedObjectSupporter72.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor74 = serializedObjectSupporter72.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request76 = serializedObjectSupporter75.deserializeObjectRequest1();
        retrofit.client.Request request77 = serializedObjectSupporter75.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter78 = serializedObjectSupporter75.deserializeObjectConverter5();
        retrofit.Profiler profiler79 = null;
        retrofit.ErrorHandler errorHandler80 = null;
        retrofit.RestAdapter.Builder builder81 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor82 = null;
        builder81.sethttpExecutor(executor82);
        retrofit.RestAdapter.Log log84 = retrofit.RestAdapter.Log.NONE;
        builder81.log = log84;
        retrofit.RestAdapter.LogLevel logLevel86 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter87 = new retrofit.RestAdapter(server68, provider69, executor70, executor71, requestInterceptor74, (retrofit.converter.Converter) gsonConverter78, profiler79, errorHandler80, log84, logLevel86);
        retrofit.RestAdapter.LogLevel logLevel88 = restAdapter87.getLogLevel();
        retrofit.converter.Converter converter89 = restAdapter87.converter;
        java.util.concurrent.Executor executor90 = restAdapter87.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel91 = restAdapter87.getLogLevel();
        restAdapter58.setLogLevel(logLevel91);
        restAdapter23.setLogLevel(logLevel91);
        retrofit.converter.Converter converter94 = restAdapter23.converter;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "GET" + "'", str36, "GET");
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Retrofit-" + "'", str44, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor45);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter60);
        org.junit.Assert.assertNull(executor61);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "GET" + "'", str65, "GET");
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(server68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Retrofit-" + "'", str73, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor74);
        org.junit.Assert.assertNotNull(request76);
        org.junit.Assert.assertNotNull(request77);
        org.junit.Assert.assertNotNull(gsonConverter78);
        org.junit.Assert.assertNotNull(log84);
        org.junit.Assert.assertTrue("'" + logLevel86 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel86.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel88 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel88.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter89);
        org.junit.Assert.assertNull(executor90);
        org.junit.Assert.assertTrue("'" + logLevel91 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel91.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter94);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter26 = restAdapter23.converter;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter23.new RestHandler();
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = null;
        builder28.sethttpExecutor(executor29);
        retrofit.RequestInterceptor requestInterceptor31 = null;
        builder28.requestInterceptor = requestInterceptor31;
        java.util.concurrent.Executor executor33 = null;
        builder28.httpExecutor = executor33;
        java.util.concurrent.Executor executor35 = null;
        builder28.setcallbackExecutor(executor35);
        retrofit.client.Client.Provider provider37 = null;
        builder28.setclientProvider(provider37);
        retrofit.RestAdapter.Builder builder40 = builder28.setServer("Retrofit-Idle");
        retrofit.RestAdapter restAdapter41 = builder40.build();
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter41.setLogLevel(logLevel42);
        java.lang.reflect.Method method44 = null;
        java.lang.Object[] objArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = restHandler27.invoke((java.lang.Object) logLevel42, method44, objArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(restAdapter41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest7();
        retrofit.client.Request request9 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GET" + "'", str3, "GET");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request3 = serializedObjectSupporter2.deserializeObjectRequest8();
        java.util.List<retrofit.client.Header> headerList4 = request3.getHeaders();
        java.lang.String str5 = request3.method;
        java.util.List<retrofit.client.Header> headerList6 = request3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest8();
        retrofit.client.Request request11 = serializedObjectSupporter9.deserializeObjectRequest7();
        java.util.List<retrofit.client.Header> headerList12 = request11.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request11.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest1();
        java.util.List<retrofit.client.Header> headerList20 = request19.headers;
        java.util.List<retrofit.client.Header> headerList21 = request19.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request23 = serializedObjectSupporter22.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter2();
        retrofit.client.Request request25 = serializedObjectSupporter22.deserializeObjectRequest6();
        retrofit.client.Request request26 = serializedObjectSupporter22.deserializeObjectRequest8();
        retrofit.client.Request request27 = serializedObjectSupporter22.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString28 = serializedObjectSupporter22.deserializeObjectTypedOutput2();
        retrofit.client.Request request29 = new retrofit.client.Request("", "Retrofit-", headerList21, (retrofit.mime.TypedOutput) typedString28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request33 = serializedObjectSupporter32.deserializeObjectRequest1();
        java.util.List<retrofit.client.Header> headerList34 = request33.headers;
        java.util.List<retrofit.client.Header> headerList35 = request33.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request37 = serializedObjectSupporter36.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter2();
        retrofit.client.Request request39 = serializedObjectSupporter36.deserializeObjectRequest6();
        retrofit.client.Request request40 = serializedObjectSupporter36.deserializeObjectRequest8();
        retrofit.client.Request request41 = serializedObjectSupporter36.deserializeObjectRequest1();
        retrofit.mime.TypedString typedString42 = serializedObjectSupporter36.deserializeObjectTypedOutput2();
        retrofit.client.Request request43 = new retrofit.client.Request("", "Retrofit-", headerList35, (retrofit.mime.TypedOutput) typedString42);
        retrofit.client.Request request44 = new retrofit.client.Request("GET", "POST", headerList21, (retrofit.mime.TypedOutput) typedString42);
        retrofit.client.Request request45 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-Idle", headerList13, (retrofit.mime.TypedOutput) typedString42);
        retrofit.client.Request request46 = new retrofit.client.Request("GET", "http://example.com/", headerList6, (retrofit.mime.TypedOutput) typedString42);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(typedString28);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(typedString42);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.mime.TypedString typedString10 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.mime.TypedString typedString12 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(typedString10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString12);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.Profiler profiler5 = builder3.profiler;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request8 = serializedObjectSupporter7.deserializeObjectRequest1();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString1();
        builder3.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter3();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.Server server16 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor22 = serializedObjectSupporter20.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.client.Request request25 = serializedObjectSupporter23.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter23.deserializeObjectConverter5();
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = null;
        builder29.sethttpExecutor(executor30);
        retrofit.RestAdapter.Log log32 = retrofit.RestAdapter.Log.NONE;
        builder29.log = log32;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server16, provider17, executor18, executor19, requestInterceptor22, (retrofit.converter.Converter) gsonConverter26, profiler27, errorHandler28, log32, logLevel34);
        java.util.concurrent.Executor executor36 = restAdapter35.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor37 = restAdapter35.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor38 = restAdapter35.requestInterceptor;
        java.lang.String str39 = restAdapter35.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = restAdapter35.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel41 = restAdapter35.logLevel;
        retrofit.converter.Converter converter42 = restAdapter35.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = restAdapter35.serializedObjectSupporter;
        retrofit.Server server44 = restAdapter35.server;
        builder3.server = server44;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-" + "'", str10, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(requestInterceptor37);
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Retrofit-" + "'", str39, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter42);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
        org.junit.Assert.assertNotNull(server44);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder3.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor7 = serializedObjectSupporter5.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter6();
        retrofit.RequestInterceptor requestInterceptor11 = serializedObjectSupporter5.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder12 = builder3.setRequestInterceptor(requestInterceptor11);
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = builder13.serializedObjectSupporter;
        retrofit.Profiler profiler15 = builder13.profiler;
        retrofit.ErrorHandler errorHandler16 = builder13.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter3();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.Server server21 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor27 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request29 = serializedObjectSupporter28.deserializeObjectRequest1();
        retrofit.client.Request request30 = serializedObjectSupporter28.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter28.deserializeObjectConverter5();
        retrofit.Profiler profiler32 = null;
        retrofit.ErrorHandler errorHandler33 = null;
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = null;
        builder34.sethttpExecutor(executor35);
        retrofit.RestAdapter.Log log37 = retrofit.RestAdapter.Log.NONE;
        builder34.log = log37;
        retrofit.RestAdapter.LogLevel logLevel39 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter40 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor27, (retrofit.converter.Converter) gsonConverter31, profiler32, errorHandler33, log37, logLevel39);
        java.util.concurrent.Executor executor41 = restAdapter40.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor42 = restAdapter40.requestInterceptor;
        retrofit.RestAdapter.Builder builder43 = builder13.setRequestInterceptor(requestInterceptor42);
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor45 = null;
        builder44.setcallbackExecutor(executor45);
        java.util.concurrent.Executor executor47 = null;
        builder44.setcallbackExecutor(executor47);
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.FULL;
        builder44.logLevel = logLevel49;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor52 = null;
        builder51.setcallbackExecutor(executor52);
        java.util.concurrent.Executor executor54 = null;
        builder51.setcallbackExecutor(executor54);
        builder51.ensureSaneDefaults();
        java.util.concurrent.Executor executor57 = builder51.callbackExecutor;
        builder44.sethttpExecutor(executor57);
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = builder59.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = builder59.serializedObjectSupporter;
        retrofit.client.Client.Provider provider62 = null;
        builder59.clientProvider = provider62;
        java.util.concurrent.Executor executor64 = null;
        builder59.callbackExecutor = executor64;
        retrofit.RestAdapter.Builder builder66 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor67 = null;
        builder66.setcallbackExecutor(executor67);
        java.util.concurrent.Executor executor69 = null;
        builder66.setcallbackExecutor(executor69);
        retrofit.RestAdapter.LogLevel logLevel71 = retrofit.RestAdapter.LogLevel.FULL;
        builder66.logLevel = logLevel71;
        retrofit.RestAdapter.Builder builder73 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor74 = null;
        builder73.setcallbackExecutor(executor74);
        java.util.concurrent.Executor executor76 = null;
        builder73.setcallbackExecutor(executor76);
        builder73.ensureSaneDefaults();
        java.util.concurrent.Executor executor79 = builder73.callbackExecutor;
        builder66.sethttpExecutor(executor79);
        builder59.httpExecutor = executor79;
        retrofit.RestAdapter.Builder builder82 = builder43.setExecutors(executor57, executor79);
        builder3.sethttpExecutor(executor79);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GET" + "'", str18, "GET");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-" + "'", str26, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNotNull(requestInterceptor42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor57);
        org.junit.Assert.assertNull(serializedObjectSupporter60);
        org.junit.Assert.assertNull(serializedObjectSupporter61);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor79);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder7.serializedObjectSupporter;
        retrofit.Profiler profiler9 = builder7.profiler;
        retrofit.RestAdapter.LogLevel logLevel10 = builder7.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter.Log log12 = null;
        builder0.log = log12;
        retrofit.RestAdapter.Builder builder15 = builder0.setServer("GET");
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request17 = serializedObjectSupporter16.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter2();
        retrofit.client.Request request19 = serializedObjectSupporter16.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor20 = serializedObjectSupporter16.deserializeObjectRequestInterceptor1();
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter16.deserializeObjectConverter1();
        builder0.converter = gsonConverter22;
        retrofit.RestAdapter restAdapter24 = builder0.build();
        retrofit.client.Client.Provider provider25 = restAdapter24.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(requestInterceptor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(restAdapter24);
        org.junit.Assert.assertNotNull(provider25);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder3.logLevel = logLevel5;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        retrofit.client.Request request12 = serializedObjectSupporter8.deserializeObjectRequest6();
        retrofit.Server server13 = serializedObjectSupporter8.deserializeObjectServer1();
        builder3.server = server13;
        java.util.concurrent.Executor executor15 = builder3.getcallbackExecutor();
        java.util.concurrent.Executor executor16 = builder3.callbackExecutor;
        retrofit.converter.Converter converter17 = builder3.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.client.Request request21 = serializedObjectSupporter18.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor22 = serializedObjectSupporter18.deserializeObjectRequestInterceptor1();
        java.lang.String str23 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter18.deserializeObjectConverter1();
        retrofit.Server server25 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder26 = builder3.setServer(server25);
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor28 = null;
        builder27.sethttpExecutor(executor28);
        retrofit.RestAdapter.Log log30 = null;
        builder27.log = log30;
        retrofit.RestAdapter.Log log32 = builder27.log;
        retrofit.Profiler profiler33 = builder27.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter34.deserializeObjectConverter3();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString4();
        retrofit.Server server38 = serializedObjectSupporter34.deserializeObjectServer1();
        retrofit.client.Client.Provider provider39 = null;
        java.util.concurrent.Executor executor40 = null;
        java.util.concurrent.Executor executor41 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        java.lang.String str43 = serializedObjectSupporter42.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor44 = serializedObjectSupporter42.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request46 = serializedObjectSupporter45.deserializeObjectRequest1();
        retrofit.client.Request request47 = serializedObjectSupporter45.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter45.deserializeObjectConverter5();
        retrofit.Profiler profiler49 = null;
        retrofit.ErrorHandler errorHandler50 = null;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor52 = null;
        builder51.sethttpExecutor(executor52);
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        builder51.log = log54;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server38, provider39, executor40, executor41, requestInterceptor44, (retrofit.converter.Converter) gsonConverter48, profiler49, errorHandler50, log54, logLevel56);
        retrofit.RestAdapter.Builder builder58 = builder27.setConverter((retrofit.converter.Converter) gsonConverter48);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter59.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter59.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter59.deserializeObjectConverter1();
        retrofit.Server server64 = serializedObjectSupporter59.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder65 = builder58.setServer(server64);
        builder26.server = server64;
        java.util.concurrent.Executor executor67 = builder26.httpExecutor;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GET" + "'", str9, "GET");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(requestInterceptor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(log32);
        org.junit.Assert.assertNull(profiler33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "GET" + "'", str35, "GET");
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Retrofit-" + "'", str43, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(gsonConverter48);
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GET" + "'", str60, "GET");
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertNotNull(gsonConverter63);
        org.junit.Assert.assertNotNull(server64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNull(executor67);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter3();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString4();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.getLogLevel();
        java.lang.String str31 = restAdapter23.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor32 = restAdapter23.callbackExecutor;
        retrofit.converter.Converter converter33 = restAdapter23.getconverter();
        retrofit.client.Client.Provider provider34 = restAdapter23.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter35.deserializeObjectConverter3();
        java.lang.String str38 = serializedObjectSupporter35.deserializeObjectString4();
        retrofit.Server server39 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.client.Client.Provider provider40 = null;
        java.util.concurrent.Executor executor41 = null;
        java.util.concurrent.Executor executor42 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor45 = serializedObjectSupporter43.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request47 = serializedObjectSupporter46.deserializeObjectRequest1();
        retrofit.client.Request request48 = serializedObjectSupporter46.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter5();
        retrofit.Profiler profiler50 = null;
        retrofit.ErrorHandler errorHandler51 = null;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor53 = null;
        builder52.sethttpExecutor(executor53);
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        builder52.log = log55;
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter58 = new retrofit.RestAdapter(server39, provider40, executor41, executor42, requestInterceptor45, (retrofit.converter.Converter) gsonConverter49, profiler50, errorHandler51, log55, logLevel57);
        java.util.concurrent.Executor executor59 = restAdapter58.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor60 = restAdapter58.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor61 = restAdapter58.requestInterceptor;
        retrofit.ErrorHandler errorHandler62 = restAdapter58.geterrorHandler();
        java.util.concurrent.Executor executor63 = restAdapter58.gethttpExecutor();
        java.lang.String str64 = restAdapter58.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request66 = serializedObjectSupporter65.deserializeObjectRequest1();
        retrofit.client.Request request67 = serializedObjectSupporter65.deserializeObjectRequest5();
        retrofit.client.Request request68 = restAdapter58.logAndReplaceRequest(request67);
        retrofit.client.Request request69 = restAdapter23.logAndReplaceRequest(request68);
        java.lang.String str70 = request68.url;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GET" + "'", str26, "GET");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(converter33);
        org.junit.Assert.assertNull(provider34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "GET" + "'", str36, "GET");
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Retrofit-" + "'", str44, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor45);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor59);
        org.junit.Assert.assertNotNull(requestInterceptor60);
        org.junit.Assert.assertNotNull(requestInterceptor61);
        org.junit.Assert.assertNull(errorHandler62);
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Retrofit-" + "'", str64, "Retrofit-");
        org.junit.Assert.assertNotNull(request66);
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertNotNull(request68);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.RestAdapter restAdapter22 = builder0.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        retrofit.client.Request request26 = serializedObjectSupporter23.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor27 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        java.lang.String str28 = serializedObjectSupporter23.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter23.deserializeObjectConverter3();
        restAdapter22.serializedObjectSupporter = serializedObjectSupporter23;
        java.util.concurrent.Executor executor31 = restAdapter22.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter22.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter22.new RestHandler();
        retrofit.client.Client.Provider provider34 = restAdapter22.getclientProvider();
        retrofit.RestAdapter.Log log35 = restAdapter22.log;
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(requestInterceptor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(executor31);
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(log35);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.client.Request request8 = serializedObjectSupporter4.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter4.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler9;
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.setcallbackExecutor(executor13);
        java.util.concurrent.Executor executor15 = null;
        builder12.setcallbackExecutor(executor15);
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = null;
        builder19.setcallbackExecutor(executor20);
        java.util.concurrent.Executor executor22 = null;
        builder19.setcallbackExecutor(executor22);
        builder19.ensureSaneDefaults();
        java.util.concurrent.Executor executor25 = builder19.callbackExecutor;
        builder12.sethttpExecutor(executor25);
        builder0.httpExecutor = executor25;
        java.util.concurrent.Executor executor28 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = null;
        builder29.sethttpExecutor(executor30);
        retrofit.RestAdapter.Log log32 = null;
        builder29.log = log32;
        java.util.concurrent.Executor executor34 = builder29.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = builder29.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler36 = builder29.errorHandler;
        builder29.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel38 = builder29.logLevel;
        retrofit.client.Client.Provider provider39 = builder29.getclientProvider();
        builder0.setclientProvider(provider39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request42 = serializedObjectSupporter41.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter41.deserializeObjectConverter2();
        retrofit.client.Request request44 = serializedObjectSupporter41.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor45 = serializedObjectSupporter41.deserializeObjectRequestInterceptor1();
        java.lang.String str46 = serializedObjectSupporter41.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter41.deserializeObjectConverter5();
        builder0.converter = gsonConverter47;
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor25);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNull(serializedObjectSupporter35);
        org.junit.Assert.assertNull(errorHandler36);
        org.junit.Assert.assertTrue("'" + logLevel38 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel38.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(requestInterceptor45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://example.com/" + "'", str46, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter47);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-Idle" + "'", str7, "Retrofit-Idle");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        retrofit.Profiler profiler26 = restAdapter23.getprofiler();
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.Server server32 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter36.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request40 = serializedObjectSupporter39.deserializeObjectRequest1();
        retrofit.client.Request request41 = serializedObjectSupporter39.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter39.deserializeObjectConverter5();
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = null;
        builder45.sethttpExecutor(executor46);
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        builder45.log = log48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor38, (retrofit.converter.Converter) gsonConverter42, profiler43, errorHandler44, log48, logLevel50);
        java.util.concurrent.Executor executor52 = restAdapter51.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter53.deserializeObjectConverter3();
        java.lang.String str56 = serializedObjectSupporter53.deserializeObjectString4();
        restAdapter51.serializedObjectSupporter = serializedObjectSupporter53;
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter53;
        retrofit.Profiler profiler59 = restAdapter23.profiler;
        retrofit.converter.Converter converter60 = restAdapter23.getconverter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-" + "'", str37, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "GET" + "'", str54, "GET");
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNull(profiler59);
        org.junit.Assert.assertNotNull(converter60);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter26 = restAdapter23.converter;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restHandler27.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        retrofit.converter.Converter converter5 = builder0.converter;
        java.util.concurrent.Executor executor6 = null;
        builder0.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter3();
        builder8.converter = gsonConverter13;
        retrofit.client.Client.Provider provider15 = null;
        builder8.clientProvider = provider15;
        retrofit.client.Client.Provider provider17 = null;
        builder8.setclientProvider(provider17);
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = builder19.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = builder19.serializedObjectSupporter;
        java.util.concurrent.Executor executor22 = null;
        builder19.httpExecutor = executor22;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request25 = serializedObjectSupporter24.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter24.deserializeObjectConverter2();
        builder19.serializedObjectSupporter = serializedObjectSupporter24;
        retrofit.client.Request request28 = serializedObjectSupporter24.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter24.deserializeObjectConverter5();
        retrofit.Server server30 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder31 = builder8.setServer(server30);
        builder0.server = server30;
        retrofit.RequestInterceptor requestInterceptor33 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor34 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log35 = builder0.log;
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(requestInterceptor33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNull(log35);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler28 = restAdapter23.getprofiler();
        retrofit.converter.Converter converter29 = restAdapter23.converter;
        retrofit.Server server30 = restAdapter23.getserver();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertNotNull(converter29);
        org.junit.Assert.assertNotNull(server30);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter26 = restAdapter23.converter;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.Server server32 = serializedObjectSupporter28.deserializeObjectServer1();
        restHandler27.serializedObjectSupporter = serializedObjectSupporter28;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = restHandler27.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(serializedObjectSupporter34);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder7.serializedObjectSupporter;
        retrofit.Profiler profiler9 = builder7.profiler;
        retrofit.RestAdapter.LogLevel logLevel10 = builder7.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        java.util.concurrent.Executor executor17 = builder12.callbackExecutor;
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        builder12.log = log18;
        log18.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder22 = builder0.setLog(log18);
        java.util.concurrent.Executor executor23 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = null;
        builder24.setcallbackExecutor(executor25);
        retrofit.converter.Converter converter27 = builder24.converter;
        retrofit.RestAdapter.Builder builder29 = builder24.setServer("GET");
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = null;
        builder30.sethttpExecutor(executor31);
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter33.deserializeObjectConverter3();
        builder30.converter = gsonConverter35;
        retrofit.client.Client.Provider provider37 = null;
        builder30.clientProvider = provider37;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        java.lang.String str40 = serializedObjectSupporter39.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter39.deserializeObjectConverter3();
        java.lang.String str42 = serializedObjectSupporter39.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter39.deserializeObjectConverter6();
        builder30.converter = gsonConverter43;
        builder24.converter = gsonConverter43;
        retrofit.RestAdapter restAdapter46 = builder24.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request48 = serializedObjectSupporter47.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter47.deserializeObjectConverter2();
        retrofit.client.Request request50 = serializedObjectSupporter47.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor51 = serializedObjectSupporter47.deserializeObjectRequestInterceptor1();
        java.lang.String str52 = serializedObjectSupporter47.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter47.deserializeObjectConverter3();
        restAdapter46.serializedObjectSupporter = serializedObjectSupporter47;
        java.util.concurrent.Executor executor55 = restAdapter46.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor56 = restAdapter46.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler57 = restAdapter46.new RestHandler();
        retrofit.client.Client.Provider provider58 = restAdapter46.getclientProvider();
        builder0.setclientProvider(provider58);
        retrofit.RestAdapter.Builder builder60 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor61 = null;
        builder60.sethttpExecutor(executor61);
        retrofit.RestAdapter.Log log63 = null;
        builder60.log = log63;
        java.util.concurrent.Executor executor65 = builder60.callbackExecutor;
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        builder60.log = log66;
        builder0.log = log66;
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(converter27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "GET" + "'", str34, "GET");
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GET" + "'", str40, "GET");
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(restAdapter46);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(requestInterceptor51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(executor55);
        org.junit.Assert.assertNotNull(requestInterceptor56);
        org.junit.Assert.assertNotNull(provider58);
        org.junit.Assert.assertNull(executor65);
        org.junit.Assert.assertNotNull(log66);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter3();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString4();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.getLogLevel();
        java.lang.String str31 = restAdapter23.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor32 = restAdapter23.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter23.getLogLevel();
        boolean boolean34 = logLevel33.log();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GET" + "'", str26, "GET");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider2 = null;
        builder0.setclientProvider(provider2);
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = null;
        builder4.sethttpExecutor(executor5);
        retrofit.RestAdapter.Log log7 = null;
        builder4.log = log7;
        java.util.concurrent.Executor executor9 = builder4.callbackExecutor;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        builder4.log = log10;
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter3();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        retrofit.client.Request request17 = serializedObjectSupporter13.deserializeObjectRequest6();
        retrofit.Server server18 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder19 = builder12.setServer(server18);
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.client.Request request25 = serializedObjectSupporter23.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor26 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request28 = serializedObjectSupporter27.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter27.deserializeObjectConverter2();
        retrofit.Profiler profiler30 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        java.lang.String str32 = serializedObjectSupporter31.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter3();
        java.lang.String str34 = serializedObjectSupporter31.deserializeObjectString4();
        retrofit.client.Request request35 = serializedObjectSupporter31.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler36 = serializedObjectSupporter31.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = builder37.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = builder37.serializedObjectSupporter;
        retrofit.client.Client.Provider provider40 = null;
        builder37.clientProvider = provider40;
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        builder37.log = log42;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor45 = null;
        builder44.setcallbackExecutor(executor45);
        java.util.concurrent.Executor executor47 = null;
        builder44.setcallbackExecutor(executor47);
        retrofit.client.Client.Provider provider49 = null;
        builder44.clientProvider = provider49;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = builder51.serializedObjectSupporter;
        retrofit.Profiler profiler53 = builder51.profiler;
        retrofit.RestAdapter.LogLevel logLevel54 = builder51.logLevel;
        builder44.logLevel = logLevel54;
        retrofit.RestAdapter restAdapter56 = new retrofit.RestAdapter(server18, provider20, executor21, executor22, requestInterceptor26, (retrofit.converter.Converter) gsonConverter29, profiler30, errorHandler36, log42, logLevel54);
        retrofit.client.Client.Provider provider57 = restAdapter56.clientProvider;
        retrofit.client.Client.Provider provider58 = restAdapter56.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GET" + "'", str32, "GET");
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(errorHandler36);
        org.junit.Assert.assertNull(serializedObjectSupporter38);
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNull(serializedObjectSupporter52);
        org.junit.Assert.assertNull(profiler53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider57);
        org.junit.Assert.assertNull(provider58);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        retrofit.client.Client.Provider provider27 = restAdapter23.clientProvider;
        retrofit.converter.Converter converter28 = restAdapter23.getconverter();
        retrofit.Profiler profiler29 = restAdapter23.profiler;
        java.lang.Class<?> wildcardClass30 = restAdapter23.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertNotNull(converter28);
        org.junit.Assert.assertNull(profiler29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest8();
        java.lang.String str9 = request8.url;
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        java.util.concurrent.Executor executor27 = restAdapter23.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(executor27);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter3.deserializeObjectConverter3();
        builder0.converter = gsonConverter5;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = builder11.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder14 = builder11.setLogLevel(logLevel13);
        retrofit.RestAdapter.Log log15 = builder14.log;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder14.logLevel = logLevel16;
        retrofit.ErrorHandler errorHandler18 = builder14.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter19.deserializeObjectConverter3();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString4();
        retrofit.client.Request request23 = serializedObjectSupporter19.deserializeObjectRequest6();
        retrofit.Server server24 = serializedObjectSupporter19.deserializeObjectServer1();
        builder14.server = server24;
        java.util.concurrent.Executor executor26 = builder14.getcallbackExecutor();
        java.util.concurrent.Executor executor27 = builder14.callbackExecutor;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = null;
        builder28.setcallbackExecutor(executor29);
        java.util.concurrent.Executor executor31 = null;
        builder28.setcallbackExecutor(executor31);
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.FULL;
        builder28.logLevel = logLevel33;
        retrofit.client.Client.Provider provider35 = builder28.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = null;
        builder36.sethttpExecutor(executor37);
        retrofit.RestAdapter.Log log39 = null;
        builder36.log = log39;
        retrofit.RestAdapter.Log log41 = builder36.log;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor43 = null;
        builder42.sethttpExecutor(executor43);
        retrofit.RequestInterceptor requestInterceptor45 = null;
        builder42.requestInterceptor = requestInterceptor45;
        java.util.concurrent.Executor executor47 = null;
        builder42.httpExecutor = executor47;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter3();
        java.lang.String str52 = serializedObjectSupporter49.deserializeObjectString4();
        retrofit.client.Request request53 = serializedObjectSupporter49.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler54 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        builder42.errorHandler = errorHandler54;
        retrofit.RestAdapter.Builder builder56 = builder36.setErrorHandler(errorHandler54);
        retrofit.RestAdapter.Builder builder57 = builder28.setErrorHandler(errorHandler54);
        retrofit.RestAdapter.Builder builder58 = builder14.setErrorHandler(errorHandler54);
        retrofit.RestAdapter.Builder builder59 = builder0.setErrorHandler(errorHandler54);
        retrofit.client.Client.Provider provider60 = null;
        builder59.setclientProvider(provider60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GET" + "'", str4, "GET");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GET" + "'", str20, "GET");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNull(log41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "GET" + "'", str50, "GET");
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(errorHandler54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request9 = serializedObjectSupporter0.deserializeObjectRequest6();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter23.requestInterceptor;
        java.util.concurrent.Executor executor29 = restAdapter23.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor30 = restAdapter23.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        java.lang.String str32 = serializedObjectSupporter31.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter3();
        java.lang.String str34 = serializedObjectSupporter31.deserializeObjectString4();
        retrofit.Server server35 = serializedObjectSupporter31.deserializeObjectServer1();
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        java.lang.String str40 = serializedObjectSupporter39.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor41 = serializedObjectSupporter39.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request43 = serializedObjectSupporter42.deserializeObjectRequest1();
        retrofit.client.Request request44 = serializedObjectSupporter42.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter42.deserializeObjectConverter5();
        retrofit.Profiler profiler46 = null;
        retrofit.ErrorHandler errorHandler47 = null;
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor49 = null;
        builder48.sethttpExecutor(executor49);
        retrofit.RestAdapter.Log log51 = retrofit.RestAdapter.Log.NONE;
        builder48.log = log51;
        retrofit.RestAdapter.LogLevel logLevel53 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter54 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor41, (retrofit.converter.Converter) gsonConverter45, profiler46, errorHandler47, log51, logLevel53);
        retrofit.RestAdapter.LogLevel logLevel55 = restAdapter54.getLogLevel();
        java.lang.String str56 = restAdapter54.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor57 = restAdapter54.httpExecutor;
        retrofit.Profiler profiler58 = restAdapter54.getprofiler();
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor60 = null;
        builder59.setcallbackExecutor(executor60);
        java.util.concurrent.Executor executor62 = builder59.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel63 = builder59.logLevel;
        boolean boolean64 = logLevel63.log();
        restAdapter54.logLevel = logLevel63;
        retrofit.RestAdapter.Builder builder66 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor67 = null;
        builder66.sethttpExecutor(executor67);
        retrofit.RestAdapter.Log log69 = null;
        builder66.log = log69;
        java.util.concurrent.Executor executor71 = builder66.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = builder66.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler73 = builder66.errorHandler;
        builder66.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel75 = builder66.logLevel;
        restAdapter54.logLevel = logLevel75;
        restAdapter23.setLogLevel(logLevel75);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNotNull(requestInterceptor28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNotNull(requestInterceptor30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GET" + "'", str32, "GET");
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-" + "'", str40, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Retrofit-Idle" + "'", str56, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNull(profiler58);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertTrue("'" + logLevel63 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel63.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(executor71);
        org.junit.Assert.assertNull(serializedObjectSupporter72);
        org.junit.Assert.assertNull(errorHandler73);
        org.junit.Assert.assertTrue("'" + logLevel75 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel75.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider2 = null;
        builder0.setclientProvider(provider2);
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = null;
        builder4.sethttpExecutor(executor5);
        retrofit.RestAdapter.Log log7 = null;
        builder4.log = log7;
        java.util.concurrent.Executor executor9 = builder4.callbackExecutor;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        builder4.log = log10;
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = null;
        builder13.setcallbackExecutor(executor14);
        java.util.concurrent.Executor executor16 = null;
        builder13.setcallbackExecutor(executor16);
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.FULL;
        builder13.logLevel = logLevel18;
        retrofit.client.Client.Provider provider20 = builder13.getclientProvider();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = null;
        builder21.sethttpExecutor(executor22);
        retrofit.RestAdapter.Log log24 = null;
        builder21.log = log24;
        retrofit.RestAdapter.Log log26 = builder21.log;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor28 = null;
        builder27.sethttpExecutor(executor28);
        retrofit.RequestInterceptor requestInterceptor30 = null;
        builder27.requestInterceptor = requestInterceptor30;
        java.util.concurrent.Executor executor32 = null;
        builder27.httpExecutor = executor32;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter34.deserializeObjectConverter3();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString4();
        retrofit.client.Request request38 = serializedObjectSupporter34.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler39 = serializedObjectSupporter34.deserializeObjectErrorHandler1();
        builder27.errorHandler = errorHandler39;
        retrofit.RestAdapter.Builder builder41 = builder21.setErrorHandler(errorHandler39);
        retrofit.RestAdapter.Builder builder42 = builder13.setErrorHandler(errorHandler39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request44 = serializedObjectSupporter43.deserializeObjectRequest1();
        java.lang.String str45 = serializedObjectSupporter43.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor46 = serializedObjectSupporter43.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder47 = builder42.setRequestInterceptor(requestInterceptor46);
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest8();
        retrofit.client.Request request50 = serializedObjectSupporter48.deserializeObjectRequest7();
        java.lang.String str51 = serializedObjectSupporter48.deserializeObjectString1();
        java.lang.String str52 = serializedObjectSupporter48.deserializeObjectString5();
        retrofit.RequestInterceptor requestInterceptor53 = serializedObjectSupporter48.deserializeObjectRequestInterceptor1();
        builder47.requestInterceptor = requestInterceptor53;
        retrofit.RestAdapter.Builder builder55 = builder12.setRequestInterceptor(requestInterceptor53);
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        java.lang.String str57 = serializedObjectSupporter56.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter58 = serializedObjectSupporter56.deserializeObjectConverter3();
        java.lang.String str59 = serializedObjectSupporter56.deserializeObjectString4();
        retrofit.Server server60 = serializedObjectSupporter56.deserializeObjectServer1();
        retrofit.client.Client.Provider provider61 = null;
        java.util.concurrent.Executor executor62 = null;
        java.util.concurrent.Executor executor63 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = new retrofit.SerializedObjectSupporter();
        java.lang.String str65 = serializedObjectSupporter64.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor66 = serializedObjectSupporter64.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request68 = serializedObjectSupporter67.deserializeObjectRequest1();
        retrofit.client.Request request69 = serializedObjectSupporter67.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter70 = serializedObjectSupporter67.deserializeObjectConverter5();
        retrofit.Profiler profiler71 = null;
        retrofit.ErrorHandler errorHandler72 = null;
        retrofit.RestAdapter.Builder builder73 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor74 = null;
        builder73.sethttpExecutor(executor74);
        retrofit.RestAdapter.Log log76 = retrofit.RestAdapter.Log.NONE;
        builder73.log = log76;
        retrofit.RestAdapter.LogLevel logLevel78 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter79 = new retrofit.RestAdapter(server60, provider61, executor62, executor63, requestInterceptor66, (retrofit.converter.Converter) gsonConverter70, profiler71, errorHandler72, log76, logLevel78);
        java.util.concurrent.Executor executor80 = restAdapter79.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor81 = restAdapter79.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor82 = restAdapter79.requestInterceptor;
        java.lang.String str83 = restAdapter79.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter84 = restAdapter79.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel85 = restAdapter79.logLevel;
        java.lang.String str86 = restAdapter79.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider87 = restAdapter79.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel88 = restAdapter79.getLogLevel();
        retrofit.RestAdapter.Builder builder89 = builder55.setLogLevel(logLevel88);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(log26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "GET" + "'", str35, "GET");
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(errorHandler39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Retrofit-" + "'", str45, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Retrofit-" + "'", str51, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "POST" + "'", str52, "POST");
        org.junit.Assert.assertNotNull(requestInterceptor53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "GET" + "'", str57, "GET");
        org.junit.Assert.assertNotNull(gsonConverter58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Retrofit-" + "'", str65, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor66);
        org.junit.Assert.assertNotNull(request68);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(gsonConverter70);
        org.junit.Assert.assertNotNull(log76);
        org.junit.Assert.assertTrue("'" + logLevel78 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel78.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor80);
        org.junit.Assert.assertNotNull(requestInterceptor81);
        org.junit.Assert.assertNotNull(requestInterceptor82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Retrofit-" + "'", str83, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter84);
        org.junit.Assert.assertTrue("'" + logLevel85 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel85.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Retrofit-" + "'", str86, "Retrofit-");
        org.junit.Assert.assertNull(provider87);
        org.junit.Assert.assertTrue("'" + logLevel88 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel88.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        retrofit.ErrorHandler errorHandler27 = restAdapter23.geterrorHandler();
        java.util.concurrent.Executor executor28 = restAdapter23.gethttpExecutor();
        java.util.concurrent.Executor executor29 = restAdapter23.callbackExecutor;
        java.util.concurrent.Executor executor30 = restAdapter23.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(errorHandler27);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(executor30);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor3 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(requestInterceptor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Request request12 = serializedObjectSupporter0.deserializeObjectRequest4();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.setcallbackExecutor(executor9);
        retrofit.RequestInterceptor requestInterceptor11 = builder8.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter3();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.client.Request request16 = serializedObjectSupporter12.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        builder8.errorHandler = errorHandler17;
        retrofit.RestAdapter.Log log19 = builder8.log;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.setcallbackExecutor(executor21);
        java.util.concurrent.Executor executor23 = null;
        builder20.setcallbackExecutor(executor23);
        retrofit.client.Client.Provider provider25 = null;
        builder20.clientProvider = provider25;
        retrofit.Profiler profiler27 = null;
        builder20.profiler = profiler27;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider30 = builder29.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel31 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder32 = builder29.setLogLevel(logLevel31);
        retrofit.converter.Converter converter33 = builder32.converter;
        builder32.ensureSaneDefaults();
        retrofit.client.Client.Provider provider35 = builder32.clientProvider;
        retrofit.RestAdapter.Builder builder36 = builder20.setClient(provider35);
        builder8.setclientProvider(provider35);
        builder0.clientProvider = provider35;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(provider30);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(converter33);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.Server server8 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor14 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest1();
        retrofit.client.Request request17 = serializedObjectSupporter15.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = null;
        builder21.sethttpExecutor(executor22);
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder21.log = log24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor14, (retrofit.converter.Converter) gsonConverter18, profiler19, errorHandler20, log24, logLevel26);
        java.util.concurrent.Executor executor28 = restAdapter27.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor29 = restAdapter27.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter27.logLevel;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.Server server32 = restAdapter27.server;
        retrofit.RestAdapter.Builder builder33 = builder0.setServer(server32);
        retrofit.RestAdapter.Builder builder35 = builder0.setServer("hi!");
        retrofit.RestAdapter.Log log36 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString4();
        retrofit.Server server41 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.Server server42 = serializedObjectSupporter37.deserializeObjectServer1();
        builder0.server = server42;
        java.util.concurrent.Executor executor44 = builder0.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GET" + "'", str38, "GET");
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertNotNull(executor44);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.Server server8 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor14 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest1();
        retrofit.client.Request request17 = serializedObjectSupporter15.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = null;
        builder21.sethttpExecutor(executor22);
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder21.log = log24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor14, (retrofit.converter.Converter) gsonConverter18, profiler19, errorHandler20, log24, logLevel26);
        java.util.concurrent.Executor executor28 = restAdapter27.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor29 = restAdapter27.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter27.logLevel;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.Server server32 = restAdapter27.server;
        retrofit.RestAdapter.Builder builder33 = builder0.setServer(server32);
        retrofit.RestAdapter.Builder builder35 = builder0.setServer("hi!");
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request37 = serializedObjectSupporter36.deserializeObjectRequest1();
        retrofit.client.Request request38 = serializedObjectSupporter36.deserializeObjectRequest8();
        retrofit.client.Request request39 = serializedObjectSupporter36.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter36.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter36.deserializeObjectConverter2();
        builder35.serializedObjectSupporter = serializedObjectSupporter36;
        java.lang.String str43 = serializedObjectSupporter36.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter44 = serializedObjectSupporter36.deserializeObjectConverter2();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "POST" + "'", str43, "POST");
        org.junit.Assert.assertNotNull(gsonConverter44);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.ErrorHandler errorHandler4 = null;
        builder0.errorHandler = errorHandler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = null;
        builder6.setclientProvider(provider10);
        retrofit.client.Client.Provider provider12 = null;
        builder6.setclientProvider(provider12);
        java.util.concurrent.Executor executor14 = builder6.httpExecutor;
        builder0.callbackExecutor = executor14;
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(executor14);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request6 = serializedObjectSupporter5.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.client.Request request9 = serializedObjectSupporter5.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter5();
        retrofit.Server server11 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.client.Request request14 = serializedObjectSupporter5.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter5.deserializeObjectConverter3();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(gsonConverter15);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.Profiler profiler24 = restAdapter23.profiler;
        java.util.concurrent.Executor executor25 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler26 = restAdapter23.profiler;
        retrofit.Server server27 = restAdapter23.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString4();
        retrofit.Server server32 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        java.lang.String str37 = serializedObjectSupporter36.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter36.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request40 = serializedObjectSupporter39.deserializeObjectRequest1();
        retrofit.client.Request request41 = serializedObjectSupporter39.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter39.deserializeObjectConverter5();
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = null;
        builder45.sethttpExecutor(executor46);
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        builder45.log = log48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor38, (retrofit.converter.Converter) gsonConverter42, profiler43, errorHandler44, log48, logLevel50);
        java.util.concurrent.Executor executor52 = restAdapter51.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor53 = restAdapter51.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor54 = restAdapter51.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor55 = restAdapter51.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel56 = restAdapter51.getLogLevel();
        restAdapter23.logLevel = logLevel56;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = builder58.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = builder58.serializedObjectSupporter;
        java.util.concurrent.Executor executor61 = null;
        builder58.httpExecutor = executor61;
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request64 = serializedObjectSupporter63.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter65 = serializedObjectSupporter63.deserializeObjectConverter2();
        builder58.serializedObjectSupporter = serializedObjectSupporter63;
        retrofit.client.Request request67 = serializedObjectSupporter63.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter68 = serializedObjectSupporter63.deserializeObjectConverter5();
        retrofit.client.Request request69 = serializedObjectSupporter63.deserializeObjectRequest1();
        java.lang.String str70 = request69.getUrl();
        retrofit.client.Request request71 = restAdapter23.logAndReplaceRequest(request69);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(profiler24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-" + "'", str37, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertNotNull(requestInterceptor53);
        org.junit.Assert.assertNotNull(requestInterceptor54);
        org.junit.Assert.assertNotNull(requestInterceptor55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter59);
        org.junit.Assert.assertNull(serializedObjectSupporter60);
        org.junit.Assert.assertNotNull(request64);
        org.junit.Assert.assertNotNull(gsonConverter65);
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertNotNull(gsonConverter68);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(request71);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.client.Request request11 = serializedObjectSupporter9.deserializeObjectRequest5();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter7();
        builder0.converter = gsonConverter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.Server server19 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter15.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter15.deserializeObjectConverter6();
        retrofit.client.Request request22 = serializedObjectSupporter15.deserializeObjectRequest7();
        builder0.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter24.deserializeObjectConverter3();
        java.lang.String str27 = serializedObjectSupporter24.deserializeObjectString4();
        retrofit.Server server28 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter24.deserializeObjectConverter6();
        retrofit.client.Request request30 = serializedObjectSupporter24.deserializeObjectRequest7();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter24.deserializeObjectConverter3();
        retrofit.ErrorHandler errorHandler32 = serializedObjectSupporter24.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler32;
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "POST" + "'", str12, "POST");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GET" + "'", str25, "GET");
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(errorHandler32);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter23.logLevel;
        java.util.concurrent.Executor executor27 = restAdapter23.getcallbackExecutor();
        retrofit.Server server28 = restAdapter23.server;
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter23.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter3();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString4();
        retrofit.Server server9 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.client.Client.Provider provider10 = null;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor15 = serializedObjectSupporter13.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request17 = serializedObjectSupporter16.deserializeObjectRequest1();
        retrofit.client.Request request18 = serializedObjectSupporter16.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = null;
        builder22.sethttpExecutor(executor23);
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        builder22.log = log25;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server9, provider10, executor11, executor12, requestInterceptor15, (retrofit.converter.Converter) gsonConverter19, profiler20, errorHandler21, log25, logLevel27);
        java.util.concurrent.Executor executor29 = restAdapter28.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor30 = restAdapter28.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter28.logLevel;
        builder3.logLevel = logLevel31;
        retrofit.RestAdapter.Log log33 = builder3.log;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GET" + "'", str6, "GET");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNotNull(requestInterceptor30);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log33);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter23.getLogLevel();
        retrofit.converter.Converter converter25 = restAdapter23.getconverter();
        java.util.concurrent.Executor executor26 = restAdapter23.httpExecutor;
        java.lang.String str27 = restAdapter23.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter23.getLogLevel();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-Idle" + "'", str27, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request10 = serializedObjectSupporter9.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter2();
        retrofit.client.Request request12 = serializedObjectSupporter9.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        builder0.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString4();
        retrofit.client.Request request16 = serializedObjectSupporter9.deserializeObjectRequest6();
        retrofit.client.Request request17 = serializedObjectSupporter9.deserializeObjectRequest5();
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(headerList18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.client.Client.Provider provider28 = restAdapter23.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter2();
        retrofit.client.Request request32 = serializedObjectSupporter29.deserializeObjectRequest2();
        retrofit.mime.TypedOutput typedOutput33 = request32.getBody();
        retrofit.client.Request request34 = restAdapter23.logAndReplaceRequest(request32);
        retrofit.converter.Converter converter35 = restAdapter23.getconverter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNull(typedOutput33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(converter35);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter23.logLevel = logLevel25;
        retrofit.Profiler profiler27 = restAdapter23.profiler;
        retrofit.client.Client.Provider provider28 = restAdapter23.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = restAdapter23.serializedObjectSupporter;
        retrofit.Profiler profiler30 = restAdapter23.getprofiler();
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor32 = null;
        builder31.sethttpExecutor(executor32);
        retrofit.RequestInterceptor requestInterceptor34 = null;
        builder31.requestInterceptor = requestInterceptor34;
        retrofit.Server server36 = builder31.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString4();
        retrofit.Server server41 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.client.Client.Provider provider42 = null;
        java.util.concurrent.Executor executor43 = null;
        java.util.concurrent.Executor executor44 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor47 = serializedObjectSupporter45.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest1();
        retrofit.client.Request request50 = serializedObjectSupporter48.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter48.deserializeObjectConverter5();
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = null;
        builder54.sethttpExecutor(executor55);
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        builder54.log = log57;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server41, provider42, executor43, executor44, requestInterceptor47, (retrofit.converter.Converter) gsonConverter51, profiler52, errorHandler53, log57, logLevel59);
        retrofit.RestAdapter.LogLevel logLevel61 = restAdapter60.getLogLevel();
        retrofit.converter.Converter converter62 = restAdapter60.converter;
        java.lang.String str63 = restAdapter60.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = builder64.serializedObjectSupporter;
        retrofit.Profiler profiler66 = builder64.profiler;
        retrofit.RestAdapter.LogLevel logLevel67 = builder64.logLevel;
        restAdapter60.logLevel = logLevel67;
        retrofit.RestAdapter.Builder builder69 = builder31.setLogLevel(logLevel67);
        restAdapter23.logLevel = logLevel67;
        retrofit.RestAdapter.RestHandler restHandler71 = restAdapter23.new RestHandler();
        retrofit.converter.Converter converter72 = restAdapter23.converter;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNull(profiler30);
        org.junit.Assert.assertNull(server36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GET" + "'", str38, "GET");
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Retrofit-" + "'", str46, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Retrofit-Idle" + "'", str63, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter65);
        org.junit.Assert.assertNull(profiler66);
        org.junit.Assert.assertTrue("'" + logLevel67 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel67.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(converter72);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider6 = null;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor11 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        builder12.converter = gsonConverter17;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter21.deserializeObjectConverter3();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString4();
        retrofit.Server server25 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor31 = serializedObjectSupporter29.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request33 = serializedObjectSupporter32.deserializeObjectRequest1();
        retrofit.client.Request request34 = serializedObjectSupporter32.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter32.deserializeObjectConverter5();
        retrofit.Profiler profiler36 = null;
        retrofit.ErrorHandler errorHandler37 = null;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor39 = null;
        builder38.sethttpExecutor(executor39);
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        builder38.log = log41;
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter44 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor31, (retrofit.converter.Converter) gsonConverter35, profiler36, errorHandler37, log41, logLevel43);
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter45.deserializeObjectConverter3();
        java.lang.String str48 = serializedObjectSupporter45.deserializeObjectString4();
        retrofit.Server server49 = serializedObjectSupporter45.deserializeObjectServer1();
        retrofit.client.Client.Provider provider50 = null;
        java.util.concurrent.Executor executor51 = null;
        java.util.concurrent.Executor executor52 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor55 = serializedObjectSupporter53.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request57 = serializedObjectSupporter56.deserializeObjectRequest1();
        retrofit.client.Request request58 = serializedObjectSupporter56.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter56.deserializeObjectConverter5();
        retrofit.Profiler profiler60 = null;
        retrofit.ErrorHandler errorHandler61 = null;
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor63 = null;
        builder62.sethttpExecutor(executor63);
        retrofit.RestAdapter.Log log65 = retrofit.RestAdapter.Log.NONE;
        builder62.log = log65;
        retrofit.RestAdapter.LogLevel logLevel67 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter68 = new retrofit.RestAdapter(server49, provider50, executor51, executor52, requestInterceptor55, (retrofit.converter.Converter) gsonConverter59, profiler60, errorHandler61, log65, logLevel67);
        java.util.concurrent.Executor executor69 = restAdapter68.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor70 = restAdapter68.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor71 = restAdapter68.requestInterceptor;
        java.lang.String str72 = restAdapter68.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = restAdapter68.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel74 = restAdapter68.logLevel;
        retrofit.RestAdapter restAdapter75 = new retrofit.RestAdapter(server5, provider6, executor7, executor8, requestInterceptor11, (retrofit.converter.Converter) gsonConverter17, profiler19, errorHandler20, log41, logLevel74);
        retrofit.RestAdapter.LogLevel logLevel76 = restAdapter75.logLevel;
        java.lang.String str77 = restAdapter75.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler78 = restAdapter75.geterrorHandler();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-" + "'", str10, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GET" + "'", str22, "GET");
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-" + "'", str30, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor31);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "GET" + "'", str46, "GET");
        org.junit.Assert.assertNotNull(gsonConverter47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(server49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Retrofit-" + "'", str54, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor55);
        org.junit.Assert.assertNotNull(request57);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(log65);
        org.junit.Assert.assertTrue("'" + logLevel67 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel67.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor69);
        org.junit.Assert.assertNotNull(requestInterceptor70);
        org.junit.Assert.assertNotNull(requestInterceptor71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Retrofit-" + "'", str72, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter73);
        org.junit.Assert.assertTrue("'" + logLevel74 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel74.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel76 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel76.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Retrofit-Idle" + "'", str77, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler78);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder3.logLevel;
        retrofit.RestAdapter.Log log5 = builder3.log;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder3.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(log5);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.RestAdapter restAdapter22 = builder0.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        retrofit.client.Request request26 = serializedObjectSupporter23.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor27 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        java.lang.String str28 = serializedObjectSupporter23.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter23.deserializeObjectConverter3();
        restAdapter22.serializedObjectSupporter = serializedObjectSupporter23;
        java.util.concurrent.Executor executor31 = restAdapter22.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter22.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter22.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = restHandler33.serializedObjectSupporter;
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(requestInterceptor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(executor31);
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNull(serializedObjectSupporter34);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        retrofit.Profiler profiler27 = restAdapter23.getprofiler();
        retrofit.client.Client.Provider provider28 = restAdapter23.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter2();
        retrofit.client.Request request32 = serializedObjectSupporter29.deserializeObjectRequest2();
        retrofit.mime.TypedOutput typedOutput33 = request32.getBody();
        retrofit.client.Request request34 = restAdapter23.logAndReplaceRequest(request32);
        java.lang.String str35 = request32.getMethod();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertNull(profiler27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNull(typedOutput33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "GET" + "'", str35, "GET");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GET" + "'", str4, "GET");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.client.Request request8 = serializedObjectSupporter4.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter4.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler9;
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.setcallbackExecutor(executor13);
        java.util.concurrent.Executor executor15 = null;
        builder12.setcallbackExecutor(executor15);
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = null;
        builder19.setcallbackExecutor(executor20);
        java.util.concurrent.Executor executor22 = null;
        builder19.setcallbackExecutor(executor22);
        builder19.ensureSaneDefaults();
        java.util.concurrent.Executor executor25 = builder19.callbackExecutor;
        builder12.sethttpExecutor(executor25);
        builder0.httpExecutor = executor25;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider29 = builder28.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder31 = builder28.setLogLevel(logLevel30);
        retrofit.converter.Converter converter32 = builder31.converter;
        java.util.concurrent.Executor executor33 = null;
        builder31.sethttpExecutor(executor33);
        retrofit.RestAdapter.Builder builder36 = builder31.setServer("GET");
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString4();
        retrofit.Server server41 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.client.Client.Provider provider42 = null;
        java.util.concurrent.Executor executor43 = null;
        java.util.concurrent.Executor executor44 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        java.lang.String str46 = serializedObjectSupporter45.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor47 = serializedObjectSupporter45.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest1();
        retrofit.client.Request request50 = serializedObjectSupporter48.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter48.deserializeObjectConverter5();
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = null;
        builder54.sethttpExecutor(executor55);
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        builder54.log = log57;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server41, provider42, executor43, executor44, requestInterceptor47, (retrofit.converter.Converter) gsonConverter51, profiler52, errorHandler53, log57, logLevel59);
        retrofit.RestAdapter.Builder builder61 = builder31.setLog(log57);
        retrofit.RestAdapter.Builder builder62 = builder0.setLog(log57);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor25);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GET" + "'", str38, "GET");
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Retrofit-" + "'", str46, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request6 = serializedObjectSupporter5.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.client.Request request9 = serializedObjectSupporter5.deserializeObjectRequest6();
        retrofit.client.Request request10 = serializedObjectSupporter5.deserializeObjectRequest4();
        retrofit.mime.TypedString typedString11 = serializedObjectSupporter5.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.client.Request request13 = serializedObjectSupporter5.deserializeObjectRequest7();
        retrofit.client.Request request14 = serializedObjectSupporter5.deserializeObjectRequest1();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(typedString11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter23.logLevel = logLevel25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log28 = restAdapter23.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter29.deserializeObjectConverter8();
        java.lang.String str33 = serializedObjectSupporter29.deserializeObjectString4();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.RestAdapter.Log log35 = restAdapter23.log;
        retrofit.ErrorHandler errorHandler36 = restAdapter23.geterrorHandler();
        retrofit.ErrorHandler errorHandler37 = restAdapter23.errorHandler;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNull(errorHandler36);
        org.junit.Assert.assertNull(errorHandler37);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest2();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "POST" + "'", str6, "POST");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GET" + "'", str6, "GET");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.Server server8 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor14 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest1();
        retrofit.client.Request request17 = serializedObjectSupporter15.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = null;
        builder21.sethttpExecutor(executor22);
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder21.log = log24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor14, (retrofit.converter.Converter) gsonConverter18, profiler19, errorHandler20, log24, logLevel26);
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter27.getLogLevel();
        java.lang.String str29 = restAdapter27.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler30 = restAdapter27.profiler;
        java.util.concurrent.Executor executor31 = restAdapter27.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter27.getrequestInterceptor();
        retrofit.converter.Converter converter33 = restAdapter27.converter;
        retrofit.RestAdapter.Builder builder34 = builder0.setConverter(converter33);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(converter33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "POST" + "'", str4, "POST");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        java.lang.String str27 = restAdapter23.getTHREAD_PREFIX();
        retrofit.converter.Converter converter28 = restAdapter23.getconverter();
        java.util.concurrent.Executor executor29 = restAdapter23.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertNotNull(converter28);
        org.junit.Assert.assertNull(executor29);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.mime.TypedString typedString6 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(typedString6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        retrofit.Server server12 = serializedObjectSupporter8.deserializeObjectServer1();
        retrofit.client.Client.Provider provider13 = null;
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor18 = serializedObjectSupporter16.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request20 = serializedObjectSupporter19.deserializeObjectRequest1();
        retrofit.client.Request request21 = serializedObjectSupporter19.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter19.deserializeObjectConverter5();
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = null;
        builder25.sethttpExecutor(executor26);
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        builder25.log = log28;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter(server12, provider13, executor14, executor15, requestInterceptor18, (retrofit.converter.Converter) gsonConverter22, profiler23, errorHandler24, log28, logLevel30);
        java.util.concurrent.Executor executor32 = restAdapter31.getcallbackExecutor();
        java.util.concurrent.Executor executor33 = restAdapter31.callbackExecutor;
        retrofit.Server server34 = restAdapter31.server;
        retrofit.Server server35 = restAdapter31.server;
        retrofit.RestAdapter.Builder builder36 = builder0.setServer(server35);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder38 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GET" + "'", str9, "GET");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.client.Request request10 = serializedObjectSupporter0.deserializeObjectRequest2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(typedString9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GET" + "'", str11, "GET");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.RestAdapter restAdapter22 = builder0.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request24 = serializedObjectSupporter23.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        retrofit.client.Request request26 = serializedObjectSupporter23.deserializeObjectRequest8();
        retrofit.RequestInterceptor requestInterceptor27 = serializedObjectSupporter23.deserializeObjectRequestInterceptor1();
        java.lang.String str28 = serializedObjectSupporter23.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter23.deserializeObjectConverter3();
        restAdapter22.serializedObjectSupporter = serializedObjectSupporter23;
        java.util.concurrent.Executor executor31 = restAdapter22.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter32.deserializeObjectConverter3();
        java.lang.String str35 = serializedObjectSupporter32.deserializeObjectString4();
        retrofit.client.Request request36 = serializedObjectSupporter32.deserializeObjectRequest6();
        retrofit.Server server37 = serializedObjectSupporter32.deserializeObjectServer1();
        retrofit.client.Request request38 = serializedObjectSupporter32.deserializeObjectRequest4();
        java.lang.String str39 = request38.getUrl();
        retrofit.mime.TypedOutput typedOutput40 = request38.body;
        retrofit.client.Request request41 = restAdapter22.logAndReplaceRequest(request38);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(requestInterceptor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(executor31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "GET" + "'", str33, "GET");
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(request41);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler28 = restAdapter23.getprofiler();
        java.lang.String str29 = restAdapter23.getTHREAD_PREFIX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-" + "'", str29, "Retrofit-");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler28 = restAdapter23.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor32 = serializedObjectSupporter30.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter30.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter30.deserializeObjectConverter8();
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString2();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor38 = null;
        builder37.sethttpExecutor(executor38);
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter3();
        builder37.converter = gsonConverter42;
        retrofit.client.Client.Provider provider44 = null;
        builder37.clientProvider = provider44;
        retrofit.RestAdapter.LogLevel logLevel46 = builder37.logLevel;
        java.util.concurrent.Executor executor47 = null;
        builder37.setcallbackExecutor(executor47);
        retrofit.converter.Converter converter49 = builder37.converter;
        java.lang.reflect.Method method50 = null;
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = restHandler29.invoke((java.lang.Object) builder37, method50, objArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-Idle" + "'", str35, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "GET" + "'", str41, "GET");
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(converter49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler28 = restAdapter23.getprofiler();
        retrofit.Server server29 = restAdapter23.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter3();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString4();
        retrofit.Server server34 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter30.deserializeObjectConverter6();
        retrofit.client.Request request36 = serializedObjectSupporter30.deserializeObjectRequest7();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter30.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter30.deserializeObjectConverter8();
        retrofit.mime.TypedString typedString39 = serializedObjectSupporter30.deserializeObjectTypedOutput2();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.client.Request request41 = serializedObjectSupporter30.deserializeObjectRequest5();
        java.util.List<retrofit.client.Header> headerList42 = request41.headers;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GET" + "'", str31, "GET");
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(typedString39);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(headerList42);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.client.Client.Provider provider6 = null;
        builder4.setclientProvider(provider6);
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Log log11 = null;
        builder8.log = log11;
        java.util.concurrent.Executor executor13 = builder8.callbackExecutor;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        builder8.log = log14;
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter3();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString4();
        retrofit.client.Request request21 = serializedObjectSupporter17.deserializeObjectRequest6();
        retrofit.Server server22 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder23 = builder16.setServer(server22);
        retrofit.RestAdapter.Builder builder24 = builder0.setServer(server22);
        retrofit.Profiler profiler25 = builder24.profiler;
        retrofit.RestAdapter.Builder builder27 = builder24.setServer("GET");
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = null;
        builder28.sethttpExecutor(executor29);
        retrofit.RequestInterceptor requestInterceptor31 = null;
        builder28.requestInterceptor = requestInterceptor31;
        retrofit.converter.Converter converter33 = builder28.converter;
        java.util.concurrent.Executor executor34 = null;
        builder28.httpExecutor = executor34;
        java.util.concurrent.Executor executor36 = null;
        builder28.httpExecutor = executor36;
        retrofit.Profiler profiler38 = null;
        builder28.profiler = profiler38;
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider41 = builder40.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder43 = builder40.setLogLevel(logLevel42);
        retrofit.converter.Converter converter44 = builder43.converter;
        builder43.ensureSaneDefaults();
        retrofit.client.Client.Provider provider46 = builder43.clientProvider;
        retrofit.RestAdapter.Builder builder47 = builder28.setClient(provider46);
        retrofit.RestAdapter.Builder builder48 = builder24.setClient(provider46);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = null;
        builder49.sethttpExecutor(executor50);
        retrofit.RestAdapter.Log log52 = null;
        builder49.log = log52;
        java.util.concurrent.Executor executor54 = builder49.callbackExecutor;
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        builder49.log = log55;
        builder48.log = log55;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GET" + "'", str18, "GET");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(profiler25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(converter33);
        org.junit.Assert.assertNull(provider41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(converter44);
        org.junit.Assert.assertNotNull(provider46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor54);
        org.junit.Assert.assertNotNull(log55);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        java.lang.String str26 = restAdapter23.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor27 = restAdapter23.httpExecutor;
        retrofit.Profiler profiler28 = restAdapter23.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter23.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor32 = serializedObjectSupporter30.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter30.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter30.deserializeObjectConverter8();
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString2();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.client.Request request37 = serializedObjectSupporter30.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter30.deserializeObjectConverter3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-Idle" + "'", str35, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(gsonConverter38);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = null;
        builder5.sethttpExecutor(executor6);
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = null;
        builder5.setclientProvider(provider9);
        retrofit.client.Client.Provider provider11 = null;
        builder5.setclientProvider(provider11);
        java.util.concurrent.Executor executor13 = builder5.httpExecutor;
        builder3.callbackExecutor = executor13;
        retrofit.client.Client.Provider provider15 = builder3.clientProvider;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        retrofit.RestAdapter.Log log4 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder3.logLevel = logLevel5;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean9 = logLevel8.log();
        retrofit.RestAdapter.Builder builder10 = builder3.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = null;
        builder11.sethttpExecutor(executor12);
        retrofit.RestAdapter.Log log14 = null;
        builder11.log = log14;
        retrofit.RestAdapter.Log log16 = builder11.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request18 = serializedObjectSupporter17.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter8();
        retrofit.RestAdapter.Builder builder21 = builder11.setConverter((retrofit.converter.Converter) gsonConverter20);
        retrofit.ErrorHandler errorHandler22 = null;
        builder21.errorHandler = errorHandler22;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = null;
        builder24.sethttpExecutor(executor25);
        builder24.ensureSaneDefaults();
        retrofit.client.Client.Provider provider28 = null;
        builder24.setclientProvider(provider28);
        retrofit.client.Client.Provider provider30 = null;
        builder24.setclientProvider(provider30);
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = null;
        builder32.setcallbackExecutor(executor33);
        java.util.concurrent.Executor executor35 = builder32.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel36 = builder32.logLevel;
        retrofit.Profiler profiler37 = builder32.profiler;
        retrofit.RestAdapter.Builder builder39 = builder32.setServer("hi!");
        retrofit.converter.Converter converter40 = builder39.converter;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider42 = builder41.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder44 = builder41.setLogLevel(logLevel43);
        retrofit.converter.Converter converter45 = builder44.converter;
        builder44.ensureSaneDefaults();
        retrofit.client.Client.Provider provider47 = builder44.clientProvider;
        builder39.clientProvider = provider47;
        retrofit.RestAdapter.Builder builder49 = builder24.setClient(provider47);
        retrofit.RestAdapter.Builder builder50 = builder21.setClient(provider47);
        builder10.setclientProvider(provider47);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertNull(provider42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(converter45);
        org.junit.Assert.assertNotNull(provider47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request7 = serializedObjectSupporter6.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter8();
        retrofit.RestAdapter.Builder builder10 = builder0.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.ErrorHandler errorHandler11 = null;
        builder10.errorHandler = errorHandler11;
        java.util.concurrent.Executor executor13 = builder10.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider15 = builder14.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder17 = builder14.setLogLevel(logLevel16);
        retrofit.converter.Converter converter18 = builder17.converter;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = null;
        builder19.sethttpExecutor(executor20);
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider23 = null;
        builder19.setclientProvider(provider23);
        retrofit.client.Client.Provider provider25 = null;
        builder19.setclientProvider(provider25);
        java.util.concurrent.Executor executor27 = builder19.httpExecutor;
        builder17.callbackExecutor = executor27;
        builder10.sethttpExecutor(executor27);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = null;
        builder30.sethttpExecutor(executor31);
        retrofit.RestAdapter.Log log33 = null;
        builder30.log = log33;
        java.util.concurrent.Executor executor35 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = builder30.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler37 = builder30.errorHandler;
        retrofit.converter.Converter converter38 = builder30.converter;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = null;
        builder39.sethttpExecutor(executor40);
        builder39.ensureSaneDefaults();
        retrofit.client.Client.Provider provider43 = null;
        builder39.setclientProvider(provider43);
        retrofit.client.Client.Provider provider45 = null;
        builder39.setclientProvider(provider45);
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = null;
        builder47.setcallbackExecutor(executor48);
        java.util.concurrent.Executor executor50 = builder47.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel51 = builder47.logLevel;
        retrofit.Profiler profiler52 = builder47.profiler;
        retrofit.RestAdapter.Builder builder54 = builder47.setServer("hi!");
        retrofit.converter.Converter converter55 = builder54.converter;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider57 = builder56.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder59 = builder56.setLogLevel(logLevel58);
        retrofit.converter.Converter converter60 = builder59.converter;
        builder59.ensureSaneDefaults();
        retrofit.client.Client.Provider provider62 = builder59.clientProvider;
        builder54.clientProvider = provider62;
        retrofit.RestAdapter.Builder builder64 = builder39.setClient(provider62);
        builder30.clientProvider = provider62;
        retrofit.RestAdapter.Builder builder66 = builder10.setClient(provider62);
        java.util.concurrent.Executor executor67 = builder66.gethttpExecutor();
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNotNull(executor27);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNull(serializedObjectSupporter36);
        org.junit.Assert.assertNull(errorHandler37);
        org.junit.Assert.assertNull(converter38);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(converter55);
        org.junit.Assert.assertNull(provider57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(converter60);
        org.junit.Assert.assertNotNull(provider62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(executor67);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter23.logLevel;
        boolean boolean27 = logLevel26.log();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = null;
        builder7.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = builder7.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.Profiler profiler12 = builder7.profiler;
        retrofit.RestAdapter.Builder builder14 = builder7.setServer("hi!");
        retrofit.converter.Converter converter15 = builder14.converter;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider17 = builder16.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel18);
        retrofit.converter.Converter converter20 = builder19.converter;
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder19.clientProvider;
        builder14.clientProvider = provider22;
        builder0.clientProvider = provider22;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = null;
        builder25.setcallbackExecutor(executor26);
        java.util.concurrent.Executor executor28 = null;
        builder25.setcallbackExecutor(executor28);
        builder25.ensureSaneDefaults();
        java.util.concurrent.Executor executor31 = builder25.callbackExecutor;
        builder0.callbackExecutor = executor31;
        org.junit.Assert.assertNotNull(executor6);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(executor31);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        retrofit.RestAdapter restAdapter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.RestHandler restHandler1 = restAdapter0.new RestHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to retrofit.RestAdapter$RestHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.RequestInterceptor requestInterceptor9 = null;
        builder6.requestInterceptor = requestInterceptor9;
        java.util.concurrent.Executor executor11 = null;
        builder6.httpExecutor = executor11;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter3();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        retrofit.client.Request request17 = serializedObjectSupporter13.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler18 = serializedObjectSupporter13.deserializeObjectErrorHandler1();
        builder6.errorHandler = errorHandler18;
        retrofit.RestAdapter.Builder builder20 = builder0.setErrorHandler(errorHandler18);
        retrofit.RequestInterceptor requestInterceptor21 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel22 = builder0.logLevel;
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(errorHandler18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(requestInterceptor21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("GET");
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder6.converter = gsonConverter11;
        retrofit.client.Client.Provider provider13 = null;
        builder6.clientProvider = provider13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter6();
        builder6.converter = gsonConverter19;
        builder0.converter = gsonConverter19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString4();
        retrofit.Server server26 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.client.Client.Provider provider27 = null;
        java.util.concurrent.Executor executor28 = null;
        java.util.concurrent.Executor executor29 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor32 = serializedObjectSupporter30.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest1();
        retrofit.client.Request request35 = serializedObjectSupporter33.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter5();
        retrofit.Profiler profiler37 = null;
        retrofit.ErrorHandler errorHandler38 = null;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = null;
        builder39.sethttpExecutor(executor40);
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        builder39.log = log42;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server26, provider27, executor28, executor29, requestInterceptor32, (retrofit.converter.Converter) gsonConverter36, profiler37, errorHandler38, log42, logLevel44);
        java.util.concurrent.Executor executor46 = restAdapter45.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor47 = restAdapter45.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor48 = restAdapter45.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor49 = restAdapter45.getrequestInterceptor();
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = null;
        builder50.sethttpExecutor(executor51);
        retrofit.RequestInterceptor requestInterceptor53 = null;
        builder50.requestInterceptor = requestInterceptor53;
        retrofit.converter.Converter converter55 = builder50.converter;
        java.util.concurrent.Executor executor56 = null;
        builder50.httpExecutor = executor56;
        retrofit.RestAdapter.LogLevel logLevel58 = builder50.logLevel;
        restAdapter45.logLevel = logLevel58;
        builder0.logLevel = logLevel58;
        java.util.concurrent.Executor executor61 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = builder62.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = builder62.serializedObjectSupporter;
        retrofit.client.Client.Provider provider65 = null;
        builder62.clientProvider = provider65;
        java.util.concurrent.Executor executor67 = null;
        builder62.callbackExecutor = executor67;
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor70 = null;
        builder69.setcallbackExecutor(executor70);
        java.util.concurrent.Executor executor72 = null;
        builder69.setcallbackExecutor(executor72);
        retrofit.RestAdapter.LogLevel logLevel74 = retrofit.RestAdapter.LogLevel.FULL;
        builder69.logLevel = logLevel74;
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor77 = null;
        builder76.setcallbackExecutor(executor77);
        java.util.concurrent.Executor executor79 = null;
        builder76.setcallbackExecutor(executor79);
        builder76.ensureSaneDefaults();
        java.util.concurrent.Executor executor82 = builder76.callbackExecutor;
        builder69.sethttpExecutor(executor82);
        builder62.httpExecutor = executor82;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor86 = null;
        builder85.sethttpExecutor(executor86);
        retrofit.RestAdapter.Log log88 = null;
        builder85.log = log88;
        java.util.concurrent.Executor executor90 = builder85.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter91 = builder85.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter92 = builder85.serializedObjectSupporter;
        builder85.ensureSaneDefaults();
        java.util.concurrent.Executor executor94 = builder85.httpExecutor;
        retrofit.RestAdapter.Builder builder95 = builder0.setExecutors(executor82, executor94);
        retrofit.RestAdapter restAdapter96 = builder0.build();
        retrofit.RequestInterceptor requestInterceptor97 = restAdapter96.requestInterceptor;
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GET" + "'", str23, "GET");
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Retrofit-" + "'", str31, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor32);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(requestInterceptor48);
        org.junit.Assert.assertNotNull(requestInterceptor49);
        org.junit.Assert.assertNull(converter55);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor61);
        org.junit.Assert.assertNull(serializedObjectSupporter63);
        org.junit.Assert.assertNull(serializedObjectSupporter64);
        org.junit.Assert.assertTrue("'" + logLevel74 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel74.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor82);
        org.junit.Assert.assertNull(executor90);
        org.junit.Assert.assertNull(serializedObjectSupporter91);
        org.junit.Assert.assertNull(serializedObjectSupporter92);
        org.junit.Assert.assertNotNull(executor94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(restAdapter96);
        org.junit.Assert.assertNotNull(requestInterceptor97);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest7();
        retrofit.Server server7 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Request request9 = serializedObjectSupporter0.deserializeObjectRequest3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(request2);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request6 = serializedObjectSupporter5.deserializeObjectRequest1();
        retrofit.Server server7 = serializedObjectSupporter5.deserializeObjectServer1();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString3();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        java.util.concurrent.Executor executor11 = builder0.gethttpExecutor();
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor13 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter3();
        retrofit.Server server18 = serializedObjectSupporter14.deserializeObjectServer1();
        builder0.server = server18;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GET" + "'", str15, "GET");
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(server18);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler2 = builder0.profiler;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString4();
        retrofit.Server server8 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor14 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest1();
        retrofit.client.Request request17 = serializedObjectSupporter15.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = null;
        builder21.sethttpExecutor(executor22);
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder21.log = log24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor14, (retrofit.converter.Converter) gsonConverter18, profiler19, errorHandler20, log24, logLevel26);
        java.util.concurrent.Executor executor28 = restAdapter27.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter3();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString4();
        restAdapter27.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.RestAdapter.LogLevel logLevel34 = restAdapter27.getLogLevel();
        java.lang.String str35 = restAdapter27.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor36 = restAdapter27.callbackExecutor;
        retrofit.converter.Converter converter37 = restAdapter27.getconverter();
        retrofit.client.Client.Provider provider38 = restAdapter27.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel39 = restAdapter27.logLevel;
        retrofit.RestAdapter.Log log40 = restAdapter27.log;
        builder0.log = log40;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GET" + "'", str5, "GET");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GET" + "'", str30, "GET");
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-" + "'", str35, "Retrofit-");
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(converter37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log40);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "POST" + "'", str7, "POST");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Retrofit-" + "'", str8, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor2 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest7();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        retrofit.Server server5 = builder0.server;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider7 = builder6.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder9 = builder6.setLogLevel(logLevel8);
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.RestAdapter.Log log11 = builder9.log;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider13 = builder12.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder15 = builder12.setLogLevel(logLevel14);
        retrofit.converter.Converter converter16 = builder15.converter;
        retrofit.Profiler profiler17 = builder15.profiler;
        java.util.concurrent.Executor executor18 = builder15.callbackExecutor;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = null;
        builder19.setcallbackExecutor(executor20);
        java.util.concurrent.Executor executor22 = null;
        builder19.setcallbackExecutor(executor22);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.FULL;
        builder19.logLevel = logLevel24;
        retrofit.client.Client.Provider provider26 = builder19.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder19.serializedObjectSupporter;
        java.util.concurrent.Executor executor28 = builder19.callbackExecutor;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = builder29.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = builder29.serializedObjectSupporter;
        java.util.concurrent.Executor executor32 = null;
        builder29.httpExecutor = executor32;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request35 = serializedObjectSupporter34.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter34.deserializeObjectConverter2();
        builder29.serializedObjectSupporter = serializedObjectSupporter34;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider39 = builder38.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder41 = builder38.setLogLevel(logLevel40);
        retrofit.converter.Converter converter42 = builder41.converter;
        java.util.concurrent.Executor executor43 = null;
        builder41.sethttpExecutor(executor43);
        retrofit.RestAdapter.Builder builder46 = builder41.setServer("GET");
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = null;
        builder47.setcallbackExecutor(executor48);
        java.util.concurrent.Executor executor50 = null;
        builder47.setcallbackExecutor(executor50);
        builder47.ensureSaneDefaults();
        java.util.concurrent.Executor executor53 = builder47.callbackExecutor;
        builder46.setcallbackExecutor(executor53);
        builder29.httpExecutor = executor53;
        builder19.sethttpExecutor(executor53);
        builder15.callbackExecutor = executor53;
        java.util.concurrent.Executor executor58 = builder15.httpExecutor;
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor60 = null;
        builder59.setcallbackExecutor(executor60);
        java.util.concurrent.Executor executor62 = builder59.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel63 = builder59.logLevel;
        retrofit.Profiler profiler64 = builder59.profiler;
        retrofit.RestAdapter.Builder builder66 = builder59.setServer("hi!");
        retrofit.converter.Converter converter67 = builder66.converter;
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider69 = builder68.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel70 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder71 = builder68.setLogLevel(logLevel70);
        retrofit.converter.Converter converter72 = builder71.converter;
        builder71.ensureSaneDefaults();
        retrofit.client.Client.Provider provider74 = builder71.clientProvider;
        builder66.clientProvider = provider74;
        builder15.setclientProvider(provider74);
        retrofit.RestAdapter.Builder builder77 = builder9.setClient(provider74);
        builder0.setclientProvider(provider74);
        retrofit.RestAdapter.LogLevel logLevel79 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder80 = builder0.setLogLevel(logLevel79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNull(serializedObjectSupporter30);
        org.junit.Assert.assertNull(serializedObjectSupporter31);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNull(provider39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(converter42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(executor53);
        org.junit.Assert.assertNull(executor58);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertTrue("'" + logLevel63 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel63.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(converter67);
        org.junit.Assert.assertNull(provider69);
        org.junit.Assert.assertTrue("'" + logLevel70 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel70.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNull(converter72);
        org.junit.Assert.assertNotNull(provider74);
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter3.deserializeObjectConverter3();
        builder0.converter = gsonConverter5;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder11.serializedObjectSupporter;
        java.util.concurrent.Executor executor14 = null;
        builder11.httpExecutor = executor14;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request17 = serializedObjectSupporter16.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter2();
        builder11.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.client.Request request20 = serializedObjectSupporter16.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.Server server22 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server22);
        retrofit.client.Client.Provider provider24 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = null;
        builder25.setcallbackExecutor(executor26);
        retrofit.RequestInterceptor requestInterceptor28 = builder25.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter3();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString4();
        retrofit.client.Request request33 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler34 = serializedObjectSupporter29.deserializeObjectErrorHandler1();
        builder25.errorHandler = errorHandler34;
        retrofit.RestAdapter.Builder builder36 = builder0.setErrorHandler(errorHandler34);
        retrofit.RestAdapter.Builder builder38 = builder36.setServer("POST");
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = builder39.serializedObjectSupporter;
        retrofit.client.Client.Provider provider41 = null;
        builder39.setclientProvider(provider41);
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = null;
        builder43.sethttpExecutor(executor44);
        retrofit.RestAdapter.Log log46 = null;
        builder43.log = log46;
        java.util.concurrent.Executor executor48 = builder43.callbackExecutor;
        retrofit.RestAdapter.Log log49 = retrofit.RestAdapter.Log.NONE;
        builder43.log = log49;
        retrofit.RestAdapter.Builder builder51 = builder39.setLog(log49);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter52.deserializeObjectConverter3();
        java.lang.String str55 = serializedObjectSupporter52.deserializeObjectString4();
        retrofit.client.Request request56 = serializedObjectSupporter52.deserializeObjectRequest6();
        retrofit.Server server57 = serializedObjectSupporter52.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder58 = builder51.setServer(server57);
        retrofit.client.Client.Provider provider59 = null;
        java.util.concurrent.Executor executor60 = null;
        java.util.concurrent.Executor executor61 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request63 = serializedObjectSupporter62.deserializeObjectRequest1();
        retrofit.client.Request request64 = serializedObjectSupporter62.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor65 = serializedObjectSupporter62.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request67 = serializedObjectSupporter66.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter68 = serializedObjectSupporter66.deserializeObjectConverter2();
        retrofit.Profiler profiler69 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter70 = new retrofit.SerializedObjectSupporter();
        java.lang.String str71 = serializedObjectSupporter70.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter70.deserializeObjectConverter3();
        java.lang.String str73 = serializedObjectSupporter70.deserializeObjectString4();
        retrofit.client.Request request74 = serializedObjectSupporter70.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler75 = serializedObjectSupporter70.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = builder76.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = builder76.serializedObjectSupporter;
        retrofit.client.Client.Provider provider79 = null;
        builder76.clientProvider = provider79;
        retrofit.RestAdapter.Log log81 = retrofit.RestAdapter.Log.NONE;
        builder76.log = log81;
        retrofit.RestAdapter.Builder builder83 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor84 = null;
        builder83.setcallbackExecutor(executor84);
        java.util.concurrent.Executor executor86 = null;
        builder83.setcallbackExecutor(executor86);
        retrofit.client.Client.Provider provider88 = null;
        builder83.clientProvider = provider88;
        retrofit.RestAdapter.Builder builder90 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter91 = builder90.serializedObjectSupporter;
        retrofit.Profiler profiler92 = builder90.profiler;
        retrofit.RestAdapter.LogLevel logLevel93 = builder90.logLevel;
        builder83.logLevel = logLevel93;
        retrofit.RestAdapter restAdapter95 = new retrofit.RestAdapter(server57, provider59, executor60, executor61, requestInterceptor65, (retrofit.converter.Converter) gsonConverter68, profiler69, errorHandler75, log81, logLevel93);
        retrofit.Server server96 = restAdapter95.server;
        builder36.server = server96;
        builder36.ensureSaneDefaults();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GET" + "'", str4, "GET");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(requestInterceptor28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GET" + "'", str30, "GET");
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(errorHandler34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "GET" + "'", str53, "GET");
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://example.com/" + "'", str55, "http://example.com/");
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(server57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(request64);
        org.junit.Assert.assertNotNull(requestInterceptor65);
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertNotNull(gsonConverter68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "GET" + "'", str71, "GET");
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "http://example.com/" + "'", str73, "http://example.com/");
        org.junit.Assert.assertNotNull(request74);
        org.junit.Assert.assertNotNull(errorHandler75);
        org.junit.Assert.assertNull(serializedObjectSupporter77);
        org.junit.Assert.assertNull(serializedObjectSupporter78);
        org.junit.Assert.assertNotNull(log81);
        org.junit.Assert.assertNull(serializedObjectSupporter91);
        org.junit.Assert.assertNull(profiler92);
        org.junit.Assert.assertTrue("'" + logLevel93 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel93.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server96);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter23.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter23.requestInterceptor;
        java.lang.String str27 = restAdapter23.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restAdapter23.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter23.logLevel;
        retrofit.converter.Converter converter30 = restAdapter23.getconverter();
        java.util.concurrent.Executor executor31 = restAdapter23.httpExecutor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-" + "'", str27, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(converter30);
        org.junit.Assert.assertNull(executor31);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest4();
        retrofit.mime.TypedOutput typedOutput7 = request6.body;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNull(typedOutput7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNull(typedOutput7);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest1();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GET" + "'", str7, "GET");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest1();
        retrofit.client.Request request13 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = null;
        builder17.sethttpExecutor(executor18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        builder17.log = log20;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor10, (retrofit.converter.Converter) gsonConverter14, profiler15, errorHandler16, log20, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter23.logLevel = logLevel25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log28 = restAdapter23.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter29.deserializeObjectConverter8();
        java.lang.String str33 = serializedObjectSupporter29.deserializeObjectString4();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.client.Request request35 = serializedObjectSupporter29.deserializeObjectRequest3();
        retrofit.client.Request request36 = serializedObjectSupporter29.deserializeObjectRequest1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request36);
    }
}

