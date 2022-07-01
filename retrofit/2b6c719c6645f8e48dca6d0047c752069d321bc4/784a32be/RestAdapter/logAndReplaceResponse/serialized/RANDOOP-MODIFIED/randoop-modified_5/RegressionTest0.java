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
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedInput typedInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response4 = new retrofit.client.Response((int) (short) 10, "", headerList2, typedInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter1 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
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
        retrofit.client.Response response12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response14 = restAdapter10.logAndReplaceResponse("Retrofit-", response12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable13, "Retrofit-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.client.Client client2 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder3 = builder0.setClient(client2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setExecutors(executor7, executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request14 = restAdapter10.logAndReplaceRequest(request13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restHandler11.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider14 = builder13.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel15 = builder13.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setRequestInterceptor(requestInterceptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(executor2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(executor2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.LogLevel logLevel18 = builder14.logLevel;
        java.util.concurrent.Executor executor19 = null;
        builder14.setcallbackExecutor(executor19);
        retrofit.ErrorHandler errorHandler21 = builder14.errorHandler;
        java.util.concurrent.Executor executor22 = null;
        builder14.setcallbackExecutor(executor22);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder25 = builder14.setLogLevel(logLevel24);
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        retrofit.client.Client.Provider provider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setClient(provider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((int) '#', "", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response(100, "Retrofit-", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.LogLevel logLevel18 = builder14.logLevel;
        java.util.concurrent.Executor executor19 = null;
        builder14.setcallbackExecutor(executor19);
        retrofit.ErrorHandler errorHandler21 = builder14.errorHandler;
        java.util.concurrent.Executor executor22 = null;
        builder14.setcallbackExecutor(executor22);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder25 = builder14.setLogLevel(logLevel24);
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        java.util.concurrent.Executor executor12 = null;
        java.util.concurrent.Executor executor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder0.setExecutors(executor12, executor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        retrofit.client.Client.Provider provider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(provider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restHandler13.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        int int3 = response2.status;
        java.lang.String str4 = response2.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter14 = serializedObjectSupporter10.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-" + "'", str0, "Retrofit-");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter2.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setExecutors(executor4, executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server15 = restAdapter10.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString6();
        retrofit.client.Response response19 = serializedObjectSupporter17.deserializeObjectResponse1();
        retrofit.client.Response response20 = serializedObjectSupporter17.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response22 = restAdapter10.logAndReplaceResponse("", response20, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((-1), "http://example.com/", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
        retrofit.RequestInterceptor requestInterceptor12 = builder11.requestInterceptor;
        retrofit.client.Client client13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder11.setClient(client13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        int int7 = response5.status;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = builder21.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        builder21.serializedObjectSupporter = serializedObjectSupporter23;
        retrofit.RestAdapter.Builder builder28 = builder21.setServer("Retrofit-");
        java.util.concurrent.Executor executor29 = builder28.httpExecutor;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server32 = serializedObjectSupporter31.deserializeObjectServer1();
        builder30.server = server32;
        retrofit.RestAdapter.LogLevel logLevel34 = builder30.logLevel;
        builder30.ensureSaneDefaults();
        java.util.concurrent.Executor executor36 = null;
        builder30.setcallbackExecutor(executor36);
        java.util.concurrent.Executor executor38 = null;
        builder30.callbackExecutor = executor38;
        retrofit.client.Client.Provider provider40 = builder30.clientProvider;
        builder28.setclientProvider(provider40);
        builder7.setclientProvider(provider40);
        retrofit.RestAdapter.Log log43 = builder7.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNull(log43);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        retrofit.RestAdapter.LogLevel logLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder0.setLogLevel(logLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString6();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.converter.Converter converter7 = builder0.converter;
        java.util.concurrent.Executor executor8 = null;
        java.util.concurrent.Executor executor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setExecutors(executor8, executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setExecutors(executor10, executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider10 = builder9.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel11 = builder9.logLevel;
        builder0.logLevel = logLevel11;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter13 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setClient(client4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        retrofit.mime.TypedInput typedInput7 = response5.getBody();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertNull(typedInput7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Request request12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request13 = restAdapter10.logAndReplaceRequest(request12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter2();
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList7 = response6.getHeaders();
        retrofit.mime.TypedInput typedInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response9 = new retrofit.client.Response(1, "OK", headerList7, typedInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList2 = response1.getHeaders();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(headerList2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter2();
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList7 = response6.getHeaders();
        retrofit.mime.TypedInput typedInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response9 = new retrofit.client.Response(0, "Internal Server Error", headerList7, typedInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((int) (byte) 100, "Internal Server Error", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter restAdapter6 = builder0.build();
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restHandler13.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler13.serializedObjectSupporter;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter17);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter2();
        retrofit.client.Response response16 = serializedObjectSupporter14.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response18 = restAdapter10.logAndReplaceResponse("Retrofit-", response16, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = null;
        builder7.callbackExecutor = executor21;
        java.util.concurrent.Executor executor23 = builder7.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor24 = builder23.httpExecutor;
        retrofit.RestAdapter.Log log25 = null;
        builder23.log = log25;
        java.util.concurrent.Executor executor27 = null;
        builder23.callbackExecutor = executor27;
        retrofit.Profiler profiler29 = null;
        builder23.profiler = profiler29;
        builder23.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider33 = builder32.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel34 = builder32.logLevel;
        builder23.logLevel = logLevel34;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(errorHandler22);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = requestInterceptor12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder11.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor13 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(errorHandler2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder6 = builder0.setConverter((retrofit.converter.Converter) gsonConverter5);
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        java.util.concurrent.Executor executor9 = null;
        builder7.sethttpExecutor(executor9);
        retrofit.ErrorHandler errorHandler11 = builder7.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(executor8);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.converter.Converter converter9 = builder0.converter;
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(executor10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler5 = builder0.profiler;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(profiler5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
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
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        retrofit.RequestInterceptor requestInterceptor11 = builder10.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(requestInterceptor11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(server2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse3();
        retrofit.client.Response response7 = serializedObjectSupporter2.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter2.deserializeObjectConverter1();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int5 = response4.status;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        retrofit.Server server3 = builder0.server;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = null;
        builder0.setcallbackExecutor(executor6);
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter restAdapter8 = builder0.build();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(restAdapter8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter2();
        builder9.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.RestAdapter.Builder builder16 = builder9.setServer("Retrofit-");
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        builder18.server = server20;
        retrofit.RestAdapter.LogLevel logLevel22 = builder18.logLevel;
        builder18.ensureSaneDefaults();
        java.util.concurrent.Executor executor24 = null;
        builder18.setcallbackExecutor(executor24);
        java.util.concurrent.Executor executor26 = null;
        builder18.callbackExecutor = executor26;
        retrofit.client.Client.Provider provider28 = builder18.clientProvider;
        builder16.setclientProvider(provider28);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter32.deserializeObjectConverter2();
        builder30.serializedObjectSupporter = serializedObjectSupporter32;
        retrofit.RestAdapter.Builder builder37 = builder30.setServer("Retrofit-");
        java.util.concurrent.Executor executor38 = builder37.httpExecutor;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server41 = serializedObjectSupporter40.deserializeObjectServer1();
        builder39.server = server41;
        retrofit.RestAdapter.LogLevel logLevel43 = builder39.logLevel;
        builder39.ensureSaneDefaults();
        java.util.concurrent.Executor executor45 = null;
        builder39.setcallbackExecutor(executor45);
        java.util.concurrent.Executor executor47 = null;
        builder39.callbackExecutor = executor47;
        retrofit.client.Client.Provider provider49 = builder39.clientProvider;
        builder37.setclientProvider(provider49);
        builder16.setclientProvider(provider49);
        retrofit.RestAdapter.Builder builder52 = builder0.setClient(provider49);
        builder52.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider49);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(executor9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        log6.log("");
        builder0.log = log6;
        retrofit.converter.Converter converter10 = builder0.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(converter10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList5 = response4.getHeaders();
        retrofit.mime.TypedInput typedInput6 = response4.getBody();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(typedInput6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(provider13);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        log6.log("");
        builder0.log = log6;
        log6.log("OK");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter2();
        builder9.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.RestAdapter.Builder builder16 = builder9.setServer("Retrofit-");
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        builder18.server = server20;
        retrofit.RestAdapter.LogLevel logLevel22 = builder18.logLevel;
        builder18.ensureSaneDefaults();
        java.util.concurrent.Executor executor24 = null;
        builder18.setcallbackExecutor(executor24);
        java.util.concurrent.Executor executor26 = null;
        builder18.callbackExecutor = executor26;
        retrofit.client.Client.Provider provider28 = builder18.clientProvider;
        builder16.setclientProvider(provider28);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter32.deserializeObjectConverter2();
        builder30.serializedObjectSupporter = serializedObjectSupporter32;
        retrofit.RestAdapter.Builder builder37 = builder30.setServer("Retrofit-");
        java.util.concurrent.Executor executor38 = builder37.httpExecutor;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server41 = serializedObjectSupporter40.deserializeObjectServer1();
        builder39.server = server41;
        retrofit.RestAdapter.LogLevel logLevel43 = builder39.logLevel;
        builder39.ensureSaneDefaults();
        java.util.concurrent.Executor executor45 = null;
        builder39.setcallbackExecutor(executor45);
        java.util.concurrent.Executor executor47 = null;
        builder39.callbackExecutor = executor47;
        retrofit.client.Client.Provider provider49 = builder39.clientProvider;
        builder37.setclientProvider(provider49);
        builder16.setclientProvider(provider49);
        retrofit.RestAdapter.Builder builder52 = builder0.setClient(provider49);
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor54 = builder53.httpExecutor;
        retrofit.RestAdapter.Log log55 = null;
        builder53.log = log55;
        java.util.concurrent.Executor executor57 = null;
        builder53.callbackExecutor = executor57;
        retrofit.RequestInterceptor requestInterceptor59 = null;
        builder53.requestInterceptor = requestInterceptor59;
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server63 = serializedObjectSupporter62.deserializeObjectServer1();
        builder61.server = server63;
        retrofit.RestAdapter.LogLevel logLevel65 = retrofit.RestAdapter.LogLevel.BASIC;
        builder61.logLevel = logLevel65;
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server69 = serializedObjectSupporter68.deserializeObjectServer1();
        builder67.server = server69;
        retrofit.RestAdapter.LogLevel logLevel71 = retrofit.RestAdapter.LogLevel.BASIC;
        builder67.logLevel = logLevel71;
        retrofit.RestAdapter restAdapter73 = builder67.build();
        java.util.concurrent.Executor executor74 = builder67.getcallbackExecutor();
        builder61.setcallbackExecutor(executor74);
        builder53.httpExecutor = executor74;
        builder52.setcallbackExecutor(executor74);
        retrofit.Profiler profiler78 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder79 = builder52.setProfiler(profiler78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(executor54);
        org.junit.Assert.assertNotNull(server63);
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server69);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter73);
        org.junit.Assert.assertNotNull(executor74);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
        retrofit.RequestInterceptor requestInterceptor12 = builder11.requestInterceptor;
        java.util.concurrent.Executor executor13 = builder11.getcallbackExecutor();
        retrofit.Profiler profiler14 = null;
        builder11.profiler = profiler14;
        retrofit.Profiler profiler16 = null;
        builder11.profiler = profiler16;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.getReason();
        java.util.List<retrofit.client.Header> headerList8 = response5.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
        org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler7 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler7);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString6();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        restHandler16.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str22 = serializedObjectSupporter18.deserializeObjectString4();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter restAdapter6 = builder0.build();
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server15 = restAdapter10.server;
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        retrofit.RestAdapter.LogLevel logLevel20 = builder16.logLevel;
        java.util.concurrent.Executor executor21 = null;
        builder16.setcallbackExecutor(executor21);
        retrofit.ErrorHandler errorHandler23 = builder16.errorHandler;
        java.util.concurrent.Executor executor24 = null;
        builder16.setcallbackExecutor(executor24);
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder27 = builder16.setLogLevel(logLevel26);
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder27);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel23 = restAdapter10.logLevel;
        retrofit.client.Request request24 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request25 = restAdapter10.logAndReplaceRequest(request24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(errorHandler22);
        org.junit.Assert.assertNull(logLevel23);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        retrofit.Profiler profiler10 = builder0.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(errorHandler8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = restAdapter10.server;
        retrofit.client.Request request18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(converter19);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor17);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.lang.reflect.Method method19 = null;
        retrofit.Server server20 = null;
        retrofit.client.Client.Provider provider21 = null;
        java.util.concurrent.Executor executor22 = null;
        java.util.concurrent.Executor executor23 = null;
        retrofit.RequestInterceptor requestInterceptor24 = null;
        retrofit.converter.Converter converter25 = null;
        retrofit.Profiler profiler26 = null;
        retrofit.ErrorHandler errorHandler27 = null;
        retrofit.RestAdapter.Log log28 = null;
        retrofit.RestAdapter.LogLevel logLevel29 = null;
        retrofit.RestAdapter restAdapter30 = new retrofit.RestAdapter(server20, provider21, executor22, executor23, requestInterceptor24, converter25, profiler26, errorHandler27, log28, logLevel29);
        retrofit.Profiler profiler31 = restAdapter30.getprofiler();
        retrofit.converter.Converter converter32 = restAdapter30.converter;
        java.util.concurrent.Executor executor33 = restAdapter30.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel34 = restAdapter30.getLogLevel();
        retrofit.Profiler profiler35 = restAdapter30.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler36 = restAdapter30.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor37 = restAdapter30.getrequestInterceptor();
        java.lang.Object[] objArray38 = new java.lang.Object[] { requestInterceptor37 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = restHandler17.invoke((java.lang.Object) "Retrofit-", method19, objArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(profiler31);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(logLevel34);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNull(requestInterceptor37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[null]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int4 = response3.status;
        retrofit.mime.TypedInput typedInput5 = response3.getBody();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNull(typedInput5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.RestAdapter.Log log10 = null;
        builder8.log = log10;
        java.util.concurrent.Executor executor12 = null;
        builder8.callbackExecutor = executor12;
        retrofit.RequestInterceptor requestInterceptor14 = null;
        builder8.requestInterceptor = requestInterceptor14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        builder16.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        builder22.server = server24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        builder22.logLevel = logLevel26;
        retrofit.RestAdapter restAdapter28 = builder22.build();
        java.util.concurrent.Executor executor29 = builder22.getcallbackExecutor();
        builder16.setcallbackExecutor(executor29);
        builder8.httpExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        retrofit.client.Client.Provider provider33 = builder0.clientProvider;
        retrofit.Profiler profiler34 = builder0.profiler;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(executor29);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNull(profiler34);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
            restAdapter10.logException(throwable12, "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(provider13);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        retrofit.Profiler profiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setProfiler(profiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(errorHandler8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restHandler13.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean15 = logLevel14.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel2 = builder0.logLevel;
        retrofit.Server server3 = builder0.server;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        retrofit.Profiler profiler10 = null;
        builder0.profiler = profiler10;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter21.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter21.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter21.deserializeObjectConverter5();
        retrofit.client.Response response26 = serializedObjectSupporter21.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RequestInterceptor requestInterceptor28 = serializedObjectSupporter21.deserializeObjectRequestInterceptor1();
        builder0.requestInterceptor = requestInterceptor28;
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
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(requestInterceptor28);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        retrofit.RestAdapter restAdapter15 = builder0.build();
        retrofit.client.Request request16 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request17 = restAdapter15.logAndReplaceRequest(request16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertNotNull(restAdapter15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class<?> wildcardClass7 = response6.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor63 = builder62.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter65 = serializedObjectSupporter64.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter64.deserializeObjectConverter2();
        builder62.serializedObjectSupporter = serializedObjectSupporter64;
        retrofit.RestAdapter.Builder builder69 = builder62.setServer("Retrofit-");
        java.util.concurrent.Executor executor70 = builder69.httpExecutor;
        java.util.concurrent.Executor executor71 = null;
        builder69.sethttpExecutor(executor71);
        retrofit.RestAdapter.Builder builder73 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor74 = builder73.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter76 = serializedObjectSupporter75.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter77 = serializedObjectSupporter75.deserializeObjectConverter2();
        builder73.serializedObjectSupporter = serializedObjectSupporter75;
        retrofit.RestAdapter.Builder builder80 = builder73.setServer("Retrofit-");
        java.util.concurrent.Executor executor81 = builder80.httpExecutor;
        retrofit.RestAdapter.Builder builder82 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter83 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server84 = serializedObjectSupporter83.deserializeObjectServer1();
        builder82.server = server84;
        retrofit.RestAdapter.LogLevel logLevel86 = builder82.logLevel;
        builder82.ensureSaneDefaults();
        java.util.concurrent.Executor executor88 = null;
        builder82.setcallbackExecutor(executor88);
        java.util.concurrent.Executor executor90 = null;
        builder82.callbackExecutor = executor90;
        retrofit.client.Client.Provider provider92 = builder82.clientProvider;
        builder80.setclientProvider(provider92);
        builder69.setclientProvider(provider92);
        builder0.clientProvider = provider92;
        retrofit.Profiler profiler96 = builder0.profiler;
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
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertNotNull(gsonConverter65);
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(executor70);
        org.junit.Assert.assertNull(executor74);
        org.junit.Assert.assertNotNull(gsonConverter76);
        org.junit.Assert.assertNotNull(gsonConverter77);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNull(executor81);
        org.junit.Assert.assertNotNull(server84);
        org.junit.Assert.assertTrue("'" + logLevel86 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel86.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider92);
        org.junit.Assert.assertNull(profiler96);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestInterceptor requestInterceptor7 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestInterceptor7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
        retrofit.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder11.setClient(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString9();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        retrofit.Profiler profiler12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setProfiler(profiler12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response8 = serializedObjectSupporter7.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter7.deserializeObjectServer1();
        builder0.server = server9;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = null;
        builder0.setcallbackExecutor(executor6);
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.Profiler profiler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setProfiler(profiler10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler2);
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
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        builder5.server = server7;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        builder5.logLevel = logLevel9;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter2();
        builder11.serializedObjectSupporter = serializedObjectSupporter13;
        java.util.concurrent.Executor executor17 = null;
        builder11.callbackExecutor = executor17;
        retrofit.Profiler profiler19 = null;
        builder11.profiler = profiler19;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = builder21.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter2();
        builder21.serializedObjectSupporter = serializedObjectSupporter23;
        retrofit.RestAdapter.Builder builder28 = builder21.setServer("Retrofit-");
        java.util.concurrent.Executor executor29 = builder28.httpExecutor;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server32 = serializedObjectSupporter31.deserializeObjectServer1();
        builder30.server = server32;
        retrofit.RestAdapter.LogLevel logLevel34 = builder30.logLevel;
        builder30.ensureSaneDefaults();
        java.util.concurrent.Executor executor36 = null;
        builder30.setcallbackExecutor(executor36);
        java.util.concurrent.Executor executor38 = null;
        builder30.callbackExecutor = executor38;
        retrofit.client.Client.Provider provider40 = builder30.clientProvider;
        builder28.setclientProvider(provider40);
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor43 = builder42.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter44.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter44.deserializeObjectConverter2();
        builder42.serializedObjectSupporter = serializedObjectSupporter44;
        retrofit.RestAdapter.Builder builder49 = builder42.setServer("Retrofit-");
        java.util.concurrent.Executor executor50 = builder49.httpExecutor;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server53 = serializedObjectSupporter52.deserializeObjectServer1();
        builder51.server = server53;
        retrofit.RestAdapter.LogLevel logLevel55 = builder51.logLevel;
        builder51.ensureSaneDefaults();
        java.util.concurrent.Executor executor57 = null;
        builder51.setcallbackExecutor(executor57);
        java.util.concurrent.Executor executor59 = null;
        builder51.callbackExecutor = executor59;
        retrofit.client.Client.Provider provider61 = builder51.clientProvider;
        builder49.setclientProvider(provider61);
        builder28.setclientProvider(provider61);
        retrofit.RestAdapter.Builder builder64 = builder11.setClient(provider61);
        builder5.setclientProvider(provider61);
        retrofit.RequestInterceptor requestInterceptor66 = builder5.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor67 = null;
        builder5.requestInterceptor = requestInterceptor67;
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter70 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server71 = serializedObjectSupporter70.deserializeObjectServer1();
        builder69.server = server71;
        retrofit.RestAdapter.LogLevel logLevel73 = builder69.logLevel;
        retrofit.RestAdapter.Builder builder74 = builder5.setLogLevel(logLevel73);
        retrofit.RestAdapter.Builder builder75 = builder0.setLogLevel(logLevel73);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(requestInterceptor66);
        org.junit.Assert.assertNotNull(server71);
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str5 = response4.reason;
        java.util.List<retrofit.client.Header> headerList6 = response4.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        retrofit.Server server10 = builder0.server;
        java.util.concurrent.Executor executor11 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(server10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.Profiler profiler9 = builder7.profiler;
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder7.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(profiler9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server9 = serializedObjectSupporter8.deserializeObjectServer1();
        builder7.server = server9;
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        builder7.logLevel = logLevel11;
        boolean boolean13 = logLevel11.log();
        retrofit.RestAdapter.Builder builder14 = builder0.setLogLevel(logLevel11);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(log15);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int2 = response1.status;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.Profiler profiler10 = null;
        builder8.profiler = profiler10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        builder12.server = server14;
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        java.util.concurrent.Executor executor17 = null;
        builder12.setcallbackExecutor(executor17);
        retrofit.ErrorHandler errorHandler19 = builder12.errorHandler;
        java.util.concurrent.Executor executor20 = null;
        builder12.setcallbackExecutor(executor20);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter2();
        builder12.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor27 = builder26.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter28.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter2();
        builder26.serializedObjectSupporter = serializedObjectSupporter28;
        retrofit.RestAdapter.Builder builder33 = builder26.setServer("Retrofit-");
        java.util.concurrent.Executor executor34 = builder33.httpExecutor;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server37 = serializedObjectSupporter36.deserializeObjectServer1();
        builder35.server = server37;
        retrofit.RestAdapter.LogLevel logLevel39 = builder35.logLevel;
        builder35.ensureSaneDefaults();
        java.util.concurrent.Executor executor41 = null;
        builder35.setcallbackExecutor(executor41);
        java.util.concurrent.Executor executor43 = null;
        builder35.callbackExecutor = executor43;
        retrofit.client.Client.Provider provider45 = builder35.clientProvider;
        builder33.setclientProvider(provider45);
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter2();
        builder47.serializedObjectSupporter = serializedObjectSupporter49;
        retrofit.RestAdapter.Builder builder54 = builder47.setServer("Retrofit-");
        java.util.concurrent.Executor executor55 = builder54.httpExecutor;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server58 = serializedObjectSupporter57.deserializeObjectServer1();
        builder56.server = server58;
        retrofit.RestAdapter.LogLevel logLevel60 = builder56.logLevel;
        builder56.ensureSaneDefaults();
        java.util.concurrent.Executor executor62 = null;
        builder56.setcallbackExecutor(executor62);
        java.util.concurrent.Executor executor64 = null;
        builder56.callbackExecutor = executor64;
        retrofit.client.Client.Provider provider66 = builder56.clientProvider;
        builder54.setclientProvider(provider66);
        builder33.setclientProvider(provider66);
        builder12.setclientProvider(provider66);
        retrofit.RestAdapter.Builder builder70 = builder8.setClient(provider66);
        retrofit.RestAdapter.Builder builder71 = builder0.setClient(provider66);
        retrofit.Profiler profiler72 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder73 = builder71.setProfiler(profiler72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(server58);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider66);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.String str19 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor21 = restAdapter10.httpExecutor;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        retrofit.Profiler profiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setProfiler(profiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(errorHandler8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server7 = serializedObjectSupporter6.deserializeObjectServer1();
        builder5.server = server7;
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.BASIC;
        builder5.logLevel = logLevel9;
        retrofit.RestAdapter restAdapter11 = builder5.build();
        java.util.concurrent.Executor executor12 = builder5.getcallbackExecutor();
        builder0.setcallbackExecutor(executor12);
        retrofit.ErrorHandler errorHandler14 = builder0.errorHandler;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter11);
        org.junit.Assert.assertNotNull(executor12);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(provider1);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server15 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.Profiler profiler10 = null;
        builder8.profiler = profiler10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        builder12.server = server14;
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        java.util.concurrent.Executor executor17 = null;
        builder12.setcallbackExecutor(executor17);
        retrofit.ErrorHandler errorHandler19 = builder12.errorHandler;
        java.util.concurrent.Executor executor20 = null;
        builder12.setcallbackExecutor(executor20);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter2();
        builder12.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor27 = builder26.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter28.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter2();
        builder26.serializedObjectSupporter = serializedObjectSupporter28;
        retrofit.RestAdapter.Builder builder33 = builder26.setServer("Retrofit-");
        java.util.concurrent.Executor executor34 = builder33.httpExecutor;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server37 = serializedObjectSupporter36.deserializeObjectServer1();
        builder35.server = server37;
        retrofit.RestAdapter.LogLevel logLevel39 = builder35.logLevel;
        builder35.ensureSaneDefaults();
        java.util.concurrent.Executor executor41 = null;
        builder35.setcallbackExecutor(executor41);
        java.util.concurrent.Executor executor43 = null;
        builder35.callbackExecutor = executor43;
        retrofit.client.Client.Provider provider45 = builder35.clientProvider;
        builder33.setclientProvider(provider45);
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter2();
        builder47.serializedObjectSupporter = serializedObjectSupporter49;
        retrofit.RestAdapter.Builder builder54 = builder47.setServer("Retrofit-");
        java.util.concurrent.Executor executor55 = builder54.httpExecutor;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server58 = serializedObjectSupporter57.deserializeObjectServer1();
        builder56.server = server58;
        retrofit.RestAdapter.LogLevel logLevel60 = builder56.logLevel;
        builder56.ensureSaneDefaults();
        java.util.concurrent.Executor executor62 = null;
        builder56.setcallbackExecutor(executor62);
        java.util.concurrent.Executor executor64 = null;
        builder56.callbackExecutor = executor64;
        retrofit.client.Client.Provider provider66 = builder56.clientProvider;
        builder54.setclientProvider(provider66);
        builder33.setclientProvider(provider66);
        builder12.setclientProvider(provider66);
        retrofit.RestAdapter.Builder builder70 = builder8.setClient(provider66);
        retrofit.RestAdapter.Builder builder71 = builder0.setClient(provider66);
        retrofit.RestAdapter.Builder builder73 = builder71.setServer("Retrofit-");
        java.util.concurrent.Executor executor74 = builder73.callbackExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(server58);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider66);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNull(executor74);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.Class<?> wildcardClass17 = restAdapter10.getClass();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter10 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder0.requestInterceptor = requestInterceptor8;
        java.util.concurrent.Executor executor10 = builder0.httpExecutor;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.Profiler profiler10 = builder0.profiler;
        retrofit.client.Client.Provider provider11 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNotNull(provider11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList4 = response3.headers;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(converter16);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        builder2.server = server4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder2.logLevel;
        java.util.concurrent.Executor executor7 = null;
        builder2.setcallbackExecutor(executor7);
        retrofit.ErrorHandler errorHandler9 = builder2.errorHandler;
        java.util.concurrent.Executor executor10 = null;
        builder2.setcallbackExecutor(executor10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter2();
        builder2.serializedObjectSupporter = serializedObjectSupporter12;
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
        builder2.setclientProvider(provider56);
        builder0.clientProvider = provider56;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(gsonConverter14);
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
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider20 = builder19.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel21 = builder19.logLevel;
        restAdapter10.logLevel = logLevel21;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.RestAdapter.Log log10 = null;
        builder8.log = log10;
        java.util.concurrent.Executor executor12 = null;
        builder8.callbackExecutor = executor12;
        retrofit.RequestInterceptor requestInterceptor14 = null;
        builder8.requestInterceptor = requestInterceptor14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        builder16.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        builder22.server = server24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        builder22.logLevel = logLevel26;
        retrofit.RestAdapter restAdapter28 = builder22.build();
        java.util.concurrent.Executor executor29 = builder22.getcallbackExecutor();
        builder16.setcallbackExecutor(executor29);
        builder8.httpExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        retrofit.client.Client.Provider provider33 = builder0.clientProvider;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler35 = builder0.profiler;
        java.util.concurrent.Executor executor36 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(executor29);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNotNull(executor36);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        java.util.concurrent.Executor executor9 = null;
        builder7.sethttpExecutor(executor9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter2();
        builder11.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.RestAdapter.Builder builder18 = builder11.setServer("Retrofit-");
        java.util.concurrent.Executor executor19 = builder18.httpExecutor;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server22 = serializedObjectSupporter21.deserializeObjectServer1();
        builder20.server = server22;
        retrofit.RestAdapter.LogLevel logLevel24 = builder20.logLevel;
        builder20.ensureSaneDefaults();
        java.util.concurrent.Executor executor26 = null;
        builder20.setcallbackExecutor(executor26);
        java.util.concurrent.Executor executor28 = null;
        builder20.callbackExecutor = executor28;
        retrofit.client.Client.Provider provider30 = builder20.clientProvider;
        builder18.setclientProvider(provider30);
        builder7.setclientProvider(provider30);
        retrofit.RestAdapter.Builder builder34 = builder7.setServer("OK");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        builder23.server = server25;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.BASIC;
        builder23.logLevel = logLevel27;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server31 = serializedObjectSupporter30.deserializeObjectServer1();
        builder29.server = server31;
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.BASIC;
        builder29.logLevel = logLevel33;
        retrofit.RestAdapter restAdapter35 = builder29.build();
        java.util.concurrent.Executor executor36 = builder29.getcallbackExecutor();
        builder23.setcallbackExecutor(executor36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter38.deserializeObjectConverter2();
        retrofit.client.Response response41 = serializedObjectSupporter38.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter38.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder43 = builder23.setConverter((retrofit.converter.Converter) gsonConverter42);
        builder7.converter = gsonConverter42;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter35);
        org.junit.Assert.assertNotNull(executor36);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList6 = response5.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.LogLevel logLevel18 = builder14.logLevel;
        java.util.concurrent.Executor executor19 = builder14.httpExecutor;
        java.util.concurrent.Executor executor20 = builder14.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = builder21.httpExecutor;
        retrofit.RestAdapter.Log log23 = null;
        builder21.log = log23;
        java.util.concurrent.Executor executor25 = null;
        builder21.callbackExecutor = executor25;
        retrofit.Profiler profiler27 = null;
        builder21.profiler = profiler27;
        builder21.ensureSaneDefaults();
        java.util.concurrent.Executor executor30 = builder21.callbackExecutor;
        builder14.setcallbackExecutor(executor30);
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server34 = serializedObjectSupporter33.deserializeObjectServer1();
        builder32.server = server34;
        retrofit.RestAdapter.LogLevel logLevel36 = builder32.logLevel;
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server39 = serializedObjectSupporter38.deserializeObjectServer1();
        builder37.server = server39;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.BASIC;
        builder37.logLevel = logLevel41;
        retrofit.RestAdapter restAdapter43 = builder37.build();
        java.util.concurrent.Executor executor44 = builder37.getcallbackExecutor();
        builder32.setcallbackExecutor(executor44);
        retrofit.RestAdapter.Builder builder46 = builder0.setExecutors(executor30, executor44);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertNotNull(executor44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler23 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider24 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput4 = response3.getBody();
        java.lang.String str5 = response3.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(typedInput4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
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
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler17.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restHandler17.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server17 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(server17);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        retrofit.Server server18 = restAdapter10.server;
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        builder2.server = server4;
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.BASIC;
        builder2.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder8.serializedObjectSupporter = serializedObjectSupporter10;
        java.util.concurrent.Executor executor14 = null;
        builder8.callbackExecutor = executor14;
        retrofit.Profiler profiler16 = null;
        builder8.profiler = profiler16;
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
        retrofit.RestAdapter.Builder builder61 = builder8.setClient(provider58);
        builder2.setclientProvider(provider58);
        retrofit.RestAdapter.Builder builder63 = builder0.setClient(provider58);
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor65 = builder64.httpExecutor;
        retrofit.RestAdapter.Builder builder66 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server68 = serializedObjectSupporter67.deserializeObjectServer1();
        builder66.server = server68;
        builder64.server = server68;
        builder63.server = server68;
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = builder63.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
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
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(executor65);
        org.junit.Assert.assertNotNull(server68);
        org.junit.Assert.assertNull(serializedObjectSupporter72);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
        builder11.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder14 = builder11.setServer("Retrofit-");
        retrofit.Profiler profiler15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder11.setProfiler(profiler15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter17);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        retrofit.client.Client.Provider provider8 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(provider8);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.Profiler profiler10 = builder0.profiler;
        retrofit.RequestInterceptor requestInterceptor11 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNotNull(requestInterceptor11);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        builder0.ensureSaneDefaults();
        retrofit.converter.Converter converter13 = builder0.converter;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(converter13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter2();
        builder9.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.RestAdapter.Builder builder16 = builder9.setServer("Retrofit-");
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        builder18.server = server20;
        retrofit.RestAdapter.LogLevel logLevel22 = builder18.logLevel;
        builder18.ensureSaneDefaults();
        java.util.concurrent.Executor executor24 = null;
        builder18.setcallbackExecutor(executor24);
        java.util.concurrent.Executor executor26 = null;
        builder18.callbackExecutor = executor26;
        retrofit.client.Client.Provider provider28 = builder18.clientProvider;
        builder16.setclientProvider(provider28);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter32.deserializeObjectConverter2();
        builder30.serializedObjectSupporter = serializedObjectSupporter32;
        retrofit.RestAdapter.Builder builder37 = builder30.setServer("Retrofit-");
        java.util.concurrent.Executor executor38 = builder37.httpExecutor;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server41 = serializedObjectSupporter40.deserializeObjectServer1();
        builder39.server = server41;
        retrofit.RestAdapter.LogLevel logLevel43 = builder39.logLevel;
        builder39.ensureSaneDefaults();
        java.util.concurrent.Executor executor45 = null;
        builder39.setcallbackExecutor(executor45);
        java.util.concurrent.Executor executor47 = null;
        builder39.callbackExecutor = executor47;
        retrofit.client.Client.Provider provider49 = builder39.clientProvider;
        builder37.setclientProvider(provider49);
        builder16.setclientProvider(provider49);
        retrofit.RestAdapter.Builder builder52 = builder0.setClient(provider49);
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor54 = builder53.httpExecutor;
        retrofit.RestAdapter.Log log55 = null;
        builder53.log = log55;
        java.util.concurrent.Executor executor57 = null;
        builder53.callbackExecutor = executor57;
        retrofit.RequestInterceptor requestInterceptor59 = null;
        builder53.requestInterceptor = requestInterceptor59;
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server63 = serializedObjectSupporter62.deserializeObjectServer1();
        builder61.server = server63;
        retrofit.RestAdapter.LogLevel logLevel65 = retrofit.RestAdapter.LogLevel.BASIC;
        builder61.logLevel = logLevel65;
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server69 = serializedObjectSupporter68.deserializeObjectServer1();
        builder67.server = server69;
        retrofit.RestAdapter.LogLevel logLevel71 = retrofit.RestAdapter.LogLevel.BASIC;
        builder67.logLevel = logLevel71;
        retrofit.RestAdapter restAdapter73 = builder67.build();
        java.util.concurrent.Executor executor74 = builder67.getcallbackExecutor();
        builder61.setcallbackExecutor(executor74);
        builder53.httpExecutor = executor74;
        builder52.setcallbackExecutor(executor74);
        retrofit.Server server78 = builder52.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(executor54);
        org.junit.Assert.assertNotNull(server63);
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server69);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter73);
        org.junit.Assert.assertNotNull(executor74);
        org.junit.Assert.assertNull(server78);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter restAdapter6 = builder0.build();
        retrofit.RestAdapter.RestHandler restHandler7 = restAdapter6.new RestHandler();
        java.util.concurrent.Executor executor8 = restAdapter6.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter6);
        org.junit.Assert.assertNotNull(executor8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter2();
        retrofit.client.Response response18 = serializedObjectSupporter14.deserializeObjectResponse3();
        retrofit.client.Response response19 = serializedObjectSupporter14.deserializeObjectResponse7();
        retrofit.client.Response response20 = serializedObjectSupporter14.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response22 = restAdapter10.logAndReplaceResponse("Retrofit-", response20, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str7 = response6.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter2.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(converter4);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = null;
        builder7.callbackExecutor = executor21;
        retrofit.ErrorHandler errorHandler23 = builder7.errorHandler;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        builder24.server = server26;
        java.util.concurrent.Executor executor28 = null;
        builder24.setcallbackExecutor(executor28);
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        builder24.logLevel = logLevel30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = builder32.httpExecutor;
        retrofit.RestAdapter.Log log34 = null;
        builder32.log = log34;
        java.util.concurrent.Executor executor36 = null;
        builder32.callbackExecutor = executor36;
        retrofit.RequestInterceptor requestInterceptor38 = null;
        builder32.requestInterceptor = requestInterceptor38;
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server42 = serializedObjectSupporter41.deserializeObjectServer1();
        builder40.server = server42;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.BASIC;
        builder40.logLevel = logLevel44;
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server48 = serializedObjectSupporter47.deserializeObjectServer1();
        builder46.server = server48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.BASIC;
        builder46.logLevel = logLevel50;
        retrofit.RestAdapter restAdapter52 = builder46.build();
        java.util.concurrent.Executor executor53 = builder46.getcallbackExecutor();
        builder40.setcallbackExecutor(executor53);
        builder32.httpExecutor = executor53;
        builder24.setcallbackExecutor(executor53);
        builder7.setcallbackExecutor(executor53);
        retrofit.RestAdapter restAdapter58 = builder7.build();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter52);
        org.junit.Assert.assertNotNull(executor53);
        org.junit.Assert.assertNotNull(restAdapter58);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        retrofit.converter.Converter converter9 = builder8.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(converter9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(wildcardClass4);
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
        retrofit.Server server11 = restAdapter10.getserver();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.Log log8 = builder0.log;
        retrofit.RestAdapter.Log log9 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(log9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.client.Response response14 = serializedObjectSupporter10.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter15 = serializedObjectSupporter10.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor21 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(executor21);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        boolean boolean8 = logLevel7.log();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.client.Response response14 = serializedObjectSupporter10.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput15 = response14.body;
        java.util.List<retrofit.client.Header> headerList16 = response14.getHeaders();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(typedInput15);
        org.junit.Assert.assertNotNull(headerList16);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter11 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNull(converter10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        retrofit.RequestInterceptor requestInterceptor24 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter20);
        org.junit.Assert.assertNotNull(executor21);
        org.junit.Assert.assertNull(requestInterceptor24);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter2();
        builder14.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.RestAdapter.Builder builder21 = builder14.setServer("Retrofit-");
        java.util.concurrent.Executor executor22 = builder21.httpExecutor;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        builder23.server = server25;
        retrofit.RestAdapter.LogLevel logLevel27 = builder23.logLevel;
        builder23.ensureSaneDefaults();
        java.util.concurrent.Executor executor29 = null;
        builder23.setcallbackExecutor(executor29);
        java.util.concurrent.Executor executor31 = null;
        builder23.callbackExecutor = executor31;
        retrofit.client.Client.Provider provider33 = builder23.clientProvider;
        builder21.setclientProvider(provider33);
        java.util.concurrent.Executor executor35 = builder21.gethttpExecutor();
        retrofit.RestAdapter restAdapter36 = builder21.build();
        retrofit.RestAdapter restAdapter37 = builder21.build();
        retrofit.Server server38 = restAdapter37.server;
        retrofit.RestAdapter.Builder builder39 = builder0.setServer(server38);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider33);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNotNull(restAdapter36);
        org.junit.Assert.assertNotNull(restAdapter37);
        org.junit.Assert.assertNotNull(server38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.String str21 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = restAdapter10.server;
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable18, "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server17);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.RestAdapter.Log log18 = null;
        builder16.log = log18;
        java.util.concurrent.Executor executor20 = null;
        builder16.callbackExecutor = executor20;
        retrofit.Profiler profiler22 = null;
        builder16.profiler = profiler22;
        builder16.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider26 = builder25.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel27 = builder25.logLevel;
        builder16.logLevel = logLevel27;
        restAdapter10.logLevel = logLevel27;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter restAdapter23 = builder7.build();
        retrofit.Server server24 = restAdapter23.server;
        java.lang.String str25 = restAdapter23.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(restAdapter23);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.Log log8 = builder0.log;
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(errorHandler9);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        retrofit.RestAdapter.Builder builder25 = builder0.setServer("Retrofit-");
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter18.deserializeObjectConverter5();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter22);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.client.Response response21 = serializedObjectSupporter16.deserializeObjectResponse7();
        retrofit.client.Response response22 = serializedObjectSupporter16.deserializeObjectResponse1();
        retrofit.client.Response response23 = serializedObjectSupporter16.deserializeObjectResponse3();
        restHandler15.serializedObjectSupporter = serializedObjectSupporter16;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(errorHandler21);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server18 = restAdapter10.getserver();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter5();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter4.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder8 = builder2.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.RestAdapter.Builder builder9 = builder0.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(provider10);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler17.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.getReason();
        int int8 = response5.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.Server server6 = builder0.server;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.RestAdapter.Log log10 = null;
        builder8.log = log10;
        java.util.concurrent.Executor executor12 = null;
        builder8.callbackExecutor = executor12;
        retrofit.RequestInterceptor requestInterceptor14 = null;
        builder8.requestInterceptor = requestInterceptor14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        builder16.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        builder22.server = server24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        builder22.logLevel = logLevel26;
        retrofit.RestAdapter restAdapter28 = builder22.build();
        java.util.concurrent.Executor executor29 = builder22.getcallbackExecutor();
        builder16.setcallbackExecutor(executor29);
        builder8.httpExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        retrofit.client.Client.Provider provider33 = builder0.clientProvider;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler35 = builder0.profiler;
        retrofit.converter.Converter converter36 = builder0.converter;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(executor29);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNotNull(converter36);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        retrofit.converter.Converter converter14 = builder0.converter;
        retrofit.client.Client client15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder0.setClient(client15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(converter14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter restAdapter23 = builder7.build();
        retrofit.client.Client.Provider provider24 = builder7.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(restAdapter23);
        org.junit.Assert.assertNotNull(provider24);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.client.Response response14 = serializedObjectSupporter10.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter10.deserializeObjectString7();
        retrofit.client.Response response16 = serializedObjectSupporter10.deserializeObjectResponse1();
        retrofit.client.Response response17 = serializedObjectSupporter10.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        builder2.server = server4;
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.BASIC;
        builder2.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder8.serializedObjectSupporter = serializedObjectSupporter10;
        java.util.concurrent.Executor executor14 = null;
        builder8.callbackExecutor = executor14;
        retrofit.Profiler profiler16 = null;
        builder8.profiler = profiler16;
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
        retrofit.RestAdapter.Builder builder61 = builder8.setClient(provider58);
        builder2.setclientProvider(provider58);
        retrofit.RestAdapter.Builder builder63 = builder0.setClient(provider58);
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor65 = builder64.httpExecutor;
        retrofit.RestAdapter.Builder builder66 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server68 = serializedObjectSupporter67.deserializeObjectServer1();
        builder66.server = server68;
        builder64.server = server68;
        builder63.server = server68;
        retrofit.Profiler profiler72 = null;
        builder63.profiler = profiler72;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
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
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(executor65);
        org.junit.Assert.assertNotNull(server68);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = builder15.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        builder2.server = server4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder2.logLevel;
        java.util.concurrent.Executor executor7 = null;
        builder2.setcallbackExecutor(executor7);
        retrofit.client.Client.Provider provider9 = builder2.clientProvider;
        retrofit.client.Client.Provider provider10 = null;
        builder2.clientProvider = provider10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        builder12.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.RestAdapter.Builder builder19 = builder12.setServer("Retrofit-");
        java.util.concurrent.Executor executor20 = builder19.httpExecutor;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server23 = serializedObjectSupporter22.deserializeObjectServer1();
        builder21.server = server23;
        retrofit.RestAdapter.LogLevel logLevel25 = builder21.logLevel;
        builder21.ensureSaneDefaults();
        java.util.concurrent.Executor executor27 = null;
        builder21.setcallbackExecutor(executor27);
        java.util.concurrent.Executor executor29 = null;
        builder21.callbackExecutor = executor29;
        retrofit.client.Client.Provider provider31 = builder21.clientProvider;
        builder19.setclientProvider(provider31);
        java.util.concurrent.Executor executor33 = builder19.gethttpExecutor();
        retrofit.RestAdapter restAdapter34 = builder19.build();
        java.util.concurrent.Executor executor35 = restAdapter34.httpExecutor;
        builder2.callbackExecutor = executor35;
        builder0.callbackExecutor = executor35;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNotNull(restAdapter34);
        org.junit.Assert.assertNotNull(executor35);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.Server server9 = builder7.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder7.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(requestInterceptor5);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.Log log20 = restAdapter10.log;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(log20);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor63 = builder62.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter64 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter65 = serializedObjectSupporter64.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter64.deserializeObjectConverter2();
        builder62.serializedObjectSupporter = serializedObjectSupporter64;
        retrofit.RestAdapter.Builder builder69 = builder62.setServer("Retrofit-");
        java.util.concurrent.Executor executor70 = builder69.httpExecutor;
        java.util.concurrent.Executor executor71 = null;
        builder69.sethttpExecutor(executor71);
        retrofit.RestAdapter.Builder builder73 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor74 = builder73.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter76 = serializedObjectSupporter75.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter77 = serializedObjectSupporter75.deserializeObjectConverter2();
        builder73.serializedObjectSupporter = serializedObjectSupporter75;
        retrofit.RestAdapter.Builder builder80 = builder73.setServer("Retrofit-");
        java.util.concurrent.Executor executor81 = builder80.httpExecutor;
        retrofit.RestAdapter.Builder builder82 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter83 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server84 = serializedObjectSupporter83.deserializeObjectServer1();
        builder82.server = server84;
        retrofit.RestAdapter.LogLevel logLevel86 = builder82.logLevel;
        builder82.ensureSaneDefaults();
        java.util.concurrent.Executor executor88 = null;
        builder82.setcallbackExecutor(executor88);
        java.util.concurrent.Executor executor90 = null;
        builder82.callbackExecutor = executor90;
        retrofit.client.Client.Provider provider92 = builder82.clientProvider;
        builder80.setclientProvider(provider92);
        builder69.setclientProvider(provider92);
        builder0.clientProvider = provider92;
        retrofit.ErrorHandler errorHandler96 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder97 = builder0.setErrorHandler(errorHandler96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
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
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertNotNull(gsonConverter65);
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(executor70);
        org.junit.Assert.assertNull(executor74);
        org.junit.Assert.assertNotNull(gsonConverter76);
        org.junit.Assert.assertNotNull(gsonConverter77);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNull(executor81);
        org.junit.Assert.assertNotNull(server84);
        org.junit.Assert.assertTrue("'" + logLevel86 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel86.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider92);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.Profiler profiler2 = builder0.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(profiler2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(errorHandler8);
        org.junit.Assert.assertNull(requestInterceptor9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString10();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.client.Response response19 = serializedObjectSupporter14.deserializeObjectResponse2();
        int int20 = response19.status;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = response3.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        retrofit.converter.Converter converter14 = builder0.converter;
        retrofit.converter.Converter converter15 = builder0.converter;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNotNull(converter15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(errorHandler16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(profiler19);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.logLevel;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel18);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler19 = restAdapter10.errorHandler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(errorHandler19);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter restAdapter6 = builder0.build();
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        retrofit.RestAdapter restAdapter8 = builder0.build();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter6);
        org.junit.Assert.assertNotNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter8);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class7 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("OK");
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor8 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        org.junit.Assert.assertNull(executor1);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Server server13 = restAdapter10.getserver();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.Server server14 = restAdapter10.getserver();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(server14);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        builder17.server = server19;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.BASIC;
        builder17.logLevel = logLevel21;
        boolean boolean23 = logLevel21.log();
        boolean boolean24 = logLevel21.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.Server server15 = restAdapter10.server;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.Server server20 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(server20);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder6 = builder0.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.RequestInterceptor requestInterceptor7 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder8.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.RestAdapter.Builder builder15 = builder8.setServer("Retrofit-");
        java.util.concurrent.Executor executor16 = builder15.httpExecutor;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        builder17.server = server19;
        retrofit.RestAdapter.LogLevel logLevel21 = builder17.logLevel;
        builder17.ensureSaneDefaults();
        java.util.concurrent.Executor executor23 = null;
        builder17.setcallbackExecutor(executor23);
        java.util.concurrent.Executor executor25 = null;
        builder17.callbackExecutor = executor25;
        retrofit.client.Client.Provider provider27 = builder17.clientProvider;
        builder15.setclientProvider(provider27);
        java.util.concurrent.Executor executor29 = builder15.gethttpExecutor();
        retrofit.RestAdapter restAdapter30 = builder15.build();
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor32 = builder31.httpExecutor;
        retrofit.RestAdapter.Log log33 = null;
        builder31.log = log33;
        java.util.concurrent.Executor executor35 = null;
        builder31.callbackExecutor = executor35;
        retrofit.RequestInterceptor requestInterceptor37 = null;
        builder31.requestInterceptor = requestInterceptor37;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server41 = serializedObjectSupporter40.deserializeObjectServer1();
        builder39.server = server41;
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.BASIC;
        builder39.logLevel = logLevel43;
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server47 = serializedObjectSupporter46.deserializeObjectServer1();
        builder45.server = server47;
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.BASIC;
        builder45.logLevel = logLevel49;
        retrofit.RestAdapter restAdapter51 = builder45.build();
        java.util.concurrent.Executor executor52 = builder45.getcallbackExecutor();
        builder39.setcallbackExecutor(executor52);
        builder31.httpExecutor = executor52;
        retrofit.RestAdapter.Builder builder55 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor56 = builder55.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter58 = serializedObjectSupporter57.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter57.deserializeObjectConverter2();
        builder55.serializedObjectSupporter = serializedObjectSupporter57;
        retrofit.RestAdapter.Builder builder62 = builder55.setServer("Retrofit-");
        java.util.concurrent.Executor executor63 = builder62.httpExecutor;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server66 = serializedObjectSupporter65.deserializeObjectServer1();
        builder64.server = server66;
        retrofit.RestAdapter.LogLevel logLevel68 = builder64.logLevel;
        builder64.ensureSaneDefaults();
        java.util.concurrent.Executor executor70 = null;
        builder64.setcallbackExecutor(executor70);
        java.util.concurrent.Executor executor72 = null;
        builder64.callbackExecutor = executor72;
        retrofit.client.Client.Provider provider74 = builder64.clientProvider;
        builder62.setclientProvider(provider74);
        java.util.concurrent.Executor executor76 = builder62.gethttpExecutor();
        retrofit.RestAdapter restAdapter77 = builder62.build();
        java.util.concurrent.Executor executor78 = restAdapter77.httpExecutor;
        builder31.setcallbackExecutor(executor78);
        builder15.callbackExecutor = executor78;
        retrofit.RestAdapter.Builder builder81 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter82 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server83 = serializedObjectSupporter82.deserializeObjectServer1();
        builder81.server = server83;
        retrofit.RestAdapter.LogLevel logLevel85 = retrofit.RestAdapter.LogLevel.BASIC;
        builder81.logLevel = logLevel85;
        retrofit.RestAdapter restAdapter87 = builder81.build();
        java.util.concurrent.Executor executor88 = builder81.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder89 = builder0.setExecutors(executor78, executor88);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(requestInterceptor7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider27);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNotNull(restAdapter30);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server47);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter51);
        org.junit.Assert.assertNotNull(executor52);
        org.junit.Assert.assertNull(executor56);
        org.junit.Assert.assertNotNull(gsonConverter58);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider74);
        org.junit.Assert.assertNull(executor76);
        org.junit.Assert.assertNotNull(restAdapter77);
        org.junit.Assert.assertNotNull(executor78);
        org.junit.Assert.assertNotNull(server83);
        org.junit.Assert.assertTrue("'" + logLevel85 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel85.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter87);
        org.junit.Assert.assertNotNull(executor88);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.String str20 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Response response29 = serializedObjectSupporter26.deserializeObjectResponse2();
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
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        java.util.concurrent.Executor executor23 = restAdapter22.httpExecutor;
        retrofit.converter.Converter converter24 = restAdapter22.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(executor23);
        org.junit.Assert.assertNotNull(converter24);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        java.util.concurrent.Executor executor23 = restAdapter22.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor24 = restAdapter22.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(executor23);
        org.junit.Assert.assertNotNull(requestInterceptor24);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        java.lang.String str4 = response2.reason;
        retrofit.mime.TypedInput typedInput5 = response2.getBody();
        java.lang.String str6 = response2.getReason();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(typedInput3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter2();
        builder10.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.RestAdapter.Builder builder17 = builder10.setServer("Retrofit-");
        java.util.concurrent.Executor executor18 = builder17.httpExecutor;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server21 = serializedObjectSupporter20.deserializeObjectServer1();
        builder19.server = server21;
        retrofit.RestAdapter.LogLevel logLevel23 = builder19.logLevel;
        builder19.ensureSaneDefaults();
        java.util.concurrent.Executor executor25 = null;
        builder19.setcallbackExecutor(executor25);
        java.util.concurrent.Executor executor27 = null;
        builder19.callbackExecutor = executor27;
        retrofit.client.Client.Provider provider29 = builder19.clientProvider;
        builder17.setclientProvider(provider29);
        java.util.concurrent.Executor executor31 = builder17.gethttpExecutor();
        retrofit.RestAdapter restAdapter32 = builder17.build();
        java.util.concurrent.Executor executor33 = restAdapter32.httpExecutor;
        builder0.callbackExecutor = executor33;
        retrofit.RestAdapter.Log log35 = builder0.log;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(restAdapter32);
        org.junit.Assert.assertNotNull(executor33);
        org.junit.Assert.assertNull(log35);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        retrofit.Server server19 = restAdapter10.server;
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("OK");
        retrofit.RestAdapter restAdapter7 = builder0.build();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter7);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int4 = response3.status;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        retrofit.ErrorHandler errorHandler12 = builder0.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(executor9);
        org.junit.Assert.assertNotNull(errorHandler12);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        java.util.concurrent.Executor executor20 = null;
        builder16.setcallbackExecutor(executor20);
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        builder16.logLevel = logLevel22;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder16.log = log24;
        retrofit.RestAdapter.LogLevel logLevel26 = builder16.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.Log log8 = builder0.log;
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        java.util.concurrent.Executor executor10 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.RestAdapter.Log log10 = null;
        builder8.log = log10;
        java.util.concurrent.Executor executor12 = null;
        builder8.callbackExecutor = executor12;
        retrofit.RequestInterceptor requestInterceptor14 = null;
        builder8.requestInterceptor = requestInterceptor14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        builder16.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        builder22.server = server24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        builder22.logLevel = logLevel26;
        retrofit.RestAdapter restAdapter28 = builder22.build();
        java.util.concurrent.Executor executor29 = builder22.getcallbackExecutor();
        builder16.setcallbackExecutor(executor29);
        builder8.httpExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        retrofit.client.Client.Provider provider33 = builder0.clientProvider;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server37 = serializedObjectSupporter36.deserializeObjectServer1();
        builder35.server = server37;
        retrofit.RestAdapter.LogLevel logLevel39 = builder35.logLevel;
        java.util.concurrent.Executor executor40 = null;
        builder35.setcallbackExecutor(executor40);
        retrofit.client.Client.Provider provider42 = builder35.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter44 = serializedObjectSupporter43.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter43.deserializeObjectConverter2();
        builder35.converter = gsonConverter45;
        retrofit.RequestInterceptor requestInterceptor47 = builder35.requestInterceptor;
        retrofit.Profiler profiler48 = builder35.profiler;
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = builder49.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter51.deserializeObjectConverter2();
        builder49.serializedObjectSupporter = serializedObjectSupporter51;
        retrofit.RestAdapter.Builder builder56 = builder49.setServer("Retrofit-");
        java.util.concurrent.Executor executor57 = builder56.httpExecutor;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server60 = serializedObjectSupporter59.deserializeObjectServer1();
        builder58.server = server60;
        retrofit.RestAdapter.LogLevel logLevel62 = builder58.logLevel;
        builder58.ensureSaneDefaults();
        java.util.concurrent.Executor executor64 = null;
        builder58.setcallbackExecutor(executor64);
        java.util.concurrent.Executor executor66 = null;
        builder58.callbackExecutor = executor66;
        retrofit.client.Client.Provider provider68 = builder58.clientProvider;
        builder56.setclientProvider(provider68);
        java.util.concurrent.Executor executor70 = builder56.gethttpExecutor();
        retrofit.RestAdapter restAdapter71 = builder56.build();
        retrofit.RestAdapter restAdapter72 = builder56.build();
        retrofit.Server server73 = restAdapter72.server;
        retrofit.RestAdapter.Builder builder74 = builder35.setServer(server73);
        builder0.server = server73;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(executor29);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider42);
        org.junit.Assert.assertNotNull(gsonConverter44);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNull(requestInterceptor47);
        org.junit.Assert.assertNull(profiler48);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider68);
        org.junit.Assert.assertNull(executor70);
        org.junit.Assert.assertNotNull(restAdapter71);
        org.junit.Assert.assertNotNull(restAdapter72);
        org.junit.Assert.assertNotNull(server73);
        org.junit.Assert.assertNotNull(builder74);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.ErrorHandler errorHandler18 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter2();
        retrofit.client.Response response22 = serializedObjectSupporter20.deserializeObjectResponse2();
        retrofit.ErrorHandler errorHandler23 = serializedObjectSupporter20.deserializeObjectErrorHandler1();
        java.lang.String str24 = serializedObjectSupporter20.deserializeObjectString3();
        restHandler19.serializedObjectSupporter = serializedObjectSupporter20;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(errorHandler23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter2();
        retrofit.client.Response response14 = serializedObjectSupporter11.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder16 = builder0.setConverter((retrofit.converter.Converter) gsonConverter15);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
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
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel23 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor24 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(errorHandler22);
        org.junit.Assert.assertNull(logLevel23);
        org.junit.Assert.assertNull(executor24);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput6 = response5.getBody();
        int int7 = response5.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(typedInput6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
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
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(executor18);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        java.lang.String str19 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log21 = restAdapter10.log;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(log21);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Server server21 = restAdapter10.server;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(server21);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        retrofit.ErrorHandler errorHandler16 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel17 = builder0.logLevel;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder0.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor10 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server13 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(server13);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        retrofit.converter.Converter converter14 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        builder16.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.client.Client.Provider provider22 = builder16.getclientProvider();
        retrofit.converter.Converter converter23 = builder16.converter;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = builder24.httpExecutor;
        retrofit.Profiler profiler26 = null;
        builder24.profiler = profiler26;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server30 = serializedObjectSupporter29.deserializeObjectServer1();
        builder28.server = server30;
        retrofit.RestAdapter.LogLevel logLevel32 = builder28.logLevel;
        java.util.concurrent.Executor executor33 = null;
        builder28.setcallbackExecutor(executor33);
        retrofit.ErrorHandler errorHandler35 = builder28.errorHandler;
        java.util.concurrent.Executor executor36 = null;
        builder28.setcallbackExecutor(executor36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter38.deserializeObjectConverter2();
        builder28.serializedObjectSupporter = serializedObjectSupporter38;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor43 = builder42.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter44.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter44.deserializeObjectConverter2();
        builder42.serializedObjectSupporter = serializedObjectSupporter44;
        retrofit.RestAdapter.Builder builder49 = builder42.setServer("Retrofit-");
        java.util.concurrent.Executor executor50 = builder49.httpExecutor;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server53 = serializedObjectSupporter52.deserializeObjectServer1();
        builder51.server = server53;
        retrofit.RestAdapter.LogLevel logLevel55 = builder51.logLevel;
        builder51.ensureSaneDefaults();
        java.util.concurrent.Executor executor57 = null;
        builder51.setcallbackExecutor(executor57);
        java.util.concurrent.Executor executor59 = null;
        builder51.callbackExecutor = executor59;
        retrofit.client.Client.Provider provider61 = builder51.clientProvider;
        builder49.setclientProvider(provider61);
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor64 = builder63.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter65.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter65.deserializeObjectConverter2();
        builder63.serializedObjectSupporter = serializedObjectSupporter65;
        retrofit.RestAdapter.Builder builder70 = builder63.setServer("Retrofit-");
        java.util.concurrent.Executor executor71 = builder70.httpExecutor;
        retrofit.RestAdapter.Builder builder72 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server74 = serializedObjectSupporter73.deserializeObjectServer1();
        builder72.server = server74;
        retrofit.RestAdapter.LogLevel logLevel76 = builder72.logLevel;
        builder72.ensureSaneDefaults();
        java.util.concurrent.Executor executor78 = null;
        builder72.setcallbackExecutor(executor78);
        java.util.concurrent.Executor executor80 = null;
        builder72.callbackExecutor = executor80;
        retrofit.client.Client.Provider provider82 = builder72.clientProvider;
        builder70.setclientProvider(provider82);
        builder49.setclientProvider(provider82);
        builder28.setclientProvider(provider82);
        retrofit.RestAdapter.Builder builder86 = builder24.setClient(provider82);
        retrofit.RestAdapter.Builder builder87 = builder16.setClient(provider82);
        retrofit.RestAdapter.Builder builder88 = builder0.setClient(provider82);
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(converter23);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler35);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(server53);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider61);
        org.junit.Assert.assertNull(executor64);
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNull(executor71);
        org.junit.Assert.assertNotNull(server74);
        org.junit.Assert.assertTrue("'" + logLevel76 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel76.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider82);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
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
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter restAdapter23 = builder7.build();
        retrofit.Server server24 = restAdapter23.server;
        java.util.concurrent.Executor executor25 = restAdapter23.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(restAdapter23);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(executor25);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(logLevel16);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList4 = response3.headers;
        java.util.List<retrofit.client.Header> headerList5 = response3.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(log15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.client.Response response15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response17 = restAdapter10.logAndReplaceResponse("Internal Server Error", response15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider13);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable13, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(executor19);
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
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        java.util.concurrent.Executor executor23 = restAdapter22.httpExecutor;
        retrofit.Profiler profiler24 = restAdapter22.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(executor23);
        org.junit.Assert.assertNull(profiler24);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        builder0.ensureSaneDefaults();
        retrofit.converter.Converter converter13 = builder0.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(converter13);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.RestAdapter.Log log10 = null;
        builder8.log = log10;
        java.util.concurrent.Executor executor12 = null;
        builder8.callbackExecutor = executor12;
        retrofit.RequestInterceptor requestInterceptor14 = null;
        builder8.requestInterceptor = requestInterceptor14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        builder16.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server24 = serializedObjectSupporter23.deserializeObjectServer1();
        builder22.server = server24;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        builder22.logLevel = logLevel26;
        retrofit.RestAdapter restAdapter28 = builder22.build();
        java.util.concurrent.Executor executor29 = builder22.getcallbackExecutor();
        builder16.setcallbackExecutor(executor29);
        builder8.httpExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        java.util.concurrent.Executor executor33 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor34 = builder0.httpExecutor;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(executor29);
        org.junit.Assert.assertNotNull(executor33);
        org.junit.Assert.assertNull(executor34);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = null;
        builder7.callbackExecutor = executor21;
        retrofit.ErrorHandler errorHandler23 = builder7.errorHandler;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server26 = serializedObjectSupporter25.deserializeObjectServer1();
        builder24.server = server26;
        java.util.concurrent.Executor executor28 = null;
        builder24.setcallbackExecutor(executor28);
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        builder24.logLevel = logLevel30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = builder32.httpExecutor;
        retrofit.RestAdapter.Log log34 = null;
        builder32.log = log34;
        java.util.concurrent.Executor executor36 = null;
        builder32.callbackExecutor = executor36;
        retrofit.RequestInterceptor requestInterceptor38 = null;
        builder32.requestInterceptor = requestInterceptor38;
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server42 = serializedObjectSupporter41.deserializeObjectServer1();
        builder40.server = server42;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.BASIC;
        builder40.logLevel = logLevel44;
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server48 = serializedObjectSupporter47.deserializeObjectServer1();
        builder46.server = server48;
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.BASIC;
        builder46.logLevel = logLevel50;
        retrofit.RestAdapter restAdapter52 = builder46.build();
        java.util.concurrent.Executor executor53 = builder46.getcallbackExecutor();
        builder40.setcallbackExecutor(executor53);
        builder32.httpExecutor = executor53;
        builder24.setcallbackExecutor(executor53);
        builder7.setcallbackExecutor(executor53);
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server60 = serializedObjectSupporter59.deserializeObjectServer1();
        builder58.server = server60;
        java.util.concurrent.Executor executor62 = null;
        builder58.setcallbackExecutor(executor62);
        retrofit.RestAdapter.LogLevel logLevel64 = retrofit.RestAdapter.LogLevel.FULL;
        builder58.logLevel = logLevel64;
        boolean boolean66 = logLevel64.log();
        retrofit.RestAdapter.Builder builder67 = builder7.setLogLevel(logLevel64);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter52);
        org.junit.Assert.assertNotNull(executor53);
        org.junit.Assert.assertNotNull(server60);
        org.junit.Assert.assertTrue("'" + logLevel64 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel64.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel6;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log8;
        log8.log("");
        log8.log("Internal Server Error");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log8);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(logLevel18);
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = null;
        builder0.setcallbackExecutor(executor6);
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.Profiler profiler10 = builder0.profiler;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler10);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        retrofit.Profiler profiler19 = restAdapter10.getprofiler();
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(profiler19);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput4 = response3.getBody();
        retrofit.mime.TypedInput typedInput5 = response3.getBody();
        retrofit.mime.TypedInput typedInput6 = response3.body;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(typedInput4);
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertNull(typedInput6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList7 = response6.headers;
        java.lang.String str8 = response6.getReason();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OK" + "'", str8, "OK");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel23 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor24 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(errorHandler22);
        org.junit.Assert.assertNull(logLevel23);
        org.junit.Assert.assertNull(executor24);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString10();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.client.Response response19 = serializedObjectSupporter14.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter20 = serializedObjectSupporter14.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response19);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(logLevel17);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        retrofit.Server server19 = restAdapter10.server;
        java.util.concurrent.Executor executor20 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(executor20);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class7 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter restAdapter23 = builder7.build();
        retrofit.RequestInterceptor requestInterceptor24 = restAdapter23.requestInterceptor;
        java.util.concurrent.Executor executor25 = restAdapter23.callbackExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(restAdapter23);
        org.junit.Assert.assertNotNull(requestInterceptor24);
        org.junit.Assert.assertNotNull(executor25);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        retrofit.converter.Converter converter4 = null;
        builder0.converter = converter4;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.httpExecutor;
        retrofit.RestAdapter.Log log11 = null;
        builder9.log = log11;
        java.util.concurrent.Executor executor13 = null;
        builder9.callbackExecutor = executor13;
        retrofit.Profiler profiler15 = null;
        builder9.profiler = profiler15;
        builder9.ensureSaneDefaults();
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
        retrofit.RestAdapter.Builder builder61 = builder9.setClient(provider58);
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor63 = builder62.httpExecutor;
        retrofit.RestAdapter.Log log64 = null;
        builder62.log = log64;
        java.util.concurrent.Executor executor66 = null;
        builder62.callbackExecutor = executor66;
        retrofit.RequestInterceptor requestInterceptor68 = null;
        builder62.requestInterceptor = requestInterceptor68;
        retrofit.RestAdapter.Builder builder70 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter71 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server72 = serializedObjectSupporter71.deserializeObjectServer1();
        builder70.server = server72;
        retrofit.RestAdapter.LogLevel logLevel74 = retrofit.RestAdapter.LogLevel.BASIC;
        builder70.logLevel = logLevel74;
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server78 = serializedObjectSupporter77.deserializeObjectServer1();
        builder76.server = server78;
        retrofit.RestAdapter.LogLevel logLevel80 = retrofit.RestAdapter.LogLevel.BASIC;
        builder76.logLevel = logLevel80;
        retrofit.RestAdapter restAdapter82 = builder76.build();
        java.util.concurrent.Executor executor83 = builder76.getcallbackExecutor();
        builder70.setcallbackExecutor(executor83);
        builder62.httpExecutor = executor83;
        builder61.setcallbackExecutor(executor83);
        builder0.httpExecutor = executor83;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNull(executor10);
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
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(executor63);
        org.junit.Assert.assertNotNull(server72);
        org.junit.Assert.assertTrue("'" + logLevel74 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel74.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server78);
        org.junit.Assert.assertTrue("'" + logLevel80 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel80.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter82);
        org.junit.Assert.assertNotNull(executor83);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(executor15);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.client.Response response27 = serializedObjectSupporter22.deserializeObjectResponse7();
        java.lang.String str28 = serializedObjectSupporter22.deserializeObjectString1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter22;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter30 = serializedObjectSupporter22.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Retrofit-" + "'", str28, "Retrofit-");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter21.deserializeObjectConverter2();
        builder19.serializedObjectSupporter = serializedObjectSupporter21;
        retrofit.Profiler profiler25 = null;
        builder19.profiler = profiler25;
        retrofit.RestAdapter.Builder builder28 = builder19.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel29 = builder28.logLevel;
        restAdapter10.logLevel = logLevel29;
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler32 = restAdapter10.profiler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(requestInterceptor31);
        org.junit.Assert.assertNull(profiler32);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(log16);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse3();
        retrofit.client.Response response7 = serializedObjectSupporter2.deserializeObjectResponse1();
        int int8 = response7.getStatus();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Server server13 = restAdapter10.getserver();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server13);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(profiler19);
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.Server server14 = restAdapter10.server;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(server14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor24 = builder23.httpExecutor;
        retrofit.RestAdapter.Log log25 = null;
        builder23.log = log25;
        java.util.concurrent.Executor executor27 = null;
        builder23.callbackExecutor = executor27;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        builder23.requestInterceptor = requestInterceptor29;
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server33 = serializedObjectSupporter32.deserializeObjectServer1();
        builder31.server = server33;
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.BASIC;
        builder31.logLevel = logLevel35;
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server39 = serializedObjectSupporter38.deserializeObjectServer1();
        builder37.server = server39;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.BASIC;
        builder37.logLevel = logLevel41;
        retrofit.RestAdapter restAdapter43 = builder37.build();
        java.util.concurrent.Executor executor44 = builder37.getcallbackExecutor();
        builder31.setcallbackExecutor(executor44);
        builder23.httpExecutor = executor44;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter2();
        builder47.serializedObjectSupporter = serializedObjectSupporter49;
        retrofit.RestAdapter.Builder builder54 = builder47.setServer("Retrofit-");
        java.util.concurrent.Executor executor55 = builder54.httpExecutor;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server58 = serializedObjectSupporter57.deserializeObjectServer1();
        builder56.server = server58;
        retrofit.RestAdapter.LogLevel logLevel60 = builder56.logLevel;
        builder56.ensureSaneDefaults();
        java.util.concurrent.Executor executor62 = null;
        builder56.setcallbackExecutor(executor62);
        java.util.concurrent.Executor executor64 = null;
        builder56.callbackExecutor = executor64;
        retrofit.client.Client.Provider provider66 = builder56.clientProvider;
        builder54.setclientProvider(provider66);
        java.util.concurrent.Executor executor68 = builder54.gethttpExecutor();
        retrofit.RestAdapter restAdapter69 = builder54.build();
        java.util.concurrent.Executor executor70 = restAdapter69.httpExecutor;
        builder23.setcallbackExecutor(executor70);
        builder7.callbackExecutor = executor70;
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = builder7.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(server33);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertNotNull(executor44);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(server58);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider66);
        org.junit.Assert.assertNull(executor68);
        org.junit.Assert.assertNotNull(restAdapter69);
        org.junit.Assert.assertNotNull(executor70);
        org.junit.Assert.assertNotNull(serializedObjectSupporter73);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString6();
        retrofit.ErrorHandler errorHandler20 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        restHandler16.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.client.Response response22 = serializedObjectSupporter18.deserializeObjectResponse3();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler20);
        org.junit.Assert.assertNotNull(response22);
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
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor12);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor23 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(executor23);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.Server server19 = restAdapter10.server;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(server19);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter restAdapter6 = builder0.build();
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler8 = builder0.profiler;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter2();
        builder9.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean16 = logLevel15.log();
        retrofit.RestAdapter.Builder builder17 = builder9.setLogLevel(logLevel15);
        builder0.logLevel = logLevel15;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter6);
        org.junit.Assert.assertNotNull(executor7);
        org.junit.Assert.assertNull(profiler8);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.client.Response response14 = serializedObjectSupporter10.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput15 = response14.getBody();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(typedInput15);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        retrofit.Server server12 = builder0.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(server12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter10.logLevel = logLevel14;
        retrofit.Server server16 = restAdapter10.server;
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter18.deserializeObjectConverter2();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter22);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        int int4 = response2.getStatus();
        retrofit.mime.TypedInput typedInput5 = response2.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(typedInput3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNull(typedInput5);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        retrofit.Profiler profiler11 = builder0.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(profiler11);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server15 = restAdapter10.server;
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
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
        retrofit.client.Client.Provider provider22 = restAdapter10.clientProvider;
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
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        retrofit.Server server20 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertNull(server20);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server4 = serializedObjectSupporter3.deserializeObjectServer1();
        builder2.server = server4;
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.BASIC;
        builder2.logLevel = logLevel6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder8.serializedObjectSupporter = serializedObjectSupporter10;
        java.util.concurrent.Executor executor14 = null;
        builder8.callbackExecutor = executor14;
        retrofit.Profiler profiler16 = null;
        builder8.profiler = profiler16;
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
        retrofit.RestAdapter.Builder builder61 = builder8.setClient(provider58);
        builder2.setclientProvider(provider58);
        retrofit.RestAdapter.Builder builder63 = builder0.setClient(provider58);
        retrofit.RestAdapter.Log log64 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
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
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(log64);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int3 = response2.getStatus();
        java.util.List<retrofit.client.Header> headerList4 = response2.headers;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(headerList4);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.Server server17 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(server17);
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
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter5();
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
        org.junit.Assert.assertNotNull(gsonConverter29);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
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
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.getReason();
        retrofit.mime.TypedInput typedInput8 = response5.body;
        java.util.List<retrofit.client.Header> headerList9 = response5.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
        org.junit.Assert.assertNull(typedInput8);
        org.junit.Assert.assertNotNull(headerList9);
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server19 = serializedObjectSupporter18.deserializeObjectServer1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse2();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int4 = response3.status;
        retrofit.mime.TypedInput typedInput5 = response3.body;
        retrofit.mime.TypedInput typedInput6 = response3.getBody();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertNull(typedInput6);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log20 = restAdapter10.log;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(log20);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(converter19);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.Profiler profiler10 = null;
        builder8.profiler = profiler10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        builder12.server = server14;
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        java.util.concurrent.Executor executor17 = null;
        builder12.setcallbackExecutor(executor17);
        retrofit.ErrorHandler errorHandler19 = builder12.errorHandler;
        java.util.concurrent.Executor executor20 = null;
        builder12.setcallbackExecutor(executor20);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter2();
        builder12.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor27 = builder26.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter28.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter2();
        builder26.serializedObjectSupporter = serializedObjectSupporter28;
        retrofit.RestAdapter.Builder builder33 = builder26.setServer("Retrofit-");
        java.util.concurrent.Executor executor34 = builder33.httpExecutor;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server37 = serializedObjectSupporter36.deserializeObjectServer1();
        builder35.server = server37;
        retrofit.RestAdapter.LogLevel logLevel39 = builder35.logLevel;
        builder35.ensureSaneDefaults();
        java.util.concurrent.Executor executor41 = null;
        builder35.setcallbackExecutor(executor41);
        java.util.concurrent.Executor executor43 = null;
        builder35.callbackExecutor = executor43;
        retrofit.client.Client.Provider provider45 = builder35.clientProvider;
        builder33.setclientProvider(provider45);
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter2();
        builder47.serializedObjectSupporter = serializedObjectSupporter49;
        retrofit.RestAdapter.Builder builder54 = builder47.setServer("Retrofit-");
        java.util.concurrent.Executor executor55 = builder54.httpExecutor;
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server58 = serializedObjectSupporter57.deserializeObjectServer1();
        builder56.server = server58;
        retrofit.RestAdapter.LogLevel logLevel60 = builder56.logLevel;
        builder56.ensureSaneDefaults();
        java.util.concurrent.Executor executor62 = null;
        builder56.setcallbackExecutor(executor62);
        java.util.concurrent.Executor executor64 = null;
        builder56.callbackExecutor = executor64;
        retrofit.client.Client.Provider provider66 = builder56.clientProvider;
        builder54.setclientProvider(provider66);
        builder33.setclientProvider(provider66);
        builder12.setclientProvider(provider66);
        retrofit.RestAdapter.Builder builder70 = builder8.setClient(provider66);
        retrofit.RestAdapter.Builder builder71 = builder0.setClient(provider66);
        retrofit.RestAdapter.Builder builder73 = builder71.setServer("Retrofit-");
        retrofit.RestAdapter.Builder builder74 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server76 = serializedObjectSupporter75.deserializeObjectServer1();
        builder74.server = server76;
        retrofit.RestAdapter.LogLevel logLevel78 = builder74.logLevel;
        java.util.concurrent.Executor executor79 = null;
        builder74.setcallbackExecutor(executor79);
        retrofit.ErrorHandler errorHandler81 = builder74.errorHandler;
        java.util.concurrent.Executor executor82 = null;
        builder74.setcallbackExecutor(executor82);
        retrofit.SerializedObjectSupporter serializedObjectSupporter84 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter85 = serializedObjectSupporter84.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter86 = serializedObjectSupporter84.deserializeObjectConverter2();
        builder74.serializedObjectSupporter = serializedObjectSupporter84;
        retrofit.client.Response response88 = serializedObjectSupporter84.deserializeObjectResponse4();
        java.lang.String str89 = serializedObjectSupporter84.deserializeObjectString7();
        retrofit.client.Response response90 = serializedObjectSupporter84.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter91 = serializedObjectSupporter84.deserializeObjectConverter5();
        retrofit.RestAdapter.Builder builder92 = builder71.setConverter((retrofit.converter.Converter) gsonConverter91);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(server37);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(server58);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider66);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(server76);
        org.junit.Assert.assertTrue("'" + logLevel78 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel78.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler81);
        org.junit.Assert.assertNotNull(gsonConverter85);
        org.junit.Assert.assertNotNull(gsonConverter86);
        org.junit.Assert.assertNotNull(response88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "http://example.com/" + "'", str89, "http://example.com/");
        org.junit.Assert.assertNotNull(response90);
        org.junit.Assert.assertNotNull(gsonConverter91);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString6();
        retrofit.ErrorHandler errorHandler16 = serializedObjectSupporter14.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler16);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server11 = serializedObjectSupporter10.deserializeObjectServer1();
        builder9.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder9.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = null;
        builder9.setcallbackExecutor(executor15);
        java.util.concurrent.Executor executor17 = null;
        builder9.callbackExecutor = executor17;
        retrofit.client.Client.Provider provider19 = builder9.clientProvider;
        builder7.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder7.gethttpExecutor();
        retrofit.RestAdapter restAdapter22 = builder7.build();
        retrofit.RestAdapter restAdapter23 = builder7.build();
        retrofit.Server server24 = restAdapter23.server;
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter23.logLevel;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(restAdapter22);
        org.junit.Assert.assertNotNull(restAdapter23);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = null;
        builder0.setcallbackExecutor(executor6);
        retrofit.RestAdapter.LogLevel logLevel8 = null;
        builder0.logLevel = logLevel8;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor6 = null;
        builder0.setcallbackExecutor(executor6);
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler11 = builder0.errorHandler;
        retrofit.client.Client.Provider provider12 = null;
        builder0.clientProvider = provider12;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(errorHandler11);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.RestAdapter.Log log11 = builder9.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(log11);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(executor15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.client.Response response14 = serializedObjectSupporter10.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter10.deserializeObjectString7();
        retrofit.Server server16 = serializedObjectSupporter10.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(server16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler15.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler15.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.client.Response response22 = serializedObjectSupporter18.deserializeObjectResponse3();
        java.lang.reflect.Method method23 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = restHandler15.invoke((java.lang.Object) serializedObjectSupporter18, method23, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(profiler17);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
        retrofit.RequestInterceptor requestInterceptor12 = builder11.requestInterceptor;
        java.util.concurrent.Executor executor13 = builder11.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder15 = builder11.setServer("hi!");
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server18 = serializedObjectSupporter17.deserializeObjectServer1();
        builder16.server = server18;
        java.util.concurrent.Executor executor20 = null;
        builder16.setcallbackExecutor(executor20);
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        builder16.logLevel = logLevel22;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        builder16.log = log24;
        log24.log("");
        log24.log("http://example.com/");
        builder11.log = log24;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(server18);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter10.logLevel = logLevel14;
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(provider17);
    }
}

