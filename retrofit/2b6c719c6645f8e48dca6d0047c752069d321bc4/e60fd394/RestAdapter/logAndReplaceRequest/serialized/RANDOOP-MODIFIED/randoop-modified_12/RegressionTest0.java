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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.Server server2 = new retrofit.Server("hi!", "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
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
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable12, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        java.util.concurrent.Executor executor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder3 = builder0.setExecutors(executor1, executor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.Profiler profiler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder3.setProfiler(profiler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = retrofit.RestAdapter.LOG_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4000 + "'", int0 == 4000);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = retrofit.Server.DEFAULT_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request23 = restAdapter10.logAndReplaceRequest(request22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.FULL;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder3.setExecutors(executor9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request27 = restAdapter10.logAndReplaceRequest(request26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request27 = restAdapter10.logAndReplaceRequest(request26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.Server server2 = new retrofit.Server("default", "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor5 = null;
        builder0.sethttpExecutor(executor5);
        retrofit.ErrorHandler errorHandler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setErrorHandler(errorHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(class3);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.ErrorHandler errorHandler7 = builder6.errorHandler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(errorHandler7);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter16 = serializedObjectSupporter13.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "Retrofit-");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.converter.Converter converter7 = builder0.converter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder9 = builder3.setLogLevel(logLevel8);
        retrofit.client.Client.Provider provider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder9.setClient(provider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList19, typedOutput23);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request25 = restAdapter10.logAndReplaceRequest(request24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        retrofit.client.Client.Provider provider7 = null;
        builder3.setclientProvider(provider7);
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder2 = builder0.setRequestInterceptor(requestInterceptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString10();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter14;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = serializedObjectSupporter14.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setClient(client3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(log2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.Server server2 = new retrofit.Server("http://example.com", "http://example.com");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request25 = restAdapter10.logAndReplaceRequest(request23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(headerList24);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("Retrofit-", "", headerList2, typedOutput3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.Server server7 = builder3.server;
        java.lang.String str8 = server7.getName();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "default" + "'", str8, "default");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = builder3.getclientProvider();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.Server server1 = new retrofit.Server("hi!");
        java.lang.String str2 = server1.getUrl();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        log3.log("default");
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "http://example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput24);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request26 = restAdapter10.logAndReplaceRequest(request25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        java.util.concurrent.Executor executor5 = null;
        java.util.concurrent.Executor executor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder4.setExecutors(executor5, executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        builder3.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder11 = builder3.setServer("http://example.com/");
        retrofit.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder3.setClient(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter17 = serializedObjectSupporter13.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server17 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response20 = restAdapter10.logAndReplaceResponse("default", response18, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(server4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.client.Client.Provider provider7 = null;
        builder6.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = builder6.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(errorHandler1);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList20, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.util.List<retrofit.client.Header> headerList27 = request25.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request28 = restAdapter10.logAndReplaceRequest(request25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        java.util.concurrent.Executor executor9 = null;
        builder3.sethttpExecutor(executor9);
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList21, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList21, typedOutput29);
        java.lang.String str31 = request30.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request32 = restAdapter10.logAndReplaceRequest(request30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "default" + "'", str31, "default");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
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
        retrofit.client.Client.Provider provider26 = restAdapter25.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter25.logLevel = logLevel27;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString10();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.Class class18 = serializedObjectSupporter14.deserializeObjectClass1();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.converter.Converter converter5 = builder0.converter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(converter5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString10();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter19 = serializedObjectSupporter14.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("Retrofit-", "hi!", headerList2, typedOutput3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request21 = restAdapter10.logAndReplaceRequest(request19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList20);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList32, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList32, typedOutput35);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = restAdapter10.logAndReplaceRequest(request36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList32);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("default", "", headerList9, typedOutput10);
        retrofit.mime.TypedOutput typedOutput12 = request11.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean1 = logLevel0.log();
        boolean boolean2 = logLevel0.log();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel12;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.Server server26 = restAdapter8.getserver();
        retrofit.client.Client.Provider provider27 = restAdapter8.clientProvider;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(provider27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.Class<?> wildcardClass14 = restHandler13.getClass();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(wildcardClass14);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput31);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request33 = restAdapter10.logAndReplaceRequest(request32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler14.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        retrofit.ErrorHandler errorHandler9 = builder3.errorHandler;
        retrofit.Profiler profiler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder3.setProfiler(profiler10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(errorHandler9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList20, typedOutput24);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request26 = restAdapter10.logAndReplaceRequest(request25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.ErrorHandler errorHandler8 = builder3.errorHandler;
        java.util.concurrent.Executor executor9 = builder3.gethttpExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(errorHandler8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList21, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request30 = restAdapter10.logAndReplaceRequest(request28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList29);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("default", "", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("Retrofit-Idle", "default", headerList31, typedOutput34);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request36 = restAdapter10.logAndReplaceRequest(request35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList31);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler14.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler7 = builder6.errorHandler;
        retrofit.RestAdapter.Builder builder9 = builder6.setServer("hi!");
        retrofit.client.Client.Provider provider10 = null;
        builder9.clientProvider = provider10;
        java.util.concurrent.Executor executor12 = builder9.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder3.logLevel = logLevel13;
        java.lang.Class<?> wildcardClass15 = builder3.getClass();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.Server server2 = new retrofit.Server("", "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("default", "default", headerList31, typedOutput34);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request36 = restAdapter10.logAndReplaceRequest(request35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList31);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        java.util.concurrent.Executor executor8 = builder3.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(executor8);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = restHandler27.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server30 = serializedObjectSupporter29.deserializeObjectServer1();
        restHandler27.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.client.Response response32 = serializedObjectSupporter29.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response34 = restAdapter10.logAndReplaceResponse("Retrofit-", response32, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(response32);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.RestAdapter.Builder builder10 = builder3.setServer("http://example.com");
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder3.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder3.callbackExecutor = executor6;
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder3.requestInterceptor = requestInterceptor8;
        java.util.concurrent.Executor executor10 = builder3.callbackExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder9 = builder3.setLogLevel(logLevel8);
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder9.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server15 = serializedObjectSupporter14.deserializeObjectServer1();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString10();
        restHandler13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter19 = serializedObjectSupporter14.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "http://example.com/", headerList28, typedOutput29);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request31 = restAdapter10.logAndReplaceRequest(request30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler7 = builder6.errorHandler;
        retrofit.RestAdapter.Builder builder9 = builder6.setServer("hi!");
        retrofit.client.Client.Provider provider10 = null;
        builder9.clientProvider = provider10;
        java.util.concurrent.Executor executor12 = builder9.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        builder3.logLevel = logLevel13;
        boolean boolean15 = logLevel13.log();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.String str23 = request22.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList24, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList24, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList24, typedOutput32);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request34 = restAdapter10.logAndReplaceRequest(request33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.RestAdapter.Builder builder10 = builder3.setServer("http://example.com");
        retrofit.Server server11 = builder3.server;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(server11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.Class<?> wildcardClass5 = gsonConverter4.getClass();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList25, typedOutput31);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request33 = restAdapter10.logAndReplaceRequest(request32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.Server server2 = new retrofit.Server("hi!", "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("http://example.com/", "http://example.com", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel8 = null;
        builder3.logLevel = logLevel8;
        java.util.concurrent.Executor executor10 = null;
        builder3.callbackExecutor = executor10;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter8.logException(throwable9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
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
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com", "", headerList15, typedOutput18);
        java.lang.String str20 = request19.getMethod();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com" + "'", str20, "http://example.com");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter13.deserializeObjectConverter6();
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean15 = logLevel14.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.client.Response response16 = serializedObjectSupporter13.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter17 = serializedObjectSupporter13.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.Server server18 = restAdapter10.getserver();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(server18);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList26, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList26, typedOutput34);
        java.util.List<retrofit.client.Header> headerList36 = request35.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = restAdapter10.logAndReplaceRequest(request35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList36);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.Server server1 = new retrofit.Server("http://example.com");
        java.lang.String str2 = server1.name;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("default", "hi!", headerList15, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
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
        retrofit.client.Client.Provider provider19 = restAdapter18.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter18.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = builder0.setLogLevel(logLevel20);
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder22);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.getBody();
        java.util.List<retrofit.client.Header> headerList32 = request30.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request33 = restAdapter10.logAndReplaceRequest(request30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNotNull(headerList32);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com/", "Retrofit-", headerList29, typedOutput30);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request32 = restAdapter10.logAndReplaceRequest(request31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList29);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        java.lang.String str26 = request25.getUrl();
        java.lang.String str27 = request25.getUrl();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Retrofit-Idle" + "'", str27, "Retrofit-Idle");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        builder3.ensureSaneDefaults();
        retrofit.Profiler profiler10 = null;
        builder3.profiler = profiler10;
        retrofit.Server server12 = builder3.server;
        retrofit.Profiler profiler13 = builder3.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.Server server2 = new retrofit.Server("default", "");
        java.lang.String str3 = server2.getapiUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor19 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(executor19);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.Profiler profiler9 = builder3.profiler;
        retrofit.Profiler profiler10 = null;
        builder3.profiler = profiler10;
        retrofit.Server server13 = new retrofit.Server("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder14 = builder3.setServer(server13);
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder3.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.Profiler profiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder3.setProfiler(profiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList25, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList25, typedOutput33);
        java.lang.String str35 = request34.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request36 = restAdapter10.logAndReplaceRequest(request34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-Idle" + "'", str35, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList25, typedOutput31);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request33 = restAdapter10.logAndReplaceRequest(request32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.Server server2 = new retrofit.Server("default", "http://example.com");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log3 = builder0.log;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(log3);
        org.junit.Assert.assertNull(requestInterceptor4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.client.Client.Provider provider7 = builder6.getclientProvider();
        java.util.concurrent.Executor executor8 = builder6.gethttpExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor8);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler14.serializedObjectSupporter;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log21 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(log21);
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList18, typedOutput22);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request24 = restAdapter10.logAndReplaceRequest(request23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("default", "", headerList30, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com", "default", headerList30, typedOutput33);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request35 = restAdapter10.logAndReplaceRequest(request34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList30);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
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
        retrofit.client.Client.Provider provider27 = restAdapter26.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter26.logLevel = logLevel28;
        restAdapter10.logLevel = logLevel28;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.Server server2 = new retrofit.Server("http://example.com/", "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.converter.Converter converter10 = restAdapter9.converter;
        java.util.concurrent.Executor executor11 = restAdapter9.callbackExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(converter10);
        org.junit.Assert.assertNotNull(executor11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com/", "Retrofit-", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList15, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("default", "Retrofit-", headerList26, typedOutput27);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request29 = restAdapter10.logAndReplaceRequest(request28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList26);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = server3.getapiUrl();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Server server20 = restAdapter10.getserver();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNull(server20);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(converter19);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-Idle");
        java.lang.String str3 = server2.name;
        java.lang.String str4 = server2.apiUrl;
        java.lang.String str5 = server2.apiUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider18);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.util.List<retrofit.client.Header> headerList27 = request26.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("default", "Retrofit-", headerList27, typedOutput28);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request30 = restAdapter10.logAndReplaceRequest(request29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList27);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "default", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-", "", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList21, typedOutput30);
        java.lang.String str32 = request31.getUrl();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Server server14 = restAdapter10.getserver();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(server14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
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
        retrofit.client.Client.Provider provider27 = restAdapter26.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter26.logLevel = logLevel28;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = server1.name;
        java.lang.String str3 = server1.name;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(converter19);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList27, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList27, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList27, typedOutput35);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = restAdapter10.logAndReplaceRequest(request36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.Server server2 = new retrofit.Server("http://example.com", "Retrofit-");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com", headerList23, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "http://example.com/", headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "Retrofit-Idle", headerList23, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-", "hi!", headerList23, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList23, typedOutput34);
        java.util.List<retrofit.client.Header> headerList36 = request35.getHeaders();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList36);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        int int11 = restAdapter10.getLOG_CHUNK_SIZE();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4000 + "'", int11 == 4000);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit.Server server2 = new retrofit.Server("default", "http://example.com/");
        java.lang.String str3 = server2.name;
        java.lang.String str4 = server2.getapiUrl();
        java.lang.String str5 = server2.apiUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.Server server26 = restAdapter8.getserver();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter8.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter8.getrequestInterceptor();
        java.lang.Throwable throwable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter8.logException(throwable29, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(requestInterceptor28);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.Server server2 = new retrofit.Server("default", "Retrofit-");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList32, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList32, typedOutput35);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = restAdapter10.logAndReplaceRequest(request36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList32);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.Server server1 = new retrofit.Server("Retrofit-Idle");
        java.lang.String str2 = server1.apiUrl;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log5 = builder0.log;
        java.util.concurrent.Executor executor6 = builder0.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder3.requestInterceptor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.client.Client.Provider provider8 = builder3.getclientProvider();
        retrofit.Server server11 = new retrofit.Server("http://example.com/", "http://example.com");
        builder3.server = server11;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.Server server17 = restAdapter10.getserver();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        builder3.ensureSaneDefaults();
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder3.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor5 = null;
        builder0.sethttpExecutor(executor5);
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-", "", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList21, typedOutput30);
        java.lang.String str32 = request31.getMethod();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-Idle" + "'", str32, "Retrofit-Idle");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.Server server1 = new retrofit.Server("http://example.com/");
        java.lang.String str2 = server1.getDEFAULT_NAME();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log20 = restAdapter10.log;
        int int21 = restAdapter10.getLOG_CHUNK_SIZE();
        java.lang.Throwable throwable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable22, "http://example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(log20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4000 + "'", int21 == 4000);
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
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList28, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.getHeaders();
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "http://example.com/", headerList34, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "http://example.com", headerList34, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("hi!", "http://example.com/", headerList34, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("http://example.com", "http://example.com", headerList34, typedOutput41);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request43 = restAdapter10.logAndReplaceRequest(request42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(headerList34);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "Retrofit-Idle", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "Retrofit-", headerList16, typedOutput19);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.ErrorHandler errorHandler9 = builder3.errorHandler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(errorHandler9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        java.util.concurrent.Executor executor7 = null;
        builder3.sethttpExecutor(executor7);
        retrofit.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder3.setClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request29 = restAdapter10.logAndReplaceRequest(request28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList7.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.Server server8 = new retrofit.Server("");
        java.lang.String str9 = server8.name;
        java.lang.String str10 = server8.getDEFAULT_NAME();
        builder3.server = server8;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "default" + "'", str9, "default");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "default" + "'", str10, "default");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("Retrofit-", "http://example.com/", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("default", "Retrofit-Idle", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com");
        java.lang.String str3 = server2.getapiUrl();
        java.lang.String str4 = server2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "Retrofit-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(log12);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-", "default", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        retrofit.Profiler profiler9 = null;
        builder3.profiler = profiler9;
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder3.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-Idle");
        java.lang.String str3 = server2.name;
        java.lang.String str4 = server2.getUrl();
        java.lang.String str5 = server2.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(log19);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        builder3.ensureSaneDefaults();
        retrofit.Server server11 = new retrofit.Server("");
        java.lang.String str12 = server11.getUrl();
        retrofit.RestAdapter.Builder builder13 = builder3.setServer(server11);
        retrofit.RestAdapter restAdapter14 = builder13.build();
        retrofit.RestAdapter.LogLevel logLevel15 = builder13.logLevel;
        boolean boolean16 = logLevel15.log();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.Builder builder8 = builder3.setServer("hi!");
        retrofit.converter.Converter converter9 = builder8.converter;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler11 = builder10.errorHandler;
        retrofit.RestAdapter.Builder builder13 = builder10.setServer("hi!");
        retrofit.client.Client.Provider provider14 = null;
        builder13.clientProvider = provider14;
        java.util.concurrent.Executor executor16 = builder13.callbackExecutor;
        retrofit.client.Client.Provider provider17 = null;
        builder13.clientProvider = provider17;
        builder13.ensureSaneDefaults();
        retrofit.Server server21 = new retrofit.Server("");
        java.lang.String str22 = server21.getUrl();
        retrofit.RestAdapter.Builder builder23 = builder13.setServer(server21);
        retrofit.RestAdapter.Builder builder25 = builder13.setServer("http://example.com/");
        java.util.concurrent.Executor executor26 = builder25.getcallbackExecutor();
        builder8.httpExecutor = executor26;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(executor26);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.Server server26 = restAdapter8.getserver();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter8.new RestHandler();
        retrofit.converter.Converter converter28 = restAdapter8.getconverter();
        java.util.concurrent.Executor executor29 = restAdapter8.callbackExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(converter28);
        org.junit.Assert.assertNotNull(executor29);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com", "", headerList13, typedOutput14);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com", headerList23, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "http://example.com/", headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "Retrofit-Idle", headerList23, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-", "hi!", headerList23, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com", "", headerList23, typedOutput34);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "Retrofit-");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-", "", headerList19, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com", headerList23, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "http://example.com/", headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "Retrofit-Idle", headerList23, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList23, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList23, typedOutput34);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList21, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList21, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList21, typedOutput31);
        retrofit.client.Request request33 = restAdapter9.logAndReplaceRequest(request32);
        java.util.concurrent.Executor executor34 = restAdapter9.getcallbackExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(executor34);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler14.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(requestInterceptor16);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList29, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList29, typedOutput35);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = restAdapter10.logAndReplaceRequest(request36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Builder builder8 = builder3.setServer("hi!");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder8);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter10.getLogLevel();
        java.lang.String str23 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(logLevel22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Retrofit-Idle" + "'", str23, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.Server server19 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler20 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(errorHandler20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com", "http://example.com", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", headerList21, typedOutput30);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder9 = builder3.setServer("http://example.com");
        java.util.concurrent.Executor executor10 = builder9.gethttpExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        java.util.concurrent.Executor executor7 = builder6.getcallbackExecutor();
        retrofit.RestAdapter restAdapter8 = builder6.build();
        retrofit.client.Client.Provider provider9 = builder6.getclientProvider();
        retrofit.Profiler profiler10 = builder6.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.RestAdapter.Builder builder10 = builder3.setServer("http://example.com");
        java.util.concurrent.Executor executor11 = null;
        builder10.sethttpExecutor(executor11);
        builder10.ensureSaneDefaults();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.client.Client.Provider provider7 = null;
        builder0.clientProvider = provider7;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(log2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.Log log21 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(log21);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter20 = restAdapter10.converter;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "Retrofit-Idle", headerList19, typedOutput26);
        java.lang.Class<?> wildcardClass28 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "Retrofit-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "http://example.com/", headerList28, typedOutput29);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request31 = restAdapter10.logAndReplaceRequest(request30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList28);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("http://example.com/", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(log15);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "http://example.com/", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "http://example.com", headerList31, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList31, typedOutput36);
        java.lang.String str38 = request37.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request39 = restAdapter10.logAndReplaceRequest(request37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com" + "'", str38, "http://example.com");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler11.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(serializedObjectSupporter16);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.Server server18 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(server18);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor17);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.Server server1 = new retrofit.Server("http://example.com");
        java.lang.String str2 = server1.apiUrl;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com" + "'", str2, "http://example.com");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "default");
        java.lang.String str3 = server2.apiUrl;
        java.lang.String str4 = server2.getDEFAULT_NAME();
        java.lang.String str5 = server2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Server server17 = restAdapter10.getserver();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(profiler16);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString8();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        retrofit.ErrorHandler errorHandler19 = serializedObjectSupporter16.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(errorHandler19);
        org.junit.Assert.assertNull(logLevel21);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com/", "Retrofit-", headerList28, typedOutput29);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request31 = restAdapter10.logAndReplaceRequest(request30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList28);
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
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.String str20 = request18.getMethod();
        java.lang.String str21 = request18.getMethod();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        retrofit.RestAdapter.Log log9 = retrofit.RestAdapter.Log.NONE;
        builder3.log = log9;
        log9.log("Retrofit-");
        log9.log("hi!");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.Server server2 = new retrofit.Server("http://example.com/", "http://example.com");
        java.lang.String str3 = server2.getapiUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        java.util.concurrent.Executor executor10 = restAdapter9.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(executor10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-Idle", "default", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "http://example.com/", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList17, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.String str25 = request23.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com" + "'", str24, "http://example.com");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com" + "'", str25, "http://example.com");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com");
        java.lang.String str3 = server2.getapiUrl();
        java.lang.String str4 = server2.getapiUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.converter.Converter converter9 = restAdapter8.getconverter();
        java.lang.Class<?> wildcardClass10 = restAdapter8.getClass();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler22 = restAdapter10.profiler;
        java.lang.Throwable throwable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNull(profiler22);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "default");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server15);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.RequestInterceptor requestInterceptor8 = builder3.requestInterceptor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(requestInterceptor8);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("default", "default", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "http://example.com", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-Idle", "default", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList20, typedOutput23);
        java.lang.String str25 = request24.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Retrofit-Idle" + "'", str25, "Retrofit-Idle");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel8 = null;
        builder3.logLevel = logLevel8;
        retrofit.RestAdapter restAdapter10 = builder3.build();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter10);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(log17);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(logLevel18);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "default");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(requestInterceptor19);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("Retrofit-", "default", (java.util.List<retrofit.client.Header>) headerList21, typedOutput27);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request29 = restAdapter10.logAndReplaceRequest(request28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "default", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
        org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        builder3.ensureSaneDefaults();
        retrofit.Server server11 = new retrofit.Server("");
        java.lang.String str12 = server11.getUrl();
        retrofit.RestAdapter.Builder builder13 = builder3.setServer(server11);
        retrofit.RestAdapter.Builder builder15 = builder3.setServer("http://example.com/");
        java.util.concurrent.Executor executor16 = builder15.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = builder15.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(executor16);
        org.junit.Assert.assertNotNull(executor17);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-");
        java.lang.String str3 = server2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request25 = restAdapter10.logAndReplaceRequest(request22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor4 = null;
        builder0.requestInterceptor = requestInterceptor4;
        retrofit.Profiler profiler6 = builder0.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(profiler6);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNull(log19);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList33, typedOutput37);
        java.util.List<retrofit.client.Header> headerList39 = request38.getHeaders();
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "http://example.com/", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("hi!", "http://example.com", headerList39, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "http://example.com/", headerList39, typedOutput44);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request46 = restAdapter10.logAndReplaceRequest(request45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(headerList39);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler20 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(requestInterceptor21);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        java.lang.String str19 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        restHandler14.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = null;
        restHandler14.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restHandler14.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = server3.name;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel8 = null;
        builder3.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder3.clientProvider;
        java.util.concurrent.Executor executor11 = builder3.getcallbackExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit.Server server2 = new retrofit.Server("hi!", "http://example.com");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("default", "", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "http://example.com/", headerList21, typedOutput30);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("http://example.com", "http://example.com", headerList2, typedOutput3);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.client.Response response16 = serializedObjectSupporter13.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter13.deserializeObjectConverter2();
        retrofit.Server server18 = serializedObjectSupporter13.deserializeObjectServer1();
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(server18);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.Server server10 = builder3.server;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(server10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "hi!");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-Idle", "default", headerList22, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList22, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "Retrofit-", headerList22, typedOutput27);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList22);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = request27.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request30 = restAdapter10.logAndReplaceRequest(request27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(typedOutput29);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList28, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList28, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList28, typedOutput36);
        java.util.List<retrofit.client.Header> headerList38 = request37.getHeaders();
        java.lang.String str39 = request37.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request40 = restAdapter10.logAndReplaceRequest(request37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = server4.apiUrl;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder9 = builder3.setLogLevel(logLevel8);
        boolean boolean10 = logLevel8.log();
        boolean boolean11 = logLevel8.log();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        java.lang.String str22 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider23 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("default", "default", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(provider14);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        int int18 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4000 + "'", int18 == 4000);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("default", "", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com", "default", headerList11, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.getHeaders();
        java.lang.String str17 = request15.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com" + "'", str17, "http://example.com");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.Server server1 = new retrofit.Server("Retrofit-Idle");
        java.lang.String str2 = server1.getDEFAULT_NAME();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "default", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.Server server26 = restAdapter8.getserver();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter8.new RestHandler();
        retrofit.Server server28 = restAdapter8.getserver();
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter8.new RestHandler();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(server28);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(logLevel15);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        retrofit.RestAdapter.Log log9 = retrofit.RestAdapter.Log.NONE;
        builder3.log = log9;
        log9.log("Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log9);
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(requestInterceptor18);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.lang.String str14 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "default" + "'", str14, "default");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder9 = builder3.setServer("http://example.com");
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder3.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(builder9);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        int int18 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4000 + "'", int18 == 4000);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        java.lang.String str20 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.RestAdapter.RestHandler restHandler10 = restAdapter9.new RestHandler();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList19, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com/", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "http://example.com", headerList25, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "http://example.com/", headerList25, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "Retrofit-Idle", headerList25, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("Retrofit-", "hi!", headerList25, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("default", "", headerList25, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "http://example.com/", headerList25, typedOutput38);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder3.errorHandler;
        retrofit.ErrorHandler errorHandler8 = builder3.errorHandler;
        retrofit.converter.Converter converter9 = builder3.converter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(errorHandler8);
        org.junit.Assert.assertNull(converter9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider4 = builder0.getclientProvider();
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.RequestInterceptor requestInterceptor26 = restAdapter8.getrequestInterceptor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(requestInterceptor26);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        restHandler14.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter5();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restHandler12.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor4 = null;
        builder0.requestInterceptor = requestInterceptor4;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor7 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(executor7);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList27, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "", headerList33, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("Retrofit-", "hi!", headerList33, typedOutput38);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request40 = restAdapter10.logAndReplaceRequest(request39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList33);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.setcallbackExecutor(executor7);
        builder3.ensureSaneDefaults();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit.Server server1 = new retrofit.Server("");
        java.lang.String str2 = server1.name;
        java.lang.String str3 = server1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit.Server server2 = new retrofit.Server("", "Retrofit-Idle");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "http://example.com/", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com", headerList17, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList22, typedOutput23);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "");
        java.lang.String str3 = server2.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList21, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList21, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList21, typedOutput31);
        retrofit.client.Request request33 = restAdapter9.logAndReplaceRequest(request32);
        retrofit.RestAdapter.Log log34 = restAdapter9.log;
        java.util.concurrent.Executor executor35 = restAdapter9.gethttpExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNotNull(executor35);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(server18);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        retrofit.Server server1 = new retrofit.Server("http://example.com/");
        java.lang.String str2 = server1.getapiUrl();
        java.lang.String str3 = server1.apiUrl;
        java.lang.String str4 = server1.getDEFAULT_NAME();
        java.lang.String str5 = server1.getDEFAULT_NAME();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.util.List<retrofit.client.Header> headerList27 = request25.getHeaders();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        java.util.concurrent.Executor executor7 = builder6.getcallbackExecutor();
        retrofit.RestAdapter restAdapter8 = builder6.build();
        retrofit.RestAdapter restAdapter9 = builder6.build();
        retrofit.RestAdapter.RestHandler restHandler10 = restAdapter9.new RestHandler();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(restAdapter9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel8 = null;
        builder3.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder3.clientProvider;
        retrofit.Profiler profiler11 = null;
        builder3.profiler = profiler11;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        java.util.List<retrofit.client.Header> headerList27 = request26.getHeaders();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.ErrorHandler errorHandler7 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler9 = builder8.errorHandler;
        retrofit.RestAdapter.Builder builder11 = builder8.setServer("hi!");
        retrofit.client.Client.Provider provider12 = null;
        builder11.clientProvider = provider12;
        java.util.concurrent.Executor executor14 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel15 = builder11.logLevel;
        retrofit.RestAdapter restAdapter16 = builder11.build();
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList24, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList24, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        retrofit.client.Request request33 = restAdapter16.logAndReplaceRequest(request31);
        retrofit.Server server34 = restAdapter16.getserver();
        retrofit.RestAdapter.RestHandler restHandler35 = restAdapter16.new RestHandler();
        retrofit.client.Client.Provider provider36 = restAdapter16.getclientProvider();
        retrofit.converter.Converter converter37 = restAdapter16.getconverter();
        builder0.converter = converter37;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter16);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(provider36);
        org.junit.Assert.assertNotNull(converter37);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("Retrofit-");
        log0.log("Retrofit-");
        log0.log("http://example.com");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter19 = restAdapter10.converter;
        retrofit.client.Header[] headerArray30 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList31 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList31, headerArray30);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList31, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList31, typedOutput35);
        java.util.List<retrofit.client.Header> headerList37 = request36.getHeaders();
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "http://example.com/", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "http://example.com", headerList37, typedOutput40);
        java.util.List<retrofit.client.Header> headerList42 = request41.getHeaders();
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList42, typedOutput43);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request45 = restAdapter10.logAndReplaceRequest(request44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(headerList42);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.Server server16 = restAdapter10.server;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler20 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor21 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor23 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(executor23);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.RestAdapter.Log log9 = builder3.log;
        java.util.concurrent.Executor executor10 = builder3.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder12 = builder3.setServer("http://example.com/");
        retrofit.Profiler profiler13 = builder3.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(executor10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(profiler13);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList27, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "http://example.com/", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "http://example.com", headerList33, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "http://example.com/", headerList33, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("http://example.com", "http://example.com", headerList33, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request43 = restAdapter10.logAndReplaceRequest(request41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(typedOutput42);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString8();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        retrofit.ErrorHandler errorHandler19 = serializedObjectSupporter16.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(errorHandler19);
        org.junit.Assert.assertNull(profiler21);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor19);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Server server14 = restAdapter10.getserver();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restHandler16.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("Retrofit-Idle", "http://example.com", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel12;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList30, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList30, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList30, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList30, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("Retrofit-Idle", "http://example.com", (java.util.List<retrofit.client.Header>) headerList30, typedOutput42);
        java.lang.String str44 = request43.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request45 = restAdapter10.logAndReplaceRequest(request43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com" + "'", str44, "http://example.com");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "");
        java.lang.String str3 = server2.getName();
        java.lang.String str4 = server2.getapiUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.Profiler profiler6 = builder0.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(profiler6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNull(requestInterceptor20);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler7 = builder6.errorHandler;
        retrofit.RestAdapter.Builder builder9 = builder6.setServer("hi!");
        retrofit.client.Client.Provider provider10 = null;
        builder9.clientProvider = provider10;
        java.util.concurrent.Executor executor12 = builder9.callbackExecutor;
        retrofit.client.Client.Provider provider13 = null;
        builder9.clientProvider = provider13;
        builder9.ensureSaneDefaults();
        retrofit.Server server17 = new retrofit.Server("");
        java.lang.String str18 = server17.getUrl();
        retrofit.RestAdapter.Builder builder19 = builder9.setServer(server17);
        retrofit.RestAdapter.Builder builder21 = builder9.setServer("http://example.com/");
        java.util.concurrent.Executor executor22 = builder21.getcallbackExecutor();
        builder3.callbackExecutor = executor22;
        retrofit.client.Client.Provider provider24 = builder3.clientProvider;
        retrofit.Profiler profiler25 = builder3.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(executor22);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(profiler25);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        java.util.concurrent.Executor executor7 = null;
        builder3.sethttpExecutor(executor7);
        retrofit.Server server9 = builder3.server;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log17 = builder16.log;
        retrofit.RestAdapter.Log log18 = builder16.log;
        retrofit.client.Client.Provider provider19 = builder16.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel20 = builder16.logLevel;
        boolean boolean21 = logLevel20.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNull(log17);
        org.junit.Assert.assertNull(log18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.converter.Converter converter10 = restAdapter9.converter;
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter9.logException(throwable11, "default");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(converter10);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        java.lang.Class<?> wildcardClass20 = restAdapter10.getClass();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "Retrofit-", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log20 = restAdapter10.log;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList26, typedOutput30);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request32 = restAdapter10.logAndReplaceRequest(request31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(log20);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        retrofit.RestAdapter restAdapter9 = builder3.build();
        retrofit.RestAdapter.Log log10 = builder3.log;
        retrofit.client.Client client11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder3.setClient(client11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(log14);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        retrofit.Server server18 = restAdapter10.getserver();
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor19);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "http://example.com/", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "http://example.com", headerList31, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList31, typedOutput36);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request38 = restAdapter10.logAndReplaceRequest(request37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList31);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("default", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com", "default", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("Retrofit-Idle", "http://example.com", headerList13, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        java.lang.String str22 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor23 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor23);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler20 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler20);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("default", "Retrofit-", headerList17, typedOutput22);
        java.lang.String str24 = request23.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "default" + "'", str24, "default");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = builder3.getcallbackExecutor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor9);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        retrofit.Server server2 = new retrofit.Server("", "Retrofit-");
        java.lang.String str3 = server2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(executor16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com/", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com", "http://example.com", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "hi!", headerList21, typedOutput30);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "http://example.com/", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "default", headerList15, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        retrofit.Server server2 = new retrofit.Server("", "http://example.com");
        java.lang.String str3 = server2.apiUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(profiler19);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.getLogLevel();
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList28, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.getHeaders();
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "http://example.com/", headerList34, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "http://example.com", headerList34, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList34, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("Retrofit-", "", headerList34, typedOutput41);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList34, typedOutput43);
        java.lang.String str45 = request44.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request46 = restAdapter10.logAndReplaceRequest(request44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Retrofit-Idle" + "'", str45, "Retrofit-Idle");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("default", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com", "default", headerList15, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("default", "", headerList20, typedOutput23);
        java.lang.String str25 = request24.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        retrofit.Server server2 = new retrofit.Server("default", "Retrofit-Idle");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "default", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com/", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "http://example.com", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server15);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler20 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor21 = restAdapter10.getcallbackExecutor();
        retrofit.client.Client.Provider provider22 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter23 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(converter23);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("default", "default", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = request23.getBody();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(log2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(profiler6);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = restHandler29.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server32 = serializedObjectSupporter31.deserializeObjectServer1();
        restHandler29.serializedObjectSupporter = serializedObjectSupporter31;
        retrofit.client.Response response34 = serializedObjectSupporter31.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response36 = restAdapter10.logAndReplaceResponse("", response34, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(serializedObjectSupporter30);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        java.lang.String str4 = server2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com/", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList17, typedOutput22);
        java.lang.Class<?> wildcardClass24 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass24);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("default", "default", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
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
        retrofit.client.Client.Provider provider12 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler16 = builder15.errorHandler;
        retrofit.RestAdapter.Builder builder18 = builder15.setServer("hi!");
        retrofit.client.Client.Provider provider19 = null;
        builder18.clientProvider = provider19;
        java.util.concurrent.Executor executor21 = builder18.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel22 = builder18.logLevel;
        retrofit.RestAdapter restAdapter23 = builder18.build();
        retrofit.RestAdapter.Log log24 = builder18.log;
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder26 = builder18.setLogLevel(logLevel25);
        restAdapter10.logLevel = logLevel25;
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter23);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.Server server8 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com/", "Retrofit-", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "default", headerList15, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        java.lang.String str22 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertNull(profiler20);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        java.util.concurrent.Executor executor7 = builder3.getcallbackExecutor();
        retrofit.RestAdapter restAdapter8 = builder3.build();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter8);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(logLevel16);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "default" + "'", str19, "default");
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        java.util.concurrent.Executor executor7 = builder6.getcallbackExecutor();
        retrofit.RestAdapter restAdapter8 = builder6.build();
        retrofit.RestAdapter restAdapter9 = builder6.build();
        java.util.concurrent.Executor executor10 = restAdapter9.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(executor10);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "http://example.com/", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "Retrofit-Idle", headerList17, typedOutput22);
        java.lang.String str24 = request23.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com" + "'", str24, "http://example.com");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler17.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "Retrofit-Idle", headerList15, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("default", "default", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.Server server19 = restAdapter10.server;
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter10.requestInterceptor;
        retrofit.converter.Converter converter22 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(requestInterceptor21);
        org.junit.Assert.assertNull(converter22);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "http://example.com/", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "http://example.com", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "http://example.com", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "default");
        java.lang.String str3 = server2.apiUrl;
        java.lang.String str4 = server2.getDEFAULT_NAME();
        java.lang.String str5 = server2.getapiUrl();
        java.lang.String str6 = server2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "default" + "'", str6, "default");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler18 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNull(executor19);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
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
        retrofit.client.Client.Provider provider34 = restAdapter33.clientProvider;
        java.util.concurrent.Executor executor35 = restAdapter33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = restAdapter33.serializedObjectSupporter;
        retrofit.Server server37 = restAdapter33.server;
        retrofit.RestAdapter.LogLevel logLevel38 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter33.logLevel = logLevel38;
        retrofit.RestAdapter.LogLevel logLevel40 = restAdapter33.getLogLevel();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNull(provider34);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNull(serializedObjectSupporter36);
        org.junit.Assert.assertNull(server37);
        org.junit.Assert.assertTrue("'" + logLevel38 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel38.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder3.serializedObjectSupporter;
        retrofit.Profiler profiler8 = null;
        builder3.profiler = profiler8;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.Server server17 = restAdapter10.getserver();
        java.lang.String str18 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider20 = restAdapter10.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = provider20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(provider20);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel12;
        retrofit.Server server14 = restAdapter10.server;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server14);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = request28.getBody();
        java.lang.String str30 = request28.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request31 = restAdapter10.logAndReplaceRequest(request28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(headerList20);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(server5);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "Retrofit-Idle", headerList17, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        retrofit.RestAdapter.Log log9 = retrofit.RestAdapter.Log.NONE;
        builder3.log = log9;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder3.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str15 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter20 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(converter20);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(requestInterceptor4);
        org.junit.Assert.assertNull(errorHandler5);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable14, "Retrofit-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(logLevel13);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        java.lang.String str22 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider23 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider24 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(provider24);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList29, typedOutput33);
        java.util.List<retrofit.client.Header> headerList35 = request34.getHeaders();
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "http://example.com/", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "http://example.com", headerList35, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "http://example.com/", headerList35, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("http://example.com", "http://example.com", headerList35, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("default", "http://example.com/", headerList35, typedOutput44);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request46 = restAdapter10.logAndReplaceRequest(request45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerList35);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.Server server26 = restAdapter8.getserver();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter8.new RestHandler();
        retrofit.converter.Converter converter28 = restAdapter8.getconverter();
        retrofit.converter.Converter converter29 = restAdapter8.getconverter();
        java.lang.String str30 = restAdapter8.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(converter28);
        org.junit.Assert.assertNotNull(converter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-Idle" + "'", str30, "Retrofit-Idle");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler3 = builder2.errorHandler;
        retrofit.RestAdapter.Builder builder5 = builder2.setServer("hi!");
        retrofit.client.Client.Provider provider6 = null;
        builder5.clientProvider = provider6;
        java.util.concurrent.Executor executor8 = builder5.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel9 = builder5.logLevel;
        retrofit.client.Client.Provider provider10 = builder5.clientProvider;
        retrofit.RestAdapter restAdapter11 = builder5.build();
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList23, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList23, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList23, typedOutput33);
        retrofit.client.Request request35 = restAdapter11.logAndReplaceRequest(request34);
        java.util.List<retrofit.client.Header> headerList36 = request35.getHeaders();
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("Retrofit-", "default", headerList36, typedOutput37);
        org.junit.Assert.assertNull(errorHandler3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(restAdapter11);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(headerList36);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("default", "Retrofit-Idle", headerList9, typedOutput10);
        java.lang.String str12 = request11.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.client.Request request25 = restAdapter8.logAndReplaceRequest(request23);
        retrofit.Server server26 = restAdapter8.getserver();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter8.new RestHandler();
        retrofit.Server server28 = restAdapter8.getserver();
        java.lang.String str29 = server28.name;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(server26);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "default" + "'", str29, "default");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        retrofit.Server server1 = new retrofit.Server("");
        java.lang.String str2 = server1.name;
        java.lang.String str3 = server1.getDEFAULT_NAME();
        java.lang.String str4 = server1.getName();
        java.lang.String str5 = server1.apiUrl;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList15, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.converter.Converter converter7 = builder3.converter;
        java.util.concurrent.Executor executor8 = builder3.gethttpExecutor();
        retrofit.converter.Converter converter9 = builder3.converter;
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder3.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(converter9);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("Retrofit-", "default", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(log17);
        org.junit.Assert.assertNull(converter18);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList24, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "http://example.com/", headerList30, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "http://example.com", headerList30, typedOutput33);
        java.util.List<retrofit.client.Header> headerList35 = request34.getHeaders();
        retrofit.mime.TypedOutput typedOutput36 = request34.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = restAdapter10.logAndReplaceRequest(request34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNull(typedOutput36);
    }
}

