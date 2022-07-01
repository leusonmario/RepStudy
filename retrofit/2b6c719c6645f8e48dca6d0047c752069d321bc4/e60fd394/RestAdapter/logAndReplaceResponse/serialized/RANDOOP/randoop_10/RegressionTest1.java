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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(errorHandler12);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.gethttpExecutor();
        retrofit.Server server32 = null;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.RequestInterceptor requestInterceptor36 = null;
        retrofit.converter.Converter converter37 = null;
        retrofit.Profiler profiler38 = null;
        retrofit.ErrorHandler errorHandler39 = null;
        retrofit.RestAdapter.Log log40 = null;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter42 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor36, converter37, profiler38, errorHandler39, log40, logLevel41);
        restAdapter27.logLevel = logLevel41;
        restAdapter10.logLevel = logLevel41;
        retrofit.RequestInterceptor requestInterceptor45 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel46 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor47 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor45);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor47);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString10();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Server server14 = restAdapter10.server;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.client.Response response17 = serializedObjectSupporter12.deserializeObjectResponse3();
        retrofit.Server server18 = serializedObjectSupporter12.deserializeObjectServer1();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(server18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.setLogLevel(logLevel20);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter23.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString9();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.Log log31 = restAdapter10.log;
        retrofit.client.Client.Provider provider32 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNull(log31);
        org.junit.Assert.assertNull(provider32);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.getLogLevel();
        java.lang.String str22 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log23 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter10.getLogLevel();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-" + "'", str22, "Retrofit-");
        org.junit.Assert.assertNull(log23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.Server server21 = null;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        retrofit.converter.Converter converter26 = null;
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Log log29 = null;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor25, converter26, profiler27, errorHandler28, log29, logLevel30);
        retrofit.converter.Converter converter32 = restAdapter31.converter;
        java.util.concurrent.Executor executor33 = restAdapter31.callbackExecutor;
        retrofit.RestAdapter.Log log34 = restAdapter31.log;
        java.util.concurrent.Executor executor35 = restAdapter31.getcallbackExecutor();
        int int36 = restAdapter31.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor37 = restAdapter31.callbackExecutor;
        java.lang.String str38 = restAdapter31.getTHREAD_PREFIX();
        retrofit.Profiler profiler39 = restAdapter31.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel40 = restAdapter31.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel41 = restAdapter31.getLogLevel();
        restAdapter10.setLogLevel(logLevel41);
        java.util.concurrent.Executor executor43 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor44 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(log34);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4000 + "'", int36 == 4000);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Retrofit-" + "'", str38, "Retrofit-");
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNull(executor44);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        java.util.concurrent.Executor executor25 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider26 = restAdapter10.clientProvider;
        retrofit.Server server27 = restAdapter10.server;
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNull(requestInterceptor28);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.Server server17 = restAdapter10.server;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        java.lang.String str19 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean18 = logLevel17.log();
        restAdapter10.logLevel = logLevel17;
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(executor20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor22 = restAdapter10.getrequestInterceptor();
        java.lang.Class<?> wildcardClass23 = restAdapter10.getClass();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(requestInterceptor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.gethttpExecutor();
        retrofit.Server server32 = null;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.RequestInterceptor requestInterceptor36 = null;
        retrofit.converter.Converter converter37 = null;
        retrofit.Profiler profiler38 = null;
        retrofit.ErrorHandler errorHandler39 = null;
        retrofit.RestAdapter.Log log40 = null;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter42 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor36, converter37, profiler38, errorHandler39, log40, logLevel41);
        restAdapter27.logLevel = logLevel41;
        restAdapter10.logLevel = logLevel41;
        retrofit.converter.Converter converter45 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter45);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.client.Response response18 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput19 = response18.getBody();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(typedInput19);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.Class class8 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(class8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        restAdapter10.setLogLevel(logLevel17);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        java.util.concurrent.Executor executor25 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider26 = restAdapter10.clientProvider;
        retrofit.ErrorHandler errorHandler27 = restAdapter10.geterrorHandler();
        int int28 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(errorHandler27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4000 + "'", int28 == 4000);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server17 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder5 = builder0.setLogLevel(logLevel4);
        retrofit.Profiler profiler6 = null;
        builder5.profiler = profiler6;
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder5.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder5.serializedObjectSupporter;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter12.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter12.deserializeObjectConverter3();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.RestAdapter.Log log9 = null;
        builder6.log = log9;
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.FULL;
        builder6.logLevel = logLevel11;
        retrofit.RestAdapter.Builder builder13 = builder0.setLogLevel(logLevel11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.client.Response response16 = serializedObjectSupporter14.deserializeObjectResponse7();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler18 = serializedObjectSupporter14.deserializeObjectErrorHandler1();
        builder13.errorHandler = errorHandler18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder23 = builder20.setServer(server22);
        retrofit.RestAdapter restAdapter24 = builder20.build();
        java.util.concurrent.Executor executor25 = builder20.getcallbackExecutor();
        builder13.sethttpExecutor(executor25);
        retrofit.RequestInterceptor requestInterceptor27 = builder13.requestInterceptor;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler18);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(restAdapter24);
        org.junit.Assert.assertNotNull(executor25);
        org.junit.Assert.assertNull(requestInterceptor27);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput7 = response6.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(typedInput7);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        retrofit.ErrorHandler errorHandler25 = restAdapter10.geterrorHandler();
        retrofit.client.Client.Provider provider26 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNull(provider26);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter10.getLogLevel();
        java.lang.Throwable throwable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable26, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter4.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler8 = serializedObjectSupporter4.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler8;
        retrofit.RestAdapter.LogLevel logLevel10 = builder0.logLevel;
        retrofit.RestAdapter.Log log11 = builder0.log;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        retrofit.RestAdapter.Log log19 = builder12.log;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.sethttpExecutor(executor21);
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder26 = builder23.setServer(server25);
        retrofit.RestAdapter.Builder builder27 = builder20.setServer(server25);
        retrofit.Server server28 = builder20.server;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder32 = builder29.setServer(server31);
        retrofit.RestAdapter restAdapter33 = builder29.build();
        java.util.concurrent.Executor executor34 = builder29.getcallbackExecutor();
        builder20.setcallbackExecutor(executor34);
        builder12.sethttpExecutor(executor34);
        builder0.setcallbackExecutor(executor34);
        retrofit.ErrorHandler errorHandler38 = builder0.errorHandler;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler8);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(restAdapter33);
        org.junit.Assert.assertNotNull(executor34);
        org.junit.Assert.assertNotNull(errorHandler38);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler7 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(errorHandler7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.Profiler profiler5 = null;
        builder3.profiler = profiler5;
        retrofit.RequestInterceptor requestInterceptor7 = builder3.requestInterceptor;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(requestInterceptor7);
        org.junit.Assert.assertNull(provider8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter27.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler33 = restAdapter27.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter27.setLogLevel(logLevel34);
        restAdapter10.logLevel = logLevel34;
        java.lang.String str37 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(requestInterceptor32);
        org.junit.Assert.assertNull(errorHandler33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-" + "'", str37, "Retrofit-");
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        java.lang.String str26 = restAdapter25.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor27 = restAdapter25.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean29 = logLevel28.log();
        restAdapter25.logLevel = logLevel28;
        restAdapter10.setLogLevel(logLevel28);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-" + "'", str26, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.Class class7 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = null;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter18.serializedObjectSupporter;
        java.util.concurrent.Executor executor20 = restAdapter18.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter18.getLogLevel();
        boolean boolean22 = logLevel21.log();
        retrofit.RestAdapter.Builder builder23 = builder0.setLogLevel(logLevel21);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter10.getserver();
        java.util.concurrent.Executor executor34 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler35 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor36 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNull(errorHandler35);
        org.junit.Assert.assertNull(executor36);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server12 = null;
        retrofit.client.Client.Provider provider13 = null;
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        retrofit.RequestInterceptor requestInterceptor16 = null;
        retrofit.converter.Converter converter17 = null;
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Log log20 = null;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server12, provider13, executor14, executor15, requestInterceptor16, converter17, profiler18, errorHandler19, log20, logLevel21);
        retrofit.converter.Converter converter23 = restAdapter22.converter;
        java.util.concurrent.Executor executor24 = restAdapter22.callbackExecutor;
        retrofit.RestAdapter.Log log25 = restAdapter22.log;
        java.util.concurrent.Executor executor26 = restAdapter22.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor27 = restAdapter22.getrequestInterceptor();
        retrofit.Profiler profiler28 = restAdapter22.getprofiler();
        retrofit.Server server29 = null;
        retrofit.client.Client.Provider provider30 = null;
        java.util.concurrent.Executor executor31 = null;
        java.util.concurrent.Executor executor32 = null;
        retrofit.RequestInterceptor requestInterceptor33 = null;
        retrofit.converter.Converter converter34 = null;
        retrofit.Profiler profiler35 = null;
        retrofit.ErrorHandler errorHandler36 = null;
        retrofit.RestAdapter.Log log37 = null;
        retrofit.RestAdapter.LogLevel logLevel38 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter39 = new retrofit.RestAdapter(server29, provider30, executor31, executor32, requestInterceptor33, converter34, profiler35, errorHandler36, log37, logLevel38);
        retrofit.converter.Converter converter40 = restAdapter39.converter;
        java.util.concurrent.Executor executor41 = restAdapter39.callbackExecutor;
        retrofit.RestAdapter.Log log42 = restAdapter39.log;
        retrofit.Server server43 = null;
        retrofit.client.Client.Provider provider44 = null;
        java.util.concurrent.Executor executor45 = null;
        java.util.concurrent.Executor executor46 = null;
        retrofit.RequestInterceptor requestInterceptor47 = null;
        retrofit.converter.Converter converter48 = null;
        retrofit.Profiler profiler49 = null;
        retrofit.ErrorHandler errorHandler50 = null;
        retrofit.RestAdapter.Log log51 = null;
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter53 = new retrofit.RestAdapter(server43, provider44, executor45, executor46, requestInterceptor47, converter48, profiler49, errorHandler50, log51, logLevel52);
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = restAdapter53.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server56 = serializedObjectSupporter55.deserializeObjectServer1();
        retrofit.client.Response response57 = serializedObjectSupporter55.deserializeObjectResponse7();
        java.lang.String str58 = serializedObjectSupporter55.deserializeObjectString9();
        restAdapter53.serializedObjectSupporter = serializedObjectSupporter55;
        restAdapter39.serializedObjectSupporter = serializedObjectSupporter55;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = restAdapter39.serializedObjectSupporter;
        retrofit.Server server62 = restAdapter39.getserver();
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor64 = null;
        builder63.sethttpExecutor(executor64);
        retrofit.RestAdapter.Log log66 = null;
        builder63.log = log66;
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.FULL;
        builder63.logLevel = logLevel68;
        restAdapter39.logLevel = logLevel68;
        restAdapter22.logLevel = logLevel68;
        restAdapter10.setLogLevel(logLevel68);
        java.lang.Throwable throwable73 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable73, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(log25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(requestInterceptor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertTrue("'" + logLevel38 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel38.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNull(log42);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter54);
        org.junit.Assert.assertNotNull(server56);
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "http://example.com/" + "'", str58, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter61);
        org.junit.Assert.assertNull(server62);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.client.Response response18 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList19 = response18.headers;
        java.util.List<retrofit.client.Header> headerList20 = response18.headers;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(profiler15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Request request16 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request17 = restAdapter10.logAndReplaceRequest(request16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(gsonConverter5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter22 = restAdapter10.converter;
        retrofit.converter.Converter converter23 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor24 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter25 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(converter23);
        org.junit.Assert.assertNull(requestInterceptor24);
        org.junit.Assert.assertNull(converter25);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.RestAdapter.Log log5 = builder0.log;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(log5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(server13);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.Profiler profiler5 = null;
        builder3.profiler = profiler5;
        retrofit.Profiler profiler7 = null;
        builder3.profiler = profiler7;
        retrofit.Profiler profiler9 = builder3.profiler;
        retrofit.Profiler profiler10 = builder3.profiler;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(profiler10);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter22 = restAdapter10.converter;
        retrofit.client.Client.Provider provider23 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter24 = restAdapter10.getconverter();
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
        retrofit.RestAdapter.Log log33 = null;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log33, logLevel34);
        java.lang.String str36 = restAdapter35.getTHREAD_PREFIX();
        java.lang.String str37 = restAdapter35.getIDLE_THREAD_NAME();
        retrofit.Server server38 = null;
        retrofit.client.Client.Provider provider39 = null;
        java.util.concurrent.Executor executor40 = null;
        java.util.concurrent.Executor executor41 = null;
        retrofit.RequestInterceptor requestInterceptor42 = null;
        retrofit.converter.Converter converter43 = null;
        retrofit.Profiler profiler44 = null;
        retrofit.ErrorHandler errorHandler45 = null;
        retrofit.RestAdapter.Log log46 = null;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server38, provider39, executor40, executor41, requestInterceptor42, converter43, profiler44, errorHandler45, log46, logLevel47);
        restAdapter35.logLevel = logLevel47;
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = restAdapter35.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor51 = restAdapter35.requestInterceptor;
        retrofit.ErrorHandler errorHandler52 = restAdapter35.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel53 = restAdapter35.logLevel;
        restAdapter10.setLogLevel(logLevel53);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-" + "'", str36, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter50);
        org.junit.Assert.assertNull(requestInterceptor51);
        org.junit.Assert.assertNull(errorHandler52);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.BASIC));
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.Server server20 = restAdapter10.server;
        java.util.concurrent.Executor executor21 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(server20);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RequestInterceptor requestInterceptor8 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        retrofit.Server server12 = null;
        retrofit.client.Client.Provider provider13 = null;
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        retrofit.RequestInterceptor requestInterceptor16 = null;
        retrofit.converter.Converter converter17 = null;
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Log log20 = null;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server12, provider13, executor14, executor15, requestInterceptor16, converter17, profiler18, errorHandler19, log20, logLevel21);
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = restAdapter22.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.client.Response response26 = serializedObjectSupporter24.deserializeObjectResponse7();
        java.lang.String str27 = serializedObjectSupporter24.deserializeObjectString9();
        restAdapter22.serializedObjectSupporter = serializedObjectSupporter24;
        retrofit.client.Response response29 = serializedObjectSupporter24.deserializeObjectResponse4();
        builder0.serializedObjectSupporter = serializedObjectSupporter24;
        retrofit.Profiler profiler31 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder32 = builder0.setProfiler(profiler31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter10.getserver();
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = null;
        builder34.sethttpExecutor(executor35);
        retrofit.RestAdapter.Log log37 = null;
        builder34.log = log37;
        retrofit.RestAdapter.LogLevel logLevel39 = retrofit.RestAdapter.LogLevel.FULL;
        builder34.logLevel = logLevel39;
        restAdapter10.logLevel = logLevel39;
        retrofit.client.Client.Provider provider42 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider42);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        retrofit.RequestInterceptor requestInterceptor18 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter12.deserializeObjectConverter6();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(requestInterceptor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter20);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.gethttpExecutor();
        retrofit.Server server32 = null;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.RequestInterceptor requestInterceptor36 = null;
        retrofit.converter.Converter converter37 = null;
        retrofit.Profiler profiler38 = null;
        retrofit.ErrorHandler errorHandler39 = null;
        retrofit.RestAdapter.Log log40 = null;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter42 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor36, converter37, profiler38, errorHandler39, log40, logLevel41);
        restAdapter27.logLevel = logLevel41;
        restAdapter10.logLevel = logLevel41;
        retrofit.RestAdapter.RestHandler restHandler45 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter10.getserver();
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = null;
        builder34.sethttpExecutor(executor35);
        retrofit.RestAdapter.Log log37 = null;
        builder34.log = log37;
        retrofit.RestAdapter.LogLevel logLevel39 = retrofit.RestAdapter.LogLevel.FULL;
        builder34.logLevel = logLevel39;
        restAdapter10.logLevel = logLevel39;
        java.util.concurrent.Executor executor42 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor42);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        log2.log("hi!");
        retrofit.RestAdapter.Builder builder5 = builder0.setLog(log2);
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder9 = builder6.setServer(server8);
        retrofit.converter.Converter converter10 = builder9.converter;
        retrofit.Profiler profiler11 = null;
        builder9.profiler = profiler11;
        retrofit.RestAdapter restAdapter13 = builder9.build();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter13.logLevel;
        retrofit.ErrorHandler errorHandler15 = restAdapter13.geterrorHandler();
        retrofit.RestAdapter.Builder builder16 = builder5.setErrorHandler(errorHandler15);
        retrofit.client.Client client17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder18 = builder5.setClient(client17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNotNull(restAdapter13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(errorHandler15);
        org.junit.Assert.assertNotNull(builder16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.client.Response response18 = serializedObjectSupporter12.deserializeObjectResponse1();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter23.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString9();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RequestInterceptor requestInterceptor31 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        java.lang.String str32 = serializedObjectSupporter25.deserializeObjectString3();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString5();
        retrofit.client.Response response22 = serializedObjectSupporter16.deserializeObjectResponse3();
        retrofit.client.Response response23 = serializedObjectSupporter16.deserializeObjectResponse1();
        java.lang.String str24 = serializedObjectSupporter16.deserializeObjectString6();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString2();
        retrofit.client.Response response34 = serializedObjectSupporter32.deserializeObjectResponse7();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Retrofit-Idle" + "'", str33, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response34);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int4 = response3.getStatus();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        restAdapter10.logLevel = logLevel24;
        retrofit.Server server27 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider28 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNull(provider28);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(provider14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter20 = restAdapter10.converter;
        retrofit.client.Request request21 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request22 = restAdapter10.logAndReplaceRequest(request21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertNull(converter20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        retrofit.Server server18 = null;
        retrofit.client.Client.Provider provider19 = null;
        java.util.concurrent.Executor executor20 = null;
        java.util.concurrent.Executor executor21 = null;
        retrofit.RequestInterceptor requestInterceptor22 = null;
        retrofit.converter.Converter converter23 = null;
        retrofit.Profiler profiler24 = null;
        retrofit.ErrorHandler errorHandler25 = null;
        retrofit.RestAdapter.Log log26 = null;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server18, provider19, executor20, executor21, requestInterceptor22, converter23, profiler24, errorHandler25, log26, logLevel27);
        retrofit.converter.Converter converter29 = restAdapter28.converter;
        java.util.concurrent.Executor executor30 = restAdapter28.callbackExecutor;
        retrofit.RestAdapter.Log log31 = restAdapter28.log;
        java.util.concurrent.Executor executor32 = restAdapter28.getcallbackExecutor();
        int int33 = restAdapter28.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor34 = restAdapter28.callbackExecutor;
        java.lang.String str35 = restAdapter28.getTHREAD_PREFIX();
        retrofit.Profiler profiler36 = restAdapter28.getprofiler();
        retrofit.converter.Converter converter37 = restAdapter28.converter;
        retrofit.client.Client.Provider provider38 = restAdapter28.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel39 = restAdapter28.getLogLevel();
        java.lang.String str40 = restAdapter28.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean42 = logLevel41.log();
        restAdapter28.setLogLevel(logLevel41);
        restAdapter10.logLevel = logLevel41;
        java.util.concurrent.Executor executor45 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter29);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNull(log31);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4000 + "'", int33 == 4000);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-" + "'", str35, "Retrofit-");
        org.junit.Assert.assertNull(profiler36);
        org.junit.Assert.assertNull(converter37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-" + "'", str40, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(executor45);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider21 = restAdapter10.getclientProvider();
        retrofit.client.Response response23 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response25 = restAdapter10.logAndReplaceResponse("", response23, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider21);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.getLogLevel();
        java.lang.String str22 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log23 = restAdapter10.log;
        retrofit.client.Client.Provider provider24 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-" + "'", str22, "Retrofit-");
        org.junit.Assert.assertNull(log23);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(requestInterceptor25);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder14 = builder11.setServer(server13);
        retrofit.RestAdapter.Builder builder15 = builder8.setServer(server13);
        retrofit.Server server16 = builder8.server;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder17.setServer(server19);
        retrofit.RestAdapter restAdapter21 = builder17.build();
        java.util.concurrent.Executor executor22 = builder17.getcallbackExecutor();
        builder8.setcallbackExecutor(executor22);
        builder0.sethttpExecutor(executor22);
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
        retrofit.RestAdapter.Log log33 = null;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log33, logLevel34);
        java.lang.String str36 = restAdapter35.getTHREAD_PREFIX();
        java.lang.String str37 = restAdapter35.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler38 = restAdapter35.errorHandler;
        retrofit.ErrorHandler errorHandler39 = restAdapter35.geterrorHandler();
        java.util.concurrent.Executor executor40 = restAdapter35.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server42 = serializedObjectSupporter41.deserializeObjectServer1();
        retrofit.client.Response response43 = serializedObjectSupporter41.deserializeObjectResponse7();
        java.lang.String str44 = serializedObjectSupporter41.deserializeObjectString4();
        restAdapter35.serializedObjectSupporter = serializedObjectSupporter41;
        java.lang.String str46 = serializedObjectSupporter41.deserializeObjectString5();
        retrofit.client.Response response47 = serializedObjectSupporter41.deserializeObjectResponse3();
        java.lang.String str48 = serializedObjectSupporter41.deserializeObjectString9();
        retrofit.client.Response response49 = serializedObjectSupporter41.deserializeObjectResponse1();
        builder0.serializedObjectSupporter = serializedObjectSupporter41;
        java.util.concurrent.Executor executor51 = builder0.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(restAdapter21);
        org.junit.Assert.assertNotNull(executor22);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-" + "'", str36, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler38);
        org.junit.Assert.assertNull(errorHandler39);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://example.com/" + "'", str46, "http://example.com/");
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(response49);
        org.junit.Assert.assertNull(executor51);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter1 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder14 = builder11.setServer(server13);
        retrofit.RestAdapter.Builder builder15 = builder8.setServer(server13);
        retrofit.Server server16 = builder8.server;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder17.setServer(server19);
        retrofit.RestAdapter restAdapter21 = builder17.build();
        java.util.concurrent.Executor executor22 = builder17.getcallbackExecutor();
        builder8.setcallbackExecutor(executor22);
        builder0.sethttpExecutor(executor22);
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
        retrofit.RestAdapter.Log log33 = null;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log33, logLevel34);
        java.lang.String str36 = restAdapter35.getTHREAD_PREFIX();
        java.lang.String str37 = restAdapter35.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler38 = restAdapter35.errorHandler;
        retrofit.ErrorHandler errorHandler39 = restAdapter35.geterrorHandler();
        java.util.concurrent.Executor executor40 = restAdapter35.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server42 = serializedObjectSupporter41.deserializeObjectServer1();
        retrofit.client.Response response43 = serializedObjectSupporter41.deserializeObjectResponse7();
        java.lang.String str44 = serializedObjectSupporter41.deserializeObjectString4();
        restAdapter35.serializedObjectSupporter = serializedObjectSupporter41;
        java.lang.String str46 = serializedObjectSupporter41.deserializeObjectString5();
        retrofit.client.Response response47 = serializedObjectSupporter41.deserializeObjectResponse3();
        java.lang.String str48 = serializedObjectSupporter41.deserializeObjectString9();
        retrofit.client.Response response49 = serializedObjectSupporter41.deserializeObjectResponse1();
        builder0.serializedObjectSupporter = serializedObjectSupporter41;
        java.lang.Class<?> wildcardClass51 = builder0.getClass();
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(restAdapter21);
        org.junit.Assert.assertNotNull(executor22);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-" + "'", str36, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler38);
        org.junit.Assert.assertNull(errorHandler39);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://example.com/" + "'", str46, "http://example.com/");
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(response49);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        int int25 = restAdapter24.getLOG_CHUNK_SIZE();
        retrofit.Profiler profiler26 = restAdapter24.getprofiler();
        retrofit.converter.Converter converter27 = restAdapter24.converter;
        java.lang.String str28 = restAdapter24.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter24.logLevel;
        restAdapter10.setLogLevel(logLevel29);
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4000 + "'", int25 == 4000);
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertNull(converter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Retrofit-Idle" + "'", str28, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor31);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNull(profiler20);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString7();
        retrofit.client.Response response19 = serializedObjectSupporter12.deserializeObjectResponse1();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString4();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable15, "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler12 = restAdapter10.geterrorHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(converter16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(log17);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.Server server18 = restAdapter10.server;
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        int int19 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4000 + "'", int19 == 4000);
        org.junit.Assert.assertNull(provider20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler12 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter16.deserializeObjectErrorHandler1();
        retrofit.Server server21 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.client.Response response22 = serializedObjectSupporter16.deserializeObjectResponse3();
        java.lang.String str23 = serializedObjectSupporter16.deserializeObjectString10();
        retrofit.client.Response response24 = serializedObjectSupporter16.deserializeObjectResponse2();
        retrofit.client.Response response25 = serializedObjectSupporter16.deserializeObjectResponse4();
        java.lang.String str26 = response25.reason;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response28 = restAdapter10.logAndReplaceResponse("http://example.com/", response25, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OK" + "'", str26, "OK");
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.Server server17 = restAdapter10.server;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(log15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.Server server13 = restAdapter10.server;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        retrofit.client.Client.Provider provider9 = null;
        builder7.clientProvider = provider9;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int9 = response8.status;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(requestInterceptor4);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.Server server8 = builder0.server;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        retrofit.Profiler profiler11 = builder0.profiler;
        retrofit.RestAdapter.LogLevel logLevel12 = builder0.logLevel;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(requestInterceptor18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList4 = response3.headers;
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        java.lang.String str6 = response3.reason;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RequestInterceptor requestInterceptor8 = builder0.requestInterceptor;
        retrofit.Server server9 = null;
        retrofit.client.Client.Provider provider10 = null;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        retrofit.converter.Converter converter14 = null;
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Log log17 = null;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter19 = new retrofit.RestAdapter(server9, provider10, executor11, executor12, requestInterceptor13, converter14, profiler15, errorHandler16, log17, logLevel18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter19.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.client.Response response23 = serializedObjectSupporter21.deserializeObjectResponse7();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString9();
        restAdapter19.serializedObjectSupporter = serializedObjectSupporter21;
        retrofit.ErrorHandler errorHandler26 = restAdapter19.geterrorHandler();
        retrofit.Server server27 = null;
        retrofit.client.Client.Provider provider28 = null;
        java.util.concurrent.Executor executor29 = null;
        java.util.concurrent.Executor executor30 = null;
        retrofit.RequestInterceptor requestInterceptor31 = null;
        retrofit.converter.Converter converter32 = null;
        retrofit.Profiler profiler33 = null;
        retrofit.ErrorHandler errorHandler34 = null;
        retrofit.RestAdapter.Log log35 = null;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server27, provider28, executor29, executor30, requestInterceptor31, converter32, profiler33, errorHandler34, log35, logLevel36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = restAdapter37.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server40 = serializedObjectSupporter39.deserializeObjectServer1();
        retrofit.client.Response response41 = serializedObjectSupporter39.deserializeObjectResponse7();
        java.lang.String str42 = serializedObjectSupporter39.deserializeObjectString9();
        restAdapter37.serializedObjectSupporter = serializedObjectSupporter39;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter37.logLevel = logLevel44;
        restAdapter19.setLogLevel(logLevel44);
        builder0.logLevel = logLevel44;
        retrofit.RestAdapter.Builder builder49 = builder0.setServer("http://example.com/");
        java.util.concurrent.Executor executor50 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler26);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter38);
        org.junit.Assert.assertNotNull(server40);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(executor50);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.Server server8 = builder0.server;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        retrofit.ErrorHandler errorHandler11 = builder0.errorHandler;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNull(errorHandler11);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.client.Response response32 = serializedObjectSupporter26.deserializeObjectResponse4();
        java.lang.String str33 = serializedObjectSupporter26.deserializeObjectString3();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.Server server16 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNull(executor16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter22 = restAdapter10.converter;
        java.lang.String str23 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Retrofit-Idle" + "'", str23, "Retrofit-Idle");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter27.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler33 = restAdapter27.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter27.setLogLevel(logLevel34);
        restAdapter10.logLevel = logLevel34;
        retrofit.ErrorHandler errorHandler37 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler38 = restAdapter10.errorHandler;
        java.lang.Throwable throwable39 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable39, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(requestInterceptor32);
        org.junit.Assert.assertNull(errorHandler33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler37);
        org.junit.Assert.assertNull(errorHandler38);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.Profiler profiler5 = null;
        builder3.profiler = profiler5;
        retrofit.Server server7 = builder3.server;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(server7);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.Profiler profiler7 = builder0.profiler;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        retrofit.RequestInterceptor requestInterceptor10 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        retrofit.RestAdapter.Log log19 = builder12.log;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.sethttpExecutor(executor21);
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder26 = builder23.setServer(server25);
        retrofit.RestAdapter.Builder builder27 = builder20.setServer(server25);
        retrofit.Server server28 = builder20.server;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder32 = builder29.setServer(server31);
        retrofit.RestAdapter restAdapter33 = builder29.build();
        java.util.concurrent.Executor executor34 = builder29.getcallbackExecutor();
        builder20.setcallbackExecutor(executor34);
        builder12.sethttpExecutor(executor34);
        retrofit.Server server37 = null;
        retrofit.client.Client.Provider provider38 = null;
        java.util.concurrent.Executor executor39 = null;
        java.util.concurrent.Executor executor40 = null;
        retrofit.RequestInterceptor requestInterceptor41 = null;
        retrofit.converter.Converter converter42 = null;
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.RestAdapter.Log log45 = null;
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter47 = new retrofit.RestAdapter(server37, provider38, executor39, executor40, requestInterceptor41, converter42, profiler43, errorHandler44, log45, logLevel46);
        java.lang.String str48 = restAdapter47.getTHREAD_PREFIX();
        java.lang.String str49 = restAdapter47.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler50 = restAdapter47.errorHandler;
        retrofit.ErrorHandler errorHandler51 = restAdapter47.geterrorHandler();
        java.util.concurrent.Executor executor52 = restAdapter47.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server54 = serializedObjectSupporter53.deserializeObjectServer1();
        retrofit.client.Response response55 = serializedObjectSupporter53.deserializeObjectResponse7();
        java.lang.String str56 = serializedObjectSupporter53.deserializeObjectString4();
        restAdapter47.serializedObjectSupporter = serializedObjectSupporter53;
        java.lang.String str58 = serializedObjectSupporter53.deserializeObjectString5();
        retrofit.client.Response response59 = serializedObjectSupporter53.deserializeObjectResponse3();
        java.lang.String str60 = serializedObjectSupporter53.deserializeObjectString9();
        retrofit.client.Response response61 = serializedObjectSupporter53.deserializeObjectResponse1();
        builder12.serializedObjectSupporter = serializedObjectSupporter53;
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter53.deserializeObjectConverter8();
        retrofit.RestAdapter.Builder builder64 = builder0.setConverter((retrofit.converter.Converter) gsonConverter63);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(profiler7);
        org.junit.Assert.assertNull(requestInterceptor10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(restAdapter33);
        org.junit.Assert.assertNotNull(executor34);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Retrofit-" + "'", str48, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Retrofit-Idle" + "'", str49, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler50);
        org.junit.Assert.assertNull(errorHandler51);
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertNotNull(server54);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "http://example.com/" + "'", str58, "http://example.com/");
        org.junit.Assert.assertNotNull(response59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(response61);
        org.junit.Assert.assertNotNull(gsonConverter63);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput4 = response3.getBody();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(typedInput4);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        int int20 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int4 = response3.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.RestAdapter.Log log9 = null;
        builder6.log = log9;
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.FULL;
        builder6.logLevel = logLevel11;
        retrofit.RestAdapter.Builder builder13 = builder0.setLogLevel(logLevel11);
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder17 = builder14.setServer(server16);
        retrofit.RestAdapter restAdapter18 = builder14.build();
        java.util.concurrent.Executor executor19 = builder14.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.sethttpExecutor(executor21);
        retrofit.RestAdapter.Log log23 = null;
        builder20.log = log23;
        java.util.concurrent.Executor executor25 = builder20.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server28 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder26.setServer(server28);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = null;
        builder30.sethttpExecutor(executor31);
        retrofit.RestAdapter.Log log33 = null;
        builder30.log = log33;
        java.util.concurrent.Executor executor35 = builder30.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = null;
        builder36.sethttpExecutor(executor37);
        retrofit.RestAdapter.Log log39 = null;
        builder36.log = log39;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.FULL;
        builder36.logLevel = logLevel41;
        retrofit.RestAdapter.Builder builder43 = builder30.setLogLevel(logLevel41);
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server45 = serializedObjectSupporter44.deserializeObjectServer1();
        retrofit.client.Response response46 = serializedObjectSupporter44.deserializeObjectResponse7();
        java.lang.String str47 = serializedObjectSupporter44.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler48 = serializedObjectSupporter44.deserializeObjectErrorHandler1();
        builder43.errorHandler = errorHandler48;
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server52 = serializedObjectSupporter51.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder53 = builder50.setServer(server52);
        retrofit.RestAdapter restAdapter54 = builder50.build();
        java.util.concurrent.Executor executor55 = builder50.getcallbackExecutor();
        builder43.sethttpExecutor(executor55);
        builder26.sethttpExecutor(executor55);
        builder20.httpExecutor = executor55;
        retrofit.RestAdapter.Builder builder59 = builder0.setExecutors(executor19, executor55);
        retrofit.RestAdapter.LogLevel logLevel60 = builder59.logLevel;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(restAdapter18);
        org.junit.Assert.assertNotNull(executor19);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "http://example.com/" + "'", str47, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler48);
        org.junit.Assert.assertNotNull(server52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(restAdapter54);
        org.junit.Assert.assertNotNull(executor55);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString7();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString4();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString5();
        java.lang.String str21 = serializedObjectSupporter12.deserializeObjectString9();
        java.lang.String str22 = serializedObjectSupporter12.deserializeObjectString9();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.Server server18 = restAdapter10.getserver();
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(converter20);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString7();
        retrofit.Server server19 = serializedObjectSupporter12.deserializeObjectServer1();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString9();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter restAdapter5 = builder4.build();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(restAdapter5);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Server server16 = restAdapter10.server;
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel17;
        retrofit.Server server19 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server19);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = null;
        builder6.sethttpExecutor(executor7);
        retrofit.RestAdapter.Log log9 = null;
        builder6.log = log9;
        java.util.concurrent.Executor executor11 = builder6.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        retrofit.RestAdapter.Builder builder19 = builder6.setLogLevel(logLevel17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server21 = serializedObjectSupporter20.deserializeObjectServer1();
        retrofit.client.Response response22 = serializedObjectSupporter20.deserializeObjectResponse7();
        java.lang.String str23 = serializedObjectSupporter20.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler24 = serializedObjectSupporter20.deserializeObjectErrorHandler1();
        builder19.errorHandler = errorHandler24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server28 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder26.setServer(server28);
        retrofit.RestAdapter restAdapter30 = builder26.build();
        java.util.concurrent.Executor executor31 = builder26.getcallbackExecutor();
        builder19.sethttpExecutor(executor31);
        builder0.callbackExecutor = executor31;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder35 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler24);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(restAdapter30);
        org.junit.Assert.assertNotNull(executor31);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider2 = null;
        builder0.setclientProvider(provider2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        java.lang.Class class8 = serializedObjectSupporter6.deserializeObjectClass1();
        retrofit.client.Response response9 = serializedObjectSupporter6.deserializeObjectResponse3();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString4();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.String str13 = serializedObjectSupporter6.deserializeObjectString6();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log26 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(log26);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNotNull(serializedObjectSupporter19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        java.lang.String str19 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        retrofit.RequestInterceptor requestInterceptor9 = builder7.requestInterceptor;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(requestInterceptor9);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = response3.reason;
        java.lang.String str5 = response3.reason;
        retrofit.mime.TypedInput typedInput6 = response3.body;
        retrofit.mime.TypedInput typedInput7 = response3.body;
        java.util.List<retrofit.client.Header> headerList8 = response3.getHeaders();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNull(typedInput6);
        org.junit.Assert.assertNull(typedInput7);
        org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.client.Request request16 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request17 = restAdapter10.logAndReplaceRequest(request16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        log2.log("hi!");
        retrofit.RestAdapter.Builder builder5 = builder0.setLog(log2);
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("http://example.com/");
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder7.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        java.util.concurrent.Executor executor8 = builder0.getcallbackExecutor();
        retrofit.converter.Converter converter9 = builder0.converter;
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(errorHandler18);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter23.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString9();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.client.Response response31 = serializedObjectSupporter25.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter25.deserializeObjectConverter2();
        retrofit.ErrorHandler errorHandler33 = serializedObjectSupporter25.deserializeObjectErrorHandler1();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(errorHandler33);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter8 = builder7.converter;
        retrofit.RestAdapter.Builder builder10 = builder7.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder12 = builder10.setLogLevel(logLevel11);
        boolean boolean13 = logLevel11.log();
        retrofit.RestAdapter.Builder builder14 = builder0.setLogLevel(logLevel11);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = null;
        builder15.sethttpExecutor(executor16);
        retrofit.RestAdapter.Log log18 = null;
        builder15.log = log18;
        java.util.concurrent.Executor executor20 = builder15.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server23 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder24 = builder21.setServer(server23);
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = null;
        builder25.sethttpExecutor(executor26);
        retrofit.RestAdapter.Log log28 = null;
        builder25.log = log28;
        java.util.concurrent.Executor executor30 = builder25.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor32 = null;
        builder31.sethttpExecutor(executor32);
        retrofit.RestAdapter.Log log34 = null;
        builder31.log = log34;
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.FULL;
        builder31.logLevel = logLevel36;
        retrofit.RestAdapter.Builder builder38 = builder25.setLogLevel(logLevel36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server40 = serializedObjectSupporter39.deserializeObjectServer1();
        retrofit.client.Response response41 = serializedObjectSupporter39.deserializeObjectResponse7();
        java.lang.String str42 = serializedObjectSupporter39.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler43 = serializedObjectSupporter39.deserializeObjectErrorHandler1();
        builder38.errorHandler = errorHandler43;
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server47 = serializedObjectSupporter46.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder48 = builder45.setServer(server47);
        retrofit.RestAdapter restAdapter49 = builder45.build();
        java.util.concurrent.Executor executor50 = builder45.getcallbackExecutor();
        builder38.sethttpExecutor(executor50);
        builder21.sethttpExecutor(executor50);
        builder15.httpExecutor = executor50;
        builder0.httpExecutor = executor50;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(server40);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler43);
        org.junit.Assert.assertNotNull(server47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(restAdapter49);
        org.junit.Assert.assertNotNull(executor50);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(log17);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(profiler18);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server7 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(server7);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RequestInterceptor requestInterceptor8 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor12 = builder0.callbackExecutor;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.String str32 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel33;
        retrofit.ErrorHandler errorHandler35 = restAdapter10.errorHandler;
        int int36 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel37 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-Idle" + "'", str32, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4000 + "'", int36 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel38 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel38.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        log2.log("hi!");
        retrofit.RestAdapter.Builder builder5 = builder0.setLog(log2);
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = null;
        builder7.sethttpExecutor(executor8);
        retrofit.RestAdapter.Log log10 = null;
        builder7.log = log10;
        java.util.concurrent.Executor executor12 = builder7.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = null;
        builder13.sethttpExecutor(executor14);
        retrofit.RestAdapter.Log log16 = null;
        builder13.log = log16;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.FULL;
        builder13.logLevel = logLevel18;
        retrofit.RestAdapter.Builder builder20 = builder7.setLogLevel(logLevel18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.client.Response response23 = serializedObjectSupporter21.deserializeObjectResponse7();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler25 = serializedObjectSupporter21.deserializeObjectErrorHandler1();
        builder20.errorHandler = errorHandler25;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server29 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder30 = builder27.setServer(server29);
        retrofit.RestAdapter restAdapter31 = builder27.build();
        java.util.concurrent.Executor executor32 = builder27.getcallbackExecutor();
        builder20.sethttpExecutor(executor32);
        builder0.callbackExecutor = executor32;
        java.util.concurrent.Executor executor35 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = null;
        builder36.sethttpExecutor(executor37);
        retrofit.RestAdapter.Log log39 = null;
        builder36.log = log39;
        java.util.concurrent.Executor executor41 = builder36.getcallbackExecutor();
        java.util.concurrent.Executor executor42 = builder36.gethttpExecutor();
        retrofit.RestAdapter.Builder builder44 = builder36.setServer("OK");
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = null;
        builder45.sethttpExecutor(executor46);
        retrofit.RestAdapter.Log log48 = null;
        builder45.log = log48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.FULL;
        builder45.logLevel = logLevel50;
        retrofit.client.Client.Provider provider52 = builder45.getclientProvider();
        java.util.concurrent.Executor executor53 = builder45.callbackExecutor;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = null;
        builder54.sethttpExecutor(executor55);
        retrofit.RestAdapter.Log log57 = null;
        builder54.log = log57;
        java.util.concurrent.Executor executor59 = builder54.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder60 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor61 = null;
        builder60.sethttpExecutor(executor61);
        retrofit.RestAdapter.Log log63 = null;
        builder60.log = log63;
        retrofit.RestAdapter.LogLevel logLevel65 = retrofit.RestAdapter.LogLevel.FULL;
        builder60.logLevel = logLevel65;
        retrofit.RestAdapter.Builder builder67 = builder54.setLogLevel(logLevel65);
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server69 = serializedObjectSupporter68.deserializeObjectServer1();
        retrofit.client.Response response70 = serializedObjectSupporter68.deserializeObjectResponse7();
        java.lang.String str71 = serializedObjectSupporter68.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler72 = serializedObjectSupporter68.deserializeObjectErrorHandler1();
        builder67.errorHandler = errorHandler72;
        retrofit.RestAdapter.Builder builder74 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server76 = serializedObjectSupporter75.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder77 = builder74.setServer(server76);
        retrofit.RestAdapter restAdapter78 = builder74.build();
        java.util.concurrent.Executor executor79 = builder74.getcallbackExecutor();
        builder67.sethttpExecutor(executor79);
        builder45.setcallbackExecutor(executor79);
        builder36.httpExecutor = executor79;
        retrofit.RestAdapter.Builder builder83 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter84 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server85 = serializedObjectSupporter84.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder86 = builder83.setServer(server85);
        retrofit.converter.Converter converter87 = builder86.converter;
        retrofit.Profiler profiler88 = null;
        builder86.profiler = profiler88;
        retrofit.RestAdapter restAdapter90 = builder86.build();
        retrofit.RestAdapter.LogLevel logLevel91 = restAdapter90.logLevel;
        retrofit.ErrorHandler errorHandler92 = restAdapter90.geterrorHandler();
        builder36.errorHandler = errorHandler92;
        builder0.errorHandler = errorHandler92;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler25);
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(restAdapter31);
        org.junit.Assert.assertNotNull(executor32);
        org.junit.Assert.assertNotNull(executor35);
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNull(executor42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider52);
        org.junit.Assert.assertNull(executor53);
        org.junit.Assert.assertNull(executor59);
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(server69);
        org.junit.Assert.assertNotNull(response70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "http://example.com/" + "'", str71, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler72);
        org.junit.Assert.assertNotNull(server76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(restAdapter78);
        org.junit.Assert.assertNotNull(executor79);
        org.junit.Assert.assertNotNull(server85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNull(converter87);
        org.junit.Assert.assertNotNull(restAdapter90);
        org.junit.Assert.assertTrue("'" + logLevel91 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel91.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(errorHandler92);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log7);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.Server server17 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restAdapter27.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server30 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.client.Response response31 = serializedObjectSupporter29.deserializeObjectResponse7();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString9();
        restAdapter27.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.client.Response response34 = serializedObjectSupporter29.deserializeObjectResponse3();
        retrofit.client.Response response35 = serializedObjectSupporter29.deserializeObjectResponse1();
        retrofit.client.Response response36 = serializedObjectSupporter29.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response38 = restAdapter10.logAndReplaceResponse("Internal Server Error", response36, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.RestAdapter restAdapter4 = builder0.build();
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.Server server9 = builder0.server;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(restAdapter4);
        org.junit.Assert.assertNotNull(executor5);
        org.junit.Assert.assertNotNull(provider6);
        org.junit.Assert.assertNotNull(server9);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        log2.log("hi!");
        retrofit.RestAdapter.Builder builder5 = builder0.setLog(log2);
        java.util.concurrent.Executor executor6 = builder5.getcallbackExecutor();
        retrofit.converter.Converter converter7 = builder5.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString4();
        retrofit.RequestInterceptor requestInterceptor11 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        builder5.requestInterceptor = requestInterceptor11;
        builder5.ensureSaneDefaults();
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.converter.Converter converter25 = restAdapter24.converter;
        java.util.concurrent.Executor executor26 = restAdapter24.callbackExecutor;
        retrofit.RestAdapter.Log log27 = restAdapter24.log;
        retrofit.Server server28 = null;
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.RequestInterceptor requestInterceptor32 = null;
        retrofit.converter.Converter converter33 = null;
        retrofit.Profiler profiler34 = null;
        retrofit.ErrorHandler errorHandler35 = null;
        retrofit.RestAdapter.Log log36 = null;
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter38 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor32, converter33, profiler34, errorHandler35, log36, logLevel37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = restAdapter38.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server41 = serializedObjectSupporter40.deserializeObjectServer1();
        retrofit.client.Response response42 = serializedObjectSupporter40.deserializeObjectResponse7();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString9();
        restAdapter38.serializedObjectSupporter = serializedObjectSupporter40;
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter40;
        java.lang.String str46 = restAdapter24.getIDLE_THREAD_NAME();
        retrofit.Server server47 = null;
        retrofit.client.Client.Provider provider48 = null;
        java.util.concurrent.Executor executor49 = null;
        java.util.concurrent.Executor executor50 = null;
        retrofit.RequestInterceptor requestInterceptor51 = null;
        retrofit.converter.Converter converter52 = null;
        retrofit.Profiler profiler53 = null;
        retrofit.ErrorHandler errorHandler54 = null;
        retrofit.RestAdapter.Log log55 = null;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server47, provider48, executor49, executor50, requestInterceptor51, converter52, profiler53, errorHandler54, log55, logLevel56);
        java.lang.String str58 = restAdapter57.getTHREAD_PREFIX();
        java.lang.String str59 = restAdapter57.getIDLE_THREAD_NAME();
        retrofit.Server server60 = null;
        retrofit.client.Client.Provider provider61 = null;
        java.util.concurrent.Executor executor62 = null;
        java.util.concurrent.Executor executor63 = null;
        retrofit.RequestInterceptor requestInterceptor64 = null;
        retrofit.converter.Converter converter65 = null;
        retrofit.Profiler profiler66 = null;
        retrofit.ErrorHandler errorHandler67 = null;
        retrofit.RestAdapter.Log log68 = null;
        retrofit.RestAdapter.LogLevel logLevel69 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter70 = new retrofit.RestAdapter(server60, provider61, executor62, executor63, requestInterceptor64, converter65, profiler66, errorHandler67, log68, logLevel69);
        restAdapter57.logLevel = logLevel69;
        restAdapter24.logLevel = logLevel69;
        builder5.logLevel = logLevel69;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-" + "'", str9, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Retrofit-Idle" + "'", str46, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Retrofit-" + "'", str58, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Retrofit-Idle" + "'", str59, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel69 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel69.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.converter.Converter converter4 = builder3.converter;
        retrofit.Profiler profiler5 = null;
        builder3.profiler = profiler5;
        retrofit.Profiler profiler7 = null;
        builder3.profiler = profiler7;
        retrofit.Profiler profiler9 = builder3.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        retrofit.client.Response response12 = serializedObjectSupporter10.deserializeObjectResponse7();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler14 = serializedObjectSupporter10.deserializeObjectErrorHandler1();
        retrofit.Server server15 = serializedObjectSupporter10.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter10.deserializeObjectErrorHandler1();
        builder3.errorHandler = errorHandler17;
        java.util.concurrent.Executor executor19 = builder3.gethttpExecutor();
        java.util.concurrent.Executor executor20 = builder3.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.Server server15 = restAdapter10.server;
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.client.Response response17 = serializedObjectSupporter12.deserializeObjectResponse4();
        int int18 = response17.status;
        int int19 = response17.status;
        int int20 = response17.getStatus();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter21 = builder20.converter;
        retrofit.RestAdapter.Builder builder23 = builder20.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder25 = builder23.setLogLevel(logLevel24);
        boolean boolean26 = logLevel24.log();
        restAdapter10.logLevel = logLevel24;
        retrofit.client.Client.Provider provider28 = restAdapter10.getclientProvider();
        retrofit.Server server29 = restAdapter10.getserver();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(server29);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList9 = response8.getHeaders();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(headerList9);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        retrofit.client.Response response18 = serializedObjectSupporter12.deserializeObjectResponse1();
        retrofit.client.Response response19 = serializedObjectSupporter12.deserializeObjectResponse3();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter4.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler8 = serializedObjectSupporter4.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler8;
        retrofit.client.Client.Provider provider10 = null;
        builder0.clientProvider = provider10;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler8);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider26 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor27 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(requestInterceptor27);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.Server server18 = restAdapter10.getserver();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler12 = restAdapter10.geterrorHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter10.requestInterceptor;
        java.lang.String str22 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(requestInterceptor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Request request21 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request22 = restAdapter10.logAndReplaceRequest(request21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(serializedObjectSupporter20);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(converter19);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.Server server16 = null;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = null;
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter26 = new retrofit.RestAdapter(server16, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel25);
        int int27 = restAdapter26.getLOG_CHUNK_SIZE();
        retrofit.Profiler profiler28 = restAdapter26.getprofiler();
        retrofit.converter.Converter converter29 = restAdapter26.converter;
        java.lang.String str30 = restAdapter26.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter26.logLevel;
        restAdapter10.logLevel = logLevel31;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4000 + "'", int27 == 4000);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertNull(converter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-Idle" + "'", str30, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = response3.getReason();
        retrofit.mime.TypedInput typedInput5 = response3.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNull(typedInput5);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(log19);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder5 = builder0.setLogLevel(logLevel4);
        retrofit.Profiler profiler6 = null;
        builder5.profiler = profiler6;
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder10 = builder5.setServer("hi!");
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.Server server17 = restAdapter10.server;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.ErrorHandler errorHandler19 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider12 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder4 = builder1.setServer(server3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server6 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse7();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter5.deserializeObjectErrorHandler1();
        builder1.errorHandler = errorHandler9;
        retrofit.RestAdapter.LogLevel logLevel11 = builder1.logLevel;
        retrofit.RestAdapter.Builder builder12 = builder0.setLogLevel(logLevel11);
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter14 = builder13.converter;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        log15.log("hi!");
        retrofit.RestAdapter.Builder builder18 = builder13.setLog(log15);
        retrofit.RestAdapter.Log log19 = builder13.log;
        log19.log("http://example.com/");
        retrofit.RestAdapter.Builder builder22 = builder0.setLog(log19);
        log19.log("");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString2();
        java.lang.String str34 = serializedObjectSupporter32.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = serializedObjectSupporter32.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Retrofit-Idle" + "'", str33, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.RestAdapter restAdapter4 = builder0.build();
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = null;
        builder5.sethttpExecutor(executor6);
        retrofit.RestAdapter.Log log8 = null;
        builder5.log = log8;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        builder5.logLevel = logLevel10;
        restAdapter4.setLogLevel(logLevel10);
        retrofit.ErrorHandler errorHandler13 = restAdapter4.errorHandler;
        java.lang.String str14 = restAdapter4.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter4.errorHandler;
        retrofit.Server server16 = null;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = null;
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter26 = new retrofit.RestAdapter(server16, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter26.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server29 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.client.Response response30 = serializedObjectSupporter28.deserializeObjectResponse7();
        java.lang.String str31 = serializedObjectSupporter28.deserializeObjectString9();
        restAdapter26.serializedObjectSupporter = serializedObjectSupporter28;
        java.util.concurrent.Executor executor33 = restAdapter26.httpExecutor;
        retrofit.converter.Converter converter34 = restAdapter26.converter;
        retrofit.RestAdapter.LogLevel logLevel35 = restAdapter26.getLogLevel();
        restAdapter4.logLevel = logLevel35;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(restAdapter4);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(errorHandler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNotNull(errorHandler15);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(requestInterceptor21);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor4);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString1();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString10();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder4 = builder1.setServer(server3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server6 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse7();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter5.deserializeObjectErrorHandler1();
        builder1.errorHandler = errorHandler9;
        retrofit.RestAdapter.LogLevel logLevel11 = builder1.logLevel;
        retrofit.RestAdapter.Builder builder12 = builder0.setLogLevel(logLevel11);
        retrofit.Server server13 = builder0.server;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = null;
        builder14.sethttpExecutor(executor15);
        retrofit.RestAdapter.Log log17 = null;
        builder14.log = log17;
        java.util.concurrent.Executor executor19 = builder14.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = null;
        builder20.sethttpExecutor(executor21);
        retrofit.RestAdapter.Log log23 = null;
        builder20.log = log23;
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        builder20.logLevel = logLevel25;
        retrofit.RestAdapter.Builder builder27 = builder14.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server30 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder31 = builder28.setServer(server30);
        retrofit.RestAdapter restAdapter32 = builder28.build();
        java.util.concurrent.Executor executor33 = builder28.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = null;
        builder34.sethttpExecutor(executor35);
        retrofit.RestAdapter.Log log37 = null;
        builder34.log = log37;
        java.util.concurrent.Executor executor39 = builder34.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server42 = serializedObjectSupporter41.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder43 = builder40.setServer(server42);
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor45 = null;
        builder44.sethttpExecutor(executor45);
        retrofit.RestAdapter.Log log47 = null;
        builder44.log = log47;
        java.util.concurrent.Executor executor49 = builder44.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = null;
        builder50.sethttpExecutor(executor51);
        retrofit.RestAdapter.Log log53 = null;
        builder50.log = log53;
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.FULL;
        builder50.logLevel = logLevel55;
        retrofit.RestAdapter.Builder builder57 = builder44.setLogLevel(logLevel55);
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server59 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.client.Response response60 = serializedObjectSupporter58.deserializeObjectResponse7();
        java.lang.String str61 = serializedObjectSupporter58.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler62 = serializedObjectSupporter58.deserializeObjectErrorHandler1();
        builder57.errorHandler = errorHandler62;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server66 = serializedObjectSupporter65.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder67 = builder64.setServer(server66);
        retrofit.RestAdapter restAdapter68 = builder64.build();
        java.util.concurrent.Executor executor69 = builder64.getcallbackExecutor();
        builder57.sethttpExecutor(executor69);
        builder40.sethttpExecutor(executor69);
        builder34.httpExecutor = executor69;
        retrofit.RestAdapter.Builder builder73 = builder14.setExecutors(executor33, executor69);
        builder0.httpExecutor = executor69;
        retrofit.Profiler profiler75 = builder0.profiler;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter76 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(restAdapter32);
        org.junit.Assert.assertNotNull(executor33);
        org.junit.Assert.assertNull(executor39);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(executor49);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(server59);
        org.junit.Assert.assertNotNull(response60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "http://example.com/" + "'", str61, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler62);
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(restAdapter68);
        org.junit.Assert.assertNotNull(executor69);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNull(profiler75);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Log log18 = restAdapter10.log;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = null;
        builder19.sethttpExecutor(executor20);
        retrofit.RestAdapter.Log log22 = null;
        builder19.log = log22;
        java.util.concurrent.Executor executor24 = builder19.getcallbackExecutor();
        retrofit.Server server25 = builder19.server;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server28 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder26.setServer(server28);
        retrofit.RestAdapter restAdapter30 = builder26.build();
        java.util.concurrent.Executor executor31 = builder26.getcallbackExecutor();
        builder19.setcallbackExecutor(executor31);
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter34 = builder33.converter;
        retrofit.RestAdapter.Builder builder36 = builder33.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder38 = builder36.setLogLevel(logLevel37);
        boolean boolean39 = logLevel37.log();
        retrofit.RestAdapter.Builder builder40 = builder19.setLogLevel(logLevel37);
        restAdapter10.logLevel = logLevel37;
        retrofit.RestAdapter.RestHandler restHandler42 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = restHandler42.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(log18);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(server25);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(restAdapter30);
        org.junit.Assert.assertNotNull(executor31);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(serializedObjectSupporter43);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString5();
        retrofit.client.Response response22 = serializedObjectSupporter16.deserializeObjectResponse3();
        retrofit.client.Response response23 = serializedObjectSupporter16.deserializeObjectResponse1();
        java.lang.String str24 = serializedObjectSupporter16.deserializeObjectString8();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder5 = builder3.setLogLevel(logLevel4);
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter10.getserver();
        retrofit.ErrorHandler errorHandler34 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler35 = restAdapter10.new RestHandler();
        int int36 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor37 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertNull(errorHandler34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4000 + "'", int36 == 4000);
        org.junit.Assert.assertNull(executor37);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = response3.reason;
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        java.util.List<retrofit.client.Header> headerList6 = response3.headers;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Log log11 = null;
        builder8.log = log11;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.FULL;
        builder8.logLevel = logLevel13;
        boolean boolean15 = logLevel13.log();
        retrofit.RestAdapter.Builder builder16 = builder0.setLogLevel(logLevel13);
        retrofit.RestAdapter.LogLevel logLevel17 = builder16.logLevel;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder21 = builder18.setServer(server20);
        builder21.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler23 = builder21.errorHandler;
        builder21.ensureSaneDefaults();
        java.util.concurrent.Executor executor25 = builder21.gethttpExecutor();
        builder16.setcallbackExecutor(executor25);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(errorHandler23);
        org.junit.Assert.assertNotNull(executor25);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString5();
        retrofit.Server server22 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter16.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.Server server17 = restAdapter10.getserver();
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter23.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString9();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter25.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter25.deserializeObjectConverter7();
        retrofit.ErrorHandler errorHandler33 = serializedObjectSupporter25.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter25.deserializeObjectConverter5();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(errorHandler33);
        org.junit.Assert.assertNotNull(gsonConverter34);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean18 = logLevel17.log();
        restAdapter10.logLevel = logLevel17;
        retrofit.ErrorHandler errorHandler20 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(errorHandler20);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.Server server18 = restAdapter10.getserver();
        java.util.concurrent.Executor executor19 = restAdapter10.gethttpExecutor();
        retrofit.ErrorHandler errorHandler20 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(errorHandler20);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter23.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString9();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter25.deserializeObjectConverter5();
        java.lang.String str32 = serializedObjectSupporter25.deserializeObjectString2();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-Idle" + "'", str32, "Retrofit-Idle");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RequestInterceptor requestInterceptor8 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor11 = builder0.httpExecutor;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = null;
        builder3.sethttpExecutor(executor4);
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder9 = builder6.setServer(server8);
        retrofit.RestAdapter.Builder builder10 = builder3.setServer(server8);
        retrofit.RequestInterceptor requestInterceptor11 = builder3.requestInterceptor;
        retrofit.Server server12 = null;
        retrofit.client.Client.Provider provider13 = null;
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        retrofit.RequestInterceptor requestInterceptor16 = null;
        retrofit.converter.Converter converter17 = null;
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Log log20 = null;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter22 = new retrofit.RestAdapter(server12, provider13, executor14, executor15, requestInterceptor16, converter17, profiler18, errorHandler19, log20, logLevel21);
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = restAdapter22.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.client.Response response26 = serializedObjectSupporter24.deserializeObjectResponse7();
        java.lang.String str27 = serializedObjectSupporter24.deserializeObjectString9();
        restAdapter22.serializedObjectSupporter = serializedObjectSupporter24;
        retrofit.ErrorHandler errorHandler29 = restAdapter22.geterrorHandler();
        retrofit.Server server30 = null;
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.RequestInterceptor requestInterceptor34 = null;
        retrofit.converter.Converter converter35 = null;
        retrofit.Profiler profiler36 = null;
        retrofit.ErrorHandler errorHandler37 = null;
        retrofit.RestAdapter.Log log38 = null;
        retrofit.RestAdapter.LogLevel logLevel39 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter40 = new retrofit.RestAdapter(server30, provider31, executor32, executor33, requestInterceptor34, converter35, profiler36, errorHandler37, log38, logLevel39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = restAdapter40.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server43 = serializedObjectSupporter42.deserializeObjectServer1();
        retrofit.client.Response response44 = serializedObjectSupporter42.deserializeObjectResponse7();
        java.lang.String str45 = serializedObjectSupporter42.deserializeObjectString9();
        restAdapter40.serializedObjectSupporter = serializedObjectSupporter42;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter40.logLevel = logLevel47;
        restAdapter22.setLogLevel(logLevel47);
        builder3.logLevel = logLevel47;
        retrofit.RestAdapter.Builder builder51 = builder0.setLogLevel(logLevel47);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter41);
        org.junit.Assert.assertNotNull(server43);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        java.lang.Class class8 = serializedObjectSupporter6.deserializeObjectClass1();
        retrofit.client.Response response9 = serializedObjectSupporter6.deserializeObjectResponse4();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.Class class11 = serializedObjectSupporter6.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter6.deserializeObjectConverter7();
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(requestInterceptor4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter22 = restAdapter10.converter;
        retrofit.client.Client.Provider provider23 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor24 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(executor24);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.Server server18 = restAdapter10.getserver();
        java.util.concurrent.Executor executor19 = restAdapter10.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter21 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(converter21);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.client.Response response21 = serializedObjectSupporter19.deserializeObjectResponse7();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter19.deserializeObjectConverter6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter19.deserializeObjectConverter6();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter26);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.RestAdapter restAdapter4 = builder0.build();
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = null;
        builder5.sethttpExecutor(executor6);
        retrofit.RestAdapter.Log log8 = null;
        builder5.log = log8;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        builder5.logLevel = logLevel10;
        restAdapter4.setLogLevel(logLevel10);
        retrofit.Profiler profiler13 = restAdapter4.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter4.getLogLevel();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(restAdapter4);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(server12);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider21 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter10.getLogLevel();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("Retrofit-");
        retrofit.Server server4 = null;
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.RequestInterceptor requestInterceptor8 = null;
        retrofit.converter.Converter converter9 = null;
        retrofit.Profiler profiler10 = null;
        retrofit.ErrorHandler errorHandler11 = null;
        retrofit.RestAdapter.Log log12 = null;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter14 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor8, converter9, profiler10, errorHandler11, log12, logLevel13);
        java.lang.String str15 = restAdapter14.getTHREAD_PREFIX();
        java.lang.String str16 = restAdapter14.getIDLE_THREAD_NAME();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        restAdapter14.logLevel = logLevel26;
        builder3.logLevel = logLevel26;
        java.util.concurrent.Executor executor30 = builder3.httpExecutor;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor30);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(requestInterceptor9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.String str32 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor33 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-Idle" + "'", str32, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor33);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.RequestInterceptor requestInterceptor18 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter19 = serializedObjectSupporter12.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(requestInterceptor18);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNotNull(serializedObjectSupporter19);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.Server server18 = null;
        retrofit.client.Client.Provider provider19 = null;
        java.util.concurrent.Executor executor20 = null;
        java.util.concurrent.Executor executor21 = null;
        retrofit.RequestInterceptor requestInterceptor22 = null;
        retrofit.converter.Converter converter23 = null;
        retrofit.Profiler profiler24 = null;
        retrofit.ErrorHandler errorHandler25 = null;
        retrofit.RestAdapter.Log log26 = null;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server18, provider19, executor20, executor21, requestInterceptor22, converter23, profiler24, errorHandler25, log26, logLevel27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = restAdapter28.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.client.Response response32 = serializedObjectSupporter30.deserializeObjectResponse7();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString9();
        restAdapter28.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter28.logLevel = logLevel35;
        restAdapter10.setLogLevel(logLevel35);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter38;
        retrofit.converter.Converter converter40 = restAdapter10.converter;
        int int41 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server42 = restAdapter10.getserver();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4000 + "'", int41 == 4000);
        org.junit.Assert.assertNull(server42);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str9 = response8.reason;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OK" + "'", str9, "OK");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.Server server19 = null;
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.RequestInterceptor requestInterceptor23 = null;
        retrofit.converter.Converter converter24 = null;
        retrofit.Profiler profiler25 = null;
        retrofit.ErrorHandler errorHandler26 = null;
        retrofit.RestAdapter.Log log27 = null;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter29 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor23, converter24, profiler25, errorHandler26, log27, logLevel28);
        java.lang.String str30 = restAdapter29.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor31 = restAdapter29.callbackExecutor;
        int int32 = restAdapter29.getLOG_CHUNK_SIZE();
        retrofit.Server server33 = restAdapter29.server;
        retrofit.RestAdapter.LogLevel logLevel34 = restAdapter29.logLevel;
        retrofit.RestAdapter.LogLevel logLevel35 = restAdapter29.logLevel;
        restAdapter10.logLevel = logLevel35;
        retrofit.converter.Converter converter37 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-" + "'", str30, "Retrofit-");
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4000 + "'", int32 == 4000);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter37);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter27.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler33 = restAdapter27.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter27.setLogLevel(logLevel34);
        restAdapter10.logLevel = logLevel34;
        retrofit.ErrorHandler errorHandler37 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler38 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler39 = restAdapter10.geterrorHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor41 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor42 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(requestInterceptor32);
        org.junit.Assert.assertNull(errorHandler33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler37);
        org.junit.Assert.assertNull(errorHandler38);
        org.junit.Assert.assertNull(errorHandler39);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNull(executor42);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString3();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString8();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString6();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.Server server6 = builder0.server;
        retrofit.Profiler profiler7 = builder0.profiler;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(server6);
        org.junit.Assert.assertNull(profiler7);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = null;
        builder5.sethttpExecutor(executor6);
        retrofit.RestAdapter.Log log8 = null;
        builder5.log = log8;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        builder5.logLevel = logLevel10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder15 = builder12.setServer(server14);
        retrofit.RestAdapter restAdapter16 = builder12.build();
        java.util.concurrent.Executor executor17 = builder12.getcallbackExecutor();
        builder5.httpExecutor = executor17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = null;
        builder19.sethttpExecutor(executor20);
        retrofit.RestAdapter.Log log22 = null;
        builder19.log = log22;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.FULL;
        builder19.logLevel = logLevel24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server28 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder26.setServer(server28);
        retrofit.RestAdapter restAdapter30 = builder26.build();
        java.util.concurrent.Executor executor31 = builder26.getcallbackExecutor();
        builder19.httpExecutor = executor31;
        retrofit.RestAdapter.Builder builder33 = builder0.setExecutors(executor17, executor31);
        retrofit.Profiler profiler34 = null;
        builder0.profiler = profiler34;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(restAdapter16);
        org.junit.Assert.assertNotNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(restAdapter30);
        org.junit.Assert.assertNotNull(executor31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString8();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString5();
        retrofit.client.Response response19 = serializedObjectSupporter12.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter12.deserializeObjectConverter3();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(gsonConverter20);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder5 = builder3.setLogLevel(logLevel4);
        retrofit.converter.Converter converter6 = builder5.converter;
        retrofit.Server server7 = builder5.server;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(server7);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str20 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.Server server8 = builder0.server;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.util.concurrent.Executor executor11 = builder0.gethttpExecutor();
        retrofit.ErrorHandler errorHandler12 = builder0.errorHandler;
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(errorHandler12);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        retrofit.RestAdapter restAdapter4 = builder0.build();
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor6 = builder0.gethttpExecutor();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(restAdapter4);
        org.junit.Assert.assertNotNull(executor5);
        org.junit.Assert.assertNotNull(executor6);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.Server server32 = restAdapter27.server;
        retrofit.ErrorHandler errorHandler33 = restAdapter27.geterrorHandler();
        java.util.concurrent.Executor executor34 = restAdapter27.httpExecutor;
        retrofit.Server server35 = restAdapter27.server;
        retrofit.RestAdapter.LogLevel logLevel36 = restAdapter27.logLevel;
        restAdapter10.logLevel = logLevel36;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(server32);
        org.junit.Assert.assertNull(errorHandler33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNull(server35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse7();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse4();
        java.lang.String str22 = response21.getReason();
        java.lang.String str23 = response21.reason;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response25 = restAdapter10.logAndReplaceResponse("OK", response21, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OK" + "'", str22, "OK");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OK" + "'", str23, "OK");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.getLogLevel();
        java.lang.String str22 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel23 = restAdapter10.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-" + "'", str22, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.Server server15 = restAdapter10.server;
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.Server server20 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(server20);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter20 = restAdapter10.converter;
        retrofit.Profiler profiler21 = restAdapter10.getprofiler();
        retrofit.Profiler profiler22 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(profiler22);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "Retrofit-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = response3.reason;
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        java.lang.String str6 = response3.reason;
        java.util.List<retrofit.client.Header> headerList7 = response3.getHeaders();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response10 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        restAdapter10.logLevel = logLevel22;
        retrofit.ErrorHandler errorHandler25 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor26 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider27 = restAdapter10.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(provider27);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        log2.log("hi!");
        retrofit.RestAdapter.Builder builder5 = builder0.setLog(log2);
        log2.log("");
        log2.log("hi!");
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder5 = builder0.setLogLevel(logLevel4);
        retrofit.Server server6 = builder0.server;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider2 = null;
        builder0.setclientProvider(provider2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        java.lang.Class class8 = serializedObjectSupporter6.deserializeObjectClass1();
        retrofit.client.Response response9 = serializedObjectSupporter6.deserializeObjectResponse3();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString4();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.Converter converter13 = builder0.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter14 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        retrofit.Server server8 = builder0.server;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter11 = builder10.converter;
        retrofit.RestAdapter.Builder builder13 = builder10.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder15 = builder10.setLogLevel(logLevel14);
        retrofit.RestAdapter.Builder builder16 = builder0.setLogLevel(logLevel14);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer(server5);
        retrofit.RestAdapter.Builder builder7 = builder0.setServer(server5);
        retrofit.RequestInterceptor requestInterceptor8 = builder0.requestInterceptor;
        retrofit.Profiler profiler9 = builder0.profiler;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNull(profiler9);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server15 = restAdapter10.server;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        restAdapter10.logLevel = logLevel24;
        retrofit.Server server27 = restAdapter10.getserver();
        retrofit.Server server28 = null;
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.RequestInterceptor requestInterceptor32 = null;
        retrofit.converter.Converter converter33 = null;
        retrofit.Profiler profiler34 = null;
        retrofit.ErrorHandler errorHandler35 = null;
        retrofit.RestAdapter.Log log36 = null;
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter38 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor32, converter33, profiler34, errorHandler35, log36, logLevel37);
        retrofit.converter.Converter converter39 = restAdapter38.converter;
        java.util.concurrent.Executor executor40 = restAdapter38.callbackExecutor;
        retrofit.RestAdapter.Log log41 = restAdapter38.log;
        java.util.concurrent.Executor executor42 = restAdapter38.gethttpExecutor();
        retrofit.Server server43 = null;
        retrofit.client.Client.Provider provider44 = null;
        java.util.concurrent.Executor executor45 = null;
        java.util.concurrent.Executor executor46 = null;
        retrofit.RequestInterceptor requestInterceptor47 = null;
        retrofit.converter.Converter converter48 = null;
        retrofit.Profiler profiler49 = null;
        retrofit.ErrorHandler errorHandler50 = null;
        retrofit.RestAdapter.Log log51 = null;
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter53 = new retrofit.RestAdapter(server43, provider44, executor45, executor46, requestInterceptor47, converter48, profiler49, errorHandler50, log51, logLevel52);
        restAdapter38.logLevel = logLevel52;
        boolean boolean55 = logLevel52.log();
        restAdapter10.setLogLevel(logLevel52);
        boolean boolean57 = logLevel52.log();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter39);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNull(log41);
        org.junit.Assert.assertNull(executor42);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter22 = restAdapter10.converter;
        retrofit.client.Client.Provider provider23 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter24 = restAdapter10.getconverter();
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
        retrofit.RestAdapter.Log log33 = null;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log33, logLevel34);
        int int36 = restAdapter35.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler37 = restAdapter35.errorHandler;
        retrofit.Server server38 = null;
        retrofit.client.Client.Provider provider39 = null;
        java.util.concurrent.Executor executor40 = null;
        java.util.concurrent.Executor executor41 = null;
        retrofit.RequestInterceptor requestInterceptor42 = null;
        retrofit.converter.Converter converter43 = null;
        retrofit.Profiler profiler44 = null;
        retrofit.ErrorHandler errorHandler45 = null;
        retrofit.RestAdapter.Log log46 = null;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server38, provider39, executor40, executor41, requestInterceptor42, converter43, profiler44, errorHandler45, log46, logLevel47);
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = restAdapter48.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server51 = serializedObjectSupporter50.deserializeObjectServer1();
        retrofit.client.Response response52 = serializedObjectSupporter50.deserializeObjectResponse7();
        java.lang.String str53 = serializedObjectSupporter50.deserializeObjectString9();
        restAdapter48.serializedObjectSupporter = serializedObjectSupporter50;
        restAdapter35.serializedObjectSupporter = serializedObjectSupporter50;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter50;
        java.util.concurrent.Executor executor57 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4000 + "'", int36 == 4000);
        org.junit.Assert.assertNull(errorHandler37);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter49);
        org.junit.Assert.assertNotNull(server51);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNull(executor57);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter10.getserver();
        java.util.concurrent.Executor executor34 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel35 = restAdapter10.logLevel;
        retrofit.Server server36 = null;
        retrofit.client.Client.Provider provider37 = null;
        java.util.concurrent.Executor executor38 = null;
        java.util.concurrent.Executor executor39 = null;
        retrofit.RequestInterceptor requestInterceptor40 = null;
        retrofit.converter.Converter converter41 = null;
        retrofit.Profiler profiler42 = null;
        retrofit.ErrorHandler errorHandler43 = null;
        retrofit.RestAdapter.Log log44 = null;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server36, provider37, executor38, executor39, requestInterceptor40, converter41, profiler42, errorHandler43, log44, logLevel45);
        retrofit.converter.Converter converter47 = restAdapter46.converter;
        java.util.concurrent.Executor executor48 = restAdapter46.callbackExecutor;
        retrofit.RestAdapter.Log log49 = restAdapter46.log;
        java.util.concurrent.Executor executor50 = restAdapter46.getcallbackExecutor();
        retrofit.Server server51 = restAdapter46.server;
        retrofit.ErrorHandler errorHandler52 = restAdapter46.geterrorHandler();
        java.util.concurrent.Executor executor53 = restAdapter46.httpExecutor;
        retrofit.Server server54 = restAdapter46.server;
        retrofit.RestAdapter.LogLevel logLevel55 = restAdapter46.logLevel;
        restAdapter10.logLevel = logLevel55;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter47);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNull(log49);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNull(server51);
        org.junit.Assert.assertNull(errorHandler52);
        org.junit.Assert.assertNull(executor53);
        org.junit.Assert.assertNull(server54);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = null;
        builder12.sethttpExecutor(executor13);
        retrofit.RestAdapter.Log log15 = null;
        builder12.log = log15;
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel17;
        restAdapter10.logLevel = logLevel17;
        java.lang.String str20 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(errorHandler22);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder10 = builder7.setServer(server9);
        retrofit.RestAdapter restAdapter11 = builder7.build();
        java.util.concurrent.Executor executor12 = builder7.getcallbackExecutor();
        builder0.httpExecutor = executor12;
        retrofit.Profiler profiler14 = null;
        builder0.profiler = profiler14;
        retrofit.RestAdapter.LogLevel logLevel16 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(restAdapter11);
        org.junit.Assert.assertNotNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.Server server15 = restAdapter10.server;
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.Server server19 = restAdapter10.server;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(server19);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Server server17 = restAdapter10.server;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.Server server19 = null;
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.RequestInterceptor requestInterceptor23 = null;
        retrofit.converter.Converter converter24 = null;
        retrofit.Profiler profiler25 = null;
        retrofit.ErrorHandler errorHandler26 = null;
        retrofit.RestAdapter.Log log27 = null;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter29 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor23, converter24, profiler25, errorHandler26, log27, logLevel28);
        retrofit.converter.Converter converter30 = restAdapter29.converter;
        java.util.concurrent.Executor executor31 = restAdapter29.callbackExecutor;
        retrofit.RestAdapter.Log log32 = restAdapter29.log;
        retrofit.Server server33 = null;
        retrofit.client.Client.Provider provider34 = null;
        java.util.concurrent.Executor executor35 = null;
        java.util.concurrent.Executor executor36 = null;
        retrofit.RequestInterceptor requestInterceptor37 = null;
        retrofit.converter.Converter converter38 = null;
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Log log41 = null;
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter43 = new retrofit.RestAdapter(server33, provider34, executor35, executor36, requestInterceptor37, converter38, profiler39, errorHandler40, log41, logLevel42);
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = restAdapter43.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server46 = serializedObjectSupporter45.deserializeObjectServer1();
        retrofit.client.Response response47 = serializedObjectSupporter45.deserializeObjectResponse7();
        java.lang.String str48 = serializedObjectSupporter45.deserializeObjectString9();
        restAdapter43.serializedObjectSupporter = serializedObjectSupporter45;
        restAdapter29.serializedObjectSupporter = serializedObjectSupporter45;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = restAdapter29.serializedObjectSupporter;
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter51;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter54 = serializedObjectSupporter51.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(log32);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter44);
        org.junit.Assert.assertNotNull(server46);
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Retrofit-Idle" + "'", str52, "Retrofit-Idle");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Server server14 = restAdapter10.getserver();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.Server server17 = restAdapter10.server;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.client.Response response32 = serializedObjectSupporter26.deserializeObjectResponse4();
        retrofit.client.Response response33 = serializedObjectSupporter26.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = serializedObjectSupporter26.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.Server server19 = restAdapter10.getserver();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(server19);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.Server server21 = null;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        retrofit.converter.Converter converter26 = null;
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Log log29 = null;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor25, converter26, profiler27, errorHandler28, log29, logLevel30);
        retrofit.converter.Converter converter32 = restAdapter31.converter;
        java.util.concurrent.Executor executor33 = restAdapter31.callbackExecutor;
        retrofit.RestAdapter.Log log34 = restAdapter31.log;
        java.util.concurrent.Executor executor35 = restAdapter31.getcallbackExecutor();
        int int36 = restAdapter31.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor37 = restAdapter31.callbackExecutor;
        java.lang.String str38 = restAdapter31.getTHREAD_PREFIX();
        retrofit.Profiler profiler39 = restAdapter31.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel40 = restAdapter31.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel41 = restAdapter31.getLogLevel();
        restAdapter10.setLogLevel(logLevel41);
        java.util.concurrent.Executor executor43 = restAdapter10.callbackExecutor;
        retrofit.Server server44 = null;
        retrofit.client.Client.Provider provider45 = null;
        java.util.concurrent.Executor executor46 = null;
        java.util.concurrent.Executor executor47 = null;
        retrofit.RequestInterceptor requestInterceptor48 = null;
        retrofit.converter.Converter converter49 = null;
        retrofit.Profiler profiler50 = null;
        retrofit.ErrorHandler errorHandler51 = null;
        retrofit.RestAdapter.Log log52 = null;
        retrofit.RestAdapter.LogLevel logLevel53 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter54 = new retrofit.RestAdapter(server44, provider45, executor46, executor47, requestInterceptor48, converter49, profiler50, errorHandler51, log52, logLevel53);
        java.lang.String str55 = restAdapter54.getTHREAD_PREFIX();
        java.lang.String str56 = restAdapter54.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler57 = restAdapter54.errorHandler;
        java.util.concurrent.Executor executor58 = restAdapter54.gethttpExecutor();
        retrofit.Server server59 = restAdapter54.getserver();
        retrofit.RestAdapter.LogLevel logLevel60 = restAdapter54.logLevel;
        java.util.concurrent.Executor executor61 = restAdapter54.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel62 = restAdapter54.logLevel;
        restAdapter10.logLevel = logLevel62;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(log34);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4000 + "'", int36 == 4000);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Retrofit-" + "'", str38, "Retrofit-");
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Retrofit-" + "'", str55, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Retrofit-Idle" + "'", str56, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler57);
        org.junit.Assert.assertNull(executor58);
        org.junit.Assert.assertNull(server59);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor61);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        restAdapter10.logLevel = logLevel24;
        retrofit.Server server27 = restAdapter10.getserver();
        retrofit.Profiler profiler28 = restAdapter10.getprofiler();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNull(profiler28);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.LogLevel logLevel2 = builder0.logLevel;
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.client.Client.Provider provider5 = builder0.clientProvider;
        retrofit.converter.Converter converter6 = null;
        builder0.converter = converter6;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        restAdapter10.logLevel = logLevel15;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.converter.Converter converter28 = restAdapter27.converter;
        java.util.concurrent.Executor executor29 = restAdapter27.callbackExecutor;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.util.concurrent.Executor executor31 = restAdapter27.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor32 = restAdapter27.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler33 = restAdapter27.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter27.setLogLevel(logLevel34);
        restAdapter10.logLevel = logLevel34;
        retrofit.ErrorHandler errorHandler37 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler38 = restAdapter10.errorHandler;
        retrofit.Server server39 = null;
        retrofit.client.Client.Provider provider40 = null;
        java.util.concurrent.Executor executor41 = null;
        java.util.concurrent.Executor executor42 = null;
        retrofit.RequestInterceptor requestInterceptor43 = null;
        retrofit.converter.Converter converter44 = null;
        retrofit.Profiler profiler45 = null;
        retrofit.ErrorHandler errorHandler46 = null;
        retrofit.RestAdapter.Log log47 = null;
        retrofit.RestAdapter.LogLevel logLevel48 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter49 = new retrofit.RestAdapter(server39, provider40, executor41, executor42, requestInterceptor43, converter44, profiler45, errorHandler46, log47, logLevel48);
        retrofit.converter.Converter converter50 = restAdapter49.converter;
        java.util.concurrent.Executor executor51 = restAdapter49.callbackExecutor;
        retrofit.ErrorHandler errorHandler52 = restAdapter49.errorHandler;
        retrofit.client.Client.Provider provider53 = restAdapter49.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel54 = restAdapter49.getLogLevel();
        restAdapter10.logLevel = logLevel54;
        boolean boolean56 = logLevel54.log();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(requestInterceptor32);
        org.junit.Assert.assertNull(errorHandler33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler37);
        org.junit.Assert.assertNull(errorHandler38);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter50);
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertNull(errorHandler52);
        org.junit.Assert.assertNull(provider53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = restAdapter24.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse7();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString9();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter26;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.client.Response response32 = serializedObjectSupporter26.deserializeObjectResponse4();
        retrofit.client.Response response33 = serializedObjectSupporter26.deserializeObjectResponse1();
        java.lang.String str34 = serializedObjectSupporter26.deserializeObjectString1();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Retrofit-" + "'", str34, "Retrofit-");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel16 = null;
        restAdapter10.setLogLevel(logLevel16);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter23.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString9();
        restAdapter23.serializedObjectSupporter = serializedObjectSupporter25;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.Log log31 = restAdapter10.log;
        java.util.concurrent.Executor executor32 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNull(log31);
        org.junit.Assert.assertNull(executor32);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter18 = builder17.converter;
        retrofit.client.Client.Provider provider19 = builder17.getclientProvider();
        java.util.concurrent.Executor executor20 = builder17.gethttpExecutor();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server23 = serializedObjectSupporter22.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder24 = builder21.setServer(server23);
        retrofit.RestAdapter restAdapter25 = builder21.build();
        java.util.concurrent.Executor executor26 = builder21.getcallbackExecutor();
        builder17.setcallbackExecutor(executor26);
        retrofit.Server server28 = null;
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.RequestInterceptor requestInterceptor32 = null;
        retrofit.converter.Converter converter33 = null;
        retrofit.Profiler profiler34 = null;
        retrofit.ErrorHandler errorHandler35 = null;
        retrofit.RestAdapter.Log log36 = null;
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter38 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor32, converter33, profiler34, errorHandler35, log36, logLevel37);
        retrofit.converter.Converter converter39 = restAdapter38.converter;
        java.util.concurrent.Executor executor40 = restAdapter38.callbackExecutor;
        retrofit.RestAdapter.Log log41 = restAdapter38.log;
        java.util.concurrent.Executor executor42 = restAdapter38.getcallbackExecutor();
        int int43 = restAdapter38.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor44 = restAdapter38.callbackExecutor;
        java.lang.String str45 = restAdapter38.getIDLE_THREAD_NAME();
        retrofit.Server server46 = null;
        retrofit.client.Client.Provider provider47 = null;
        java.util.concurrent.Executor executor48 = null;
        java.util.concurrent.Executor executor49 = null;
        retrofit.RequestInterceptor requestInterceptor50 = null;
        retrofit.converter.Converter converter51 = null;
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Log log54 = null;
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter56 = new retrofit.RestAdapter(server46, provider47, executor48, executor49, requestInterceptor50, converter51, profiler52, errorHandler53, log54, logLevel55);
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = restAdapter56.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server59 = serializedObjectSupporter58.deserializeObjectServer1();
        retrofit.client.Response response60 = serializedObjectSupporter58.deserializeObjectResponse7();
        java.lang.String str61 = serializedObjectSupporter58.deserializeObjectString9();
        restAdapter56.serializedObjectSupporter = serializedObjectSupporter58;
        retrofit.ErrorHandler errorHandler63 = restAdapter56.geterrorHandler();
        retrofit.Server server64 = null;
        retrofit.client.Client.Provider provider65 = null;
        java.util.concurrent.Executor executor66 = null;
        java.util.concurrent.Executor executor67 = null;
        retrofit.RequestInterceptor requestInterceptor68 = null;
        retrofit.converter.Converter converter69 = null;
        retrofit.Profiler profiler70 = null;
        retrofit.ErrorHandler errorHandler71 = null;
        retrofit.RestAdapter.Log log72 = null;
        retrofit.RestAdapter.LogLevel logLevel73 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter74 = new retrofit.RestAdapter(server64, provider65, executor66, executor67, requestInterceptor68, converter69, profiler70, errorHandler71, log72, logLevel73);
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = restAdapter74.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server77 = serializedObjectSupporter76.deserializeObjectServer1();
        retrofit.client.Response response78 = serializedObjectSupporter76.deserializeObjectResponse7();
        java.lang.String str79 = serializedObjectSupporter76.deserializeObjectString9();
        restAdapter74.serializedObjectSupporter = serializedObjectSupporter76;
        retrofit.RestAdapter.LogLevel logLevel81 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter74.logLevel = logLevel81;
        restAdapter56.setLogLevel(logLevel81);
        restAdapter38.logLevel = logLevel81;
        builder17.logLevel = logLevel81;
        restAdapter10.logLevel = logLevel81;
        retrofit.Profiler profiler87 = restAdapter10.profiler;
        retrofit.converter.Converter converter88 = restAdapter10.getconverter();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(restAdapter25);
        org.junit.Assert.assertNotNull(executor26);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter39);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNull(log41);
        org.junit.Assert.assertNull(executor42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4000 + "'", int43 == 4000);
        org.junit.Assert.assertNull(executor44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Retrofit-Idle" + "'", str45, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter57);
        org.junit.Assert.assertNotNull(server59);
        org.junit.Assert.assertNotNull(response60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "http://example.com/" + "'", str61, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler63);
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter75);
        org.junit.Assert.assertNotNull(server77);
        org.junit.Assert.assertNotNull(response78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "http://example.com/" + "'", str79, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel81 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel81.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler87);
        org.junit.Assert.assertNull(converter88);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString9();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.client.Response response17 = serializedObjectSupporter12.deserializeObjectResponse3();
        int int18 = response17.getStatus();
        java.lang.Class<?> wildcardClass19 = response17.getClass();
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.String str11 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.Log log2 = retrofit.RestAdapter.Log.NONE;
        log2.log("hi!");
        retrofit.RestAdapter.Builder builder5 = builder0.setLog(log2);
        java.util.concurrent.Executor executor6 = builder5.getcallbackExecutor();
        retrofit.converter.Converter converter7 = builder5.converter;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter9 = builder8.converter;
        retrofit.RestAdapter.Builder builder11 = builder8.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder13 = builder8.setLogLevel(logLevel12);
        retrofit.Profiler profiler14 = null;
        builder13.profiler = profiler14;
        java.util.concurrent.Executor executor16 = builder13.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = builder13.requestInterceptor;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = null;
        builder18.sethttpExecutor(executor19);
        retrofit.RestAdapter.Log log21 = null;
        builder18.log = log21;
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.FULL;
        builder18.logLevel = logLevel23;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder28 = builder25.setServer(server27);
        retrofit.RestAdapter restAdapter29 = builder25.build();
        java.util.concurrent.Executor executor30 = builder25.getcallbackExecutor();
        builder18.httpExecutor = executor30;
        builder13.sethttpExecutor(executor30);
        builder5.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder35 = builder5.setServer("hi!");
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(restAdapter29);
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNotNull(builder35);
    }
}

