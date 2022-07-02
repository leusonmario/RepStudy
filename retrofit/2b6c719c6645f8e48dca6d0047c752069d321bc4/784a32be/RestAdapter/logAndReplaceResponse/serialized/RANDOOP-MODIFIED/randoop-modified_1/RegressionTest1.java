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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor16);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.Server server16 = restAdapter10.server;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.lang.String str18 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor19);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(response6);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Request request18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(errorHandler15);
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
        retrofit.RestAdapter.Log log11 = restAdapter10.log;
        retrofit.Profiler profiler12 = restAdapter10.profiler;
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNull(profiler12);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        java.util.concurrent.Executor executor9 = null;
        builder8.sethttpExecutor(executor9);
        retrofit.RestAdapter.Log log11 = builder8.log;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(log11);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter6;
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
        java.util.concurrent.Executor executor19 = restAdapter18.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter18.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.mime.TypedString typedString23 = serializedObjectSupporter21.deserializeObjectTypedInput1();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString8();
        restHandler20.serializedObjectSupporter = serializedObjectSupporter21;
        java.lang.String str26 = serializedObjectSupporter21.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter21.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler28 = serializedObjectSupporter21.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder29 = builder0.setErrorHandler(errorHandler28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        builder29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString6();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter30.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter37);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder8 = builder0.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel10 = builder0.logLevel;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder7.requestInterceptor = requestInterceptor8;
        java.util.concurrent.Executor executor10 = null;
        builder7.callbackExecutor = executor10;
        retrofit.RestAdapter.Builder builder13 = builder7.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.Builder builder18 = builder13.setServer(server16);
        java.util.concurrent.Executor executor19 = builder18.httpExecutor;
        java.util.concurrent.Executor executor20 = null;
        builder18.callbackExecutor = executor20;
        retrofit.Server server22 = builder18.server;
        builder0.server = server22;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.Log log9 = builder0.log;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(log9);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.Profiler profiler10 = builder0.profiler;
        java.util.concurrent.Executor executor11 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(executor11);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log18 = restAdapter10.log;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(log18);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter8();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString7();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor17);
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
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
        java.util.concurrent.Executor executor25 = restAdapter24.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        retrofit.RestAdapter.Log log27 = restAdapter24.log;
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter24.new RestHandler();
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor30 = null;
        builder29.requestInterceptor = requestInterceptor30;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = builder29.serializedObjectSupporter;
        retrofit.client.Client.Provider provider33 = null;
        builder29.clientProvider = provider33;
        retrofit.RestAdapter.LogLevel logLevel35 = builder29.logLevel;
        restAdapter24.logLevel = logLevel35;
        restAdapter10.logLevel = logLevel35;
        retrofit.Profiler profiler38 = restAdapter10.profiler;
        java.util.concurrent.Executor executor39 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler38);
        org.junit.Assert.assertNull(executor39);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(converter15);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter13.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter13.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter21 = serializedObjectSupporter13.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(errorHandler20);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        retrofit.Server server20 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(server20);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor19 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log12 = builder0.log;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log12);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse8();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse8();
        retrofit.mime.TypedInput typedInput21 = response20.getBody();
        int int22 = response20.getStatus();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(typedInput21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
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
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        retrofit.Server server12 = restAdapter10.getserver();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.callbackExecutor = executor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler15);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString1();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString11();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(requestInterceptor16);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(converter18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restHandler13.serializedObjectSupporter;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder8 = builder6.setServer("Retrofit-");
        builder6.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput5 = response4.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Forbidden" + "'", str3, "Forbidden");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(typedInput5);
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
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(profiler12);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput6 = response5.getBody();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(typedInput6);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response18 = serializedObjectSupporter17.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response20 = restAdapter10.logAndReplaceResponse("http://example.com/", response18, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(response18);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(logLevel20);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter27.new RestHandler();
        retrofit.client.Client.Provider provider29 = restAdapter27.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter27.logLevel = logLevel30;
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter27.getLogLevel();
        restAdapter10.logLevel = logLevel32;
        java.util.concurrent.Executor executor34 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor34);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
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
        java.util.concurrent.Executor executor25 = restAdapter24.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        retrofit.RestAdapter.Log log27 = restAdapter24.log;
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter24.new RestHandler();
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor30 = null;
        builder29.requestInterceptor = requestInterceptor30;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = builder29.serializedObjectSupporter;
        retrofit.client.Client.Provider provider33 = null;
        builder29.clientProvider = provider33;
        retrofit.RestAdapter.LogLevel logLevel35 = builder29.logLevel;
        restAdapter24.logLevel = logLevel35;
        restAdapter10.logLevel = logLevel35;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel38 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel38.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.Server server13 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.FULL;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.FULL));
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.Server server13 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(errorHandler14);
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
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(logLevel13);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(server14);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.lang.String str7 = serializedObjectSupporter1.deserializeObjectString1();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList2 = response1.headers;
        retrofit.mime.TypedInput typedInput3 = response1.body;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertNull(typedInput3);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(logLevel16);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        java.lang.String str19 = serializedObjectSupporter17.deserializeObjectString10();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        java.lang.String str22 = serializedObjectSupporter17.deserializeObjectString4();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Forbidden" + "'", str19, "Forbidden");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OK" + "'", str22, "OK");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse8();
        int int7 = response6.status;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
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
        java.util.concurrent.Executor executor27 = restAdapter26.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter26.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server30 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.mime.TypedString typedString31 = serializedObjectSupporter29.deserializeObjectTypedInput1();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString8();
        restHandler28.serializedObjectSupporter = serializedObjectSupporter29;
        java.lang.String str34 = serializedObjectSupporter29.deserializeObjectString13();
        java.lang.String str35 = serializedObjectSupporter29.deserializeObjectString1();
        restHandler15.serializedObjectSupporter = serializedObjectSupporter29;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(typedString31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-" + "'", str35, "Retrofit-");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter11 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.mime.TypedString typedString14 = serializedObjectSupporter12.deserializeObjectTypedInput1();
        retrofit.client.Response response15 = serializedObjectSupporter12.deserializeObjectResponse8();
        retrofit.ErrorHandler errorHandler16 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder17 = builder0.setErrorHandler(errorHandler16);
        retrofit.ErrorHandler errorHandler18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder19 = builder17.setErrorHandler(errorHandler18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(errorHandler16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(executor6);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        java.lang.String str19 = serializedObjectSupporter17.deserializeObjectString10();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor24 = null;
        builder23.requestInterceptor = requestInterceptor24;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = builder23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log27 = builder23.log;
        retrofit.RestAdapter.Log log28 = builder23.log;
        java.util.concurrent.Executor executor29 = builder23.gethttpExecutor();
        java.util.concurrent.Executor executor30 = builder23.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel31 = builder23.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Forbidden" + "'", str19, "Forbidden");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNull(serializedObjectSupporter26);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(log28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log18 = restAdapter10.log;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(log18);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        retrofit.mime.TypedString typedString5 = serializedObjectSupporter3.deserializeObjectTypedInput1();
        java.lang.String str6 = serializedObjectSupporter3.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter3.deserializeObjectConverter6();
        builder0.converter = gsonConverter7;
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(typedString5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Internal Server Error" + "'", str6, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        boolean boolean6 = logLevel4.log();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput2 = response1.getBody();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(typedInput2);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput4 = response3.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(typedInput4);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(errorHandler14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        retrofit.Server server13 = restAdapter10.server;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(requestInterceptor16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor11);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter10.requestInterceptor;
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
        java.util.concurrent.Executor executor33 = restAdapter32.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler34 = restAdapter32.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server36 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.mime.TypedString typedString37 = serializedObjectSupporter35.deserializeObjectTypedInput1();
        java.lang.String str38 = serializedObjectSupporter35.deserializeObjectString8();
        restHandler34.serializedObjectSupporter = serializedObjectSupporter35;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = restHandler34.serializedObjectSupporter;
        retrofit.client.Response response41 = serializedObjectSupporter40.deserializeObjectResponse8();
        java.util.List<retrofit.client.Header> headerList42 = response41.getHeaders();
        int int43 = response41.getStatus();
        int int44 = response41.getStatus();
        java.util.List<retrofit.client.Header> headerList45 = response41.headers;
        int int46 = response41.status;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response48 = restAdapter10.logAndReplaceResponse("", response41, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(requestInterceptor20);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNotNull(server36);
        org.junit.Assert.assertNotNull(typedString37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter40);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 200 + "'", int46 == 200);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.Server server19 = null;
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.RequestInterceptor requestInterceptor23 = null;
        retrofit.converter.Converter converter24 = null;
        retrofit.Profiler profiler25 = null;
        retrofit.ErrorHandler errorHandler26 = null;
        retrofit.RestAdapter.Log log27 = null;
        retrofit.RestAdapter.LogLevel logLevel28 = null;
        retrofit.RestAdapter restAdapter29 = new retrofit.RestAdapter(server19, provider20, executor21, executor22, requestInterceptor23, converter24, profiler25, errorHandler26, log27, logLevel28);
        retrofit.RestAdapter.RestHandler restHandler30 = restAdapter29.new RestHandler();
        retrofit.client.Client.Provider provider31 = restAdapter29.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restAdapter29.serializedObjectSupporter;
        retrofit.Server server33 = restAdapter29.getserver();
        retrofit.RequestInterceptor requestInterceptor34 = restAdapter29.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler35 = restAdapter29.new RestHandler();
        retrofit.Server server36 = null;
        retrofit.client.Client.Provider provider37 = null;
        java.util.concurrent.Executor executor38 = null;
        java.util.concurrent.Executor executor39 = null;
        retrofit.RequestInterceptor requestInterceptor40 = null;
        retrofit.converter.Converter converter41 = null;
        retrofit.Profiler profiler42 = null;
        retrofit.ErrorHandler errorHandler43 = null;
        retrofit.RestAdapter.Log log44 = null;
        retrofit.RestAdapter.LogLevel logLevel45 = null;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server36, provider37, executor38, executor39, requestInterceptor40, converter41, profiler42, errorHandler43, log44, logLevel45);
        java.util.concurrent.Executor executor47 = restAdapter46.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler48 = restAdapter46.new RestHandler();
        retrofit.RestAdapter.Log log49 = restAdapter46.log;
        retrofit.RestAdapter.RestHandler restHandler50 = restAdapter46.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter46.logLevel = logLevel51;
        restAdapter29.logLevel = logLevel51;
        boolean boolean54 = logLevel51.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertNull(requestInterceptor34);
        org.junit.Assert.assertNull(executor47);
        org.junit.Assert.assertNull(log49);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(errorHandler16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
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
        retrofit.RestAdapter.Log log11 = restAdapter10.log;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNull(log12);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse4();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString3();
        retrofit.client.Response response23 = serializedObjectSupporter18.deserializeObjectResponse4();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(response23);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
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
        retrofit.client.Client.Provider provider28 = restAdapter26.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = restAdapter26.serializedObjectSupporter;
        retrofit.client.Client.Provider provider30 = restAdapter26.getclientProvider();
        retrofit.Profiler profiler31 = restAdapter26.getprofiler();
        java.util.concurrent.Executor executor32 = restAdapter26.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter26.logLevel = logLevel33;
        restAdapter10.logLevel = logLevel33;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNull(provider30);
        org.junit.Assert.assertNull(profiler31);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.BASIC));
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse4();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString3();
        retrofit.client.Response response23 = serializedObjectSupporter18.deserializeObjectResponse2();
        java.lang.String str24 = serializedObjectSupporter18.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter25 = serializedObjectSupporter18.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler18 = restAdapter10.geterrorHandler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNull(converter19);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        java.lang.String str39 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel40;
        retrofit.converter.Converter converter42 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Retrofit-" + "'", str39, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter42);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.mime.TypedInput typedInput5 = response4.getBody();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(typedInput5);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput5 = response4.getBody();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(typedInput5);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections3 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.mime.TypedString typedString11 = serializedObjectSupporter9.deserializeObjectTypedInput1();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString13();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        retrofit.client.Response response14 = serializedObjectSupporter9.deserializeObjectResponse8();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter9.deserializeObjectConverter8();
        java.lang.String str17 = serializedObjectSupporter9.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter9.deserializeObjectConverter3();
        builder0.converter = gsonConverter18;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = builder0.serializedObjectSupporter;
        retrofit.Server server21 = null;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        retrofit.converter.Converter converter26 = null;
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Log log29 = null;
        retrofit.RestAdapter.LogLevel logLevel30 = null;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor25, converter26, profiler27, errorHandler28, log29, logLevel30);
        java.util.concurrent.Executor executor32 = restAdapter31.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter31.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor34 = restAdapter31.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler35 = restAdapter31.errorHandler;
        java.util.concurrent.Executor executor36 = restAdapter31.gethttpExecutor();
        retrofit.Profiler profiler37 = restAdapter31.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler38 = restAdapter31.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler39 = restAdapter31.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler40 = restAdapter31.new RestHandler();
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
        java.util.concurrent.Executor executor52 = restAdapter51.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler53 = restAdapter51.new RestHandler();
        retrofit.RestAdapter.Log log54 = restAdapter51.log;
        retrofit.RestAdapter.RestHandler restHandler55 = restAdapter51.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter51.logLevel = logLevel56;
        restAdapter31.logLevel = logLevel56;
        builder0.logLevel = logLevel56;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNotNull(typedString11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Forbidden" + "'", str17, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNull(requestInterceptor34);
        org.junit.Assert.assertNull(errorHandler35);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNull(profiler37);
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertNull(log54);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Forbidden" + "'", str5, "Forbidden");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse8();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(errorHandler20);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.RequestInterceptor requestInterceptor9 = builder8.requestInterceptor;
        retrofit.client.Client.Provider provider10 = builder8.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
        org.junit.Assert.assertNull(provider10);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(server15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel13;
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
        retrofit.RestAdapter.LogLevel logLevel25 = null;
        retrofit.RestAdapter restAdapter26 = new retrofit.RestAdapter(server16, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel25);
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter26.new RestHandler();
        retrofit.client.Client.Provider provider28 = restAdapter26.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter26.logLevel = logLevel29;
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter26.getLogLevel();
        restAdapter10.setLogLevel(logLevel31);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.mime.TypedString typedString21 = serializedObjectSupporter19.deserializeObjectTypedInput1();
        retrofit.client.Response response22 = serializedObjectSupporter19.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter2();
        builder18.serializedObjectSupporter = serializedObjectSupporter19;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.client.Response response26 = serializedObjectSupporter19.deserializeObjectResponse2();
        retrofit.RequestInterceptor requestInterceptor27 = serializedObjectSupporter19.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(typedString21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(requestInterceptor27);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        java.util.concurrent.Executor executor28 = restAdapter27.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter27.new RestHandler();
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        retrofit.RestAdapter.RestHandler restHandler31 = restAdapter27.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter27.logLevel = logLevel32;
        restAdapter10.logLevel = logLevel32;
        java.util.concurrent.Executor executor35 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor35);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        retrofit.converter.Converter converter8 = builder0.converter;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNull(provider9);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "Forbidden");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList6 = response5.headers;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Forbidden" + "'", str4, "Forbidden");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput4 = response3.getBody();
        java.util.List<retrofit.client.Header> headerList5 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList6 = response3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response8 = serializedObjectSupporter7.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter2();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString11();
        retrofit.mime.TypedString typedString11 = serializedObjectSupporter7.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response12 = new retrofit.client.Response(0, "Forbidden", headerList6, (retrofit.mime.TypedInput) typedString11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(typedInput4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString11);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.mime.TypedString typedString19 = serializedObjectSupporter17.deserializeObjectTypedInput1();
        retrofit.client.Response response20 = serializedObjectSupporter17.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter17.deserializeObjectConverter2();
        builder16.serializedObjectSupporter = serializedObjectSupporter17;
        restHandler15.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restHandler15.serializedObjectSupporter;
        retrofit.mime.TypedString typedString25 = serializedObjectSupporter24.deserializeObjectTypedInput1();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(typedString19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(typedString25);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.mime.TypedString typedString14 = serializedObjectSupporter12.deserializeObjectTypedInput1();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString13();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.client.Response response19 = serializedObjectSupporter17.deserializeObjectResponse8();
        java.lang.reflect.Method method20 = null;
        retrofit.Server server21 = null;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        retrofit.converter.Converter converter26 = null;
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Log log29 = null;
        retrofit.RestAdapter.LogLevel logLevel30 = null;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor25, converter26, profiler27, errorHandler28, log29, logLevel30);
        java.util.concurrent.Executor executor32 = restAdapter31.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter31.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server35 = serializedObjectSupporter34.deserializeObjectServer1();
        retrofit.mime.TypedString typedString36 = serializedObjectSupporter34.deserializeObjectTypedInput1();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString8();
        restHandler33.serializedObjectSupporter = serializedObjectSupporter34;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = restHandler33.serializedObjectSupporter;
        retrofit.client.Response response40 = serializedObjectSupporter39.deserializeObjectResponse8();
        java.util.List<retrofit.client.Header> headerList41 = response40.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server43 = serializedObjectSupporter42.deserializeObjectServer1();
        retrofit.client.Response response44 = serializedObjectSupporter42.deserializeObjectResponse4();
        retrofit.Server server45 = null;
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.RequestInterceptor requestInterceptor49 = null;
        retrofit.converter.Converter converter50 = null;
        retrofit.Profiler profiler51 = null;
        retrofit.ErrorHandler errorHandler52 = null;
        retrofit.RestAdapter.Log log53 = null;
        retrofit.RestAdapter.LogLevel logLevel54 = null;
        retrofit.RestAdapter restAdapter55 = new retrofit.RestAdapter(server45, provider46, executor47, executor48, requestInterceptor49, converter50, profiler51, errorHandler52, log53, logLevel54);
        retrofit.RestAdapter.RestHandler restHandler56 = restAdapter55.new RestHandler();
        retrofit.client.Client.Provider provider57 = restAdapter55.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter55.logLevel = logLevel58;
        retrofit.RestAdapter.RestHandler restHandler60 = restAdapter55.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server62 = serializedObjectSupporter61.deserializeObjectServer1();
        retrofit.mime.TypedString typedString63 = serializedObjectSupporter61.deserializeObjectTypedInput1();
        retrofit.client.Response response64 = serializedObjectSupporter61.deserializeObjectResponse8();
        retrofit.client.Response response65 = serializedObjectSupporter61.deserializeObjectResponse2();
        restHandler60.serializedObjectSupporter = serializedObjectSupporter61;
        java.lang.Object[] objArray67 = new java.lang.Object[] { headerList41, serializedObjectSupporter42, serializedObjectSupporter61 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = restHandler11.invoke((java.lang.Object) response19, method20, objArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertNotNull(typedString36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter39);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(server43);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNull(provider57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server62);
        org.junit.Assert.assertNotNull(typedString63);
        org.junit.Assert.assertNotNull(response64);
        org.junit.Assert.assertNotNull(response65);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder8.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler10 = builder8.errorHandler;
        retrofit.RestAdapter restAdapter11 = builder8.build();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(errorHandler10);
        org.junit.Assert.assertNotNull(restAdapter11);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.lang.Class<?> wildcardClass4 = server2.getClass();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter10 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Forbidden" + "'", str8, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter9);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(profiler18);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder8 = builder0.setConverter((retrofit.converter.Converter) gsonConverter7);
        java.util.concurrent.Executor executor9 = null;
        builder0.setcallbackExecutor(executor9);
        retrofit.client.Client client11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setClient(client11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder8.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler10 = builder8.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response12 = serializedObjectSupporter11.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter2();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString11();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter11.deserializeObjectTypedInput1();
        retrofit.ErrorHandler errorHandler16 = serializedObjectSupporter11.deserializeObjectErrorHandler1();
        builder8.errorHandler = errorHandler16;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.mime.TypedString typedString20 = serializedObjectSupporter18.deserializeObjectTypedInput1();
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter18.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler23 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        retrofit.ErrorHandler errorHandler24 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        builder8.errorHandler = errorHandler24;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(errorHandler10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertNotNull(errorHandler16);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(typedString20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(errorHandler23);
        org.junit.Assert.assertNotNull(errorHandler24);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server5 = serializedObjectSupporter4.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter4.deserializeObjectResponse4();
        java.lang.String str7 = response6.reason;
        java.util.List<retrofit.client.Header> headerList8 = response6.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.mime.TypedString typedString11 = serializedObjectSupporter9.deserializeObjectTypedInput1();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString13();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        retrofit.Server server14 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.client.Response response15 = serializedObjectSupporter9.deserializeObjectResponse8();
        retrofit.client.Response response16 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput17 = response16.body;
        retrofit.client.Response response18 = new retrofit.client.Response(200, "", headerList8, typedInput17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response20 = serializedObjectSupporter19.deserializeObjectResponse7();
        java.lang.String str21 = serializedObjectSupporter19.deserializeObjectString9();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString6();
        retrofit.mime.TypedString typedString23 = serializedObjectSupporter19.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response24 = new retrofit.client.Response(0, "OK", headerList8, (retrofit.mime.TypedInput) typedString23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNotNull(typedString11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(typedInput17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString23);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.mime.TypedString typedString21 = serializedObjectSupporter19.deserializeObjectTypedInput1();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString13();
        retrofit.client.Response response23 = serializedObjectSupporter19.deserializeObjectResponse3();
        retrofit.client.Response response24 = serializedObjectSupporter19.deserializeObjectResponse1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.RestAdapter.LogLevel logLevel26 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor27 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(typedString21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(logLevel26);
        org.junit.Assert.assertNull(requestInterceptor27);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        java.lang.String str19 = serializedObjectSupporter17.deserializeObjectString10();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.client.Response response22 = serializedObjectSupporter17.deserializeObjectResponse4();
        java.lang.String str23 = serializedObjectSupporter17.deserializeObjectString11();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Forbidden" + "'", str19, "Forbidden");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.converter.Converter converter13 = restAdapter10.getconverter();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString13();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(profiler19);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.Server server14 = restAdapter10.getserver();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter27.new RestHandler();
        retrofit.client.Client.Provider provider29 = restAdapter27.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter27.logLevel = logLevel30;
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter27.getLogLevel();
        restAdapter10.logLevel = logLevel32;
        retrofit.Server server34 = restAdapter10.server;
        java.lang.Throwable throwable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable35, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(server34);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(logLevel13);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Forbidden" + "'", str3, "Forbidden");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Request request20 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request21 = restAdapter10.logAndReplaceRequest(request20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(errorHandler2);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
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
        java.util.concurrent.Executor executor19 = restAdapter18.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter18.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.mime.TypedString typedString23 = serializedObjectSupporter21.deserializeObjectTypedInput1();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString8();
        restHandler20.serializedObjectSupporter = serializedObjectSupporter21;
        java.lang.String str26 = serializedObjectSupporter21.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter21.deserializeObjectConverter8();
        builder7.converter = gsonConverter27;
        retrofit.client.Client.Provider provider29 = builder7.getclientProvider();
        java.util.concurrent.Executor executor30 = builder7.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertNull(executor30);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.converter.Converter converter6 = builder0.converter;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder7.requestInterceptor = requestInterceptor8;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder7.serializedObjectSupporter;
        retrofit.RestAdapter.Log log11 = builder7.log;
        retrofit.RestAdapter.Log log12 = builder7.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder15 = builder7.setServer(server14);
        java.util.concurrent.Executor executor16 = null;
        builder15.sethttpExecutor(executor16);
        retrofit.RestAdapter.LogLevel logLevel18 = builder15.logLevel;
        builder0.logLevel = logLevel18;
        retrofit.ErrorHandler errorHandler20 = builder0.errorHandler;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler20);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.getclientProvider();
        retrofit.Server server2 = builder0.server;
        retrofit.Server server3 = null;
        retrofit.client.Client.Provider provider4 = null;
        java.util.concurrent.Executor executor5 = null;
        java.util.concurrent.Executor executor6 = null;
        retrofit.RequestInterceptor requestInterceptor7 = null;
        retrofit.converter.Converter converter8 = null;
        retrofit.Profiler profiler9 = null;
        retrofit.ErrorHandler errorHandler10 = null;
        retrofit.RestAdapter.Log log11 = null;
        retrofit.RestAdapter.LogLevel logLevel12 = null;
        retrofit.RestAdapter restAdapter13 = new retrofit.RestAdapter(server3, provider4, executor5, executor6, requestInterceptor7, converter8, profiler9, errorHandler10, log11, logLevel12);
        java.util.concurrent.Executor executor14 = restAdapter13.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter13.new RestHandler();
        retrofit.RestAdapter.Log log16 = restAdapter13.log;
        retrofit.Profiler profiler17 = restAdapter13.profiler;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter13.new RestHandler();
        retrofit.client.Client.Provider provider19 = restAdapter13.clientProvider;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler21 = builder20.errorHandler;
        java.util.concurrent.Executor executor22 = null;
        builder20.sethttpExecutor(executor22);
        retrofit.client.Client.Provider provider24 = builder20.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response26 = serializedObjectSupporter25.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder28 = builder20.setConverter((retrofit.converter.Converter) gsonConverter27);
        retrofit.ErrorHandler errorHandler29 = builder20.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel30 = builder20.logLevel;
        restAdapter13.logLevel = logLevel30;
        boolean boolean32 = logLevel30.log();
        retrofit.RestAdapter.Builder builder33 = builder0.setLogLevel(logLevel30);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString13();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Forbidden" + "'", str3, "Forbidden");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(logLevel18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(executor20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        java.lang.String str19 = serializedObjectSupporter17.deserializeObjectString10();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor24 = null;
        builder23.requestInterceptor = requestInterceptor24;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = builder23.serializedObjectSupporter;
        retrofit.RestAdapter.Log log27 = builder23.log;
        retrofit.RestAdapter.Log log28 = builder23.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server30 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder31 = builder23.setServer(server30);
        java.util.concurrent.Executor executor32 = builder23.getcallbackExecutor();
        java.lang.reflect.Method method33 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = restHandler22.invoke((java.lang.Object) executor32, method33, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Forbidden" + "'", str19, "Forbidden");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNull(serializedObjectSupporter26);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(log28);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler39 = restAdapter10.getprofiler();
        retrofit.Server server40 = restAdapter10.getserver();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertNull(server40);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        int int6 = response5.status;
        java.lang.String str7 = response5.reason;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
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
        java.util.concurrent.Executor executor25 = restAdapter24.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server28 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.mime.TypedString typedString29 = serializedObjectSupporter27.deserializeObjectTypedInput1();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString8();
        restHandler26.serializedObjectSupporter = serializedObjectSupporter27;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = restHandler26.serializedObjectSupporter;
        retrofit.client.Response response33 = serializedObjectSupporter32.deserializeObjectResponse7();
        java.lang.String str34 = serializedObjectSupporter32.deserializeObjectString11();
        retrofit.client.Response response35 = serializedObjectSupporter32.deserializeObjectResponse4();
        retrofit.client.Response response36 = serializedObjectSupporter32.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response38 = restAdapter10.logAndReplaceResponse("hi!", response36, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(typedString29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.Profiler profiler9 = builder8.profiler;
        retrofit.client.Client.Provider provider10 = builder8.clientProvider;
        retrofit.RestAdapter.Builder builder12 = builder8.setServer("Forbidden");
        retrofit.RestAdapter.Log log13 = builder12.log;
        retrofit.RestAdapter restAdapter14 = builder12.build();
        retrofit.Server server15 = restAdapter14.getserver();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNotNull(restAdapter14);
        org.junit.Assert.assertNotNull(server15);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(executor11);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.RestAdapter.RestHandler restHandler28 = restAdapter27.new RestHandler();
        retrofit.client.Client.Provider provider29 = restAdapter27.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = restAdapter27.serializedObjectSupporter;
        retrofit.client.Client.Provider provider31 = restAdapter27.getclientProvider();
        retrofit.Profiler profiler32 = restAdapter27.getprofiler();
        java.util.concurrent.Executor executor33 = restAdapter27.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor34 = restAdapter27.requestInterceptor;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server48 = serializedObjectSupporter47.deserializeObjectServer1();
        retrofit.mime.TypedString typedString49 = serializedObjectSupporter47.deserializeObjectTypedInput1();
        java.lang.String str50 = serializedObjectSupporter47.deserializeObjectString13();
        restHandler46.serializedObjectSupporter = serializedObjectSupporter47;
        java.lang.String str52 = serializedObjectSupporter47.deserializeObjectString3();
        java.lang.String str53 = serializedObjectSupporter47.deserializeObjectString2();
        restAdapter27.serializedObjectSupporter = serializedObjectSupporter47;
        retrofit.client.Response response55 = serializedObjectSupporter47.deserializeObjectResponse3();
        int int56 = response55.status;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response58 = restAdapter10.logAndReplaceResponse("OK", response55, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertNull(serializedObjectSupporter30);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNull(profiler32);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(requestInterceptor34);
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertNotNull(typedString49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Retrofit-Idle" + "'", str53, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.Server server20 = restAdapter10.getserver();
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor23 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(server20);
        org.junit.Assert.assertNull(logLevel21);
        org.junit.Assert.assertNull(requestInterceptor23);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int6 = response5.getStatus();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.Profiler profiler9 = builder8.profiler;
        retrofit.client.Client.Provider provider10 = builder8.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder8.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.mime.TypedString typedString19 = serializedObjectSupporter17.deserializeObjectTypedInput1();
        retrofit.client.Response response20 = serializedObjectSupporter17.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter17.deserializeObjectConverter2();
        builder16.serializedObjectSupporter = serializedObjectSupporter17;
        restHandler15.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restHandler15.serializedObjectSupporter;
        retrofit.client.Response response25 = serializedObjectSupporter24.deserializeObjectResponse8();
        retrofit.mime.TypedInput typedInput26 = response25.body;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(typedString19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(serializedObjectSupporter24);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(typedInput26);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.Server server18 = restAdapter10.getserver();
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNull(provider20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.getserver();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse4();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = serializedObjectSupporter18.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString13();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.mime.TypedString typedString21 = serializedObjectSupporter19.deserializeObjectTypedInput1();
        retrofit.client.Response response22 = serializedObjectSupporter19.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter2();
        builder18.serializedObjectSupporter = serializedObjectSupporter19;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(typedString21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(gsonConverter23);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.Server server17 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(server17);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(executor15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        java.util.concurrent.Executor executor22 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(executor22);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = serializedObjectSupporter18.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.mime.TypedString typedString21 = serializedObjectSupporter19.deserializeObjectTypedInput1();
        retrofit.client.Response response22 = serializedObjectSupporter19.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter2();
        builder18.serializedObjectSupporter = serializedObjectSupporter19;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter19;
        java.lang.String str26 = serializedObjectSupporter19.deserializeObjectString10();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(typedString21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Forbidden" + "'", str26, "Forbidden");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.mime.TypedString typedString17 = serializedObjectSupporter15.deserializeObjectTypedInput1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString13();
        retrofit.client.Response response19 = serializedObjectSupporter15.deserializeObjectResponse3();
        retrofit.client.Response response20 = serializedObjectSupporter15.deserializeObjectResponse1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(typedString17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(logLevel22);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.mime.TypedString typedString18 = serializedObjectSupporter16.deserializeObjectTypedInput1();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter16.deserializeObjectConverter6();
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString8();
        java.lang.String str22 = serializedObjectSupporter16.deserializeObjectString3();
        retrofit.client.Response response23 = serializedObjectSupporter16.deserializeObjectResponse2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(typedString18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Internal Server Error" + "'", str19, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(logLevel25);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.client.Client.Provider provider12 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(provider12);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.client.Request request18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(requestInterceptor17);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.mime.TypedString typedString14 = serializedObjectSupporter12.deserializeObjectTypedInput1();
        retrofit.client.Response response15 = serializedObjectSupporter12.deserializeObjectResponse8();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.client.Response response17 = serializedObjectSupporter12.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString13();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler22 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(errorHandler22);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        retrofit.Profiler profiler3 = builder0.profiler;
        java.util.concurrent.Executor executor4 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Log log5 = builder0.log;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(profiler3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(log5);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Forbidden" + "'", str7, "Forbidden");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        java.util.concurrent.Executor executor10 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor10 = null;
        builder9.requestInterceptor = requestInterceptor10;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder9.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.NONE;
        builder9.logLevel = logLevel13;
        retrofit.RestAdapter.Builder builder16 = builder9.setServer("Retrofit-Idle");
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = null;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        java.util.concurrent.Executor executor28 = restAdapter27.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter27.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString8();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter30.deserializeObjectConverter8();
        builder16.converter = gsonConverter36;
        builder0.converter = gsonConverter36;
        retrofit.converter.Converter converter39 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder40 = builder0.setConverter(converter39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter36);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.getserver();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        retrofit.Server server19 = restAdapter10.getserver();
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(profiler20);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter6;
        retrofit.Server server8 = builder0.server;
        java.util.concurrent.Executor executor9 = null;
        builder0.sethttpExecutor(executor9);
        retrofit.client.Client.Provider provider11 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(provider11);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse3();
        retrofit.client.Response response22 = serializedObjectSupporter18.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections23 = serializedObjectSupporter18.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response22);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.Profiler profiler20 = restAdapter10.getprofiler();
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.lang.String str22 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
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
        retrofit.client.Client.Provider provider28 = restAdapter26.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = restAdapter26.serializedObjectSupporter;
        retrofit.client.Client.Provider provider30 = restAdapter26.getclientProvider();
        retrofit.Profiler profiler31 = restAdapter26.getprofiler();
        java.util.concurrent.Executor executor32 = restAdapter26.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter26.logLevel = logLevel33;
        restAdapter10.logLevel = logLevel33;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server38 = serializedObjectSupporter37.deserializeObjectServer1();
        retrofit.mime.TypedString typedString39 = serializedObjectSupporter37.deserializeObjectTypedInput1();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString1();
        retrofit.client.Response response41 = serializedObjectSupporter37.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList42 = response41.headers;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response44 = restAdapter10.logAndReplaceResponse("Retrofit-Idle", response41, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertNull(provider30);
        org.junit.Assert.assertNull(profiler31);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(typedString39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Retrofit-" + "'", str40, "Retrofit-");
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(headerList42);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(errorHandler18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler39 = restAdapter10.getprofiler();
        retrofit.Profiler profiler40 = restAdapter10.profiler;
        java.lang.String str41 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertNull(profiler40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Retrofit-Idle" + "'", str41, "Retrofit-Idle");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        retrofit.mime.TypedString typedString5 = serializedObjectSupporter3.deserializeObjectTypedInput1();
        java.lang.String str6 = serializedObjectSupporter3.deserializeObjectString13();
        retrofit.client.Response response7 = serializedObjectSupporter3.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput8 = response7.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response9 = new retrofit.client.Response((-1), "http://example.com/", headerList2, typedInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(typedString5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        retrofit.RestAdapter.Log log6 = builder0.log;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log6);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler39 = restAdapter10.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel40 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertNull(logLevel40);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse3();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter18.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OK" + "'", str22, "OK");
        org.junit.Assert.assertNotNull(requestInterceptor23);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter6;
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
        java.util.concurrent.Executor executor19 = restAdapter18.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter18.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.mime.TypedString typedString23 = serializedObjectSupporter21.deserializeObjectTypedInput1();
        java.lang.String str24 = serializedObjectSupporter21.deserializeObjectString8();
        restHandler20.serializedObjectSupporter = serializedObjectSupporter21;
        java.lang.String str26 = serializedObjectSupporter21.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter21.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler28 = serializedObjectSupporter21.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder29 = builder0.setErrorHandler(errorHandler28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        builder29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString6();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString8();
        java.lang.String str37 = serializedObjectSupporter30.deserializeObjectString13();
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.Class class8 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(class8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Forbidden" + "'", str1, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList9 = response8.headers;
        retrofit.mime.TypedInput typedInput10 = response8.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(typedInput10);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.RestAdapter.Log log10 = builder0.log;
        retrofit.client.Client client11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setClient(client11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log10);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Internal Server Error" + "'", str2, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        retrofit.Server server2 = null;
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
        java.util.concurrent.Executor executor13 = restAdapter12.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter12.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.mime.TypedString typedString17 = serializedObjectSupporter15.deserializeObjectTypedInput1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString8();
        restHandler14.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restHandler14.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter20.deserializeObjectConverter2();
        retrofit.client.Response response23 = serializedObjectSupporter20.deserializeObjectResponse3();
        java.lang.String str24 = serializedObjectSupporter20.deserializeObjectString4();
        retrofit.client.Response response25 = serializedObjectSupporter20.deserializeObjectResponse1();
        java.util.List<retrofit.client.Header> headerList26 = response25.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server28 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.mime.TypedString typedString29 = serializedObjectSupporter27.deserializeObjectTypedInput1();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString13();
        retrofit.client.Response response31 = serializedObjectSupporter27.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput32 = response31.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response33 = new retrofit.client.Response((int) (short) 1, "Internal Server Error", headerList26, typedInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(typedString17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OK" + "'", str24, "OK");
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(typedString29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(typedInput32);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse3();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.client.Response response23 = serializedObjectSupporter18.deserializeObjectResponse1();
        retrofit.client.Response response24 = serializedObjectSupporter18.deserializeObjectResponse8();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OK" + "'", str22, "OK");
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response24);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNull(profiler18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.Server server20 = restAdapter10.getserver();
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.getLogLevel();
        retrofit.Server server22 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(server20);
        org.junit.Assert.assertNull(logLevel21);
        org.junit.Assert.assertNull(server22);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RequestInterceptor requestInterceptor11 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Retrofit-" + "'", str8, "Retrofit-");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(logLevel17);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(log14);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        java.lang.String str18 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Forbidden" + "'", str3, "Forbidden");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.mime.TypedString typedString18 = serializedObjectSupporter16.deserializeObjectTypedInput1();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter16.deserializeObjectConverter6();
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString8();
        java.lang.String str22 = serializedObjectSupporter16.deserializeObjectString3();
        retrofit.client.Response response23 = serializedObjectSupporter16.deserializeObjectResponse2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.Server server25 = serializedObjectSupporter16.deserializeObjectServer1();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(typedString18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Internal Server Error" + "'", str19, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(server25);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.Profiler profiler9 = builder8.profiler;
        retrofit.client.Client.Provider provider10 = builder8.clientProvider;
        retrofit.RestAdapter.Builder builder12 = builder8.setServer("Forbidden");
        java.util.concurrent.Executor executor13 = builder8.getcallbackExecutor();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(executor13);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel13;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.mime.TypedString typedString18 = serializedObjectSupporter16.deserializeObjectTypedInput1();
        retrofit.client.Response response19 = serializedObjectSupporter16.deserializeObjectResponse8();
        retrofit.client.Response response20 = serializedObjectSupporter16.deserializeObjectResponse2();
        restHandler15.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str22 = serializedObjectSupporter16.deserializeObjectString13();
        retrofit.client.Response response23 = serializedObjectSupporter16.deserializeObjectResponse7();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(typedString18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Forbidden" + "'", str4, "Forbidden");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter22 = serializedObjectSupporter18.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler16 = builder15.errorHandler;
        java.util.concurrent.Executor executor17 = null;
        builder15.sethttpExecutor(executor17);
        retrofit.client.Client.Provider provider19 = builder15.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response21 = serializedObjectSupporter20.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter20.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder23 = builder15.setConverter((retrofit.converter.Converter) gsonConverter22);
        retrofit.ErrorHandler errorHandler24 = builder15.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel25 = builder15.logLevel;
        boolean boolean26 = logLevel25.log();
        restAdapter10.logLevel = logLevel25;
        retrofit.client.Client.Provider provider28 = restAdapter10.clientProvider;
        retrofit.Profiler profiler29 = restAdapter10.profiler;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(errorHandler24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(profiler29);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter13.deserializeObjectConverter8();
        retrofit.client.Response response20 = serializedObjectSupporter13.deserializeObjectResponse4();
        java.lang.String str21 = serializedObjectSupporter13.deserializeObjectString11();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter11 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor13 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertNotNull(serializedObjectSupporter39);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter30.deserializeObjectConverter8();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter38);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter1();
        retrofit.RequestInterceptor requestInterceptor22 = serializedObjectSupporter18.deserializeObjectRequestInterceptor1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter23 = serializedObjectSupporter18.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(requestInterceptor22);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.converter.Converter converter6 = builder0.converter;
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(converter6);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput5 = response4.body;
        java.util.List<retrofit.client.Header> headerList6 = response4.headers;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(typedInput5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
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
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse3();
        int int22 = response21.status;
        java.lang.String str23 = response21.getReason();
        int int24 = response21.status;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OK" + "'", str23, "OK");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.client.Response response22 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.client.Response response23 = serializedObjectSupporter18.deserializeObjectResponse1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str6 = response5.getReason();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str6 = response5.reason;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(profiler16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse1();
        int int3 = response2.status;
        java.lang.String str4 = response2.reason;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse4();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter18.deserializeObjectConverter3();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter23);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString1();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.Server server22 = serializedObjectSupporter17.deserializeObjectServer1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(server22);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
        retrofit.RestAdapter.Log log11 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler12 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNull(errorHandler12);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput8 = response7.getBody();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response14 = serializedObjectSupporter13.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter2();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString11();
        retrofit.mime.TypedString typedString17 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter13.deserializeObjectConverter2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter13;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString17);
        org.junit.Assert.assertNotNull(gsonConverter18);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Forbidden" + "'", str4, "Forbidden");
        org.junit.Assert.assertNotNull(response5);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString7();
        retrofit.client.Response response19 = serializedObjectSupporter13.deserializeObjectResponse2();
        java.lang.String str20 = response19.getReason();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OK" + "'", str20, "OK");
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean10 = logLevel9.log();
        retrofit.RestAdapter.Builder builder11 = builder8.setLogLevel(logLevel9);
        retrofit.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder8.setClient(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        retrofit.Server server2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter12.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedInput1();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString13();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString11();
        retrofit.client.Response response20 = serializedObjectSupporter14.deserializeObjectResponse7();
        retrofit.client.Response response21 = serializedObjectSupporter14.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput22 = response21.getBody();
        java.util.List<retrofit.client.Header> headerList23 = response21.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.mime.TypedString typedString26 = serializedObjectSupporter24.deserializeObjectTypedInput1();
        retrofit.client.Response response27 = serializedObjectSupporter24.deserializeObjectResponse8();
        retrofit.ErrorHandler errorHandler28 = serializedObjectSupporter24.deserializeObjectErrorHandler1();
        retrofit.mime.TypedString typedString29 = serializedObjectSupporter24.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response30 = new retrofit.client.Response(1, "Retrofit-", headerList23, (retrofit.mime.TypedInput) typedString29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(typedInput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(typedString26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(typedString29);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter13.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter13.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter13.deserializeObjectConverter1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNotNull(gsonConverter21);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString1();
        retrofit.client.Response response21 = serializedObjectSupporter17.deserializeObjectResponse7();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int8 = response7.getStatus();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = response4.reason;
        int int6 = response4.getStatus();
        retrofit.mime.TypedInput typedInput7 = response4.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(typedInput7);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider14 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter28.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        retrofit.mime.TypedString typedString32 = serializedObjectSupporter30.deserializeObjectTypedInput1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString13();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter30;
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString3();
        java.lang.String str36 = serializedObjectSupporter30.deserializeObjectString2();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.RestAdapter.LogLevel logLevel38 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler39 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor40 = restAdapter10.httpExecutor;
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
        java.util.concurrent.Executor executor52 = restAdapter51.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler53 = restAdapter51.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor54 = restAdapter51.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler55 = restAdapter51.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler56 = restAdapter51.new RestHandler();
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
        java.util.concurrent.Executor executor68 = restAdapter67.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler69 = restAdapter67.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor70 = restAdapter67.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler71 = restAdapter67.new RestHandler();
        retrofit.client.Client.Provider provider72 = restAdapter67.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = new retrofit.SerializedObjectSupporter();
        restAdapter67.serializedObjectSupporter = serializedObjectSupporter73;
        restHandler56.serializedObjectSupporter = serializedObjectSupporter73;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter73;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(typedString32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel38);
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertNull(requestInterceptor54);
        org.junit.Assert.assertNull(executor68);
        org.junit.Assert.assertNull(requestInterceptor70);
        org.junit.Assert.assertNull(provider72);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter8();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections20 = serializedObjectSupporter16.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OK" + "'", str19, "OK");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        retrofit.mime.TypedString typedString15 = serializedObjectSupporter13.deserializeObjectTypedInput1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString8();
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler12.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse3();
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.Server server23 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.client.Response response24 = serializedObjectSupporter18.deserializeObjectResponse1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OK" + "'", str22, "OK");
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter17;
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString1();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString9();
        retrofit.client.Response response22 = serializedObjectSupporter17.deserializeObjectResponse8();
        java.lang.String str23 = response22.getReason();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OK" + "'", str23, "OK");
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.converter.Converter converter6 = builder0.converter;
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
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter17.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter17.logLevel;
        java.util.concurrent.Executor executor20 = restAdapter17.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter17.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter17.new RestHandler();
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        retrofit.mime.TypedString typedString26 = serializedObjectSupporter24.deserializeObjectTypedInput1();
        retrofit.client.Response response27 = serializedObjectSupporter24.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter24.deserializeObjectConverter2();
        builder23.serializedObjectSupporter = serializedObjectSupporter24;
        restHandler22.serializedObjectSupporter = serializedObjectSupporter24;
        retrofit.Server server31 = null;
        retrofit.client.Client.Provider provider32 = null;
        java.util.concurrent.Executor executor33 = null;
        java.util.concurrent.Executor executor34 = null;
        retrofit.RequestInterceptor requestInterceptor35 = null;
        retrofit.converter.Converter converter36 = null;
        retrofit.Profiler profiler37 = null;
        retrofit.ErrorHandler errorHandler38 = null;
        retrofit.RestAdapter.Log log39 = null;
        retrofit.RestAdapter.LogLevel logLevel40 = null;
        retrofit.RestAdapter restAdapter41 = new retrofit.RestAdapter(server31, provider32, executor33, executor34, requestInterceptor35, converter36, profiler37, errorHandler38, log39, logLevel40);
        retrofit.RestAdapter.RestHandler restHandler42 = restAdapter41.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server44 = serializedObjectSupporter43.deserializeObjectServer1();
        retrofit.mime.TypedString typedString45 = serializedObjectSupporter43.deserializeObjectTypedInput1();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString13();
        restHandler42.serializedObjectSupporter = serializedObjectSupporter43;
        restHandler22.serializedObjectSupporter = serializedObjectSupporter43;
        builder0.serializedObjectSupporter = serializedObjectSupporter43;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel51 = builder0.logLevel;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNotNull(typedString26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(server44);
        org.junit.Assert.assertNotNull(typedString45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://example.com/" + "'", str46, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(errorHandler7);
    }
}

