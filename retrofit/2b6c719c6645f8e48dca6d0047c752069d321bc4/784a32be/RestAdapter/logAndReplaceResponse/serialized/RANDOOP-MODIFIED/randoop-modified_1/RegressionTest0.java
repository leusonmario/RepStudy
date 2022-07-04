import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setExecutors(executor3, executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.client.Client client2 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder3 = builder0.setClient(client2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.RequestInterceptor requestInterceptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setRequestInterceptor(requestInterceptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.reflect.Method method13 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedInput1();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        retrofit.mime.TypedString typedString23 = serializedObjectSupporter21.deserializeObjectTypedInput1();
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
        java.util.concurrent.Executor executor35 = restAdapter34.httpExecutor;
        java.lang.Object[] objArray36 = new java.lang.Object[] { str17, serializedObjectSupporter18, 1, typedString23, restAdapter34 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = restHandler11.invoke((java.lang.Object) (short) 1, method13, objArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RequestInterceptor requestInterceptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setRequestInterceptor(requestInterceptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-" + "'", str0, "Retrofit-");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request13 = restAdapter10.logAndReplaceRequest(request12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestInterceptor11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setClient(provider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.Profiler profiler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setProfiler(profiler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Log log5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.BASIC;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedInput1();
        retrofit.client.Response response17 = serializedObjectSupporter14.deserializeObjectResponse8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response19 = restAdapter10.logAndReplaceResponse("Forbidden", response17, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter6();
        retrofit.client.Response response15 = serializedObjectSupporter13.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response17 = restAdapter10.logAndReplaceResponse("hi!", response15, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.client.Response response17 = serializedObjectSupporter15.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response19 = restAdapter10.logAndReplaceResponse("hi!", response17, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response15 = serializedObjectSupporter14.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList16 = response15.headers;
        retrofit.mime.TypedInput typedInput17 = response15.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response19 = restAdapter10.logAndReplaceResponse("Retrofit-", response15, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedInput17);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter1 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.sethttpExecutor(executor4);
        org.junit.Assert.assertNotNull(server2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections3 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter1 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
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
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections19 = serializedObjectSupporter13.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        retrofit.RestAdapter.Log log3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.mime.TypedInput typedInput4 = response3.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(typedInput4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
            java.util.Collections collections19 = serializedObjectSupporter18.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.BASIC;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        builder7.server = server9;
        retrofit.RestAdapter.Builder builder11 = builder6.setServer(server9);
        java.util.concurrent.Executor executor12 = builder6.httpExecutor;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.converter.Converter converter7 = builder6.converter;
        java.util.concurrent.Executor executor8 = null;
        builder6.callbackExecutor = executor8;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor12 = null;
        builder11.requestInterceptor = requestInterceptor12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = builder11.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.NONE;
        builder11.logLevel = logLevel15;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter6();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse2();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList6 = response5.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter7.deserializeObjectTypedInput1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString13();
        retrofit.client.Response response11 = serializedObjectSupporter7.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput12 = response11.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response13 = new retrofit.client.Response(10, "OK", headerList6, typedInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(typedString9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(typedInput12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.converter.Converter converter7 = builder6.converter;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder6.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections17 = serializedObjectSupporter12.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        builder7.server = server9;
        retrofit.RestAdapter.Builder builder11 = builder6.setServer(server9);
        java.util.concurrent.Executor executor12 = builder11.httpExecutor;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder15 = builder11.setExecutors(executor13, executor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse2();
        java.lang.String str20 = response19.getReason();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OK" + "'", str20, "OK");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        retrofit.client.Response response21 = serializedObjectSupporter20.deserializeObjectResponse8();
        java.util.List<retrofit.client.Header> headerList22 = response21.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response24 = serializedObjectSupporter23.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString11();
        retrofit.mime.TypedString typedString27 = serializedObjectSupporter23.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response28 = new retrofit.client.Response((int) (short) 0, "Internal Server Error", headerList22, (retrofit.mime.TypedInput) typedString27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(typedString17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString27);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        int int4 = response3.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 500 + "'", int4 == 500);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        retrofit.mime.TypedString typedString17 = serializedObjectSupporter15.deserializeObjectTypedInput1();
        retrofit.client.Response response18 = serializedObjectSupporter15.deserializeObjectResponse8();
        retrofit.client.Response response19 = serializedObjectSupporter15.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response21 = restAdapter10.logAndReplaceResponse("http://example.com/", response19, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(typedString17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        retrofit.Profiler profiler12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder8.setProfiler(profiler12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.Profiler profiler3 = null;
        builder0.profiler = profiler3;
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.HEADERS;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList4 = response3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString11();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter5.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response10 = new retrofit.client.Response((int) 'a', "Retrofit-", headerList4, (retrofit.mime.TypedInput) typedString9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter17 = serializedObjectSupporter12.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.mime.TypedString typedString19 = serializedObjectSupporter17.deserializeObjectTypedInput1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString13();
        retrofit.client.Response response21 = serializedObjectSupporter17.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput22 = response21.getBody();
        java.lang.reflect.Method method23 = null;
        java.lang.Object[] objArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = restHandler16.invoke((java.lang.Object) response21, method23, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(typedString19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(typedInput22);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str19 = serializedObjectSupporter13.deserializeObjectString2();
        java.lang.String str20 = serializedObjectSupporter13.deserializeObjectString4();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OK" + "'", str20, "OK");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter20 = serializedObjectSupporter13.deserializeObjectLogLevel3();
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
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter20 = serializedObjectSupporter18.deserializeObjectLogLevel3();
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
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList2 = response1.headers;
        retrofit.mime.TypedInput typedInput3 = response1.getBody();
        retrofit.mime.TypedInput typedInput4 = response1.body;
        retrofit.mime.TypedInput typedInput5 = response1.getBody();
        retrofit.mime.TypedInput typedInput6 = response1.getBody();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertNull(typedInput3);
        org.junit.Assert.assertNull(typedInput4);
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertNull(typedInput6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Class<?> wildcardClass19 = restAdapter10.getClass();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setExecutors(executor7, executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList4 = response3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server6 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.mime.TypedString typedString7 = serializedObjectSupporter5.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response8 = new retrofit.client.Response(1, "hi!", headerList4, (retrofit.mime.TypedInput) typedString7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertNotNull(typedString7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Class<?> wildcardClass15 = restHandler14.getClass();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setExecutors(executor2, executor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
            retrofit.RestAdapter restAdapter19 = serializedObjectSupporter18.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        retrofit.mime.TypedString typedString5 = serializedObjectSupporter3.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((int) '#', "Forbidden", headerList2, (retrofit.mime.TypedInput) typedString5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(typedString5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedInput1();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString13();
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString8();
        retrofit.client.Response response19 = serializedObjectSupporter14.deserializeObjectResponse8();
        int int20 = response19.status;
        int int21 = response19.status;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response23 = restAdapter10.logAndReplaceResponse("Internal Server Error", response19, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections17 = serializedObjectSupporter13.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor20 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Forbidden" + "'", str8, "Forbidden");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections3 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        boolean boolean15 = logLevel13.log();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        boolean boolean12 = logLevel9.log();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.converter.Converter converter7 = builder0.converter;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request38 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request39 = restAdapter10.logAndReplaceRequest(request38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str20 = response19.reason;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OK" + "'", str20, "OK");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        java.util.concurrent.Executor executor12 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder8 = builder0.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
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
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.NONE;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server6 = serializedObjectSupporter5.deserializeObjectServer1();
        retrofit.mime.TypedString typedString7 = serializedObjectSupporter5.deserializeObjectTypedInput1();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter1();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertNotNull(typedString7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedInput1();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString1();
        retrofit.client.Response response18 = serializedObjectSupporter14.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response20 = restAdapter10.logAndReplaceResponse("Retrofit-Idle", response18, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter6;
        retrofit.Server server8 = builder0.server;
        retrofit.client.Client.Provider provider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setClient(provider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(server8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.lang.String str5 = response3.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Internal Server Error" + "'", str5, "Internal Server Error");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        retrofit.client.Client.Provider provider12 = null;
        builder11.setclientProvider(provider12);
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response18 = serializedObjectSupporter17.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.client.Response response21 = serializedObjectSupporter17.deserializeObjectResponse3();
        java.lang.Class class22 = serializedObjectSupporter17.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(class22);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections3 = serializedObjectSupporter0.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse2();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = serializedObjectSupporter18.deserializeObjectComparator1();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Forbidden" + "'", str20, "Forbidden");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter19 = serializedObjectSupporter13.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response21 = serializedObjectSupporter13.deserializeObjectResponse3();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider6 = builder0.clientProvider;
        retrofit.client.Client.Provider provider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(provider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Forbidden" + "'", str8, "Forbidden");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OK" + "'", str9, "OK");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        java.util.concurrent.Executor executor12 = builder8.gethttpExecutor();
        retrofit.Profiler profiler13 = null;
        builder8.profiler = profiler13;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.client.Client.Provider provider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(provider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.util.List<retrofit.client.Header> headerList6 = response5.headers;
        java.lang.String str7 = response5.reason;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter19 = serializedObjectSupporter13.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        retrofit.Profiler profiler13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder8.setProfiler(profiler13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        retrofit.mime.TypedString typedString19 = serializedObjectSupporter17.deserializeObjectTypedInput1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString13();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString8();
        retrofit.client.Response response22 = serializedObjectSupporter17.deserializeObjectResponse8();
        int int23 = response22.status;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response25 = restAdapter10.logAndReplaceResponse("Internal Server Error", response22, (long) 500);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNotNull(typedString19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter21 = serializedObjectSupporter18.deserializeObjectLogLevel3();
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
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter2.deserializeObjectTypedInput1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList7 = response6.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        retrofit.mime.TypedString typedString10 = serializedObjectSupporter8.deserializeObjectTypedInput1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString13();
        retrofit.client.Response response12 = serializedObjectSupporter8.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput13 = response12.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response14 = new retrofit.client.Response((int) 'a', "", headerList7, typedInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(typedString10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(typedInput13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter2.deserializeObjectTypedInput1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList7 = response6.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response9 = serializedObjectSupporter8.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString11();
        retrofit.mime.TypedString typedString12 = serializedObjectSupporter8.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response13 = new retrofit.client.Response((int) 'a', "", headerList7, (retrofit.mime.TypedInput) typedString12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.mime.TypedInput typedInput21 = response20.body;
        int int22 = response20.getStatus();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(typedInput21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.converter.Converter converter7 = builder6.converter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = converter7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setExecutors(executor6, executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(provider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response18 = serializedObjectSupporter17.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter17;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter21 = serializedObjectSupporter17.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(gsonConverter19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("OK");
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(errorHandler3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        java.util.concurrent.Executor executor12 = null;
        java.util.concurrent.Executor executor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder8.setExecutors(executor12, executor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList3 = response2.getHeaders();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(headerList3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.getclientProvider();
        retrofit.Server server2 = builder0.server;
        retrofit.Profiler profiler3 = null;
        builder0.profiler = profiler3;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(server2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = builder7.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("OK");
        java.util.concurrent.Executor executor11 = null;
        builder0.callbackExecutor = executor11;
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor7 = null;
        builder0.httpExecutor = executor7;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        retrofit.client.Client.Provider provider13 = null;
        builder0.clientProvider = provider13;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = serializedObjectSupporter12.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = serializedObjectSupporter12.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable15, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter6;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput8 = response7.body;
        int int9 = response7.status;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        int int6 = response5.status;
        java.util.List<retrofit.client.Header> headerList7 = response5.headers;
        int int8 = response5.getStatus();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        java.util.concurrent.Executor executor6 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler8 = null;
        builder0.errorHandler = errorHandler8;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter10 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        java.util.concurrent.Executor executor10 = builder8.gethttpExecutor();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.client.Request request19 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request20 = restAdapter10.logAndReplaceRequest(request19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections21 = serializedObjectSupporter17.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("OK");
        java.util.concurrent.Executor executor11 = null;
        builder10.setcallbackExecutor(executor11);
        retrofit.Profiler profiler13 = builder10.profiler;
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        retrofit.RestAdapter.LogLevel logLevel12 = null;
        builder0.logLevel = logLevel12;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(converter11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(log17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        retrofit.mime.TypedString typedString5 = serializedObjectSupporter3.deserializeObjectTypedInput1();
        java.lang.String str6 = serializedObjectSupporter3.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter3.deserializeObjectConverter6();
        builder0.converter = gsonConverter7;
        java.util.concurrent.Executor executor9 = null;
        builder0.httpExecutor = executor9;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(typedString5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Internal Server Error" + "'", str6, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response18 = serializedObjectSupporter17.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.client.Response response21 = serializedObjectSupporter17.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter22 = serializedObjectSupporter17.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        builder7.server = server9;
        retrofit.RestAdapter.Builder builder11 = builder6.setServer(server9);
        retrofit.RequestInterceptor requestInterceptor12 = builder11.requestInterceptor;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        retrofit.Server server30 = null;
        builder29.server = server30;
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder7.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        java.lang.Class<?> wildcardClass29 = builder7.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter27.logLevel;
        java.lang.reflect.Method method30 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = restHandler11.invoke((java.lang.Object) restAdapter27, method30, objArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNull(logLevel29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(log16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(server8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        boolean boolean7 = logLevel6.log();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.client.Client.Provider provider8 = builder0.getclientProvider();
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        int int5 = response4.getStatus();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        retrofit.converter.Converter converter10 = builder8.converter;
        retrofit.RestAdapter restAdapter11 = builder8.build();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNotNull(restAdapter11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        retrofit.client.Response response21 = serializedObjectSupporter20.deserializeObjectResponse8();
        java.util.List<retrofit.client.Header> headerList22 = response21.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        retrofit.mime.TypedString typedString25 = serializedObjectSupporter23.deserializeObjectTypedInput1();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString13();
        retrofit.client.Response response27 = serializedObjectSupporter23.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput28 = response27.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response29 = new retrofit.client.Response(10, "Retrofit-", headerList22, typedInput28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(typedString17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(typedString25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(typedInput28);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        retrofit.client.Response response10 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Forbidden" + "'", str8, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider27 = restAdapter25.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restAdapter25.serializedObjectSupporter;
        retrofit.client.Client.Provider provider29 = restAdapter25.getclientProvider();
        retrofit.Profiler profiler30 = restAdapter25.getprofiler();
        java.util.concurrent.Executor executor31 = restAdapter25.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter25.logLevel = logLevel32;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertNull(profiler30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        boolean boolean35 = logLevel32.log();
        boolean boolean36 = logLevel32.log();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNull(log30);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response23 = serializedObjectSupporter18.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter24 = serializedObjectSupporter18.deserializeObjectLogLevel2();
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter6();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse2();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList6 = response5.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter7.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response10 = new retrofit.client.Response((int) (byte) 1, "Retrofit-Idle", headerList6, (retrofit.mime.TypedInput) typedString9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(typedString9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput20 = response19.getBody();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(typedInput20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.mime.TypedInput typedInput8 = response7.getBody();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.List<retrofit.client.Header> headerList20 = response19.getHeaders();
        int int21 = response19.getStatus();
        java.lang.String str22 = response19.reason;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OK" + "'", str22, "OK");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        retrofit.ErrorHandler errorHandler35 = serializedObjectSupporter30.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter30.deserializeObjectConverter1();
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
        org.junit.Assert.assertNotNull(errorHandler35);
        org.junit.Assert.assertNotNull(gsonConverter36);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString11();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString3();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString1();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Forbidden" + "'", str20, "Forbidden");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = null;
        retrofit.RestAdapter.LogLevel logLevel22 = null;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel22);
        java.util.concurrent.Executor executor24 = restAdapter23.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter23.new RestHandler();
        retrofit.RestAdapter.Log log26 = restAdapter23.log;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter23.new RestHandler();
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor29 = null;
        builder28.requestInterceptor = requestInterceptor29;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = builder28.serializedObjectSupporter;
        retrofit.client.Client.Provider provider32 = null;
        builder28.clientProvider = provider32;
        retrofit.RestAdapter.LogLevel logLevel34 = builder28.logLevel;
        restAdapter23.logLevel = logLevel34;
        boolean boolean36 = logLevel34.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(log26);
        org.junit.Assert.assertNull(serializedObjectSupporter31);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor9 = null;
        builder8.setcallbackExecutor(executor9);
        retrofit.Profiler profiler11 = builder8.profiler;
        retrofit.client.Client.Provider provider12 = builder8.clientProvider;
        java.util.concurrent.Executor executor13 = null;
        builder8.callbackExecutor = executor13;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor18 = null;
        builder17.requestInterceptor = requestInterceptor18;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = builder17.serializedObjectSupporter;
        retrofit.RestAdapter.Log log21 = builder17.log;
        retrofit.RestAdapter.Log log22 = builder17.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder25 = builder17.setServer(server24);
        java.util.concurrent.Executor executor26 = null;
        builder25.sethttpExecutor(executor26);
        retrofit.RestAdapter.LogLevel logLevel28 = builder25.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(log21);
        org.junit.Assert.assertNull(log22);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor26 = restAdapter25.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter25.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter25.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler29 = restAdapter25.errorHandler;
        java.util.concurrent.Executor executor30 = restAdapter25.gethttpExecutor();
        retrofit.Profiler profiler31 = restAdapter25.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler32 = restAdapter25.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter25.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler34 = restAdapter25.new RestHandler();
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
        java.util.concurrent.Executor executor46 = restAdapter45.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler47 = restAdapter45.new RestHandler();
        retrofit.RestAdapter.Log log48 = restAdapter45.log;
        retrofit.RestAdapter.RestHandler restHandler49 = restAdapter45.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter45.logLevel = logLevel50;
        restAdapter25.logLevel = logLevel50;
        restAdapter10.logLevel = logLevel50;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(requestInterceptor28);
        org.junit.Assert.assertNull(errorHandler29);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNull(profiler31);
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertNull(log48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor30 = restAdapter29.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler31 = restAdapter29.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server33 = serializedObjectSupporter32.deserializeObjectServer1();
        retrofit.mime.TypedString typedString34 = serializedObjectSupporter32.deserializeObjectTypedInput1();
        java.lang.String str35 = serializedObjectSupporter32.deserializeObjectString8();
        restHandler31.serializedObjectSupporter = serializedObjectSupporter32;
        restHandler18.serializedObjectSupporter = serializedObjectSupporter32;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = restHandler18.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(server33);
        org.junit.Assert.assertNotNull(typedString34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder8.setExecutors(executor11, executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response33 = serializedObjectSupporter32.deserializeObjectResponse8();
        retrofit.client.Response response34 = serializedObjectSupporter32.deserializeObjectResponse8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response36 = restAdapter10.logAndReplaceResponse("Retrofit-", response34, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(typedString29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
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
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        java.util.concurrent.Executor executor30 = null;
        builder0.sethttpExecutor(executor30);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider9 = null;
        builder0.clientProvider = provider9;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setExecutors(executor11, executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString13();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
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
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Class<?> wildcardClass21 = serializedObjectSupporter18.getClass();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("OK");
        retrofit.Profiler profiler11 = null;
        builder10.profiler = profiler11;
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response18 = serializedObjectSupporter17.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter17;
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
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter39.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter39.deserializeObjectConverter2();
        retrofit.client.Response response42 = serializedObjectSupporter39.deserializeObjectResponse3();
        retrofit.client.Response response43 = serializedObjectSupporter39.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter44 = serializedObjectSupporter39.deserializeObjectConverter7();
        java.lang.String str45 = serializedObjectSupporter39.deserializeObjectString10();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter39;
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertNotNull(typedString36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNotNull(gsonConverter44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Forbidden" + "'", str45, "Forbidden");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = null;
        builder0.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log21 = restAdapter10.log;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(requestInterceptor20);
        org.junit.Assert.assertNull(log21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler21 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(errorHandler21);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        builder7.server = server9;
        retrofit.RestAdapter.Builder builder11 = builder6.setServer(server9);
        java.util.concurrent.Executor executor12 = builder11.httpExecutor;
        java.util.concurrent.Executor executor13 = null;
        builder11.callbackExecutor = executor13;
        retrofit.Server server15 = builder11.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder11.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        int int20 = response19.getStatus();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter2.deserializeObjectTypedInput1();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter2.deserializeObjectConverter2();
        retrofit.client.Response response7 = serializedObjectSupporter2.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList8 = response7.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.mime.TypedString typedString11 = serializedObjectSupporter9.deserializeObjectTypedInput1();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString13();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        retrofit.Server server14 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.client.Response response15 = serializedObjectSupporter9.deserializeObjectResponse8();
        retrofit.client.Response response16 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput17 = response16.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response18 = new retrofit.client.Response((int) (short) 100, "hi!", headerList8, typedInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNotNull(typedString11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(typedInput17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(server4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server14 = restAdapter10.server;
        java.lang.Class<?> wildcardClass15 = restAdapter10.getClass();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.lang.String str5 = response4.reason;
        java.util.List<retrofit.client.Header> headerList6 = response4.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter7.deserializeObjectTypedInput1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString13();
        retrofit.client.Response response11 = serializedObjectSupporter7.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput12 = response11.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response13 = new retrofit.client.Response((int) (short) 100, "Internal Server Error", headerList6, typedInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(typedString9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(typedInput12);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.List<retrofit.client.Header> headerList20 = response19.getHeaders();
        java.lang.String str21 = response19.reason;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OK" + "'", str21, "OK");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        java.util.concurrent.Executor executor12 = builder8.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder8.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response23 = serializedObjectSupporter18.deserializeObjectResponse3();
        retrofit.client.Response response24 = serializedObjectSupporter18.deserializeObjectResponse7();
        java.lang.String str25 = serializedObjectSupporter18.deserializeObjectString6();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.FULL;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str21 = response20.reason;
        int int22 = response20.status;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OK" + "'", str21, "OK");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider11 = builder0.getclientProvider();
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter6;
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
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
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
        retrofit.client.Client.Provider provider26 = restAdapter24.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter24.serializedObjectSupporter;
        java.lang.String str28 = restAdapter24.getTHREAD_PREFIX();
        retrofit.Server server29 = restAdapter24.getserver();
        retrofit.RestAdapter.RestHandler restHandler30 = restAdapter24.new RestHandler();
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
        java.util.concurrent.Executor executor42 = restAdapter41.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler43 = restAdapter41.new RestHandler();
        retrofit.RestAdapter.Log log44 = restAdapter41.log;
        retrofit.RestAdapter.RestHandler restHandler45 = restAdapter41.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter41.logLevel = logLevel46;
        restAdapter24.logLevel = logLevel46;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Retrofit-" + "'", str28, "Retrofit-");
        org.junit.Assert.assertNull(server29);
        org.junit.Assert.assertNull(executor42);
        org.junit.Assert.assertNull(log44);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        java.util.concurrent.Executor executor7 = builder6.gethttpExecutor();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        retrofit.client.Client.Provider provider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder8.setClient(provider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Internal Server Error" + "'", str5, "Internal Server Error");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(class4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        retrofit.Profiler profiler20 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder21 = builder0.setProfiler(profiler20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        builder7.server = server9;
        retrofit.RestAdapter.Builder builder11 = builder6.setServer(server9);
        retrofit.RestAdapter.LogLevel logLevel12 = builder11.logLevel;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter2.deserializeObjectTypedInput1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList7 = response6.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response9 = serializedObjectSupporter8.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString11();
        retrofit.mime.TypedString typedString12 = serializedObjectSupporter8.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response13 = new retrofit.client.Response((int) (byte) 0, "hi!", headerList7, (retrofit.mime.TypedInput) typedString12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString12);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.callbackExecutor = executor1;
        retrofit.Profiler profiler3 = null;
        builder0.profiler = profiler3;
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString11();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString3();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.client.Response response20 = serializedObjectSupporter12.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-Idle");
        retrofit.client.Client.Provider provider8 = builder7.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder7.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler4 = builder0.profiler;
        builder0.ensureSaneDefaults();
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(profiler4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(errorHandler4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer(server7);
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel10 = builder0.logLevel;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        retrofit.RestAdapter.Builder builder31 = builder29.setServer("http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(typedString23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.requestInterceptor;
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
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter32.deserializeObjectConverter2();
        retrofit.client.Response response35 = serializedObjectSupporter32.deserializeObjectResponse3();
        retrofit.client.Response response36 = serializedObjectSupporter32.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response38 = restAdapter10.logAndReplaceResponse("hi!", response36, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(typedString29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor9 = null;
        builder8.setcallbackExecutor(executor9);
        retrofit.Profiler profiler11 = builder8.profiler;
        java.util.concurrent.Executor executor12 = builder8.getcallbackExecutor();
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor19 = restAdapter10.gethttpExecutor();
        retrofit.Server server20 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(server20);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str24 = response23.getReason();
        int int25 = response23.status;
        int int26 = response23.status;
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OK" + "'", str24, "OK");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.getclientProvider();
        retrofit.Server server2 = builder0.server;
        retrofit.Profiler profiler3 = builder0.profiler;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(profiler3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse2();
        retrofit.mime.TypedString typedString20 = serializedObjectSupporter18.deserializeObjectTypedInput1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(typedString20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        restHandler12.serializedObjectSupporter = serializedObjectSupporter13;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter17 = serializedObjectSupporter13.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response38 = serializedObjectSupporter30.deserializeObjectResponse7();
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
        org.junit.Assert.assertNotNull(response38);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.mime.TypedString typedString18 = serializedObjectSupporter16.deserializeObjectTypedInput1();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString12();
        restHandler15.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str21 = serializedObjectSupporter16.deserializeObjectString2();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(typedString18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Internal Server Error" + "'", str19, "Internal Server Error");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.getReason();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = null;
        builder0.sethttpExecutor(executor2);
        retrofit.converter.Converter converter4 = builder0.converter;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        int int6 = response5.getStatus();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Forbidden");
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(errorHandler7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response16 = serializedObjectSupporter15.deserializeObjectResponse3();
        java.lang.String str17 = serializedObjectSupporter15.deserializeObjectString11();
        java.lang.Class class18 = serializedObjectSupporter15.deserializeObjectClass1();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("OK");
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder10.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.util.concurrent.Executor executor10 = null;
        builder8.setcallbackExecutor(executor10);
        retrofit.RestAdapter.Builder builder13 = builder8.setServer("OK");
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(errorHandler13);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        retrofit.Profiler profiler50 = builder0.profiler;
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
        org.junit.Assert.assertNull(profiler50);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter3();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.client.Response response16 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response18 = restAdapter10.logAndReplaceResponse("hi!", response16, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
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
        builder0.callbackExecutor = executor9;
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(server8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = null;
        restHandler15.serializedObjectSupporter = serializedObjectSupporter16;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str38 = serializedObjectSupporter30.deserializeObjectString11();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler19 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(errorHandler19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        java.util.concurrent.Executor executor11 = builder8.gethttpExecutor();
        retrofit.client.Client.Provider provider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder8.setClient(provider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(errorHandler10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.Server server5 = builder0.server;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        int int6 = response5.status;
        java.lang.String str7 = response5.getReason();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(profiler18);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        retrofit.Profiler profiler12 = builder0.profiler;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(profiler12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        java.lang.String str37 = serializedObjectSupporter30.deserializeObjectString11();
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
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Forbidden" + "'", str7, "Forbidden");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNull(errorHandler7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OK" + "'", str2, "OK");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class class7 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter22 = serializedObjectSupporter17.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor20 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = response2.reason;
        java.util.List<retrofit.client.Header> headerList4 = response2.getHeaders();
        retrofit.mime.TypedInput typedInput5 = response2.getBody();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OK" + "'", str3, "OK");
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNull(typedInput5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString1();
        java.lang.Class<?> wildcardClass22 = serializedObjectSupporter18.getClass();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        retrofit.client.Client.Provider provider13 = null;
        builder0.clientProvider = provider13;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider22 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter22 = serializedObjectSupporter16.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(typedString18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString13();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Forbidden" + "'", str3, "Forbidden");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        retrofit.converter.Converter converter7 = builder6.converter;
        java.util.concurrent.Executor executor8 = builder6.gethttpExecutor();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.Server server8 = builder0.server;
        retrofit.Profiler profiler9 = builder0.profiler;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(profiler9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor9 = null;
        builder8.setcallbackExecutor(executor9);
        retrofit.Profiler profiler11 = builder8.profiler;
        retrofit.ErrorHandler errorHandler12 = builder8.errorHandler;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(errorHandler12);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
        retrofit.converter.Converter converter10 = builder0.converter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.requestInterceptor;
        retrofit.Server server16 = restAdapter10.server;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(server16);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str24 = serializedObjectSupporter18.deserializeObjectString5();
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        java.lang.String str20 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(requestInterceptor20);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
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
        retrofit.Profiler profiler12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setProfiler(profiler12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
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
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor29 = restAdapter28.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler30 = restAdapter28.new RestHandler();
        retrofit.RestAdapter.Log log31 = restAdapter28.log;
        retrofit.RestAdapter.RestHandler restHandler32 = restAdapter28.new RestHandler();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor34 = null;
        builder33.requestInterceptor = requestInterceptor34;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = builder33.serializedObjectSupporter;
        retrofit.client.Client.Provider provider37 = null;
        builder33.clientProvider = provider37;
        retrofit.RestAdapter.LogLevel logLevel39 = builder33.logLevel;
        restAdapter28.logLevel = logLevel39;
        boolean boolean41 = logLevel39.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(log31);
        org.junit.Assert.assertNull(serializedObjectSupporter36);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedString typedString5 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(typedString5);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        retrofit.RestAdapter.Log log3 = null;
        builder0.log = log3;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.mime.TypedInput typedInput21 = response20.body;
        java.util.List<retrofit.client.Header> headerList22 = response20.getHeaders();
        int int23 = response20.status;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(typedInput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Class class18 = serializedObjectSupporter16.deserializeObjectClass1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor39 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler40 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler38);
        org.junit.Assert.assertNull(requestInterceptor39);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(server5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler20 = restAdapter10.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.lang.String str5 = response4.reason;
        java.util.List<retrofit.client.Header> headerList6 = response4.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        retrofit.client.Response response11 = serializedObjectSupporter9.deserializeObjectResponse4();
        java.lang.String str12 = response11.reason;
        java.util.List<retrofit.client.Header> headerList13 = response11.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedInput1();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString13();
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString8();
        retrofit.Server server19 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.client.Response response20 = serializedObjectSupporter14.deserializeObjectResponse8();
        retrofit.client.Response response21 = serializedObjectSupporter14.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput22 = response21.body;
        retrofit.client.Response response23 = new retrofit.client.Response(200, "", headerList13, typedInput22);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response24 = new retrofit.client.Response((int) ' ', "Retrofit-Idle", headerList6, typedInput22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OK" + "'", str12, "OK");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(typedInput22);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler20 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(errorHandler20);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server15 = restAdapter10.server;
        retrofit.client.Request request16 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request17 = restAdapter10.logAndReplaceRequest(request16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Response response19 = serializedObjectSupporter13.deserializeObjectResponse1();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider9 = builder8.getclientProvider();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server15 = restAdapter10.server;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(logLevel13);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = serializedObjectSupporter16.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(gsonConverter18);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput2 = response1.getBody();
        java.util.List<retrofit.client.Header> headerList3 = response1.headers;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(typedInput2);
        org.junit.Assert.assertNotNull(headerList3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        retrofit.mime.TypedString typedString12 = serializedObjectSupporter10.deserializeObjectTypedInput1();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter10.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter10.deserializeObjectConverter7();
        builder0.converter = gsonConverter15;
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(typedString12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Internal Server Error" + "'", str13, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Internal Server Error" + "'", str2, "Internal Server Error");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter18.deserializeObjectConverter8();
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
        org.junit.Assert.assertNotNull(gsonConverter24);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Forbidden" + "'", str4, "Forbidden");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Forbidden");
        java.util.concurrent.Executor executor7 = builder6.httpExecutor;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Internal Server Error" + "'", str2, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OK" + "'", str2, "OK");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString12();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Internal Server Error" + "'", str20, "Internal Server Error");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = serializedObjectSupporter16.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections21 = serializedObjectSupporter18.deserializeObjectList2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(typedString15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server39 = restAdapter10.getserver();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler38);
        org.junit.Assert.assertNull(server39);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("OK");
        builder0.log = log3;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(server4);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.NONE;
        builder0.logLevel = logLevel4;
        retrofit.client.Client.Provider provider6 = null;
        builder0.setclientProvider(provider6);
        retrofit.Server server8 = builder0.server;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString11();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString11();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString5();
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server3 = serializedObjectSupporter2.deserializeObjectServer1();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.lang.String str5 = response4.reason;
        java.util.List<retrofit.client.Header> headerList6 = response4.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.mime.TypedString typedString9 = serializedObjectSupporter7.deserializeObjectTypedInput1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString13();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString8();
        retrofit.Server server12 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.client.Response response13 = serializedObjectSupporter7.deserializeObjectResponse8();
        retrofit.client.Response response14 = serializedObjectSupporter7.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput15 = response14.body;
        retrofit.client.Response response16 = new retrofit.client.Response(200, "", headerList6, typedInput15);
        java.util.List<retrofit.client.Header> headerList17 = response16.getHeaders();
        int int18 = response16.status;
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertNotNull(typedString9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(typedInput15);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(log13);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(requestInterceptor5);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString3();
        java.lang.String str18 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString3();
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        builder0.requestInterceptor = requestInterceptor1;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.Log log5 = builder0.log;
        java.util.concurrent.Executor executor6 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel8 = builder0.logLevel;
        retrofit.Server server9 = null;
        retrofit.client.Client.Provider provider10 = null;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        retrofit.converter.Converter converter14 = null;
        retrofit.Profiler profiler15 = null;
        retrofit.ErrorHandler errorHandler16 = null;
        retrofit.RestAdapter.Log log17 = null;
        retrofit.RestAdapter.LogLevel logLevel18 = null;
        retrofit.RestAdapter restAdapter19 = new retrofit.RestAdapter(server9, provider10, executor11, executor12, requestInterceptor13, converter14, profiler15, errorHandler16, log17, logLevel18);
        java.util.concurrent.Executor executor20 = restAdapter19.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter19.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor22 = restAdapter19.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter19.new RestHandler();
        retrofit.client.Client.Provider provider24 = restAdapter19.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        restAdapter19.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.RestAdapter.Builder builder29 = builder0.setConverter((retrofit.converter.Converter) gsonConverter28);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(requestInterceptor22);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList7 = response6.headers;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Internal Server Error" + "'", str3, "Internal Server Error");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        retrofit.mime.TypedString typedString4 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class<?> wildcardClass6 = errorHandler5.getClass();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(typedString4);
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.mime.TypedString typedString2 = serializedObjectSupporter0.deserializeObjectTypedInput1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(typedString2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler41 = restAdapter10.new RestHandler();
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
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Forbidden" + "'", str2, "Forbidden");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
    }
}

