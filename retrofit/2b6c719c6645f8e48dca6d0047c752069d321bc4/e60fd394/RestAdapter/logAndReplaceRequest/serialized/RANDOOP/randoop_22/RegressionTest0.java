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
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = retrofit.RestAdapter.LOG_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4000 + "'", int0 == 4000);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        log3.log("Retrofit-");
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder2 = builder0.setProfiler(profiler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.setclientProvider(provider5);
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(requestInterceptor4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setExecutors(executor4, executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.BASIC;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean3 = logLevel2.log();
        builder0.logLevel = logLevel2;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertTrue("'" + logLevel2 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel2.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.client.Client.Provider provider7 = builder6.clientProvider;
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder6.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setExecutors(executor7, executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("Retrofit-");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-" + "'", str0, "Retrofit-");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.client.Client.Provider provider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setClient(provider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setExecutors(executor9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertNull(requestInterceptor5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        builder6.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        java.util.concurrent.Executor executor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setExecutors(executor8, executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        retrofit.RequestInterceptor requestInterceptor9 = builder8.requestInterceptor;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder6.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = null;
        builder0.setcallbackExecutor(executor9);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("hi!");
        log0.log("Retrofit-Idle");
        java.lang.Class<?> wildcardClass5 = log0.getClass();
        org.junit.Assert.assertNotNull(log0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.FULL;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("");
        log0.log("Retrofit-Idle");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.RestAdapter.LogLevel logLevel8 = builder0.logLevel;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("hi!");
        log0.log("Retrofit-Idle");
        log0.log("");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("hi!");
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder4.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        retrofit.Profiler profiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setProfiler(profiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean1 = logLevel0.log();
        boolean boolean2 = logLevel0.log();
        boolean boolean3 = logLevel0.log();
        boolean boolean4 = logLevel0.log();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter7.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.RestAdapter.LogLevel logLevel8 = builder0.logLevel;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setExecutors(executor9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setExecutors(executor6, executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = builder0.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler5 = null;
        builder0.errorHandler = errorHandler5;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setExecutors(executor7, executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(serializedObjectSupporter4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("hi!");
        log5.log("hi!");
        builder0.log = log5;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setExecutors(executor11, executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        java.util.concurrent.Executor executor7 = null;
        builder6.httpExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        builder9.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.RestAdapter.Log log12 = retrofit.RestAdapter.Log.NONE;
        log12.log("hi!");
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log12);
        builder6.log = log12;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        retrofit.RestAdapter.LogLevel logLevel9 = builder0.logLevel;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("http://example.com/");
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.client.Client.Provider provider7 = builder6.clientProvider;
        retrofit.client.Client.Provider provider8 = null;
        builder6.clientProvider = provider8;
        java.util.concurrent.Executor executor10 = null;
        builder6.callbackExecutor = executor10;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        builder6.logLevel = logLevel12;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(log4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.converter.Converter converter5 = builder0.converter;
        org.junit.Assert.assertNull(converter5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Profiler profiler5 = builder0.profiler;
        java.util.concurrent.Executor executor6 = null;
        builder0.httpExecutor = executor6;
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(profiler5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.RestAdapter.Log log6 = null;
        builder0.log = log6;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(serializedObjectSupporter4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.Profiler profiler8 = builder0.profiler;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        java.util.concurrent.Executor executor10 = null;
        builder0.sethttpExecutor(executor10);
        retrofit.Profiler profiler12 = builder0.profiler;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(profiler12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.converter.Converter converter4 = builder0.converter;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Log log5 = builder0.log;
        org.junit.Assert.assertNull(log5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(serializedObjectSupporter4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("hi!");
        log5.log("hi!");
        builder0.log = log5;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.Server server9 = builder0.server;
        retrofit.client.Client.Provider provider10 = null;
        builder0.clientProvider = provider10;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(server9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        retrofit.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        retrofit.RestAdapter.LogLevel logLevel9 = builder0.logLevel;
        java.util.concurrent.Executor executor10 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.converter.Converter converter7 = builder0.converter;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Profiler profiler5 = builder0.profiler;
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.client.Client.Provider provider5 = null;
        builder0.setclientProvider(provider5);
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        java.util.concurrent.Executor executor2 = null;
        builder0.httpExecutor = executor2;
        org.junit.Assert.assertNull(log1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        java.util.concurrent.Executor executor10 = null;
        builder0.sethttpExecutor(executor10);
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("Retrofit-");
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        java.lang.String str14 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        java.util.concurrent.Executor executor5 = null;
        builder0.callbackExecutor = executor5;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        java.util.concurrent.Executor executor8 = null;
        builder0.sethttpExecutor(executor8);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("hi!");
        log5.log("hi!");
        builder0.log = log5;
        retrofit.Profiler profiler11 = null;
        builder0.profiler = profiler11;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        java.util.concurrent.Executor executor10 = null;
        builder0.sethttpExecutor(executor10);
        retrofit.client.Client.Provider provider12 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        retrofit.RestAdapter.Log log11 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log11;
        log11.log("");
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setExecutors(executor9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(log4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        java.util.concurrent.Executor executor10 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.Server server8 = builder0.server;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setExecutors(executor9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.client.Client.Provider provider7 = builder6.clientProvider;
        retrofit.client.Client.Provider provider8 = builder6.getclientProvider();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        java.lang.String str12 = request10.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-" + "'", str11, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setExecutors(executor10, executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(errorHandler9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(errorHandler6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor10 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider5 = builder0.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        retrofit.Server server9 = builder0.server;
        retrofit.Profiler profiler10 = builder0.profiler;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(server9);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.client.Client.Provider provider7 = builder6.clientProvider;
        retrofit.client.Client.Provider provider8 = null;
        builder6.clientProvider = provider8;
        java.util.concurrent.Executor executor10 = null;
        builder6.callbackExecutor = executor10;
        java.util.concurrent.Executor executor12 = null;
        builder6.callbackExecutor = executor12;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.Server server9 = builder0.server;
        retrofit.Server server10 = builder0.server;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(server9);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("http://example.com/");
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder8 = builder0.setLogLevel(logLevel7);
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider4 = null;
        builder0.setclientProvider(provider4);
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestInterceptor3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.Server server8 = builder0.server;
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        retrofit.Server server10 = builder0.server;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setExecutors(executor9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        java.util.concurrent.Executor executor7 = null;
        builder6.httpExecutor = executor7;
        retrofit.converter.Converter converter9 = builder6.converter;
        java.util.concurrent.Executor executor10 = null;
        builder6.callbackExecutor = executor10;
        java.util.concurrent.Executor executor12 = null;
        builder6.callbackExecutor = executor12;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        retrofit.Profiler profiler7 = builder0.profiler;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.client.Response response9 = serializedObjectSupporter8.deserializeObjectResponse7();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor8 = null;
        builder0.sethttpExecutor(executor8);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter10 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean1 = logLevel0.log();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.httpExecutor = executor7;
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean6 = logLevel5.log();
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.RequestInterceptor requestInterceptor10 = serializedObjectSupporter8.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.RequestInterceptor requestInterceptor8 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(requestInterceptor8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Profiler profiler5 = builder0.profiler;
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder0.log;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        retrofit.Profiler profiler9 = builder0.profiler;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(profiler9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.lang.String str8 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter8 = null;
        builder0.converter = converter8;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor6 = null;
        builder0.setcallbackExecutor(executor6);
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor5 = null;
        builder0.callbackExecutor = executor5;
        java.util.concurrent.Executor executor7 = null;
        builder0.httpExecutor = executor7;
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        retrofit.Server server5 = builder0.server;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        retrofit.Server server10 = builder0.server;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
        org.junit.Assert.assertNull(server5);
        org.junit.Assert.assertNull(errorHandler8);
        org.junit.Assert.assertNull(requestInterceptor9);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log4 = builder0.log;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(log4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "Retrofit-", headerList12, typedOutput13);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        retrofit.client.Client.Provider provider7 = builder6.clientProvider;
        java.util.concurrent.Executor executor8 = null;
        builder6.callbackExecutor = executor8;
        java.util.concurrent.Executor executor10 = null;
        builder6.sethttpExecutor(executor10);
        retrofit.RestAdapter.LogLevel logLevel12 = builder6.logLevel;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        java.util.concurrent.Executor executor8 = null;
        builder0.setcallbackExecutor(executor8);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        java.util.concurrent.Executor executor7 = builder6.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder6.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor8 = null;
        builder0.sethttpExecutor(executor8);
        java.util.concurrent.Executor executor10 = null;
        builder0.httpExecutor = executor10;
        retrofit.converter.Converter converter12 = builder0.converter;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.converter.Converter converter4 = builder0.converter;
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.Server server8 = builder0.server;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        retrofit.Server server9 = builder0.server;
        java.util.concurrent.Executor executor10 = null;
        builder0.httpExecutor = executor10;
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter14 = builder13.build();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter14.new RestHandler();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(server9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        log3.log("hi!");
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log3);
        java.util.concurrent.Executor executor7 = null;
        builder6.httpExecutor = executor7;
        java.util.concurrent.Executor executor9 = builder6.gethttpExecutor();
        java.util.concurrent.Executor executor10 = null;
        builder6.httpExecutor = executor10;
        retrofit.RequestInterceptor requestInterceptor12 = builder6.requestInterceptor;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.clientProvider = provider5;
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor8 = null;
        builder0.sethttpExecutor(executor8);
        retrofit.Server server10 = builder0.server;
        java.util.concurrent.Executor executor11 = null;
        builder0.httpExecutor = executor11;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.Profiler profiler4 = builder0.profiler;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(profiler4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Profiler profiler5 = builder0.profiler;
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertNull(profiler5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.lang.String str8 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Retrofit-" + "'", str8, "Retrofit-");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
    }
}

