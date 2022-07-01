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
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-" + "'", str0, "Retrofit-");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.Class<?> wildcardClass7 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.Class<?> wildcardClass2 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        retrofit.Server server5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setServer(server5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.converter.Converter converter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setConverter(converter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean1 = logLevel0.log();
        boolean boolean2 = logLevel0.log();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        java.lang.String str10 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.converter.Converter converter3 = builder2.converter;
        retrofit.ErrorHandler errorHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder2.setErrorHandler(errorHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(converter3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.client.Client.Provider provider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(provider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("");
        log0.log("");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(provider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RequestInterceptor requestInterceptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setRequestInterceptor(requestInterceptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        retrofit.Profiler profiler17 = null;
        builder0.profiler = profiler17;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.Profiler profiler13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder0.setProfiler(profiler13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setExecutors(executor3, executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        log10.log("http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.Class<?> wildcardClass2 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RestAdapter.Log log8 = builder7.log;
        retrofit.client.Client.Provider provider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder7.setClient(provider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Profiler profiler3 = null;
        builder0.profiler = profiler3;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        log10.log("Retrofit-Idle");
        log10.log("Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter13.deserializeObjectErrorHandler1();
        builder12.errorHandler = errorHandler17;
        retrofit.client.Client.Provider provider19 = null;
        builder12.clientProvider = provider19;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.client.Response response24 = serializedObjectSupporter22.deserializeObjectResponse4();
        retrofit.Server server25 = serializedObjectSupporter22.deserializeObjectServer1();
        builder0.server = server25;
        java.util.concurrent.Executor executor27 = builder0.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertNull(executor27);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setExecutors(executor2, executor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "http://example.com/", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        java.lang.String str16 = request13.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.String str9 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(errorHandler6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "http://example.com/", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RequestInterceptor requestInterceptor1 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(requestInterceptor1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "http://example.com/", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request13.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider4 = builder0.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.FULL;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setExecutors(executor11, executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler12 = serializedObjectSupporter8.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler12;
        retrofit.Profiler profiler14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder15 = builder0.setProfiler(profiler14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RestAdapter.Log log8 = builder7.log;
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.RestAdapter.Log log9 = builder0.log;
        retrofit.Profiler profiler10 = null;
        builder0.profiler = profiler10;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(requestInterceptor6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        boolean boolean2 = logLevel1.log();
        boolean boolean3 = logLevel1.log();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder18 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder0.logLevel = logLevel4;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.client.Client.Provider provider12 = builder0.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        java.util.concurrent.Executor executor4 = null;
        builder0.sethttpExecutor(executor4);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        retrofit.client.Client.Provider provider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder25 = builder23.setClient(provider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder6.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        java.util.concurrent.Executor executor24 = builder23.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = executor24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor24);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        java.util.concurrent.Executor executor13 = builder0.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.Profiler profiler7 = null;
        builder6.profiler = profiler7;
        retrofit.converter.Converter converter9 = builder6.converter;
        retrofit.client.Client.Provider provider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder6.setClient(provider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        java.util.concurrent.Executor executor9 = null;
        builder0.setcallbackExecutor(executor9);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        java.util.concurrent.Executor executor24 = builder23.callbackExecutor;
        retrofit.client.Client.Provider provider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder26 = builder23.setClient(provider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor24);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.Server server7 = builder0.server;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNull(server7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.Server server11 = builder0.server;
        java.util.concurrent.Executor executor12 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider13 = builder0.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.converter.Converter converter6 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString7();
        retrofit.RequestInterceptor requestInterceptor11 = serializedObjectSupporter5.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList9, typedOutput10);
        java.lang.String str12 = request11.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.Profiler profiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setProfiler(profiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder0.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter12 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.Server server3 = builder0.server;
        retrofit.Profiler profiler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setProfiler(profiler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RestAdapter.Log log8 = builder7.log;
        retrofit.client.Client.Provider provider9 = builder7.clientProvider;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder7.setExecutors(executor10, executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.converter.Converter converter3 = builder2.converter;
        retrofit.client.Client.Provider provider4 = null;
        builder2.setclientProvider(provider4);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(converter3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor9 = null;
        builder0.callbackExecutor = executor9;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        java.util.concurrent.Executor executor24 = null;
        java.util.concurrent.Executor executor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder26 = builder0.setExecutors(executor24, executor25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.String str12 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder14 = builder12.setLogLevel(logLevel13);
        retrofit.RequestInterceptor requestInterceptor15 = builder12.requestInterceptor;
        retrofit.Profiler profiler16 = null;
        builder12.profiler = profiler16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        builder12.logLevel = logLevel19;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel22 = builder21.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter4();
        builder21.converter = gsonConverter24;
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder27 = builder21.setLog(log26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter28.deserializeObjectConverter4();
        retrofit.client.Response response30 = serializedObjectSupporter28.deserializeObjectResponse4();
        retrofit.Server server31 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder32 = builder21.setServer(server31);
        builder12.server = server31;
        retrofit.client.Client.Provider provider34 = null;
        java.util.concurrent.Executor executor35 = null;
        java.util.concurrent.Executor executor36 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter4();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor41 = serializedObjectSupporter37.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter42 = null;
        retrofit.Profiler profiler43 = null;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLogLevel(logLevel45);
        java.util.concurrent.Executor executor47 = null;
        builder44.callbackExecutor = executor47;
        retrofit.client.Client.Provider provider49 = builder44.getclientProvider();
        retrofit.client.Client.Provider provider50 = builder44.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel51 = builder44.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter52.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter52.deserializeObjectConverter1();
        java.lang.String str55 = serializedObjectSupporter52.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler56 = serializedObjectSupporter52.deserializeObjectErrorHandler1();
        builder44.errorHandler = errorHandler56;
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server31, provider34, executor35, executor36, requestInterceptor41, converter42, profiler43, errorHandler56, log58, logLevel59);
        retrofit.RestAdapter.Builder builder61 = builder0.setLogLevel(logLevel59);
        retrofit.Server server62 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder63 = builder61.setServer(server62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertNull(provider50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://example.com/" + "'", str55, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler56);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor4 = builder0.getcallbackExecutor();
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.Profiler profiler22 = null;
        builder0.profiler = profiler22;
        retrofit.converter.Converter converter24 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString7();
        retrofit.Server server11 = serializedObjectSupporter5.deserializeObjectServer1();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(server11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.lang.String str11 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder2.server;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        java.util.concurrent.Executor executor11 = builder0.callbackExecutor;
        retrofit.converter.Converter converter12 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder7 = builder5.setLogLevel(logLevel6);
        retrofit.ErrorHandler errorHandler8 = null;
        builder5.errorHandler = errorHandler8;
        java.util.concurrent.Executor executor10 = builder5.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        retrofit.client.Response response13 = serializedObjectSupporter11.deserializeObjectResponse4();
        retrofit.Server server14 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter6();
        builder5.converter = gsonConverter15;
        java.util.concurrent.Executor executor17 = null;
        builder5.setcallbackExecutor(executor17);
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder21 = builder19.setLogLevel(logLevel20);
        retrofit.Server server22 = builder19.server;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder25 = builder23.setLogLevel(logLevel24);
        java.util.concurrent.Executor executor26 = null;
        builder23.callbackExecutor = executor26;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel29 = builder28.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter30.deserializeObjectConverter4();
        builder28.converter = gsonConverter31;
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder34 = builder28.setLog(log33);
        retrofit.RestAdapter.Builder builder35 = builder23.setLog(log33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter1();
        java.lang.String str39 = serializedObjectSupporter36.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler40 = serializedObjectSupporter36.deserializeObjectErrorHandler1();
        builder35.errorHandler = errorHandler40;
        builder19.errorHandler = errorHandler40;
        retrofit.RestAdapter.LogLevel logLevel43 = builder19.logLevel;
        builder5.logLevel = logLevel43;
        retrofit.RestAdapter.Builder builder45 = builder0.setLogLevel(logLevel43);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler40);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.client.Client.Provider provider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(provider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder19 = builder0.setLogLevel(logLevel18);
        retrofit.Server server20 = builder0.server;
        retrofit.client.Client.Provider provider21 = null;
        builder0.clientProvider = provider21;
        retrofit.RestAdapter.Builder builder24 = builder0.setServer("Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "http://example.com/", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList13, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        java.util.concurrent.Executor executor6 = builder0.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.client.Response response24 = serializedObjectSupporter22.deserializeObjectResponse4();
        retrofit.Server server25 = serializedObjectSupporter22.deserializeObjectServer1();
        builder0.server = server25;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel28 = builder27.logLevel;
        java.util.concurrent.Executor executor29 = builder27.getcallbackExecutor();
        retrofit.client.Client.Provider provider30 = null;
        builder27.setclientProvider(provider30);
        java.util.concurrent.Executor executor32 = null;
        builder27.sethttpExecutor(executor32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel35 = builder34.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter4();
        builder34.converter = gsonConverter37;
        retrofit.RestAdapter.Builder builder39 = builder27.setConverter((retrofit.converter.Converter) gsonConverter37);
        retrofit.RestAdapter.Builder builder40 = builder0.setConverter((retrofit.converter.Converter) gsonConverter37);
        java.util.concurrent.Executor executor41 = builder40.callbackExecutor;
        retrofit.client.Client.Provider provider42 = builder40.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNull(provider42);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.client.Response response9 = serializedObjectSupporter7.deserializeObjectResponse4();
        retrofit.Server server10 = serializedObjectSupporter7.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder11 = builder0.setServer(server10);
        java.util.concurrent.Executor executor12 = null;
        builder11.setcallbackExecutor(executor12);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler12 = serializedObjectSupporter8.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler12;
        retrofit.client.Client.Provider provider14 = builder0.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter4();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor29 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLogLevel(logLevel33);
        java.util.concurrent.Executor executor35 = null;
        builder32.callbackExecutor = executor35;
        retrofit.client.Client.Provider provider37 = builder32.getclientProvider();
        retrofit.client.Client.Provider provider38 = builder32.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel39 = builder32.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter1();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        builder32.errorHandler = errorHandler44;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server19, provider22, executor23, executor24, requestInterceptor29, converter30, profiler31, errorHandler44, log46, logLevel47);
        retrofit.client.Client.Provider provider49 = restAdapter48.getclientProvider();
        java.lang.Throwable throwable50 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter48.logException(throwable50, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider49);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RestAdapter.Log log8 = builder7.log;
        retrofit.client.Client.Provider provider9 = builder7.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter10 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.Profiler profiler22 = null;
        builder0.profiler = profiler22;
        retrofit.Server server24 = builder0.server;
        java.util.concurrent.Executor executor25 = null;
        builder0.httpExecutor = executor25;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(server24);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter4();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor29 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLogLevel(logLevel33);
        java.util.concurrent.Executor executor35 = null;
        builder32.callbackExecutor = executor35;
        retrofit.client.Client.Provider provider37 = builder32.getclientProvider();
        retrofit.client.Client.Provider provider38 = builder32.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel39 = builder32.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter1();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        builder32.errorHandler = errorHandler44;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server19, provider22, executor23, executor24, requestInterceptor29, converter30, profiler31, errorHandler44, log46, logLevel47);
        retrofit.RestAdapter.LogLevel logLevel49 = restAdapter48.getLogLevel();
        java.util.concurrent.Executor executor50 = restAdapter48.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor50);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.Server server12 = builder9.server;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        java.util.concurrent.Executor executor16 = null;
        builder13.callbackExecutor = executor16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.RestAdapter.Builder builder25 = builder13.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter1();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler30 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        builder25.errorHandler = errorHandler30;
        builder9.errorHandler = errorHandler30;
        retrofit.RestAdapter.Builder builder33 = builder0.setErrorHandler(errorHandler30);
        java.util.concurrent.Executor executor34 = builder33.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(executor34);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter6.deserializeObjectServer1();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter11 = serializedObjectSupporter6.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.converter.Converter converter6 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLogLevel(logLevel26);
        java.util.concurrent.Executor executor28 = null;
        builder25.callbackExecutor = executor28;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel31 = builder30.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter4();
        builder30.converter = gsonConverter33;
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder30.setLog(log35);
        retrofit.RestAdapter.Builder builder37 = builder25.setLog(log35);
        log35.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder40 = builder0.setLog(log35);
        retrofit.client.Client.Provider provider41 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder42 = builder40.setClient(provider41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = builder4.logLevel;
        boolean boolean6 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.client.Client.Provider provider8 = null;
        builder0.setclientProvider(provider8);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log3;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.Profiler profiler22 = null;
        builder0.profiler = profiler22;
        retrofit.converter.Converter converter24 = builder0.converter;
        retrofit.RestAdapter.Log log25 = null;
        builder0.log = log25;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(converter24);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLogLevel(logLevel26);
        retrofit.ErrorHandler errorHandler28 = null;
        builder25.errorHandler = errorHandler28;
        java.util.concurrent.Executor executor30 = builder25.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter4();
        retrofit.client.Response response33 = serializedObjectSupporter31.deserializeObjectResponse4();
        retrofit.Server server34 = serializedObjectSupporter31.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter31.deserializeObjectConverter6();
        builder25.converter = gsonConverter35;
        builder0.converter = gsonConverter35;
        retrofit.client.Client.Provider provider38 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder39 = builder0.setClient(provider38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(gsonConverter35);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.Server server3 = builder0.server;
        retrofit.converter.Converter converter4 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter8();
        builder0.converter = gsonConverter4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setRequestInterceptor(requestInterceptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler11 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder12 = builder0.setErrorHandler(errorHandler11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder12.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.client.Response response24 = serializedObjectSupporter22.deserializeObjectResponse4();
        retrofit.Server server25 = serializedObjectSupporter22.deserializeObjectServer1();
        builder0.server = server25;
        retrofit.client.Client client27 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder28 = builder0.setClient(client27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(server25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel10 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        java.util.concurrent.Executor executor24 = null;
        builder0.callbackExecutor = executor24;
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder28 = builder26.setLogLevel(logLevel27);
        retrofit.RequestInterceptor requestInterceptor29 = builder26.requestInterceptor;
        retrofit.Profiler profiler30 = null;
        builder26.profiler = profiler30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel33 = builder32.logLevel;
        builder26.logLevel = logLevel33;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel36 = builder35.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter4();
        builder35.converter = gsonConverter38;
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder41 = builder35.setLog(log40);
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter42.deserializeObjectConverter4();
        retrofit.client.Response response44 = serializedObjectSupporter42.deserializeObjectResponse4();
        retrofit.Server server45 = serializedObjectSupporter42.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder46 = builder35.setServer(server45);
        builder26.server = server45;
        retrofit.Profiler profiler48 = null;
        builder26.profiler = profiler48;
        retrofit.Server server50 = builder26.server;
        retrofit.RestAdapter.Builder builder51 = builder0.setServer(server50);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(server50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder11 = builder0.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.Profiler profiler12 = builder11.profiler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(profiler12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.client.Response response24 = serializedObjectSupporter22.deserializeObjectResponse4();
        retrofit.Server server25 = serializedObjectSupporter22.deserializeObjectServer1();
        builder0.server = server25;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel28 = builder27.logLevel;
        java.util.concurrent.Executor executor29 = builder27.getcallbackExecutor();
        retrofit.client.Client.Provider provider30 = null;
        builder27.setclientProvider(provider30);
        java.util.concurrent.Executor executor32 = null;
        builder27.sethttpExecutor(executor32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel35 = builder34.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter4();
        builder34.converter = gsonConverter37;
        retrofit.RestAdapter.Builder builder39 = builder27.setConverter((retrofit.converter.Converter) gsonConverter37);
        retrofit.RestAdapter.Builder builder40 = builder0.setConverter((retrofit.converter.Converter) gsonConverter37);
        java.lang.Class<?> wildcardClass41 = gsonConverter37.getClass();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor18 = null;
        builder0.callbackExecutor = executor18;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder15 = builder0.setExecutors(executor13, executor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class8 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder19 = builder0.setLogLevel(logLevel18);
        retrofit.client.Client.Provider provider20 = builder19.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log3;
        log3.log("");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter4();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor29 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLogLevel(logLevel33);
        java.util.concurrent.Executor executor35 = null;
        builder32.callbackExecutor = executor35;
        retrofit.client.Client.Provider provider37 = builder32.getclientProvider();
        retrofit.client.Client.Provider provider38 = builder32.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel39 = builder32.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter1();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        builder32.errorHandler = errorHandler44;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server19, provider22, executor23, executor24, requestInterceptor29, converter30, profiler31, errorHandler44, log46, logLevel47);
        retrofit.RestAdapter.LogLevel logLevel49 = restAdapter48.getLogLevel();
        java.util.concurrent.Executor executor50 = restAdapter48.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor50);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter1();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString1();
        java.lang.String str29 = serializedObjectSupporter25.deserializeObjectString6();
        java.lang.String str30 = serializedObjectSupporter25.deserializeObjectString7();
        java.lang.Class class31 = serializedObjectSupporter25.deserializeObjectClass1();
        retrofit.client.Response response32 = serializedObjectSupporter25.deserializeObjectResponse1();
        builder0.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.Log log34 = builder0.log;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Retrofit-" + "'", str28, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(log34);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        log5.log("Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder7 = builder5.setLogLevel(logLevel6);
        java.util.concurrent.Executor executor8 = null;
        builder5.callbackExecutor = executor8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel11 = builder10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        builder10.converter = gsonConverter13;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder16 = builder10.setLog(log15);
        retrofit.RestAdapter.Builder builder17 = builder5.setLog(log15);
        builder0.log = log15;
        java.util.concurrent.Executor executor19 = null;
        builder0.httpExecutor = executor19;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
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
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder4 = builder2.setLogLevel(logLevel3);
        retrofit.RequestInterceptor requestInterceptor5 = builder2.requestInterceptor;
        retrofit.Profiler profiler6 = null;
        builder2.profiler = profiler6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder10 = builder8.setLogLevel(logLevel9);
        java.util.concurrent.Executor executor11 = null;
        builder8.callbackExecutor = executor11;
        retrofit.client.Client.Provider provider13 = builder8.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter4();
        retrofit.client.Response response16 = serializedObjectSupporter14.deserializeObjectResponse4();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString2();
        builder8.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        retrofit.client.Response response22 = serializedObjectSupporter20.deserializeObjectResponse4();
        retrofit.Server server23 = serializedObjectSupporter20.deserializeObjectServer1();
        builder8.server = server23;
        retrofit.RestAdapter.Builder builder25 = builder2.setServer(server23);
        retrofit.RestAdapter.LogLevel logLevel26 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder27 = builder0.setLogLevel(logLevel26);
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder30 = builder28.setLogLevel(logLevel29);
        java.util.concurrent.Executor executor31 = null;
        builder28.callbackExecutor = executor31;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter33.deserializeObjectConverter4();
        retrofit.client.Response response35 = serializedObjectSupporter33.deserializeObjectResponse4();
        java.lang.String str36 = serializedObjectSupporter33.deserializeObjectString8();
        builder28.serializedObjectSupporter = serializedObjectSupporter33;
        java.lang.String str38 = serializedObjectSupporter33.deserializeObjectString7();
        retrofit.ErrorHandler errorHandler39 = serializedObjectSupporter33.deserializeObjectErrorHandler1();
        builder27.errorHandler = errorHandler39;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(requestInterceptor5);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler39);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter2();
        builder0.converter = gsonConverter10;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Retrofit-Idle" + "'", str8, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter7();
        retrofit.RequestInterceptor requestInterceptor14 = serializedObjectSupporter12.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(server4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.RestAdapter.Log log9 = builder0.log;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel11 = builder10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        builder10.converter = gsonConverter13;
        builder0.converter = gsonConverter13;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log9);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor7 = null;
        builder0.setcallbackExecutor(executor7);
        retrofit.converter.Converter converter9 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.Server server11 = builder0.server;
        java.util.concurrent.Executor executor12 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor13 = builder0.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.client.Client.Provider provider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setClient(provider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        builder0.converter = gsonConverter10;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter12 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(provider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        java.util.concurrent.Executor executor11 = null;
        java.util.concurrent.Executor executor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setExecutors(executor11, executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.RestAdapter.Log log9 = builder0.log;
        java.util.concurrent.Executor executor10 = null;
        builder0.httpExecutor = executor10;
        java.util.concurrent.Executor executor12 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor13 = builder0.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log9);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        builder0.converter = gsonConverter10;
        java.util.concurrent.Executor executor12 = null;
        builder0.setcallbackExecutor(executor12);
        java.util.concurrent.Executor executor14 = builder0.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = null;
        builder0.sethttpExecutor(executor5);
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        java.util.concurrent.Executor executor9 = null;
        builder0.httpExecutor = executor9;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder13 = builder11.setLogLevel(logLevel12);
        retrofit.RequestInterceptor requestInterceptor14 = builder11.requestInterceptor;
        retrofit.Profiler profiler15 = null;
        builder11.profiler = profiler15;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel18 = builder17.logLevel;
        builder11.logLevel = logLevel18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel21 = builder20.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        builder20.converter = gsonConverter23;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder26 = builder20.setLog(log25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter4();
        retrofit.client.Response response29 = serializedObjectSupporter27.deserializeObjectResponse4();
        retrofit.Server server30 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder31 = builder20.setServer(server30);
        builder11.server = server30;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter4();
        java.lang.String str39 = serializedObjectSupporter36.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor40 = serializedObjectSupporter36.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter41 = null;
        retrofit.Profiler profiler42 = null;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder45 = builder43.setLogLevel(logLevel44);
        java.util.concurrent.Executor executor46 = null;
        builder43.callbackExecutor = executor46;
        retrofit.client.Client.Provider provider48 = builder43.getclientProvider();
        retrofit.client.Client.Provider provider49 = builder43.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel50 = builder43.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter51.deserializeObjectConverter1();
        java.lang.String str54 = serializedObjectSupporter51.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler55 = serializedObjectSupporter51.deserializeObjectErrorHandler1();
        builder43.errorHandler = errorHandler55;
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server30, provider33, executor34, executor35, requestInterceptor40, converter41, profiler42, errorHandler55, log57, logLevel58);
        retrofit.RestAdapter.LogLevel logLevel60 = restAdapter59.getLogLevel();
        retrofit.RestAdapter.Log log61 = restAdapter59.log;
        builder0.log = log61;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor40);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(provider48);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler55);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log61);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        retrofit.RestAdapter.Builder builder11 = builder0.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter1();
        java.lang.Class class15 = serializedObjectSupporter12.deserializeObjectClass1();
        retrofit.Server server16 = serializedObjectSupporter12.deserializeObjectServer1();
        builder11.server = server16;
        java.lang.Class<?> wildcardClass18 = server16.getClass();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider7 = null;
        builder6.clientProvider = provider7;
        retrofit.Profiler profiler9 = null;
        builder6.profiler = profiler9;
        java.util.concurrent.Executor executor11 = builder6.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter4();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor29 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLogLevel(logLevel33);
        java.util.concurrent.Executor executor35 = null;
        builder32.callbackExecutor = executor35;
        retrofit.client.Client.Provider provider37 = builder32.getclientProvider();
        retrofit.client.Client.Provider provider38 = builder32.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel39 = builder32.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter1();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        builder32.errorHandler = errorHandler44;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server19, provider22, executor23, executor24, requestInterceptor29, converter30, profiler31, errorHandler44, log46, logLevel47);
        retrofit.client.Client.Provider provider49 = restAdapter48.getclientProvider();
        java.util.concurrent.Executor executor50 = restAdapter48.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertNull(executor50);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = null;
        builder0.sethttpExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder7.converter = gsonConverter10;
        retrofit.RestAdapter.Builder builder12 = builder0.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.Profiler profiler13 = null;
        builder0.profiler = profiler13;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        boolean boolean25 = logLevel24.log();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        java.util.concurrent.Executor executor24 = builder23.callbackExecutor;
        java.util.concurrent.Executor executor25 = builder23.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(executor25);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.Profiler profiler6 = builder0.profiler;
        retrofit.client.Client.Provider provider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(provider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(profiler6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider18 = null;
        builder0.setclientProvider(provider18);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        java.util.concurrent.Executor executor25 = null;
        builder0.sethttpExecutor(executor25);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        java.util.concurrent.Executor executor12 = null;
        builder0.setcallbackExecutor(executor12);
        java.util.concurrent.Executor executor14 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor15 = builder0.httpExecutor;
        java.util.concurrent.Executor executor16 = builder0.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RestAdapter.Log log8 = builder7.log;
        retrofit.client.Client.Provider provider9 = builder7.clientProvider;
        retrofit.client.Client.Provider provider10 = null;
        builder7.clientProvider = provider10;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter4();
        builder0.converter = gsonConverter5;
        java.util.concurrent.Executor executor7 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder0.logLevel = logLevel4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        java.util.concurrent.Executor executor10 = null;
        builder0.callbackExecutor = executor10;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter8();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler15 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList11, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        retrofit.RestAdapter.Log log24 = builder0.log;
        retrofit.client.Client client25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder26 = builder0.setClient(client25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(log24);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "http://example.com/", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request13.getHeaders();
        java.util.List<retrofit.client.Header> headerList17 = request13.getHeaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter13.deserializeObjectErrorHandler1();
        builder12.errorHandler = errorHandler17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder21 = builder19.setLogLevel(logLevel20);
        retrofit.Server server22 = builder19.server;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder25 = builder23.setLogLevel(logLevel24);
        java.util.concurrent.Executor executor26 = null;
        builder23.callbackExecutor = executor26;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel29 = builder28.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter30.deserializeObjectConverter4();
        builder28.converter = gsonConverter31;
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder34 = builder28.setLog(log33);
        retrofit.RestAdapter.Builder builder35 = builder23.setLog(log33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter1();
        java.lang.String str39 = serializedObjectSupporter36.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler40 = serializedObjectSupporter36.deserializeObjectErrorHandler1();
        builder35.errorHandler = errorHandler40;
        builder19.errorHandler = errorHandler40;
        retrofit.RestAdapter.LogLevel logLevel43 = builder19.logLevel;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLogLevel(logLevel45);
        java.util.concurrent.Executor executor47 = null;
        builder44.callbackExecutor = executor47;
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel50 = builder49.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter4();
        builder49.converter = gsonConverter52;
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder55 = builder49.setLog(log54);
        retrofit.RestAdapter.Builder builder56 = builder44.setLog(log54);
        log54.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder59 = builder19.setLog(log54);
        retrofit.RestAdapter.Builder builder60 = builder12.setLog(log54);
        retrofit.Profiler profiler61 = builder12.profiler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler40);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(profiler61);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder7.requestInterceptor = requestInterceptor8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder12 = builder10.setLogLevel(logLevel11);
        java.util.concurrent.Executor executor13 = null;
        builder10.callbackExecutor = executor13;
        retrofit.client.Client.Provider provider15 = builder10.getclientProvider();
        retrofit.client.Client.Provider provider16 = builder10.getclientProvider();
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel18 = builder17.logLevel;
        builder10.logLevel = logLevel18;
        retrofit.RestAdapter.Builder builder20 = builder7.setLogLevel(logLevel18);
        boolean boolean21 = logLevel18.log();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.Profiler profiler22 = null;
        builder0.profiler = profiler22;
        java.util.concurrent.Executor executor24 = null;
        builder0.httpExecutor = executor24;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder4 = builder2.setLogLevel(logLevel3);
        retrofit.RequestInterceptor requestInterceptor5 = builder2.requestInterceptor;
        retrofit.Profiler profiler6 = null;
        builder2.profiler = profiler6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder10 = builder8.setLogLevel(logLevel9);
        java.util.concurrent.Executor executor11 = null;
        builder8.callbackExecutor = executor11;
        retrofit.client.Client.Provider provider13 = builder8.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter4();
        retrofit.client.Response response16 = serializedObjectSupporter14.deserializeObjectResponse4();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString2();
        builder8.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        retrofit.client.Response response22 = serializedObjectSupporter20.deserializeObjectResponse4();
        retrofit.Server server23 = serializedObjectSupporter20.deserializeObjectServer1();
        builder8.server = server23;
        retrofit.RestAdapter.Builder builder25 = builder2.setServer(server23);
        retrofit.RestAdapter.LogLevel logLevel26 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder27 = builder0.setLogLevel(logLevel26);
        java.lang.Class<?> wildcardClass28 = logLevel26.getClass();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(requestInterceptor5);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        retrofit.client.Client.Provider provider24 = builder23.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor7 = builder6.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(requestInterceptor7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "http://example.com/", headerList13, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        java.lang.String str17 = request15.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "Retrofit-Idle", headerList18, typedOutput19);
        java.lang.String str21 = request20.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = null;
        builder0.sethttpExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder7.converter = gsonConverter10;
        retrofit.RestAdapter.Builder builder12 = builder0.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.client.Client.Provider provider13 = builder0.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString7();
        retrofit.ErrorHandler errorHandler11 = serializedObjectSupporter5.deserializeObjectErrorHandler1();
        retrofit.client.Response response12 = serializedObjectSupporter5.deserializeObjectResponse1();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "http://example.com/", headerList13, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        java.lang.String str17 = request15.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "Retrofit-Idle", headerList18, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.clientProvider;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = null;
        builder0.sethttpExecutor(executor9);
        java.util.concurrent.Executor executor11 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler12 = builder0.profiler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(profiler12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setExecutors(executor7, executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter4();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor29 = serializedObjectSupporter25.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLogLevel(logLevel33);
        java.util.concurrent.Executor executor35 = null;
        builder32.callbackExecutor = executor35;
        retrofit.client.Client.Provider provider37 = builder32.getclientProvider();
        retrofit.client.Client.Provider provider38 = builder32.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel39 = builder32.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter40.deserializeObjectConverter1();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        builder32.errorHandler = errorHandler44;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server19, provider22, executor23, executor24, requestInterceptor29, converter30, profiler31, errorHandler44, log46, logLevel47);
        boolean boolean49 = logLevel47.log();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor29);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Log log6 = builder0.log;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(log6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.Profiler profiler25 = null;
        builder0.profiler = profiler25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter27);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        retrofit.RequestInterceptor requestInterceptor16 = builder13.requestInterceptor;
        retrofit.Profiler profiler17 = null;
        builder13.profiler = profiler17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = builder19.logLevel;
        builder13.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel23 = builder22.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter4();
        builder22.converter = gsonConverter25;
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder28 = builder22.setLog(log27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter29.deserializeObjectConverter4();
        retrofit.client.Response response31 = serializedObjectSupporter29.deserializeObjectResponse4();
        retrofit.Server server32 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder33 = builder22.setServer(server32);
        builder13.server = server32;
        retrofit.RestAdapter.Builder builder35 = builder0.setServer(server32);
        java.util.concurrent.Executor executor36 = null;
        builder35.callbackExecutor = executor36;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler11 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder12 = builder0.setErrorHandler(errorHandler11);
        retrofit.RequestInterceptor requestInterceptor13 = builder12.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = builder12.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.clientProvider;
        retrofit.client.Client.Provider provider7 = null;
        builder0.setclientProvider(provider7);
        java.util.concurrent.Executor executor9 = null;
        builder0.sethttpExecutor(executor9);
        retrofit.converter.Converter converter11 = builder0.converter;
        retrofit.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setClient(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(converter11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler11 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder12 = builder0.setErrorHandler(errorHandler11);
        java.util.concurrent.Executor executor13 = builder12.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.RequestInterceptor requestInterceptor7 = builder0.requestInterceptor;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(requestInterceptor7);
        org.junit.Assert.assertNull(errorHandler8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        java.util.concurrent.Executor executor9 = null;
        builder0.sethttpExecutor(executor9);
        retrofit.Profiler profiler11 = builder0.profiler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        retrofit.converter.Converter converter9 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(errorHandler8);
        org.junit.Assert.assertNull(converter9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.RestAdapter.Log log9 = builder0.log;
        java.util.concurrent.Executor executor10 = null;
        builder0.httpExecutor = executor10;
        retrofit.RestAdapter.LogLevel logLevel12 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log9);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "http://example.com/", headerList15, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        java.lang.String str19 = request17.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "Retrofit-Idle", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", headerList20, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput25);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "http://example.com/", headerList15, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        java.lang.String str19 = request17.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "Retrofit-Idle", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", headerList20, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.client.Client.Provider provider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder7.setClient(provider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter8();
        builder0.converter = gsonConverter4;
        java.util.concurrent.Executor executor6 = null;
        builder0.sethttpExecutor(executor6);
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder0.logLevel = logLevel8;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.Server server11 = builder0.server;
        java.util.concurrent.Executor executor12 = builder0.getcallbackExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter13 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler8 = null;
        builder0.profiler = profiler8;
        retrofit.client.Client.Provider provider10 = null;
        builder0.setclientProvider(provider10);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.Class<?> wildcardClass2 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLogLevel(logLevel26);
        java.util.concurrent.Executor executor28 = null;
        builder25.callbackExecutor = executor28;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel31 = builder30.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter4();
        builder30.converter = gsonConverter33;
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder30.setLog(log35);
        retrofit.RestAdapter.Builder builder37 = builder25.setLog(log35);
        log35.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder40 = builder0.setLog(log35);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLogLevel(logLevel42);
        retrofit.RequestInterceptor requestInterceptor44 = builder41.requestInterceptor;
        retrofit.Profiler profiler45 = null;
        builder41.profiler = profiler45;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel48 = builder47.logLevel;
        builder41.logLevel = logLevel48;
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder52 = builder50.setLogLevel(logLevel51);
        retrofit.Server server53 = builder50.server;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder56 = builder54.setLogLevel(logLevel55);
        java.util.concurrent.Executor executor57 = null;
        builder54.callbackExecutor = executor57;
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel60 = builder59.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter61.deserializeObjectConverter4();
        builder59.converter = gsonConverter62;
        retrofit.RestAdapter.Log log64 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder65 = builder59.setLog(log64);
        retrofit.RestAdapter.Builder builder66 = builder54.setLog(log64);
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter68 = serializedObjectSupporter67.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter69 = serializedObjectSupporter67.deserializeObjectConverter1();
        java.lang.String str70 = serializedObjectSupporter67.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler71 = serializedObjectSupporter67.deserializeObjectErrorHandler1();
        builder66.errorHandler = errorHandler71;
        builder50.errorHandler = errorHandler71;
        retrofit.RestAdapter.Builder builder74 = builder41.setErrorHandler(errorHandler71);
        retrofit.RestAdapter.Builder builder75 = builder0.setErrorHandler(errorHandler71);
        java.util.concurrent.Executor executor76 = builder0.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(requestInterceptor44);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(server53);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(gsonConverter68);
        org.junit.Assert.assertNotNull(gsonConverter69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler71);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNull(executor76);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.String str12 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.Server server12 = builder9.server;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        java.util.concurrent.Executor executor16 = null;
        builder13.callbackExecutor = executor16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.RestAdapter.Builder builder25 = builder13.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter1();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler30 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        builder25.errorHandler = errorHandler30;
        builder9.errorHandler = errorHandler30;
        retrofit.RestAdapter.Builder builder33 = builder0.setErrorHandler(errorHandler30);
        java.util.concurrent.Executor executor34 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider35 = null;
        builder0.setclientProvider(provider35);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(executor34);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "http://example.com/", headerList15, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-", "hi!", headerList19, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.client.Response response24 = serializedObjectSupporter22.deserializeObjectResponse4();
        retrofit.Server server25 = serializedObjectSupporter22.deserializeObjectServer1();
        builder0.server = server25;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel28 = builder27.logLevel;
        java.util.concurrent.Executor executor29 = builder27.getcallbackExecutor();
        retrofit.client.Client.Provider provider30 = null;
        builder27.setclientProvider(provider30);
        java.util.concurrent.Executor executor32 = null;
        builder27.sethttpExecutor(executor32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel35 = builder34.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter4();
        builder34.converter = gsonConverter37;
        retrofit.RestAdapter.Builder builder39 = builder27.setConverter((retrofit.converter.Converter) gsonConverter37);
        retrofit.RestAdapter.Builder builder40 = builder0.setConverter((retrofit.converter.Converter) gsonConverter37);
        retrofit.converter.Converter converter41 = builder40.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(server25);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(converter41);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        retrofit.RequestInterceptor requestInterceptor16 = builder13.requestInterceptor;
        retrofit.Profiler profiler17 = null;
        builder13.profiler = profiler17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = builder19.logLevel;
        builder13.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel23 = builder22.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter4();
        builder22.converter = gsonConverter25;
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder28 = builder22.setLog(log27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter29.deserializeObjectConverter4();
        retrofit.client.Response response31 = serializedObjectSupporter29.deserializeObjectResponse4();
        retrofit.Server server32 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder33 = builder22.setServer(server32);
        builder13.server = server32;
        retrofit.RestAdapter.Builder builder35 = builder0.setServer(server32);
        java.util.concurrent.Executor executor36 = builder35.getcallbackExecutor();
        java.util.concurrent.Executor executor37 = builder35.getcallbackExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNull(executor37);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "http://example.com/", headerList15, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        java.lang.String str19 = request17.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "Retrofit-Idle", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-Idle", "hi!", headerList20, typedOutput23);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = builder4.logLevel;
        boolean boolean6 = logLevel5.log();
        builder0.logLevel = logLevel5;
        retrofit.converter.Converter converter8 = builder0.converter;
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "Retrofit-Idle", headerList11, typedOutput14);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        boolean boolean7 = logLevel5.log();
        builder0.logLevel = logLevel5;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder20 = builder18.setLogLevel(logLevel19);
        java.util.concurrent.Executor executor21 = null;
        builder18.callbackExecutor = executor21;
        retrofit.client.Client.Provider provider23 = builder18.getclientProvider();
        retrofit.client.Client.Provider provider24 = builder18.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel25 = builder18.logLevel;
        retrofit.RestAdapter.LogLevel logLevel26 = builder18.logLevel;
        builder0.logLevel = logLevel26;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLogLevel(logLevel26);
        java.util.concurrent.Executor executor28 = null;
        builder25.callbackExecutor = executor28;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel31 = builder30.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter4();
        builder30.converter = gsonConverter33;
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder30.setLog(log35);
        retrofit.RestAdapter.Builder builder37 = builder25.setLog(log35);
        log35.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder40 = builder0.setLog(log35);
        retrofit.RestAdapter.LogLevel logLevel41 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        retrofit.RestAdapter.LogLevel logLevel24 = builder23.logLevel;
        boolean boolean25 = logLevel24.log();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        retrofit.RestAdapter.LogLevel logLevel24 = builder23.logLevel;
        retrofit.client.Client.Provider provider25 = null;
        builder23.clientProvider = provider25;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider7 = null;
        builder6.clientProvider = provider7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter4();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor13 = serializedObjectSupporter9.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder14 = builder6.setRequestInterceptor(requestInterceptor13);
        retrofit.client.Client.Provider provider15 = null;
        builder6.setclientProvider(provider15);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.RequestInterceptor requestInterceptor12 = builder9.requestInterceptor;
        retrofit.Profiler profiler13 = null;
        builder9.profiler = profiler13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel16 = builder15.logLevel;
        builder9.logLevel = logLevel16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter4();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse4();
        retrofit.Server server28 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder18.setServer(server28);
        builder9.server = server28;
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter34.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter34.deserializeObjectConverter4();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter39 = null;
        retrofit.Profiler profiler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLogLevel(logLevel42);
        java.util.concurrent.Executor executor44 = null;
        builder41.callbackExecutor = executor44;
        retrofit.client.Client.Provider provider46 = builder41.getclientProvider();
        retrofit.client.Client.Provider provider47 = builder41.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel48 = builder41.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter1();
        java.lang.String str52 = serializedObjectSupporter49.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler53 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        builder41.errorHandler = errorHandler53;
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server28, provider31, executor32, executor33, requestInterceptor38, converter39, profiler40, errorHandler53, log55, logLevel56);
        builder0.requestInterceptor = requestInterceptor38;
        java.util.concurrent.Executor executor59 = null;
        builder0.setcallbackExecutor(executor59);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(provider46);
        org.junit.Assert.assertNull(provider47);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler53);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        retrofit.Server server9 = serializedObjectSupporter6.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        builder0.converter = gsonConverter10;
        java.util.concurrent.Executor executor12 = null;
        builder0.setcallbackExecutor(executor12);
        retrofit.client.Client.Provider provider14 = null;
        builder0.clientProvider = provider14;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.lang.String str11 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.RestAdapter.LogLevel logLevel8 = builder0.logLevel;
        retrofit.client.Client.Provider provider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setClient(provider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter1();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString1();
        java.lang.String str29 = serializedObjectSupporter25.deserializeObjectString6();
        java.lang.String str30 = serializedObjectSupporter25.deserializeObjectString7();
        java.lang.Class class31 = serializedObjectSupporter25.deserializeObjectClass1();
        retrofit.client.Response response32 = serializedObjectSupporter25.deserializeObjectResponse1();
        builder0.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.Builder builder35 = builder0.setServer("Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Retrofit-" + "'", str28, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder0.logLevel = logLevel4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        java.util.concurrent.Executor executor6 = builder0.httpExecutor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider12 = null;
        builder0.clientProvider = provider12;
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder0.setExecutors(executor14, executor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.converter.Converter converter3 = builder2.converter;
        retrofit.client.Client.Provider provider4 = builder2.getclientProvider();
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder7 = builder5.setLogLevel(logLevel6);
        java.util.concurrent.Executor executor8 = null;
        builder5.callbackExecutor = executor8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel11 = builder10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        builder10.converter = gsonConverter13;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder16 = builder10.setLog(log15);
        retrofit.RestAdapter.Builder builder17 = builder5.setLog(log15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter1();
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler22 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        builder17.errorHandler = errorHandler22;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder26 = builder24.setLogLevel(logLevel25);
        retrofit.Server server27 = builder24.server;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder30 = builder28.setLogLevel(logLevel29);
        java.util.concurrent.Executor executor31 = null;
        builder28.callbackExecutor = executor31;
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel34 = builder33.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter4();
        builder33.converter = gsonConverter36;
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = builder33.setLog(log38);
        retrofit.RestAdapter.Builder builder40 = builder28.setLog(log38);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter41.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter41.deserializeObjectConverter1();
        java.lang.String str44 = serializedObjectSupporter41.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler45 = serializedObjectSupporter41.deserializeObjectErrorHandler1();
        builder40.errorHandler = errorHandler45;
        builder24.errorHandler = errorHandler45;
        retrofit.RestAdapter.LogLevel logLevel48 = builder24.logLevel;
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder51 = builder49.setLogLevel(logLevel50);
        java.util.concurrent.Executor executor52 = null;
        builder49.callbackExecutor = executor52;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel55 = builder54.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter4();
        builder54.converter = gsonConverter57;
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder60 = builder54.setLog(log59);
        retrofit.RestAdapter.Builder builder61 = builder49.setLog(log59);
        log59.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder64 = builder24.setLog(log59);
        retrofit.RestAdapter.Builder builder65 = builder17.setLog(log59);
        retrofit.RestAdapter.Builder builder66 = builder2.setLog(log59);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler22);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler45);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(log59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = builder4.logLevel;
        boolean boolean6 = logLevel5.log();
        builder0.logLevel = logLevel5;
        java.util.concurrent.Executor executor8 = null;
        builder0.sethttpExecutor(executor8);
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder12 = builder10.setLogLevel(logLevel11);
        retrofit.RequestInterceptor requestInterceptor13 = builder10.requestInterceptor;
        retrofit.Profiler profiler14 = null;
        builder10.profiler = profiler14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel17 = builder16.logLevel;
        builder10.logLevel = logLevel17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = builder19.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter4();
        builder19.converter = gsonConverter22;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = builder19.setLog(log24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter4();
        retrofit.client.Response response28 = serializedObjectSupporter26.deserializeObjectResponse4();
        retrofit.Server server29 = serializedObjectSupporter26.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder30 = builder19.setServer(server29);
        builder10.server = server29;
        retrofit.client.Client.Provider provider32 = null;
        java.util.concurrent.Executor executor33 = null;
        java.util.concurrent.Executor executor34 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter35.deserializeObjectConverter4();
        java.lang.String str38 = serializedObjectSupporter35.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor39 = serializedObjectSupporter35.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder44 = builder42.setLogLevel(logLevel43);
        java.util.concurrent.Executor executor45 = null;
        builder42.callbackExecutor = executor45;
        retrofit.client.Client.Provider provider47 = builder42.getclientProvider();
        retrofit.client.Client.Provider provider48 = builder42.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel49 = builder42.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter50.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter50.deserializeObjectConverter1();
        java.lang.String str53 = serializedObjectSupporter50.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler54 = serializedObjectSupporter50.deserializeObjectErrorHandler1();
        builder42.errorHandler = errorHandler54;
        retrofit.RestAdapter.Log log56 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter58 = new retrofit.RestAdapter(server29, provider32, executor33, executor34, requestInterceptor39, converter40, profiler41, errorHandler54, log56, logLevel57);
        retrofit.RestAdapter.LogLevel logLevel59 = restAdapter58.getLogLevel();
        builder0.logLevel = logLevel59;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor39);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(provider47);
        org.junit.Assert.assertNull(provider48);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler54);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList13, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("");
        log0.log("Retrofit-Idle");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        java.util.concurrent.Executor executor24 = null;
        builder0.sethttpExecutor(executor24);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder7 = builder5.setLogLevel(logLevel6);
        java.util.concurrent.Executor executor8 = null;
        builder5.callbackExecutor = executor8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel11 = builder10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        builder10.converter = gsonConverter13;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder16 = builder10.setLog(log15);
        retrofit.RestAdapter.Builder builder17 = builder5.setLog(log15);
        builder0.log = log15;
        log15.log("http://example.com/");
        log15.log("");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLogLevel(logLevel26);
        java.util.concurrent.Executor executor28 = null;
        builder25.callbackExecutor = executor28;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel31 = builder30.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter4();
        builder30.converter = gsonConverter33;
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder30.setLog(log35);
        retrofit.RestAdapter.Builder builder37 = builder25.setLog(log35);
        log35.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder40 = builder0.setLog(log35);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLogLevel(logLevel42);
        retrofit.RequestInterceptor requestInterceptor44 = builder41.requestInterceptor;
        retrofit.Profiler profiler45 = null;
        builder41.profiler = profiler45;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel48 = builder47.logLevel;
        builder41.logLevel = logLevel48;
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder52 = builder50.setLogLevel(logLevel51);
        retrofit.Server server53 = builder50.server;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder56 = builder54.setLogLevel(logLevel55);
        java.util.concurrent.Executor executor57 = null;
        builder54.callbackExecutor = executor57;
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel60 = builder59.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter61.deserializeObjectConverter4();
        builder59.converter = gsonConverter62;
        retrofit.RestAdapter.Log log64 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder65 = builder59.setLog(log64);
        retrofit.RestAdapter.Builder builder66 = builder54.setLog(log64);
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter68 = serializedObjectSupporter67.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter69 = serializedObjectSupporter67.deserializeObjectConverter1();
        java.lang.String str70 = serializedObjectSupporter67.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler71 = serializedObjectSupporter67.deserializeObjectErrorHandler1();
        builder66.errorHandler = errorHandler71;
        builder50.errorHandler = errorHandler71;
        retrofit.RestAdapter.Builder builder74 = builder41.setErrorHandler(errorHandler71);
        retrofit.RestAdapter.Builder builder75 = builder0.setErrorHandler(errorHandler71);
        retrofit.ErrorHandler errorHandler76 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder77 = builder0.setErrorHandler(errorHandler76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(requestInterceptor44);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(server53);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(gsonConverter68);
        org.junit.Assert.assertNotNull(gsonConverter69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "http://example.com/" + "'", str70, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler71);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = builder6.serializedObjectSupporter;
        retrofit.client.Response response19 = serializedObjectSupporter18.deserializeObjectResponse1();
        builder0.serializedObjectSupporter = serializedObjectSupporter18;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        java.util.concurrent.Executor executor25 = null;
        builder0.callbackExecutor = executor25;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.client.Client.Provider provider13 = null;
        builder12.setclientProvider(provider13);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.Profiler profiler22 = null;
        builder0.profiler = profiler22;
        retrofit.converter.Converter converter24 = builder0.converter;
        java.util.concurrent.Executor executor25 = null;
        builder0.setcallbackExecutor(executor25);
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel28 = builder27.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter29.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter1();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler33 = serializedObjectSupporter29.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder34 = builder27.setErrorHandler(errorHandler33);
        builder0.errorHandler = errorHandler33;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider9 = null;
        builder0.setclientProvider(provider9);
        retrofit.RestAdapter.Log log11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setLog(log11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = null;
        builder0.sethttpExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder7.converter = gsonConverter10;
        retrofit.RestAdapter.Builder builder12 = builder0.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder8 = builder6.setLogLevel(logLevel7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.client.Response response20 = serializedObjectSupporter18.deserializeObjectResponse4();
        retrofit.Server server21 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server21;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer(server21);
        java.util.concurrent.Executor executor24 = null;
        builder23.setcallbackExecutor(executor24);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("");
        builder0.log = log5;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.client.Response response15 = serializedObjectSupporter13.deserializeObjectResponse4();
        retrofit.Server server16 = serializedObjectSupporter13.deserializeObjectServer1();
        builder0.server = server16;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(server16);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.Server server12 = builder9.server;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        java.util.concurrent.Executor executor16 = null;
        builder13.callbackExecutor = executor16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.RestAdapter.Builder builder25 = builder13.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter1();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler30 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        builder25.errorHandler = errorHandler30;
        builder9.errorHandler = errorHandler30;
        retrofit.RestAdapter.Builder builder33 = builder0.setErrorHandler(errorHandler30);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter34 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        java.util.concurrent.Executor executor12 = builder0.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor13 = builder0.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.client.Response response15 = serializedObjectSupporter13.deserializeObjectResponse4();
        retrofit.Server server16 = serializedObjectSupporter13.deserializeObjectServer1();
        builder0.server = server16;
        retrofit.RequestInterceptor requestInterceptor18 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor19 = builder0.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(requestInterceptor19);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "http://example.com/", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", headerList13, typedOutput16);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider9 = builder0.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder19 = builder0.setLogLevel(logLevel18);
        java.util.concurrent.Executor executor20 = null;
        builder0.callbackExecutor = executor20;
        java.util.concurrent.Executor executor22 = builder0.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(executor22);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.Server server11 = builder0.server;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(server11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        builder0.converter = gsonConverter3;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider7 = null;
        builder6.clientProvider = provider7;
        retrofit.Profiler profiler9 = null;
        builder6.profiler = profiler9;
        retrofit.client.Client.Provider provider11 = builder6.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = builder6.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.client.Response response13 = serializedObjectSupporter12.deserializeObjectResponse1();
        java.lang.Class class14 = serializedObjectSupporter12.deserializeObjectClass1();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.Server server3 = builder0.server;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder6 = builder4.setLogLevel(logLevel5);
        java.util.concurrent.Executor executor7 = null;
        builder4.callbackExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.RestAdapter.Builder builder16 = builder4.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter17.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler21;
        builder0.errorHandler = errorHandler21;
        retrofit.RestAdapter.LogLevel logLevel24 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLogLevel(logLevel26);
        retrofit.ErrorHandler errorHandler28 = null;
        builder25.errorHandler = errorHandler28;
        java.util.concurrent.Executor executor30 = builder25.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter4();
        retrofit.client.Response response33 = serializedObjectSupporter31.deserializeObjectResponse4();
        retrofit.Server server34 = serializedObjectSupporter31.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter31.deserializeObjectConverter6();
        builder25.converter = gsonConverter35;
        builder0.converter = gsonConverter35;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler39 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder40 = builder0.setProfiler(profiler39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(server34);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNull(serializedObjectSupporter38);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.RequestInterceptor requestInterceptor7 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        retrofit.RequestInterceptor requestInterceptor16 = builder13.requestInterceptor;
        retrofit.Profiler profiler17 = null;
        builder13.profiler = profiler17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = builder19.logLevel;
        builder13.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel23 = builder22.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter4();
        builder22.converter = gsonConverter25;
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder28 = builder22.setLog(log27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter29.deserializeObjectConverter4();
        retrofit.client.Response response31 = serializedObjectSupporter29.deserializeObjectResponse4();
        retrofit.Server server32 = serializedObjectSupporter29.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder33 = builder22.setServer(server32);
        builder13.server = server32;
        retrofit.RestAdapter.Builder builder35 = builder0.setServer(server32);
        java.util.concurrent.Executor executor36 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder38 = builder0.setServer("Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel23 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel23.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "", headerList9, typedOutput10);
        java.lang.String str12 = request11.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.client.Response response14 = serializedObjectSupporter12.deserializeObjectResponse4();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        builder0.server = server15;
        java.util.concurrent.Executor executor17 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder19 = builder0.setLogLevel(logLevel18);
        java.util.concurrent.Executor executor20 = builder19.gethttpExecutor();
        java.util.concurrent.Executor executor21 = null;
        builder19.httpExecutor = executor21;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler17 = serializedObjectSupporter13.deserializeObjectErrorHandler1();
        builder12.errorHandler = errorHandler17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder21 = builder19.setLogLevel(logLevel20);
        retrofit.Server server22 = builder19.server;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder25 = builder23.setLogLevel(logLevel24);
        java.util.concurrent.Executor executor26 = null;
        builder23.callbackExecutor = executor26;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel29 = builder28.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter30.deserializeObjectConverter4();
        builder28.converter = gsonConverter31;
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder34 = builder28.setLog(log33);
        retrofit.RestAdapter.Builder builder35 = builder23.setLog(log33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter1();
        java.lang.String str39 = serializedObjectSupporter36.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler40 = serializedObjectSupporter36.deserializeObjectErrorHandler1();
        builder35.errorHandler = errorHandler40;
        builder19.errorHandler = errorHandler40;
        retrofit.RestAdapter.LogLevel logLevel43 = builder19.logLevel;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLogLevel(logLevel45);
        java.util.concurrent.Executor executor47 = null;
        builder44.callbackExecutor = executor47;
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel50 = builder49.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter4();
        builder49.converter = gsonConverter52;
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder55 = builder49.setLog(log54);
        retrofit.RestAdapter.Builder builder56 = builder44.setLog(log54);
        log54.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder59 = builder19.setLog(log54);
        retrofit.RestAdapter.Builder builder60 = builder12.setLog(log54);
        retrofit.client.Client.Provider provider61 = null;
        builder12.clientProvider = provider61;
        retrofit.RequestInterceptor requestInterceptor63 = builder12.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler17);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server22);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler40);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(requestInterceptor63);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder14 = builder12.setLogLevel(logLevel13);
        retrofit.RequestInterceptor requestInterceptor15 = builder12.requestInterceptor;
        retrofit.Profiler profiler16 = null;
        builder12.profiler = profiler16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        builder12.logLevel = logLevel19;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel22 = builder21.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter4();
        builder21.converter = gsonConverter24;
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder27 = builder21.setLog(log26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter28.deserializeObjectConverter4();
        retrofit.client.Response response30 = serializedObjectSupporter28.deserializeObjectResponse4();
        retrofit.Server server31 = serializedObjectSupporter28.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder32 = builder21.setServer(server31);
        builder12.server = server31;
        retrofit.client.Client.Provider provider34 = null;
        java.util.concurrent.Executor executor35 = null;
        java.util.concurrent.Executor executor36 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter4();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor41 = serializedObjectSupporter37.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter42 = null;
        retrofit.Profiler profiler43 = null;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLogLevel(logLevel45);
        java.util.concurrent.Executor executor47 = null;
        builder44.callbackExecutor = executor47;
        retrofit.client.Client.Provider provider49 = builder44.getclientProvider();
        retrofit.client.Client.Provider provider50 = builder44.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel51 = builder44.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter52.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter52.deserializeObjectConverter1();
        java.lang.String str55 = serializedObjectSupporter52.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler56 = serializedObjectSupporter52.deserializeObjectErrorHandler1();
        builder44.errorHandler = errorHandler56;
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server31, provider34, executor35, executor36, requestInterceptor41, converter42, profiler43, errorHandler56, log58, logLevel59);
        retrofit.RestAdapter.Builder builder61 = builder0.setLogLevel(logLevel59);
        retrofit.ErrorHandler errorHandler62 = builder61.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(server31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertNull(provider50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://example.com/" + "'", str55, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler56);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(errorHandler62);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.converter.Converter converter8 = builder0.converter;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.RequestInterceptor requestInterceptor12 = builder9.requestInterceptor;
        retrofit.Profiler profiler13 = null;
        builder9.profiler = profiler13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel16 = builder15.logLevel;
        builder9.logLevel = logLevel16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter4();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse4();
        retrofit.Server server28 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder18.setServer(server28);
        builder9.server = server28;
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter34.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter34.deserializeObjectConverter4();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter39 = null;
        retrofit.Profiler profiler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLogLevel(logLevel42);
        java.util.concurrent.Executor executor44 = null;
        builder41.callbackExecutor = executor44;
        retrofit.client.Client.Provider provider46 = builder41.getclientProvider();
        retrofit.client.Client.Provider provider47 = builder41.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel48 = builder41.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter1();
        java.lang.String str52 = serializedObjectSupporter49.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler53 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        builder41.errorHandler = errorHandler53;
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server28, provider31, executor32, executor33, requestInterceptor38, converter39, profiler40, errorHandler53, log55, logLevel56);
        builder0.server = server28;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(provider46);
        org.junit.Assert.assertNull(provider47);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler53);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler12 = serializedObjectSupporter8.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler12;
        retrofit.RestAdapter.LogLevel logLevel14 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler12);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel6 = builder5.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder5.converter = gsonConverter8;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder5.setLog(log10);
        retrofit.RestAdapter.Builder builder12 = builder0.setLog(log10);
        retrofit.client.Client.Provider provider13 = null;
        builder0.clientProvider = provider13;
        retrofit.RestAdapter.Builder builder16 = builder0.setServer("hi!");
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.RequestInterceptor requestInterceptor12 = builder9.requestInterceptor;
        retrofit.Profiler profiler13 = null;
        builder9.profiler = profiler13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel16 = builder15.logLevel;
        builder9.logLevel = logLevel16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter4();
        retrofit.client.Response response27 = serializedObjectSupporter25.deserializeObjectResponse4();
        retrofit.Server server28 = serializedObjectSupporter25.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder29 = builder18.setServer(server28);
        builder9.server = server28;
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter34.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter34.deserializeObjectConverter4();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor38 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter39 = null;
        retrofit.Profiler profiler40 = null;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLogLevel(logLevel42);
        java.util.concurrent.Executor executor44 = null;
        builder41.callbackExecutor = executor44;
        retrofit.client.Client.Provider provider46 = builder41.getclientProvider();
        retrofit.client.Client.Provider provider47 = builder41.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel48 = builder41.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter49.deserializeObjectConverter1();
        java.lang.String str52 = serializedObjectSupporter49.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler53 = serializedObjectSupporter49.deserializeObjectErrorHandler1();
        builder41.errorHandler = errorHandler53;
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server28, provider31, executor32, executor33, requestInterceptor38, converter39, profiler40, errorHandler53, log55, logLevel56);
        builder0.requestInterceptor = requestInterceptor38;
        retrofit.converter.Converter converter59 = builder0.converter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(gsonConverter35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(provider46);
        org.junit.Assert.assertNull(provider47);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler53);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(converter59);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.ErrorHandler errorHandler3 = null;
        builder0.errorHandler = errorHandler3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder13 = builder11.setLogLevel(logLevel12);
        retrofit.RequestInterceptor requestInterceptor14 = builder11.requestInterceptor;
        retrofit.Profiler profiler15 = null;
        builder11.profiler = profiler15;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel18 = builder17.logLevel;
        builder11.logLevel = logLevel18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel21 = builder20.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        builder20.converter = gsonConverter23;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder26 = builder20.setLog(log25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter4();
        retrofit.client.Response response29 = serializedObjectSupporter27.deserializeObjectResponse4();
        retrofit.Server server30 = serializedObjectSupporter27.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder31 = builder20.setServer(server30);
        builder11.server = server30;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter4();
        java.lang.String str39 = serializedObjectSupporter36.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor40 = serializedObjectSupporter36.deserializeObjectRequestInterceptor1();
        retrofit.converter.Converter converter41 = null;
        retrofit.Profiler profiler42 = null;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder45 = builder43.setLogLevel(logLevel44);
        java.util.concurrent.Executor executor46 = null;
        builder43.callbackExecutor = executor46;
        retrofit.client.Client.Provider provider48 = builder43.getclientProvider();
        retrofit.client.Client.Provider provider49 = builder43.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel50 = builder43.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter51.deserializeObjectConverter1();
        java.lang.String str54 = serializedObjectSupporter51.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler55 = serializedObjectSupporter51.deserializeObjectErrorHandler1();
        builder43.errorHandler = errorHandler55;
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server30, provider33, executor34, executor35, requestInterceptor40, converter41, profiler42, errorHandler55, log57, logLevel58);
        builder0.log = log57;
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(server30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor40);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(provider48);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler55);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter61);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler11 = serializedObjectSupporter7.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder12 = builder0.setErrorHandler(errorHandler11);
        retrofit.RequestInterceptor requestInterceptor13 = builder12.requestInterceptor;
        retrofit.Server server14 = builder12.server;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLogLevel(logLevel16);
        java.util.concurrent.Executor executor18 = null;
        builder15.callbackExecutor = executor18;
        retrofit.client.Client.Provider provider20 = builder15.getclientProvider();
        retrofit.client.Client.Provider provider21 = builder15.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel22 = builder15.logLevel;
        builder12.logLevel = logLevel22;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter4();
        builder9.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder9.setLog(log14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse4();
        retrofit.Server server19 = serializedObjectSupporter16.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder20 = builder9.setServer(server19);
        builder0.server = server19;
        retrofit.Profiler profiler22 = null;
        builder0.profiler = profiler22;
        retrofit.converter.Converter converter24 = builder0.converter;
        retrofit.Profiler profiler25 = null;
        builder0.profiler = profiler25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter27.deserializeObjectConverter1();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString1();
        java.lang.String str31 = serializedObjectSupporter27.deserializeObjectString6();
        java.lang.String str32 = serializedObjectSupporter27.deserializeObjectString7();
        java.lang.Class class33 = serializedObjectSupporter27.deserializeObjectClass1();
        java.lang.String str34 = serializedObjectSupporter27.deserializeObjectString10();
        retrofit.client.Response response35 = serializedObjectSupporter27.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter27.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder37 = builder0.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.RestAdapter restAdapter38 = builder0.build();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-" + "'", str30, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(restAdapter38);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.Profiler profiler5 = builder0.profiler;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(profiler5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "Retrofit-Idle", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList12, typedOutput15);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        builder0.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder0.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter3();
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        java.util.concurrent.Executor executor2 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder0.logLevel = logLevel4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        retrofit.client.Client.Provider provider8 = null;
        builder0.clientProvider = provider8;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel7 = builder6.logLevel;
        builder0.logLevel = logLevel7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLogLevel(logLevel10);
        retrofit.Server server12 = builder9.server;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLogLevel(logLevel14);
        java.util.concurrent.Executor executor16 = null;
        builder13.callbackExecutor = executor16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel19 = builder18.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter4();
        builder18.converter = gsonConverter21;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder18.setLog(log23);
        retrofit.RestAdapter.Builder builder25 = builder13.setLog(log23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter1();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler30 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        builder25.errorHandler = errorHandler30;
        builder9.errorHandler = errorHandler30;
        retrofit.RestAdapter.Builder builder33 = builder0.setErrorHandler(errorHandler30);
        retrofit.Profiler profiler34 = null;
        builder0.profiler = profiler34;
        retrofit.RequestInterceptor requestInterceptor36 = builder0.requestInterceptor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(requestInterceptor36);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor6 = null;
        builder0.httpExecutor = executor6;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter2.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder7 = builder0.setErrorHandler(errorHandler6);
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder10 = builder8.setLogLevel(logLevel9);
        retrofit.Server server11 = builder8.server;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder14 = builder12.setLogLevel(logLevel13);
        java.util.concurrent.Executor executor15 = null;
        builder12.callbackExecutor = executor15;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel18 = builder17.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter4();
        builder17.converter = gsonConverter20;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder23 = builder17.setLog(log22);
        retrofit.RestAdapter.Builder builder24 = builder12.setLog(log22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter1();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler29 = serializedObjectSupporter25.deserializeObjectErrorHandler1();
        builder24.errorHandler = errorHandler29;
        builder8.errorHandler = errorHandler29;
        retrofit.RestAdapter.LogLevel logLevel32 = builder8.logLevel;
        retrofit.RestAdapter.Builder builder33 = builder0.setLogLevel(logLevel32);
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler29);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.RestAdapter.Log log9 = builder0.log;
        retrofit.converter.Converter converter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setConverter(converter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor4 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider5 = builder0.clientProvider;
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(errorHandler8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel8 = builder7.logLevel;
        builder0.logLevel = logLevel8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.client.Client.Provider provider11 = null;
        builder0.clientProvider = provider11;
        retrofit.client.Client client13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder0.setClient(client13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        java.util.concurrent.Executor executor12 = null;
        builder0.setcallbackExecutor(executor12);
        retrofit.Profiler profiler14 = builder0.profiler;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLogLevel(logLevel1);
        java.util.concurrent.Executor executor3 = null;
        builder0.callbackExecutor = executor3;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor10 = null;
        builder0.sethttpExecutor(executor10);
        retrofit.RequestInterceptor requestInterceptor12 = null;
        builder0.requestInterceptor = requestInterceptor12;
        retrofit.RestAdapter.LogLevel logLevel14 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.callbackExecutor = executor1;
        retrofit.Profiler profiler3 = builder0.profiler;
        org.junit.Assert.assertNull(profiler3);
    }
}

