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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder4.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.Server server5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setServer(server5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setExecutors(executor3, executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder4.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setLogLevel(logLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((int) (byte) 0, "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((-1), "", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-" + "'", str0, "Retrofit-");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Log log13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder12.setLog(log13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.Profiler profiler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder3 = builder0.setProfiler(profiler2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response(1, "Retrofit-", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor11 = builder0.requestInterceptor;
        java.lang.Class<?> wildcardClass12 = requestInterceptor11.getClass();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder6.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList6 = response5.getHeaders();
        retrofit.mime.TypedInput typedInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response8 = new retrofit.client.Response((-1), "Retrofit-", headerList6, typedInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList6 = response5.getHeaders();
        retrofit.mime.TypedInput typedInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response8 = new retrofit.client.Response((int) '#', "Retrofit-", headerList6, typedInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor2 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedInput typedInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response6 = new retrofit.client.Response((int) (byte) -1, "Retrofit-", (java.util.List<retrofit.client.Header>) headerList3, typedInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.Server server3 = builder0.server;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(requestInterceptor4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.BASIC;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.gethttpExecutor();
        java.util.concurrent.Executor executor27 = null;
        builder25.setcallbackExecutor(executor27);
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        retrofit.client.Client.Provider provider40 = builder30.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor41 = builder30.requestInterceptor;
        retrofit.RestAdapter.Builder builder42 = builder25.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder43 = builder24.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder44 = builder17.setRequestInterceptor(requestInterceptor41);
        java.util.concurrent.Executor executor45 = builder44.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(executor45);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList5 = response3.getHeaders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder0.setExecutors(executor14, executor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Log log3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.RestAdapter.Builder builder7 = builder1.setServer("hi!");
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.gethttpExecutor();
        java.util.concurrent.Executor executor10 = null;
        builder8.setcallbackExecutor(executor10);
        retrofit.RestAdapter.LogLevel logLevel12 = builder8.logLevel;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        builder13.serializedObjectSupporter = serializedObjectSupporter18;
        builder13.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder13.clientProvider;
        retrofit.client.Client.Provider provider23 = builder13.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor24 = builder13.requestInterceptor;
        retrofit.RestAdapter.Builder builder25 = builder8.setRequestInterceptor(requestInterceptor24);
        retrofit.RestAdapter.Builder builder26 = builder7.setRequestInterceptor(requestInterceptor24);
        builder0.requestInterceptor = requestInterceptor24;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(requestInterceptor24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.converter.Converter converter3 = null;
        builder0.converter = converter3;
        retrofit.RestAdapter.Log log5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setLog(log5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList6 = response5.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = response5.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        retrofit.client.Response response10 = serializedObjectSupporter8.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput11 = response10.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response12 = new retrofit.client.Response((int) (short) 100, "Retrofit-", headerList7, typedInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(typedInput11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setClient(client3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder19 = builder6.setClient(client18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler5);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Log log18 = null;
        builder17.log = log18;
        retrofit.client.Client.Provider provider20 = builder17.getclientProvider();
        builder17.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.converter.Converter converter3 = null;
        builder0.converter = converter3;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter8();
        java.lang.Class class9 = serializedObjectSupporter5.deserializeObjectClass1();
        java.lang.Class class10 = serializedObjectSupporter5.deserializeObjectClass1();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder6.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        builder6.serializedObjectSupporter = serializedObjectSupporter11;
        builder6.ensureSaneDefaults();
        retrofit.client.Client.Provider provider15 = builder6.clientProvider;
        retrofit.client.Client.Provider provider16 = builder6.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = builder6.requestInterceptor;
        retrofit.RestAdapter.Builder builder18 = builder5.setRequestInterceptor(requestInterceptor17);
        builder0.requestInterceptor = requestInterceptor17;
        java.util.concurrent.Executor executor20 = builder0.getcallbackExecutor();
        retrofit.client.Client client21 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder22 = builder0.setClient(client21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.Server server3 = builder0.server;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(requestInterceptor4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        java.util.List<retrofit.client.Header> headerList6 = response3.getHeaders();
        int int7 = response3.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        retrofit.Profiler profiler27 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder28 = builder25.setProfiler(profiler27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = builder0.setRequestInterceptor(requestInterceptor13);
        retrofit.ErrorHandler errorHandler15 = builder0.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.Server server2 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.converter.Converter converter3 = null;
        builder0.converter = converter3;
        retrofit.RestAdapter.Log log5 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(log5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = builder0.profiler;
        retrofit.Profiler profiler19 = null;
        builder0.profiler = profiler19;
        retrofit.RestAdapter.LogLevel logLevel21 = builder0.logLevel;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        java.util.concurrent.Executor executor27 = restAdapter26.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(executor27);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.gethttpExecutor();
        java.util.concurrent.Executor executor27 = null;
        builder25.setcallbackExecutor(executor27);
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        retrofit.client.Client.Provider provider40 = builder30.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor41 = builder30.requestInterceptor;
        retrofit.RestAdapter.Builder builder42 = builder25.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder43 = builder24.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder44 = builder17.setRequestInterceptor(requestInterceptor41);
        retrofit.Profiler profiler45 = builder17.profiler;
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.FULL;
        builder17.logLevel = logLevel46;
        retrofit.client.Client client48 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder49 = builder17.setClient(client48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(profiler45);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = response4.reason;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RestAdapter.Log log7 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(log7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.gethttpExecutor();
        java.util.concurrent.Executor executor27 = null;
        builder25.setcallbackExecutor(executor27);
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        retrofit.client.Client.Provider provider40 = builder30.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor41 = builder30.requestInterceptor;
        retrofit.RestAdapter.Builder builder42 = builder25.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder43 = builder24.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder44 = builder17.setRequestInterceptor(requestInterceptor41);
        retrofit.Profiler profiler45 = builder17.profiler;
        java.util.concurrent.Executor executor46 = builder17.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(profiler45);
        org.junit.Assert.assertNull(executor46);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        retrofit.Server server20 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder21 = builder17.setServer(server20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.Profiler profiler18 = builder6.profiler;
        retrofit.RestAdapter.Log log19 = null;
        builder6.log = log19;
        java.util.concurrent.Executor executor21 = builder6.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder23 = builder6.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.NONE;
        java.lang.Class<?> wildcardClass1 = logLevel0.getClass();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean1 = logLevel0.log();
        boolean boolean2 = logLevel0.log();
        boolean boolean3 = logLevel0.log();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        builder0.ensureSaneDefaults();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter11 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput7 = response6.body;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(typedInput7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder18 = builder14.setConverter((retrofit.converter.Converter) gsonConverter17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        builder14.serializedObjectSupporter = serializedObjectSupporter19;
        builder14.ensureSaneDefaults();
        retrofit.client.Client.Provider provider23 = builder14.clientProvider;
        retrofit.client.Client.Provider provider24 = builder14.getclientProvider();
        retrofit.RestAdapter.Builder builder26 = builder14.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.FULL;
        builder26.logLevel = logLevel27;
        java.util.concurrent.Executor executor29 = builder26.callbackExecutor;
        builder2.callbackExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        retrofit.client.Client client32 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder33 = builder0.setClient(client32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor29);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(requestInterceptor5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RestAdapter.Builder builder14 = builder2.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.FULL;
        builder14.logLevel = logLevel15;
        java.util.concurrent.Executor executor17 = builder14.callbackExecutor;
        builder0.callbackExecutor = executor17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        retrofit.Server server21 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder22 = builder0.setServer(server21);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(server21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        retrofit.Profiler profiler20 = null;
        builder17.profiler = profiler20;
        retrofit.converter.Converter converter22 = builder17.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(converter22);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.Profiler profiler18 = builder6.profiler;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder23 = builder19.setConverter((retrofit.converter.Converter) gsonConverter22);
        java.util.concurrent.Executor executor24 = null;
        builder19.setcallbackExecutor(executor24);
        retrofit.Server server26 = builder19.server;
        java.util.concurrent.Executor executor27 = null;
        builder19.httpExecutor = executor27;
        builder19.ensureSaneDefaults();
        retrofit.RestAdapter.Log log30 = builder19.log;
        log30.log("");
        builder6.log = log30;
        retrofit.RestAdapter.Builder builder35 = builder6.setServer("hi!");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString9();
        java.lang.String str39 = serializedObjectSupporter37.deserializeObjectString5();
        retrofit.client.Response response40 = serializedObjectSupporter37.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter37.deserializeObjectConverter3();
        retrofit.client.Response response42 = serializedObjectSupporter37.deserializeObjectResponse2();
        retrofit.ErrorHandler errorHandler43 = serializedObjectSupporter37.deserializeObjectErrorHandler1();
        builder6.errorHandler = errorHandler43;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(errorHandler43);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        builder0.clientProvider = provider10;
        retrofit.ErrorHandler errorHandler12 = builder0.errorHandler;
        retrofit.client.Client.Provider provider13 = builder0.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter14 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNotNull(provider13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.converter.Converter converter7 = builder6.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.Profiler profiler18 = builder6.profiler;
        retrofit.RestAdapter.Log log19 = null;
        builder6.log = log19;
        java.util.concurrent.Executor executor21 = builder6.callbackExecutor;
        retrofit.Profiler profiler22 = builder6.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(profiler22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.gethttpExecutor();
        java.util.concurrent.Executor executor27 = null;
        builder25.setcallbackExecutor(executor27);
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        retrofit.client.Client.Provider provider40 = builder30.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor41 = builder30.requestInterceptor;
        retrofit.RestAdapter.Builder builder42 = builder25.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder43 = builder24.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder44 = builder17.setRequestInterceptor(requestInterceptor41);
        retrofit.Profiler profiler45 = builder17.profiler;
        retrofit.converter.Converter converter46 = builder17.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(profiler45);
        org.junit.Assert.assertNull(converter46);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.RequestInterceptor requestInterceptor10 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(requestInterceptor10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        int int6 = response3.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel13;
        java.util.concurrent.Executor executor15 = builder12.callbackExecutor;
        builder12.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = builder0.profiler;
        retrofit.converter.Converter converter19 = builder0.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder0.serializedObjectSupporter;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.Server server11 = builder0.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(server11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = builder49.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder53 = builder49.setConverter((retrofit.converter.Converter) gsonConverter52);
        java.util.concurrent.Executor executor54 = null;
        builder49.setcallbackExecutor(executor54);
        retrofit.Server server56 = builder49.server;
        java.util.concurrent.Executor executor57 = null;
        builder49.httpExecutor = executor57;
        builder49.ensureSaneDefaults();
        retrofit.RestAdapter.Log log60 = builder49.log;
        log60.log("");
        retrofit.RestAdapter.Builder builder63 = builder48.setLog(log60);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(server56);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("Retrofit-");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(log7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        java.util.concurrent.Executor executor27 = builder25.gethttpExecutor();
        retrofit.Profiler profiler28 = null;
        builder25.profiler = profiler28;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(executor27);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.gethttpExecutor();
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        builder13.serializedObjectSupporter = serializedObjectSupporter18;
        builder13.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder13.clientProvider;
        retrofit.client.Client.Provider provider23 = builder13.getclientProvider();
        retrofit.RestAdapter.Builder builder25 = builder13.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel26;
        java.util.concurrent.Executor executor28 = builder25.callbackExecutor;
        builder11.callbackExecutor = executor28;
        builder0.setcallbackExecutor(executor28);
        retrofit.ErrorHandler errorHandler31 = builder0.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor28);
        org.junit.Assert.assertNotNull(errorHandler31);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        builder13.serializedObjectSupporter = serializedObjectSupporter18;
        builder13.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder13.clientProvider;
        retrofit.client.Client.Provider provider23 = builder13.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor24 = builder13.requestInterceptor;
        retrofit.RestAdapter.Builder builder25 = builder12.setRequestInterceptor(requestInterceptor24);
        builder7.requestInterceptor = requestInterceptor24;
        builder0.requestInterceptor = requestInterceptor24;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(requestInterceptor24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.gethttpExecutor();
        java.util.concurrent.Executor executor14 = null;
        builder12.setcallbackExecutor(executor14);
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder21 = builder17.setConverter((retrofit.converter.Converter) gsonConverter20);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString9();
        builder17.serializedObjectSupporter = serializedObjectSupporter22;
        builder17.ensureSaneDefaults();
        retrofit.client.Client.Provider provider26 = builder17.clientProvider;
        retrofit.client.Client.Provider provider27 = builder17.clientProvider;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = builder28.gethttpExecutor();
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        retrofit.client.Client.Provider provider40 = builder30.getclientProvider();
        retrofit.RestAdapter.Builder builder42 = builder30.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.FULL;
        builder42.logLevel = logLevel43;
        java.util.concurrent.Executor executor45 = builder42.callbackExecutor;
        builder28.callbackExecutor = executor45;
        builder17.setcallbackExecutor(executor45);
        builder12.setcallbackExecutor(executor45);
        builder0.callbackExecutor = executor45;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(provider26);
        org.junit.Assert.assertNotNull(provider27);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor45);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.Profiler profiler5 = null;
        builder4.profiler = profiler5;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        java.util.concurrent.Executor executor37 = builder36.gethttpExecutor();
        retrofit.client.Client.Provider provider38 = builder36.getclientProvider();
        retrofit.client.Client client39 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder40 = builder36.setClient(client39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(provider38);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RestAdapter.Builder builder14 = builder2.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.FULL;
        builder14.logLevel = logLevel15;
        java.util.concurrent.Executor executor17 = builder14.callbackExecutor;
        builder0.callbackExecutor = executor17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder23 = builder19.setConverter((retrofit.converter.Converter) gsonConverter22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString9();
        builder19.serializedObjectSupporter = serializedObjectSupporter24;
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider28 = builder19.clientProvider;
        retrofit.client.Client.Provider provider29 = builder19.getclientProvider();
        java.util.concurrent.Executor executor30 = builder19.gethttpExecutor();
        builder0.httpExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = builder32.gethttpExecutor();
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = builder34.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder38 = builder34.setConverter((retrofit.converter.Converter) gsonConverter37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        java.lang.String str40 = serializedObjectSupporter39.deserializeObjectString9();
        builder34.serializedObjectSupporter = serializedObjectSupporter39;
        builder34.ensureSaneDefaults();
        retrofit.client.Client.Provider provider43 = builder34.clientProvider;
        retrofit.client.Client.Provider provider44 = builder34.getclientProvider();
        retrofit.RestAdapter.Builder builder46 = builder34.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.FULL;
        builder46.logLevel = logLevel47;
        java.util.concurrent.Executor executor49 = builder46.callbackExecutor;
        builder32.callbackExecutor = executor49;
        builder0.sethttpExecutor(executor49);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor17);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(provider44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor49);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        retrofit.RestAdapter.Log log14 = builder13.log;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = builder15.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder23 = builder15.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        retrofit.client.Client.Provider provider35 = builder25.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor36 = builder25.requestInterceptor;
        retrofit.RestAdapter.Builder builder37 = builder24.setRequestInterceptor(requestInterceptor36);
        builder37.ensureSaneDefaults();
        java.util.concurrent.Executor executor39 = builder37.getcallbackExecutor();
        builder15.setcallbackExecutor(executor39);
        builder13.httpExecutor = executor39;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(requestInterceptor36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(executor39);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString5();
        retrofit.client.Response response16 = serializedObjectSupporter13.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter13.deserializeObjectConverter5();
        builder12.converter = gsonConverter17;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = builder12.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(serializedObjectSupporter19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Log log11 = builder0.log;
        retrofit.client.Client.Provider provider12 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(provider12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.converter.Converter converter3 = null;
        builder0.converter = converter3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder12 = builder8.setConverter((retrofit.converter.Converter) gsonConverter11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        builder8.serializedObjectSupporter = serializedObjectSupporter13;
        builder8.ensureSaneDefaults();
        retrofit.client.Client.Provider provider17 = builder8.clientProvider;
        retrofit.client.Client.Provider provider18 = builder8.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor19 = builder8.requestInterceptor;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        retrofit.client.Client.Provider provider30 = builder20.getclientProvider();
        retrofit.RestAdapter.Builder builder32 = builder20.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.FULL;
        builder32.logLevel = logLevel33;
        java.util.concurrent.Executor executor35 = builder32.callbackExecutor;
        builder8.callbackExecutor = executor35;
        builder6.setcallbackExecutor(executor35);
        builder0.setcallbackExecutor(executor35);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(provider17);
        org.junit.Assert.assertNotNull(provider18);
        org.junit.Assert.assertNotNull(requestInterceptor19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor35);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.Profiler profiler7 = builder0.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString5();
        retrofit.client.Response response11 = serializedObjectSupporter8.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter5();
        builder0.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(profiler7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter5.getClass();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder5.clientProvider;
        retrofit.Server server7 = builder5.server;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder10 = builder8.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder15 = builder11.setConverter((retrofit.converter.Converter) gsonConverter14);
        retrofit.RestAdapter.Builder builder17 = builder11.setServer("hi!");
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString9();
        builder18.serializedObjectSupporter = serializedObjectSupporter23;
        builder18.ensureSaneDefaults();
        retrofit.client.Client.Provider provider27 = builder18.clientProvider;
        builder17.clientProvider = provider27;
        builder8.clientProvider = provider27;
        builder5.clientProvider = provider27;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(server7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(provider27);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        java.util.concurrent.Executor executor49 = builder48.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor50 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder51 = builder48.setRequestInterceptor(requestInterceptor50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(executor49);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        builder0.setclientProvider(provider19);
        retrofit.RequestInterceptor requestInterceptor21 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder26 = builder22.setConverter((retrofit.converter.Converter) gsonConverter25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        builder22.serializedObjectSupporter = serializedObjectSupporter27;
        builder22.ensureSaneDefaults();
        retrofit.client.Client.Provider provider31 = builder22.clientProvider;
        retrofit.client.Client.Provider provider32 = builder22.getclientProvider();
        java.util.concurrent.Executor executor33 = builder22.gethttpExecutor();
        builder0.callbackExecutor = executor33;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNotNull(executor33);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        retrofit.RestAdapter.Builder builder28 = builder25.setServer("http://example.com/");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.Profiler profiler7 = builder0.profiler;
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
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(profiler7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        java.util.List<retrofit.client.Header> headerList6 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = response3.headers;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.FULL;
        boolean boolean1 = logLevel0.log();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.gethttpExecutor();
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        builder13.serializedObjectSupporter = serializedObjectSupporter18;
        builder13.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder13.clientProvider;
        retrofit.client.Client.Provider provider23 = builder13.getclientProvider();
        retrofit.RestAdapter.Builder builder25 = builder13.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel26;
        java.util.concurrent.Executor executor28 = builder25.callbackExecutor;
        builder11.callbackExecutor = executor28;
        builder0.setcallbackExecutor(executor28);
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor32 = builder31.gethttpExecutor();
        java.util.concurrent.Executor executor33 = null;
        builder31.setcallbackExecutor(executor33);
        retrofit.RestAdapter.LogLevel logLevel35 = builder31.logLevel;
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        builder36.serializedObjectSupporter = serializedObjectSupporter41;
        builder36.ensureSaneDefaults();
        retrofit.client.Client.Provider provider45 = builder36.clientProvider;
        retrofit.client.Client.Provider provider46 = builder36.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor47 = builder36.requestInterceptor;
        retrofit.RestAdapter.Builder builder48 = builder31.setRequestInterceptor(requestInterceptor47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = builder49.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder53 = builder49.setConverter((retrofit.converter.Converter) gsonConverter52);
        retrofit.RestAdapter.Builder builder55 = builder49.setServer("hi!");
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor57 = builder56.gethttpExecutor();
        java.util.concurrent.Executor executor58 = null;
        builder56.setcallbackExecutor(executor58);
        retrofit.RestAdapter.LogLevel logLevel60 = builder56.logLevel;
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor62 = builder61.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter63.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder65 = builder61.setConverter((retrofit.converter.Converter) gsonConverter64);
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        builder61.serializedObjectSupporter = serializedObjectSupporter66;
        builder61.ensureSaneDefaults();
        retrofit.client.Client.Provider provider70 = builder61.clientProvider;
        retrofit.client.Client.Provider provider71 = builder61.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor72 = builder61.requestInterceptor;
        retrofit.RestAdapter.Builder builder73 = builder56.setRequestInterceptor(requestInterceptor72);
        retrofit.RestAdapter.Builder builder74 = builder55.setRequestInterceptor(requestInterceptor72);
        retrofit.RestAdapter.Builder builder75 = builder48.setRequestInterceptor(requestInterceptor72);
        builder0.requestInterceptor = requestInterceptor72;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor28);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNotNull(provider46);
        org.junit.Assert.assertNotNull(requestInterceptor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(provider70);
        org.junit.Assert.assertNotNull(provider71);
        org.junit.Assert.assertNotNull(requestInterceptor72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder6.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        builder6.serializedObjectSupporter = serializedObjectSupporter11;
        builder6.ensureSaneDefaults();
        retrofit.client.Client.Provider provider15 = builder6.clientProvider;
        retrofit.client.Client.Provider provider16 = builder6.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = builder6.requestInterceptor;
        retrofit.RestAdapter.Builder builder18 = builder5.setRequestInterceptor(requestInterceptor17);
        builder0.requestInterceptor = requestInterceptor17;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.gethttpExecutor();
        java.util.concurrent.Executor executor22 = null;
        builder20.setcallbackExecutor(executor22);
        retrofit.RestAdapter.LogLevel logLevel24 = builder20.logLevel;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        retrofit.client.Client.Provider provider35 = builder25.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor36 = builder25.requestInterceptor;
        retrofit.RestAdapter.Builder builder37 = builder20.setRequestInterceptor(requestInterceptor36);
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor39 = builder38.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder42 = builder38.setConverter((retrofit.converter.Converter) gsonConverter41);
        retrofit.RestAdapter.Builder builder44 = builder38.setServer("hi!");
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = builder45.gethttpExecutor();
        java.util.concurrent.Executor executor47 = null;
        builder45.setcallbackExecutor(executor47);
        retrofit.RestAdapter.LogLevel logLevel49 = builder45.logLevel;
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = builder50.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter52.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder54 = builder50.setConverter((retrofit.converter.Converter) gsonConverter53);
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        builder50.serializedObjectSupporter = serializedObjectSupporter55;
        builder50.ensureSaneDefaults();
        retrofit.client.Client.Provider provider59 = builder50.clientProvider;
        retrofit.client.Client.Provider provider60 = builder50.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor61 = builder50.requestInterceptor;
        retrofit.RestAdapter.Builder builder62 = builder45.setRequestInterceptor(requestInterceptor61);
        retrofit.RestAdapter.Builder builder63 = builder44.setRequestInterceptor(requestInterceptor61);
        retrofit.RestAdapter.Builder builder64 = builder37.setRequestInterceptor(requestInterceptor61);
        retrofit.RestAdapter.Builder builder65 = builder0.setRequestInterceptor(requestInterceptor61);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(requestInterceptor36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(executor39);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(provider59);
        org.junit.Assert.assertNotNull(provider60);
        org.junit.Assert.assertNotNull(requestInterceptor61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        retrofit.Profiler profiler37 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder38 = builder36.setProfiler(profiler37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.Profiler profiler49 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder50 = builder2.setProfiler(profiler49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString10();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        builder13.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = builder13.gethttpExecutor();
        java.util.concurrent.Executor executor16 = builder13.httpExecutor;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(executor16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        java.util.concurrent.Executor executor37 = builder36.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(executor37);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = builder49.gethttpExecutor();
        java.util.concurrent.Executor executor51 = null;
        builder49.setcallbackExecutor(executor51);
        retrofit.RestAdapter.LogLevel logLevel53 = builder49.logLevel;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        builder54.serializedObjectSupporter = serializedObjectSupporter59;
        builder54.ensureSaneDefaults();
        retrofit.client.Client.Provider provider63 = builder54.clientProvider;
        retrofit.client.Client.Provider provider64 = builder54.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor65 = builder54.requestInterceptor;
        retrofit.RestAdapter.Builder builder66 = builder49.setRequestInterceptor(requestInterceptor65);
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor68 = builder67.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter70 = serializedObjectSupporter69.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder71 = builder67.setConverter((retrofit.converter.Converter) gsonConverter70);
        retrofit.RestAdapter.Builder builder73 = builder67.setServer("hi!");
        retrofit.RestAdapter.Builder builder74 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor75 = builder74.gethttpExecutor();
        java.util.concurrent.Executor executor76 = null;
        builder74.setcallbackExecutor(executor76);
        retrofit.RestAdapter.LogLevel logLevel78 = builder74.logLevel;
        retrofit.RestAdapter.Builder builder79 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor80 = builder79.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter81.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder83 = builder79.setConverter((retrofit.converter.Converter) gsonConverter82);
        retrofit.SerializedObjectSupporter serializedObjectSupporter84 = new retrofit.SerializedObjectSupporter();
        java.lang.String str85 = serializedObjectSupporter84.deserializeObjectString9();
        builder79.serializedObjectSupporter = serializedObjectSupporter84;
        builder79.ensureSaneDefaults();
        retrofit.client.Client.Provider provider88 = builder79.clientProvider;
        retrofit.client.Client.Provider provider89 = builder79.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor90 = builder79.requestInterceptor;
        retrofit.RestAdapter.Builder builder91 = builder74.setRequestInterceptor(requestInterceptor90);
        retrofit.RestAdapter.Builder builder92 = builder73.setRequestInterceptor(requestInterceptor90);
        retrofit.RestAdapter.Builder builder93 = builder66.setRequestInterceptor(requestInterceptor90);
        retrofit.RestAdapter.Builder builder94 = builder48.setRequestInterceptor(requestInterceptor90);
        retrofit.client.Client.Provider provider95 = builder94.getclientProvider();
        retrofit.Server server96 = builder94.server;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(provider63);
        org.junit.Assert.assertNotNull(provider64);
        org.junit.Assert.assertNotNull(requestInterceptor65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(executor68);
        org.junit.Assert.assertNotNull(gsonConverter70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNull(executor75);
        org.junit.Assert.assertTrue("'" + logLevel78 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel78.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor80);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "http://example.com/" + "'", str85, "http://example.com/");
        org.junit.Assert.assertNotNull(provider88);
        org.junit.Assert.assertNotNull(provider89);
        org.junit.Assert.assertNotNull(requestInterceptor90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNull(provider95);
        org.junit.Assert.assertNotNull(server96);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.RestAdapter.Builder builder13 = builder7.setServer("hi!");
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.gethttpExecutor();
        java.util.concurrent.Executor executor16 = null;
        builder14.setcallbackExecutor(executor16);
        retrofit.RestAdapter.LogLevel logLevel18 = builder14.logLevel;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder23 = builder19.setConverter((retrofit.converter.Converter) gsonConverter22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString9();
        builder19.serializedObjectSupporter = serializedObjectSupporter24;
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider28 = builder19.clientProvider;
        retrofit.client.Client.Provider provider29 = builder19.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor30 = builder19.requestInterceptor;
        retrofit.RestAdapter.Builder builder31 = builder14.setRequestInterceptor(requestInterceptor30);
        retrofit.RestAdapter.Builder builder32 = builder13.setRequestInterceptor(requestInterceptor30);
        retrofit.RestAdapter restAdapter33 = builder32.build();
        java.util.concurrent.Executor executor34 = builder32.gethttpExecutor();
        retrofit.Profiler profiler35 = builder32.profiler;
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.RestAdapter.Builder builder42 = builder36.setServer("hi!");
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = builder43.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter45.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder47 = builder43.setConverter((retrofit.converter.Converter) gsonConverter46);
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString9();
        builder43.serializedObjectSupporter = serializedObjectSupporter48;
        builder43.ensureSaneDefaults();
        retrofit.client.Client.Provider provider52 = builder43.clientProvider;
        builder42.clientProvider = provider52;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.RestAdapter.Builder builder60 = builder54.setServer("hi!");
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor62 = builder61.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter63.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder65 = builder61.setConverter((retrofit.converter.Converter) gsonConverter64);
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        builder61.serializedObjectSupporter = serializedObjectSupporter66;
        builder61.ensureSaneDefaults();
        retrofit.client.Client.Provider provider70 = builder61.clientProvider;
        builder60.clientProvider = provider70;
        retrofit.RestAdapter.Builder builder72 = builder42.setClient(provider70);
        retrofit.RestAdapter restAdapter73 = builder42.build();
        java.util.concurrent.Executor executor74 = builder42.gethttpExecutor();
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor77 = builder76.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter79 = serializedObjectSupporter78.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder80 = builder76.setConverter((retrofit.converter.Converter) gsonConverter79);
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        java.lang.String str82 = serializedObjectSupporter81.deserializeObjectString9();
        builder76.serializedObjectSupporter = serializedObjectSupporter81;
        builder76.ensureSaneDefaults();
        retrofit.client.Client.Provider provider85 = builder76.clientProvider;
        retrofit.client.Client.Provider provider86 = builder76.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor87 = builder76.requestInterceptor;
        retrofit.RestAdapter.Builder builder88 = builder75.setRequestInterceptor(requestInterceptor87);
        builder88.ensureSaneDefaults();
        java.util.concurrent.Executor executor90 = builder88.gethttpExecutor();
        retrofit.RestAdapter.Builder builder91 = builder32.setExecutors(executor74, executor90);
        builder0.setcallbackExecutor(executor74);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter93 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(requestInterceptor30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(restAdapter33);
        org.junit.Assert.assertNotNull(executor34);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(executor44);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNotNull(provider52);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(provider70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(restAdapter73);
        org.junit.Assert.assertNotNull(executor74);
        org.junit.Assert.assertNull(executor77);
        org.junit.Assert.assertNotNull(gsonConverter79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "http://example.com/" + "'", str82, "http://example.com/");
        org.junit.Assert.assertNotNull(provider85);
        org.junit.Assert.assertNotNull(provider86);
        org.junit.Assert.assertNotNull(requestInterceptor87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(executor90);
        org.junit.Assert.assertNotNull(builder91);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        java.lang.Class<?> wildcardClass4 = typedInput3.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(typedInput3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder15 = builder11.setConverter((retrofit.converter.Converter) gsonConverter14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString9();
        builder11.serializedObjectSupporter = serializedObjectSupporter16;
        builder11.ensureSaneDefaults();
        retrofit.client.Client.Provider provider20 = builder11.clientProvider;
        retrofit.client.Client.Provider provider21 = builder11.getclientProvider();
        java.util.concurrent.Executor executor22 = builder11.gethttpExecutor();
        builder0.httpExecutor = executor22;
        retrofit.Server server24 = builder0.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(executor22);
        org.junit.Assert.assertNull(server24);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        retrofit.client.Client.Provider provider20 = builder10.getclientProvider();
        builder0.clientProvider = provider20;
        java.util.concurrent.Executor executor22 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNull(executor22);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        retrofit.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString5();
        retrofit.client.Response response21 = serializedObjectSupporter18.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter18.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter18.deserializeObjectRequestInterceptor1();
        retrofit.Server server24 = serializedObjectSupporter18.deserializeObjectServer1();
        builder6.server = server24;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(server24);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        retrofit.mime.TypedInput typedInput6 = response3.body;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(typedInput6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        retrofit.Server server6 = builder0.server;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder12 = builder8.setConverter((retrofit.converter.Converter) gsonConverter11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        builder8.serializedObjectSupporter = serializedObjectSupporter13;
        builder8.ensureSaneDefaults();
        retrofit.client.Client.Provider provider17 = builder8.clientProvider;
        builder7.clientProvider = provider17;
        retrofit.ErrorHandler errorHandler19 = builder7.errorHandler;
        retrofit.client.Client.Provider provider20 = builder7.clientProvider;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = builder21.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder25 = builder21.setConverter((retrofit.converter.Converter) gsonConverter24);
        retrofit.RestAdapter.Builder builder27 = builder21.setServer("hi!");
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor29 = builder28.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter30.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder32 = builder28.setConverter((retrofit.converter.Converter) gsonConverter31);
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString9();
        builder28.serializedObjectSupporter = serializedObjectSupporter33;
        builder28.ensureSaneDefaults();
        retrofit.client.Client.Provider provider37 = builder28.clientProvider;
        builder27.clientProvider = provider37;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = builder39.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter41.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder43 = builder39.setConverter((retrofit.converter.Converter) gsonConverter42);
        retrofit.RestAdapter.Builder builder45 = builder39.setServer("hi!");
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor47 = builder46.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter48.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder50 = builder46.setConverter((retrofit.converter.Converter) gsonConverter49);
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        java.lang.String str52 = serializedObjectSupporter51.deserializeObjectString9();
        builder46.serializedObjectSupporter = serializedObjectSupporter51;
        builder46.ensureSaneDefaults();
        retrofit.client.Client.Provider provider55 = builder46.clientProvider;
        builder45.clientProvider = provider55;
        retrofit.RestAdapter.Builder builder57 = builder27.setClient(provider55);
        retrofit.RestAdapter.Builder builder58 = builder7.setClient(provider55);
        retrofit.RestAdapter.Builder builder59 = builder0.setClient(provider55);
        retrofit.RestAdapter.Log log60 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler5);
        org.junit.Assert.assertNull(server6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(provider17);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(provider37);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(executor47);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "http://example.com/" + "'", str52, "http://example.com/");
        org.junit.Assert.assertNotNull(provider55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(log60);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.Server server3 = builder0.server;
        retrofit.client.Client.Provider provider4 = builder0.getclientProvider();
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.Server server8 = builder0.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNotNull(server8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.client.Client.Provider provider18 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        java.util.concurrent.Executor executor27 = builder25.gethttpExecutor();
        retrofit.Profiler profiler28 = builder25.profiler;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = builder29.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder33 = builder29.setConverter((retrofit.converter.Converter) gsonConverter32);
        retrofit.RestAdapter.Builder builder35 = builder29.setServer("hi!");
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        builder36.serializedObjectSupporter = serializedObjectSupporter41;
        builder36.ensureSaneDefaults();
        retrofit.client.Client.Provider provider45 = builder36.clientProvider;
        builder35.clientProvider = provider45;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder51 = builder47.setConverter((retrofit.converter.Converter) gsonConverter50);
        retrofit.RestAdapter.Builder builder53 = builder47.setServer("hi!");
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        builder54.serializedObjectSupporter = serializedObjectSupporter59;
        builder54.ensureSaneDefaults();
        retrofit.client.Client.Provider provider63 = builder54.clientProvider;
        builder53.clientProvider = provider63;
        retrofit.RestAdapter.Builder builder65 = builder35.setClient(provider63);
        retrofit.RestAdapter restAdapter66 = builder35.build();
        java.util.concurrent.Executor executor67 = builder35.gethttpExecutor();
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor70 = builder69.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter71 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter71.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder73 = builder69.setConverter((retrofit.converter.Converter) gsonConverter72);
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        java.lang.String str75 = serializedObjectSupporter74.deserializeObjectString9();
        builder69.serializedObjectSupporter = serializedObjectSupporter74;
        builder69.ensureSaneDefaults();
        retrofit.client.Client.Provider provider78 = builder69.clientProvider;
        retrofit.client.Client.Provider provider79 = builder69.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor80 = builder69.requestInterceptor;
        retrofit.RestAdapter.Builder builder81 = builder68.setRequestInterceptor(requestInterceptor80);
        builder81.ensureSaneDefaults();
        java.util.concurrent.Executor executor83 = builder81.gethttpExecutor();
        retrofit.RestAdapter.Builder builder84 = builder25.setExecutors(executor67, executor83);
        retrofit.Profiler profiler85 = null;
        builder25.profiler = profiler85;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(provider63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(restAdapter66);
        org.junit.Assert.assertNotNull(executor67);
        org.junit.Assert.assertNull(executor70);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "http://example.com/" + "'", str75, "http://example.com/");
        org.junit.Assert.assertNotNull(provider78);
        org.junit.Assert.assertNotNull(provider79);
        org.junit.Assert.assertNotNull(requestInterceptor80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(executor83);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder18 = builder14.setConverter((retrofit.converter.Converter) gsonConverter17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        builder14.serializedObjectSupporter = serializedObjectSupporter19;
        builder14.ensureSaneDefaults();
        retrofit.client.Client.Provider provider23 = builder14.clientProvider;
        retrofit.client.Client.Provider provider24 = builder14.getclientProvider();
        retrofit.RestAdapter.Builder builder26 = builder14.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.FULL;
        builder26.logLevel = logLevel27;
        java.util.concurrent.Executor executor29 = builder26.callbackExecutor;
        builder2.callbackExecutor = executor29;
        builder0.setcallbackExecutor(executor29);
        retrofit.Profiler profiler32 = null;
        builder0.profiler = profiler32;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor29);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.RestAdapter.Builder builder13 = builder7.setServer("hi!");
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.gethttpExecutor();
        java.util.concurrent.Executor executor16 = null;
        builder14.setcallbackExecutor(executor16);
        retrofit.RestAdapter.LogLevel logLevel18 = builder14.logLevel;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder23 = builder19.setConverter((retrofit.converter.Converter) gsonConverter22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString9();
        builder19.serializedObjectSupporter = serializedObjectSupporter24;
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider28 = builder19.clientProvider;
        retrofit.client.Client.Provider provider29 = builder19.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor30 = builder19.requestInterceptor;
        retrofit.RestAdapter.Builder builder31 = builder14.setRequestInterceptor(requestInterceptor30);
        retrofit.RestAdapter.Builder builder32 = builder13.setRequestInterceptor(requestInterceptor30);
        retrofit.RestAdapter restAdapter33 = builder32.build();
        java.util.concurrent.Executor executor34 = builder32.gethttpExecutor();
        retrofit.Profiler profiler35 = builder32.profiler;
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.RestAdapter.Builder builder42 = builder36.setServer("hi!");
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = builder43.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter45.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder47 = builder43.setConverter((retrofit.converter.Converter) gsonConverter46);
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString9();
        builder43.serializedObjectSupporter = serializedObjectSupporter48;
        builder43.ensureSaneDefaults();
        retrofit.client.Client.Provider provider52 = builder43.clientProvider;
        builder42.clientProvider = provider52;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.RestAdapter.Builder builder60 = builder54.setServer("hi!");
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor62 = builder61.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter63.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder65 = builder61.setConverter((retrofit.converter.Converter) gsonConverter64);
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        builder61.serializedObjectSupporter = serializedObjectSupporter66;
        builder61.ensureSaneDefaults();
        retrofit.client.Client.Provider provider70 = builder61.clientProvider;
        builder60.clientProvider = provider70;
        retrofit.RestAdapter.Builder builder72 = builder42.setClient(provider70);
        retrofit.RestAdapter restAdapter73 = builder42.build();
        java.util.concurrent.Executor executor74 = builder42.gethttpExecutor();
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor77 = builder76.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter79 = serializedObjectSupporter78.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder80 = builder76.setConverter((retrofit.converter.Converter) gsonConverter79);
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        java.lang.String str82 = serializedObjectSupporter81.deserializeObjectString9();
        builder76.serializedObjectSupporter = serializedObjectSupporter81;
        builder76.ensureSaneDefaults();
        retrofit.client.Client.Provider provider85 = builder76.clientProvider;
        retrofit.client.Client.Provider provider86 = builder76.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor87 = builder76.requestInterceptor;
        retrofit.RestAdapter.Builder builder88 = builder75.setRequestInterceptor(requestInterceptor87);
        builder88.ensureSaneDefaults();
        java.util.concurrent.Executor executor90 = builder88.gethttpExecutor();
        retrofit.RestAdapter.Builder builder91 = builder32.setExecutors(executor74, executor90);
        builder0.setcallbackExecutor(executor74);
        retrofit.client.Client.Provider provider93 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(requestInterceptor30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(restAdapter33);
        org.junit.Assert.assertNotNull(executor34);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(executor44);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNotNull(provider52);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(provider70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(restAdapter73);
        org.junit.Assert.assertNotNull(executor74);
        org.junit.Assert.assertNull(executor77);
        org.junit.Assert.assertNotNull(gsonConverter79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "http://example.com/" + "'", str82, "http://example.com/");
        org.junit.Assert.assertNotNull(provider85);
        org.junit.Assert.assertNotNull(provider86);
        org.junit.Assert.assertNotNull(requestInterceptor87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(executor90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNull(provider93);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor7 = builder0.requestInterceptor;
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(requestInterceptor7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-" + "'", str7, "Retrofit-");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        retrofit.client.Client.Provider provider17 = builder7.clientProvider;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.gethttpExecutor();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        retrofit.client.Client.Provider provider30 = builder20.getclientProvider();
        retrofit.RestAdapter.Builder builder32 = builder20.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.FULL;
        builder32.logLevel = logLevel33;
        java.util.concurrent.Executor executor35 = builder32.callbackExecutor;
        builder18.callbackExecutor = executor35;
        builder7.setcallbackExecutor(executor35);
        builder0.setcallbackExecutor(executor35);
        retrofit.client.Client.Provider provider39 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(provider17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor35);
        org.junit.Assert.assertNull(provider39);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        retrofit.converter.Converter converter7 = builder0.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(converter7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = builder4.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder8 = builder4.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        builder4.serializedObjectSupporter = serializedObjectSupporter9;
        builder4.ensureSaneDefaults();
        retrofit.client.Client.Provider provider13 = builder4.clientProvider;
        retrofit.client.Client.Provider provider14 = builder4.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor15 = builder4.requestInterceptor;
        retrofit.RestAdapter.Builder builder16 = builder3.setRequestInterceptor(requestInterceptor15);
        builder16.ensureSaneDefaults();
        java.util.concurrent.Executor executor18 = builder16.gethttpExecutor();
        builder2.httpExecutor = executor18;
        retrofit.RestAdapter.Builder builder21 = builder2.setServer("http://example.com/");
        java.util.concurrent.Executor executor22 = builder21.gethttpExecutor();
        builder21.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(requestInterceptor15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(executor18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(executor22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder8 = builder6.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder13 = builder9.setConverter((retrofit.converter.Converter) gsonConverter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        builder9.serializedObjectSupporter = serializedObjectSupporter14;
        builder9.ensureSaneDefaults();
        retrofit.client.Client.Provider provider18 = builder9.clientProvider;
        retrofit.client.Client.Provider provider19 = builder9.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor20 = builder9.requestInterceptor;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = builder21.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder25 = builder21.setConverter((retrofit.converter.Converter) gsonConverter24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        builder21.serializedObjectSupporter = serializedObjectSupporter26;
        builder21.ensureSaneDefaults();
        retrofit.client.Client.Provider provider30 = builder21.clientProvider;
        retrofit.client.Client.Provider provider31 = builder21.getclientProvider();
        retrofit.RestAdapter.Builder builder33 = builder21.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.FULL;
        builder33.logLevel = logLevel34;
        java.util.concurrent.Executor executor36 = builder33.callbackExecutor;
        builder9.callbackExecutor = executor36;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = builder39.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter41.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder43 = builder39.setConverter((retrofit.converter.Converter) gsonConverter42);
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        java.lang.String str45 = serializedObjectSupporter44.deserializeObjectString9();
        builder39.serializedObjectSupporter = serializedObjectSupporter44;
        builder39.ensureSaneDefaults();
        retrofit.client.Client.Provider provider48 = builder39.clientProvider;
        retrofit.client.Client.Provider provider49 = builder39.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor50 = builder39.requestInterceptor;
        retrofit.RestAdapter.Builder builder51 = builder38.setRequestInterceptor(requestInterceptor50);
        builder51.ensureSaneDefaults();
        java.util.concurrent.Executor executor53 = builder51.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder54 = builder8.setExecutors(executor36, executor53);
        builder0.setcallbackExecutor(executor53);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(errorHandler5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(provider18);
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(requestInterceptor20);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor36);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
        org.junit.Assert.assertNotNull(provider48);
        org.junit.Assert.assertNotNull(provider49);
        org.junit.Assert.assertNotNull(requestInterceptor50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(executor53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        retrofit.client.Client.Provider provider20 = builder10.getclientProvider();
        builder0.clientProvider = provider20;
        retrofit.ErrorHandler errorHandler22 = builder0.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNull(errorHandler22);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder0.serializedObjectSupporter;
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter6();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        java.util.concurrent.Executor executor27 = builder25.gethttpExecutor();
        retrofit.Profiler profiler28 = builder25.profiler;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = builder29.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder33 = builder29.setConverter((retrofit.converter.Converter) gsonConverter32);
        retrofit.RestAdapter.Builder builder35 = builder29.setServer("hi!");
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        builder36.serializedObjectSupporter = serializedObjectSupporter41;
        builder36.ensureSaneDefaults();
        retrofit.client.Client.Provider provider45 = builder36.clientProvider;
        builder35.clientProvider = provider45;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder51 = builder47.setConverter((retrofit.converter.Converter) gsonConverter50);
        retrofit.RestAdapter.Builder builder53 = builder47.setServer("hi!");
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        builder54.serializedObjectSupporter = serializedObjectSupporter59;
        builder54.ensureSaneDefaults();
        retrofit.client.Client.Provider provider63 = builder54.clientProvider;
        builder53.clientProvider = provider63;
        retrofit.RestAdapter.Builder builder65 = builder35.setClient(provider63);
        retrofit.RestAdapter restAdapter66 = builder35.build();
        java.util.concurrent.Executor executor67 = builder35.gethttpExecutor();
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor70 = builder69.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter71 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter71.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder73 = builder69.setConverter((retrofit.converter.Converter) gsonConverter72);
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        java.lang.String str75 = serializedObjectSupporter74.deserializeObjectString9();
        builder69.serializedObjectSupporter = serializedObjectSupporter74;
        builder69.ensureSaneDefaults();
        retrofit.client.Client.Provider provider78 = builder69.clientProvider;
        retrofit.client.Client.Provider provider79 = builder69.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor80 = builder69.requestInterceptor;
        retrofit.RestAdapter.Builder builder81 = builder68.setRequestInterceptor(requestInterceptor80);
        builder81.ensureSaneDefaults();
        java.util.concurrent.Executor executor83 = builder81.gethttpExecutor();
        retrofit.RestAdapter.Builder builder84 = builder25.setExecutors(executor67, executor83);
        java.util.concurrent.Executor executor85 = builder84.callbackExecutor;
        builder84.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(provider63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(restAdapter66);
        org.junit.Assert.assertNotNull(executor67);
        org.junit.Assert.assertNull(executor70);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "http://example.com/" + "'", str75, "http://example.com/");
        org.junit.Assert.assertNotNull(provider78);
        org.junit.Assert.assertNotNull(provider79);
        org.junit.Assert.assertNotNull(requestInterceptor80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(executor83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(executor85);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.Server server3 = builder0.server;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(errorHandler4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder12 = builder8.setConverter((retrofit.converter.Converter) gsonConverter11);
        retrofit.RestAdapter.Builder builder14 = builder8.setServer("hi!");
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.gethttpExecutor();
        java.util.concurrent.Executor executor17 = null;
        builder15.setcallbackExecutor(executor17);
        retrofit.RestAdapter.LogLevel logLevel19 = builder15.logLevel;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        retrofit.client.Client.Provider provider30 = builder20.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor31 = builder20.requestInterceptor;
        retrofit.RestAdapter.Builder builder32 = builder15.setRequestInterceptor(requestInterceptor31);
        retrofit.RestAdapter.Builder builder33 = builder14.setRequestInterceptor(requestInterceptor31);
        retrofit.RestAdapter restAdapter34 = builder33.build();
        java.util.concurrent.Executor executor35 = builder33.gethttpExecutor();
        retrofit.RestAdapter.Log log36 = builder33.log;
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor38 = builder37.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter39.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder41 = builder37.setConverter((retrofit.converter.Converter) gsonConverter40);
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        java.lang.String str43 = serializedObjectSupporter42.deserializeObjectString9();
        builder37.serializedObjectSupporter = serializedObjectSupporter42;
        builder37.ensureSaneDefaults();
        retrofit.client.Client.Provider provider46 = builder37.clientProvider;
        retrofit.client.Client.Provider provider47 = builder37.getclientProvider();
        retrofit.RestAdapter.Builder builder49 = builder37.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.FULL;
        builder49.logLevel = logLevel50;
        java.util.concurrent.Executor executor52 = builder49.callbackExecutor;
        builder33.callbackExecutor = executor52;
        java.util.concurrent.Executor executor54 = null;
        retrofit.RestAdapter.Builder builder55 = builder0.setExecutors(executor52, executor54);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(requestInterceptor31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(restAdapter34);
        org.junit.Assert.assertNotNull(executor35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(provider46);
        org.junit.Assert.assertNotNull(provider47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor52);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.ErrorHandler errorHandler49 = builder2.errorHandler;
        java.util.concurrent.Executor executor50 = builder2.callbackExecutor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(errorHandler49);
        org.junit.Assert.assertNotNull(executor50);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.lang.String str5 = response3.getReason();
        retrofit.mime.TypedInput typedInput6 = response3.getBody();
        retrofit.mime.TypedInput typedInput7 = response3.getBody();
        int int8 = response3.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(typedInput6);
        org.junit.Assert.assertNotNull(typedInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        int int4 = response3.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 500 + "'", int4 == 500);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        java.util.concurrent.Executor executor11 = builder0.gethttpExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter12 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(executor11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder0.getclientProvider();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        retrofit.Profiler profiler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setProfiler(profiler10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        retrofit.RestAdapter restAdapter37 = builder6.build();
        java.util.concurrent.Executor executor38 = builder6.gethttpExecutor();
        java.util.concurrent.Executor executor39 = builder6.httpExecutor;
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor41 = builder40.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter42.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder44 = builder40.setConverter((retrofit.converter.Converter) gsonConverter43);
        retrofit.RestAdapter.Builder builder46 = builder40.setServer("hi!");
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.gethttpExecutor();
        java.util.concurrent.Executor executor49 = null;
        builder47.setcallbackExecutor(executor49);
        retrofit.RestAdapter.LogLevel logLevel51 = builder47.logLevel;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor53 = builder52.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter54.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder56 = builder52.setConverter((retrofit.converter.Converter) gsonConverter55);
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        java.lang.String str58 = serializedObjectSupporter57.deserializeObjectString9();
        builder52.serializedObjectSupporter = serializedObjectSupporter57;
        builder52.ensureSaneDefaults();
        retrofit.client.Client.Provider provider61 = builder52.clientProvider;
        retrofit.client.Client.Provider provider62 = builder52.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor63 = builder52.requestInterceptor;
        retrofit.RestAdapter.Builder builder64 = builder47.setRequestInterceptor(requestInterceptor63);
        retrofit.RestAdapter.Builder builder65 = builder46.setRequestInterceptor(requestInterceptor63);
        retrofit.RestAdapter restAdapter66 = builder65.build();
        java.util.concurrent.Executor executor67 = builder65.gethttpExecutor();
        retrofit.RestAdapter.Log log68 = builder65.log;
        builder6.log = log68;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(restAdapter37);
        org.junit.Assert.assertNotNull(executor38);
        org.junit.Assert.assertNotNull(executor39);
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor53);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "http://example.com/" + "'", str58, "http://example.com/");
        org.junit.Assert.assertNotNull(provider61);
        org.junit.Assert.assertNotNull(provider62);
        org.junit.Assert.assertNotNull(requestInterceptor63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(restAdapter66);
        org.junit.Assert.assertNotNull(executor67);
        org.junit.Assert.assertNotNull(log68);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor38 = builder37.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter39.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder41 = builder37.setConverter((retrofit.converter.Converter) gsonConverter40);
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        java.lang.String str43 = serializedObjectSupporter42.deserializeObjectString9();
        builder37.serializedObjectSupporter = serializedObjectSupporter42;
        builder37.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder51 = builder47.setConverter((retrofit.converter.Converter) gsonConverter50);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        builder47.serializedObjectSupporter = serializedObjectSupporter52;
        builder47.ensureSaneDefaults();
        retrofit.client.Client.Provider provider56 = builder47.clientProvider;
        builder46.clientProvider = provider56;
        builder37.setclientProvider(provider56);
        retrofit.RestAdapter.LogLevel logLevel59 = builder37.logLevel;
        boolean boolean60 = logLevel59.log();
        retrofit.RestAdapter.Builder builder61 = builder36.setLogLevel(logLevel59);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(provider56);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = builder0.setRequestInterceptor(requestInterceptor13);
        retrofit.Profiler profiler15 = null;
        builder14.profiler = profiler15;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder21 = builder17.setConverter((retrofit.converter.Converter) gsonConverter20);
        retrofit.RestAdapter.Builder builder23 = builder17.setServer("hi!");
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = builder24.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder28 = builder24.setConverter((retrofit.converter.Converter) gsonConverter27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString9();
        builder24.serializedObjectSupporter = serializedObjectSupporter29;
        builder24.ensureSaneDefaults();
        retrofit.client.Client.Provider provider33 = builder24.clientProvider;
        builder23.clientProvider = provider33;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor36 = builder35.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder39 = builder35.setConverter((retrofit.converter.Converter) gsonConverter38);
        retrofit.RestAdapter.Builder builder41 = builder35.setServer("hi!");
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor43 = builder42.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter44.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder46 = builder42.setConverter((retrofit.converter.Converter) gsonConverter45);
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        java.lang.String str48 = serializedObjectSupporter47.deserializeObjectString9();
        builder42.serializedObjectSupporter = serializedObjectSupporter47;
        builder42.ensureSaneDefaults();
        retrofit.client.Client.Provider provider51 = builder42.clientProvider;
        builder41.clientProvider = provider51;
        retrofit.RestAdapter.Builder builder53 = builder23.setClient(provider51);
        retrofit.RestAdapter restAdapter54 = builder23.build();
        java.util.concurrent.Executor executor55 = builder23.gethttpExecutor();
        retrofit.Profiler profiler56 = builder23.profiler;
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder59 = builder57.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder60 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor61 = builder60.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter62.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder64 = builder60.setConverter((retrofit.converter.Converter) gsonConverter63);
        retrofit.RestAdapter.Builder builder66 = builder60.setServer("hi!");
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor68 = builder67.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter70 = serializedObjectSupporter69.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder71 = builder67.setConverter((retrofit.converter.Converter) gsonConverter70);
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        java.lang.String str73 = serializedObjectSupporter72.deserializeObjectString9();
        builder67.serializedObjectSupporter = serializedObjectSupporter72;
        builder67.ensureSaneDefaults();
        retrofit.client.Client.Provider provider76 = builder67.clientProvider;
        builder66.clientProvider = provider76;
        builder57.clientProvider = provider76;
        builder23.setclientProvider(provider76);
        builder14.clientProvider = provider76;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(provider33);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(provider51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(restAdapter54);
        org.junit.Assert.assertNotNull(executor55);
        org.junit.Assert.assertNull(profiler56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(executor61);
        org.junit.Assert.assertNotNull(gsonConverter63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(executor68);
        org.junit.Assert.assertNotNull(gsonConverter70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "http://example.com/" + "'", str73, "http://example.com/");
        org.junit.Assert.assertNotNull(provider76);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.Profiler profiler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setProfiler(profiler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.Profiler profiler8 = builder0.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(profiler8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.gethttpExecutor();
        java.util.concurrent.Executor executor27 = null;
        builder25.setcallbackExecutor(executor27);
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        retrofit.client.Client.Provider provider40 = builder30.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor41 = builder30.requestInterceptor;
        retrofit.RestAdapter.Builder builder42 = builder25.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder43 = builder24.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder44 = builder17.setRequestInterceptor(requestInterceptor41);
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder47 = builder45.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor49 = builder48.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter50.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder52 = builder48.setConverter((retrofit.converter.Converter) gsonConverter51);
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        java.lang.String str54 = serializedObjectSupporter53.deserializeObjectString9();
        builder48.serializedObjectSupporter = serializedObjectSupporter53;
        builder48.ensureSaneDefaults();
        retrofit.client.Client.Provider provider57 = builder48.clientProvider;
        retrofit.client.Client.Provider provider58 = builder48.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor59 = builder48.requestInterceptor;
        retrofit.RestAdapter.Builder builder60 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor61 = builder60.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter63 = serializedObjectSupporter62.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder64 = builder60.setConverter((retrofit.converter.Converter) gsonConverter63);
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        java.lang.String str66 = serializedObjectSupporter65.deserializeObjectString9();
        builder60.serializedObjectSupporter = serializedObjectSupporter65;
        builder60.ensureSaneDefaults();
        retrofit.client.Client.Provider provider69 = builder60.clientProvider;
        retrofit.client.Client.Provider provider70 = builder60.getclientProvider();
        retrofit.RestAdapter.Builder builder72 = builder60.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel73 = retrofit.RestAdapter.LogLevel.FULL;
        builder72.logLevel = logLevel73;
        java.util.concurrent.Executor executor75 = builder72.callbackExecutor;
        builder48.callbackExecutor = executor75;
        retrofit.RestAdapter.Builder builder77 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder78 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor79 = builder78.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter80 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter81 = serializedObjectSupporter80.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder82 = builder78.setConverter((retrofit.converter.Converter) gsonConverter81);
        retrofit.SerializedObjectSupporter serializedObjectSupporter83 = new retrofit.SerializedObjectSupporter();
        java.lang.String str84 = serializedObjectSupporter83.deserializeObjectString9();
        builder78.serializedObjectSupporter = serializedObjectSupporter83;
        builder78.ensureSaneDefaults();
        retrofit.client.Client.Provider provider87 = builder78.clientProvider;
        retrofit.client.Client.Provider provider88 = builder78.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor89 = builder78.requestInterceptor;
        retrofit.RestAdapter.Builder builder90 = builder77.setRequestInterceptor(requestInterceptor89);
        builder90.ensureSaneDefaults();
        java.util.concurrent.Executor executor92 = builder90.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder93 = builder47.setExecutors(executor75, executor92);
        java.util.concurrent.Executor executor94 = builder93.callbackExecutor;
        builder17.setcallbackExecutor(executor94);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNotNull(provider40);
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(executor49);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(provider57);
        org.junit.Assert.assertNotNull(provider58);
        org.junit.Assert.assertNotNull(requestInterceptor59);
        org.junit.Assert.assertNull(executor61);
        org.junit.Assert.assertNotNull(gsonConverter63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "http://example.com/" + "'", str66, "http://example.com/");
        org.junit.Assert.assertNotNull(provider69);
        org.junit.Assert.assertNotNull(provider70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor75);
        org.junit.Assert.assertNull(executor79);
        org.junit.Assert.assertNotNull(gsonConverter81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "http://example.com/" + "'", str84, "http://example.com/");
        org.junit.Assert.assertNotNull(provider87);
        org.junit.Assert.assertNotNull(provider88);
        org.junit.Assert.assertNotNull(requestInterceptor89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(executor92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(executor94);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        java.lang.String str4 = response2.reason;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(typedInput3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        java.lang.String str4 = response2.getReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(typedInput3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        builder13.serializedObjectSupporter = serializedObjectSupporter18;
        builder13.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder13.clientProvider;
        retrofit.client.Client.Provider provider23 = builder13.getclientProvider();
        retrofit.RestAdapter.Builder builder25 = builder13.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel26;
        java.util.concurrent.Executor executor28 = builder25.callbackExecutor;
        builder1.callbackExecutor = executor28;
        builder0.httpExecutor = executor28;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor28);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.RestAdapter.Builder builder19 = builder13.setServer("hi!");
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        builder19.clientProvider = provider29;
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor32 = builder31.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter33.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder35 = builder31.setConverter((retrofit.converter.Converter) gsonConverter34);
        retrofit.RestAdapter.Builder builder37 = builder31.setServer("hi!");
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor39 = builder38.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder42 = builder38.setConverter((retrofit.converter.Converter) gsonConverter41);
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString9();
        builder38.serializedObjectSupporter = serializedObjectSupporter43;
        builder38.ensureSaneDefaults();
        retrofit.client.Client.Provider provider47 = builder38.clientProvider;
        builder37.clientProvider = provider47;
        retrofit.RestAdapter.Builder builder49 = builder19.setClient(provider47);
        retrofit.RestAdapter restAdapter50 = builder19.build();
        java.util.concurrent.Executor executor51 = builder19.gethttpExecutor();
        builder0.setcallbackExecutor(executor51);
        retrofit.client.Client.Provider provider53 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(executor39);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "http://example.com/" + "'", str44, "http://example.com/");
        org.junit.Assert.assertNotNull(provider47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(restAdapter50);
        org.junit.Assert.assertNotNull(executor51);
        org.junit.Assert.assertNotNull(provider53);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        java.util.concurrent.Executor executor49 = builder48.callbackExecutor;
        retrofit.converter.Converter converter50 = builder48.converter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(executor49);
        org.junit.Assert.assertNull(converter50);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        retrofit.Profiler profiler20 = null;
        builder17.profiler = profiler20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder26 = builder22.setConverter((retrofit.converter.Converter) gsonConverter25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        builder22.serializedObjectSupporter = serializedObjectSupporter27;
        builder22.ensureSaneDefaults();
        retrofit.client.Client.Provider provider31 = builder22.clientProvider;
        retrofit.client.Client.Provider provider32 = builder22.clientProvider;
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        java.util.concurrent.Executor executor44 = builder33.gethttpExecutor();
        builder22.httpExecutor = executor44;
        builder17.callbackExecutor = executor44;
        retrofit.RestAdapter.LogLevel logLevel47 = builder17.logLevel;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(executor44);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = builder50.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter52.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder54 = builder50.setConverter((retrofit.converter.Converter) gsonConverter53);
        retrofit.SerializedObjectSupporter serializedObjectSupporter55 = new retrofit.SerializedObjectSupporter();
        java.lang.String str56 = serializedObjectSupporter55.deserializeObjectString9();
        builder50.serializedObjectSupporter = serializedObjectSupporter55;
        builder50.ensureSaneDefaults();
        retrofit.client.Client.Provider provider59 = builder50.clientProvider;
        retrofit.client.Client.Provider provider60 = builder50.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor61 = builder50.requestInterceptor;
        retrofit.RestAdapter.Builder builder62 = builder49.setRequestInterceptor(requestInterceptor61);
        builder62.ensureSaneDefaults();
        java.util.concurrent.Executor executor64 = builder62.gethttpExecutor();
        builder2.httpExecutor = executor64;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(provider59);
        org.junit.Assert.assertNotNull(provider60);
        org.junit.Assert.assertNotNull(requestInterceptor61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(executor64);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int4 = response3.getStatus();
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.ErrorHandler errorHandler49 = builder2.errorHandler;
        retrofit.client.Client.Provider provider50 = builder2.getclientProvider();
        retrofit.Server server51 = builder2.server;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(errorHandler49);
        org.junit.Assert.assertNull(provider50);
        org.junit.Assert.assertNotNull(server51);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Log log5 = builder4.log;
        retrofit.Server server6 = builder4.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(server6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder17 = builder15.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        builder15.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder37 = builder12.setClient(provider34);
        retrofit.RestAdapter.Log log38 = builder37.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(log38);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.RestAdapter.Builder builder8 = builder0.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder8.setClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        builder0.setclientProvider(provider19);
        retrofit.RequestInterceptor requestInterceptor21 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder23 = builder0.setServer("OK");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder13 = builder9.setConverter((retrofit.converter.Converter) gsonConverter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        builder9.serializedObjectSupporter = serializedObjectSupporter14;
        builder9.ensureSaneDefaults();
        retrofit.client.Client.Provider provider18 = builder9.clientProvider;
        retrofit.client.Client.Provider provider19 = builder9.getclientProvider();
        retrofit.RestAdapter.Builder builder21 = builder9.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString9();
        java.lang.String str24 = serializedObjectSupporter22.deserializeObjectString5();
        retrofit.client.Response response25 = serializedObjectSupporter22.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter22.deserializeObjectConverter5();
        builder21.converter = gsonConverter26;
        retrofit.RestAdapter.Builder builder28 = builder0.setConverter((retrofit.converter.Converter) gsonConverter26);
        retrofit.ErrorHandler errorHandler29 = builder0.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(provider18);
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(errorHandler29);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RestAdapter.Builder builder14 = builder2.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.FULL;
        builder14.logLevel = logLevel15;
        java.util.concurrent.Executor executor17 = builder14.callbackExecutor;
        builder0.callbackExecutor = executor17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        builder19.clientProvider = provider29;
        retrofit.ErrorHandler errorHandler31 = builder19.errorHandler;
        retrofit.client.Client.Provider provider32 = builder19.clientProvider;
        builder0.setclientProvider(provider32);
        retrofit.Server server34 = builder0.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor17);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNull(errorHandler31);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNull(server34);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder15 = builder0.setLogLevel(logLevel14);
        retrofit.ErrorHandler errorHandler16 = builder15.errorHandler;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder21 = builder17.setConverter((retrofit.converter.Converter) gsonConverter20);
        java.util.concurrent.Executor executor22 = null;
        builder17.setcallbackExecutor(executor22);
        retrofit.Server server24 = builder17.server;
        java.util.concurrent.Executor executor25 = null;
        builder17.httpExecutor = executor25;
        builder17.ensureSaneDefaults();
        java.util.concurrent.Executor executor28 = builder17.getcallbackExecutor();
        builder15.callbackExecutor = executor28;
        retrofit.converter.Converter converter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder31 = builder15.setConverter(converter30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertNotNull(executor28);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor7 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder9.serializedObjectSupporter;
        retrofit.client.Client.Provider provider12 = null;
        builder9.clientProvider = provider12;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder18 = builder14.setConverter((retrofit.converter.Converter) gsonConverter17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        builder14.serializedObjectSupporter = serializedObjectSupporter19;
        builder14.ensureSaneDefaults();
        retrofit.client.Client.Provider provider23 = builder14.clientProvider;
        builder9.clientProvider = provider23;
        retrofit.RestAdapter.Builder builder25 = builder0.setClient(provider23);
        retrofit.client.Client.Provider provider26 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(provider26);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.httpExecutor = executor2;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = builder4.callbackExecutor;
        retrofit.client.Client.Provider provider6 = builder4.clientProvider;
        java.util.concurrent.Executor executor7 = null;
        builder4.httpExecutor = executor7;
        java.util.concurrent.Executor executor9 = builder4.gethttpExecutor();
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        retrofit.client.Client.Provider provider20 = builder10.clientProvider;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor22 = builder21.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder25 = builder21.setConverter((retrofit.converter.Converter) gsonConverter24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString9();
        builder21.serializedObjectSupporter = serializedObjectSupporter26;
        builder21.ensureSaneDefaults();
        retrofit.client.Client.Provider provider30 = builder21.clientProvider;
        retrofit.client.Client.Provider provider31 = builder21.getclientProvider();
        java.util.concurrent.Executor executor32 = builder21.gethttpExecutor();
        builder10.httpExecutor = executor32;
        builder4.httpExecutor = executor32;
        builder0.sethttpExecutor(executor32);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com/" + "'", str27, "http://example.com/");
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNotNull(executor32);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = builder0.profiler;
        retrofit.RestAdapter.Builder builder20 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor21 = builder20.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.Profiler profiler18 = builder6.profiler;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder23 = builder19.setConverter((retrofit.converter.Converter) gsonConverter22);
        java.util.concurrent.Executor executor24 = null;
        builder19.setcallbackExecutor(executor24);
        retrofit.Server server26 = builder19.server;
        java.util.concurrent.Executor executor27 = null;
        builder19.httpExecutor = executor27;
        builder19.ensureSaneDefaults();
        retrofit.RestAdapter.Log log30 = builder19.log;
        log30.log("");
        builder6.log = log30;
        retrofit.RestAdapter.Builder builder35 = builder6.setServer("Internal Server Error");
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        builder36.serializedObjectSupporter = serializedObjectSupporter41;
        builder36.ensureSaneDefaults();
        retrofit.client.Client.Provider provider45 = builder36.clientProvider;
        retrofit.client.Client.Provider provider46 = builder36.getclientProvider();
        retrofit.RestAdapter.Builder builder48 = builder36.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = builder49.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter51.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder53 = builder49.setConverter((retrofit.converter.Converter) gsonConverter52);
        retrofit.RestAdapter.Builder builder55 = builder49.setServer("hi!");
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor57 = builder56.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter58.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder60 = builder56.setConverter((retrofit.converter.Converter) gsonConverter59);
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        java.lang.String str62 = serializedObjectSupporter61.deserializeObjectString9();
        builder56.serializedObjectSupporter = serializedObjectSupporter61;
        builder56.ensureSaneDefaults();
        retrofit.client.Client.Provider provider65 = builder56.clientProvider;
        builder55.clientProvider = provider65;
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor68 = builder67.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter70 = serializedObjectSupporter69.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder71 = builder67.setConverter((retrofit.converter.Converter) gsonConverter70);
        retrofit.RestAdapter.Builder builder73 = builder67.setServer("hi!");
        retrofit.RestAdapter.Builder builder74 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor75 = builder74.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter76 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter77 = serializedObjectSupporter76.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder78 = builder74.setConverter((retrofit.converter.Converter) gsonConverter77);
        retrofit.SerializedObjectSupporter serializedObjectSupporter79 = new retrofit.SerializedObjectSupporter();
        java.lang.String str80 = serializedObjectSupporter79.deserializeObjectString9();
        builder74.serializedObjectSupporter = serializedObjectSupporter79;
        builder74.ensureSaneDefaults();
        retrofit.client.Client.Provider provider83 = builder74.clientProvider;
        builder73.clientProvider = provider83;
        retrofit.RestAdapter.Builder builder85 = builder55.setClient(provider83);
        retrofit.RestAdapter restAdapter86 = builder55.build();
        java.util.concurrent.Executor executor87 = builder55.gethttpExecutor();
        builder36.setcallbackExecutor(executor87);
        builder6.httpExecutor = executor87;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNotNull(provider46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "http://example.com/" + "'", str62, "http://example.com/");
        org.junit.Assert.assertNotNull(provider65);
        org.junit.Assert.assertNull(executor68);
        org.junit.Assert.assertNotNull(gsonConverter70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNull(executor75);
        org.junit.Assert.assertNotNull(gsonConverter77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "http://example.com/" + "'", str80, "http://example.com/");
        org.junit.Assert.assertNotNull(provider83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(restAdapter86);
        org.junit.Assert.assertNotNull(executor87);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.gethttpExecutor();
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        retrofit.client.Client.Provider provider20 = builder10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor21 = builder10.requestInterceptor;
        retrofit.RestAdapter.Builder builder22 = builder8.setRequestInterceptor(requestInterceptor21);
        java.util.concurrent.Executor executor23 = builder22.getcallbackExecutor();
        retrofit.converter.Converter converter24 = builder22.converter;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        builder22.log = log25;
        retrofit.RestAdapter.Builder builder27 = builder0.setLog(log25);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.gethttpExecutor();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        retrofit.client.Client.Provider provider17 = builder7.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor18 = builder7.requestInterceptor;
        retrofit.RestAdapter.Builder builder19 = builder5.setRequestInterceptor(requestInterceptor18);
        java.util.concurrent.Executor executor20 = builder5.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel21 = builder5.logLevel;
        builder0.logLevel = logLevel21;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder25 = builder23.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor28 = builder27.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter29.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder31 = builder27.setConverter((retrofit.converter.Converter) gsonConverter30);
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        java.lang.String str33 = serializedObjectSupporter32.deserializeObjectString9();
        builder27.serializedObjectSupporter = serializedObjectSupporter32;
        builder27.ensureSaneDefaults();
        retrofit.client.Client.Provider provider36 = builder27.clientProvider;
        retrofit.client.Client.Provider provider37 = builder27.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor38 = builder27.requestInterceptor;
        retrofit.RestAdapter.Builder builder39 = builder26.setRequestInterceptor(requestInterceptor38);
        builder39.ensureSaneDefaults();
        java.util.concurrent.Executor executor41 = builder39.gethttpExecutor();
        builder25.httpExecutor = executor41;
        builder0.sethttpExecutor(executor41);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(provider17);
        org.junit.Assert.assertNotNull(requestInterceptor18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNotNull(provider36);
        org.junit.Assert.assertNotNull(provider37);
        org.junit.Assert.assertNotNull(requestInterceptor38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(executor41);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel13;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder17 = builder15.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        builder15.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder37 = builder12.setClient(provider34);
        retrofit.ErrorHandler errorHandler38 = builder37.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(errorHandler38);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter4();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor11 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.RestAdapter.Log log18 = null;
        builder17.log = log18;
        retrofit.client.Client.Provider provider20 = builder17.getclientProvider();
        java.util.concurrent.Executor executor21 = builder17.httpExecutor;
        java.util.concurrent.Executor executor22 = builder17.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(executor22);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        builder0.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = null;
        builder0.httpExecutor = executor21;
        retrofit.RestAdapter.LogLevel logLevel23 = null;
        builder0.logLevel = logLevel23;
        retrofit.client.Client client25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder26 = builder0.setClient(client25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str6 = response5.reason;
        int int7 = response5.status;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder6.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        builder6.serializedObjectSupporter = serializedObjectSupporter11;
        builder6.ensureSaneDefaults();
        retrofit.client.Client.Provider provider15 = builder6.clientProvider;
        retrofit.client.Client.Provider provider16 = builder6.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = builder6.requestInterceptor;
        retrofit.RestAdapter.Builder builder18 = builder5.setRequestInterceptor(requestInterceptor17);
        builder0.requestInterceptor = requestInterceptor17;
        java.util.concurrent.Executor executor20 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler21 = null;
        builder0.profiler = profiler21;
        retrofit.client.Client.Provider provider23 = null;
        builder0.setclientProvider(provider23);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RestAdapter.Builder builder14 = builder2.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.FULL;
        builder14.logLevel = logLevel15;
        java.util.concurrent.Executor executor17 = builder14.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor18 = builder14.requestInterceptor;
        builder0.requestInterceptor = requestInterceptor18;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor17);
        org.junit.Assert.assertNotNull(requestInterceptor18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = builder0.profiler;
        retrofit.RestAdapter.Builder builder20 = builder0.setServer("Retrofit-Idle");
        retrofit.ErrorHandler errorHandler21 = builder20.errorHandler;
        retrofit.RequestInterceptor requestInterceptor22 = builder20.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNotNull(requestInterceptor22);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.getReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        int int6 = response5.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder0.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter3();
        retrofit.Server server13 = serializedObjectSupporter11.deserializeObjectServer1();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(server13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RequestInterceptor requestInterceptor3 = null;
        builder0.requestInterceptor = requestInterceptor3;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder6.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.RestAdapter.Builder builder12 = builder6.setServer("hi!");
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder17 = builder13.setConverter((retrofit.converter.Converter) gsonConverter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        builder13.serializedObjectSupporter = serializedObjectSupporter18;
        builder13.ensureSaneDefaults();
        retrofit.client.Client.Provider provider22 = builder13.clientProvider;
        builder12.clientProvider = provider22;
        retrofit.Profiler profiler24 = builder12.profiler;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        java.util.concurrent.Executor executor30 = null;
        builder25.setcallbackExecutor(executor30);
        retrofit.Server server32 = builder25.server;
        java.util.concurrent.Executor executor33 = null;
        builder25.httpExecutor = executor33;
        builder25.ensureSaneDefaults();
        retrofit.RestAdapter.Log log36 = builder25.log;
        log36.log("");
        builder12.log = log36;
        log36.log("hi!");
        retrofit.RestAdapter.Builder builder42 = builder0.setLog(log36);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNull(profiler24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(server32);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor7 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = builder9.serializedObjectSupporter;
        retrofit.client.Client.Provider provider12 = null;
        builder9.clientProvider = provider12;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder18 = builder14.setConverter((retrofit.converter.Converter) gsonConverter17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString9();
        builder14.serializedObjectSupporter = serializedObjectSupporter19;
        builder14.ensureSaneDefaults();
        retrofit.client.Client.Provider provider23 = builder14.clientProvider;
        builder9.clientProvider = provider23;
        retrofit.RestAdapter.Builder builder25 = builder0.setClient(provider23);
        retrofit.RestAdapter.Log log26 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
        org.junit.Assert.assertNotNull(provider23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(log26);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor13 = builder12.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = builder12.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertNotNull(serializedObjectSupporter14);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList5 = response4.headers;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString9();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        retrofit.client.Response response7 = serializedObjectSupporter4.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter4.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor9 = serializedObjectSupporter4.deserializeObjectRequestInterceptor1();
        retrofit.Server server10 = serializedObjectSupporter4.deserializeObjectServer1();
        builder0.server = server10;
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestInterceptor9);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel8 = builder6.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder6.serializedObjectSupporter;
        retrofit.Server server10 = builder6.server;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(server10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor13 = null;
        builder0.httpExecutor = executor13;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = builder0.setRequestInterceptor(requestInterceptor13);
        retrofit.RestAdapter.Log log15 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        java.util.concurrent.Executor executor37 = builder36.gethttpExecutor();
        retrofit.client.Client.Provider provider38 = builder36.getclientProvider();
        builder36.ensureSaneDefaults();
        java.util.concurrent.Executor executor40 = builder36.callbackExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(provider38);
        org.junit.Assert.assertNotNull(executor40);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.Server server8 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = builder4.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder8 = builder4.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        builder4.serializedObjectSupporter = serializedObjectSupporter9;
        builder4.ensureSaneDefaults();
        retrofit.client.Client.Provider provider13 = builder4.clientProvider;
        retrofit.client.Client.Provider provider14 = builder4.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor15 = builder4.requestInterceptor;
        retrofit.RestAdapter.Builder builder16 = builder3.setRequestInterceptor(requestInterceptor15);
        builder16.ensureSaneDefaults();
        java.util.concurrent.Executor executor18 = builder16.gethttpExecutor();
        builder2.httpExecutor = executor18;
        retrofit.RestAdapter.Builder builder21 = builder2.setServer("http://example.com/");
        java.util.concurrent.Executor executor22 = builder21.gethttpExecutor();
        retrofit.client.Client.Provider provider23 = builder21.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(requestInterceptor15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(executor18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(executor22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder0.serializedObjectSupporter;
        builder0.ensureSaneDefaults();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        builder13.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = builder13.getcallbackExecutor();
        retrofit.converter.Converter converter16 = builder13.converter;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder21 = builder17.setConverter((retrofit.converter.Converter) gsonConverter20);
        java.util.concurrent.Executor executor22 = null;
        builder17.setcallbackExecutor(executor22);
        retrofit.Server server24 = builder17.server;
        java.util.concurrent.Executor executor25 = null;
        builder17.httpExecutor = executor25;
        builder17.ensureSaneDefaults();
        retrofit.RestAdapter.Log log28 = builder17.log;
        log28.log("");
        retrofit.RestAdapter.Builder builder31 = builder13.setLog(log28);
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        builder32.clientProvider = provider42;
        retrofit.ErrorHandler errorHandler44 = builder32.errorHandler;
        retrofit.client.Client.Provider provider45 = builder32.clientProvider;
        builder13.clientProvider = provider45;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(converter16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNull(errorHandler44);
        org.junit.Assert.assertNotNull(provider45);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder6.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        builder6.serializedObjectSupporter = serializedObjectSupporter11;
        builder6.ensureSaneDefaults();
        retrofit.client.Client.Provider provider15 = builder6.clientProvider;
        retrofit.client.Client.Provider provider16 = builder6.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = builder6.requestInterceptor;
        retrofit.RestAdapter.Builder builder18 = builder5.setRequestInterceptor(requestInterceptor17);
        builder0.requestInterceptor = requestInterceptor17;
        java.util.concurrent.Executor executor20 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler21 = builder0.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        builder13.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = builder13.getcallbackExecutor();
        retrofit.converter.Converter converter16 = builder13.converter;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder21 = builder17.setConverter((retrofit.converter.Converter) gsonConverter20);
        java.util.concurrent.Executor executor22 = null;
        builder17.setcallbackExecutor(executor22);
        retrofit.Server server24 = builder17.server;
        java.util.concurrent.Executor executor25 = null;
        builder17.httpExecutor = executor25;
        builder17.ensureSaneDefaults();
        retrofit.RestAdapter.Log log28 = builder17.log;
        log28.log("");
        retrofit.RestAdapter.Builder builder31 = builder13.setLog(log28);
        retrofit.RestAdapter.Builder builder33 = builder13.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = builder34.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder38 = builder34.setConverter((retrofit.converter.Converter) gsonConverter37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        java.lang.String str40 = serializedObjectSupporter39.deserializeObjectString9();
        builder34.serializedObjectSupporter = serializedObjectSupporter39;
        builder34.ensureSaneDefaults();
        retrofit.client.Client.Provider provider43 = builder34.clientProvider;
        retrofit.client.Client.Provider provider44 = builder34.getclientProvider();
        java.util.concurrent.Executor executor45 = builder34.gethttpExecutor();
        builder33.callbackExecutor = executor45;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(converter16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "http://example.com/" + "'", str40, "http://example.com/");
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(provider44);
        org.junit.Assert.assertNotNull(executor45);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        java.util.concurrent.Executor executor37 = builder6.getcallbackExecutor();
        retrofit.RestAdapter.Log log38 = builder6.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNull(log38);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        builder0.setclientProvider(provider19);
        retrofit.RequestInterceptor requestInterceptor21 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor22 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(requestInterceptor21);
        org.junit.Assert.assertNotNull(requestInterceptor22);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        java.util.concurrent.Executor executor20 = null;
        builder17.httpExecutor = executor20;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor24 = builder23.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder27 = builder23.setConverter((retrofit.converter.Converter) gsonConverter26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString9();
        builder23.serializedObjectSupporter = serializedObjectSupporter28;
        builder23.ensureSaneDefaults();
        retrofit.client.Client.Provider provider32 = builder23.clientProvider;
        retrofit.client.Client.Provider provider33 = builder23.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor34 = builder23.requestInterceptor;
        retrofit.RestAdapter.Builder builder35 = builder22.setRequestInterceptor(requestInterceptor34);
        builder35.ensureSaneDefaults();
        java.util.concurrent.Executor executor37 = builder35.gethttpExecutor();
        builder17.setcallbackExecutor(executor37);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNotNull(provider33);
        org.junit.Assert.assertNotNull(requestInterceptor34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(executor37);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        retrofit.client.Response response5 = serializedObjectSupporter2.deserializeObjectResponse3();
        java.lang.String str6 = response5.reason;
        retrofit.mime.TypedInput typedInput7 = response5.getBody();
        java.util.List<retrofit.client.Header> headerList8 = response5.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString9();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString5();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse3();
        java.lang.String str13 = response12.reason;
        retrofit.mime.TypedInput typedInput14 = response12.getBody();
        retrofit.mime.TypedInput typedInput15 = response12.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response16 = new retrofit.client.Response((int) (short) -1, "hi!", headerList8, typedInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertNotNull(typedInput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OK" + "'", str13, "OK");
        org.junit.Assert.assertNotNull(typedInput14);
        org.junit.Assert.assertNotNull(typedInput15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor50 = builder49.gethttpExecutor();
        java.util.concurrent.Executor executor51 = null;
        builder49.setcallbackExecutor(executor51);
        retrofit.RestAdapter.LogLevel logLevel53 = builder49.logLevel;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        builder54.serializedObjectSupporter = serializedObjectSupporter59;
        builder54.ensureSaneDefaults();
        retrofit.client.Client.Provider provider63 = builder54.clientProvider;
        retrofit.client.Client.Provider provider64 = builder54.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor65 = builder54.requestInterceptor;
        retrofit.RestAdapter.Builder builder66 = builder49.setRequestInterceptor(requestInterceptor65);
        retrofit.RestAdapter.Builder builder67 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor68 = builder67.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter70 = serializedObjectSupporter69.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder71 = builder67.setConverter((retrofit.converter.Converter) gsonConverter70);
        retrofit.RestAdapter.Builder builder73 = builder67.setServer("hi!");
        retrofit.RestAdapter.Builder builder74 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor75 = builder74.gethttpExecutor();
        java.util.concurrent.Executor executor76 = null;
        builder74.setcallbackExecutor(executor76);
        retrofit.RestAdapter.LogLevel logLevel78 = builder74.logLevel;
        retrofit.RestAdapter.Builder builder79 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor80 = builder79.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter82 = serializedObjectSupporter81.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder83 = builder79.setConverter((retrofit.converter.Converter) gsonConverter82);
        retrofit.SerializedObjectSupporter serializedObjectSupporter84 = new retrofit.SerializedObjectSupporter();
        java.lang.String str85 = serializedObjectSupporter84.deserializeObjectString9();
        builder79.serializedObjectSupporter = serializedObjectSupporter84;
        builder79.ensureSaneDefaults();
        retrofit.client.Client.Provider provider88 = builder79.clientProvider;
        retrofit.client.Client.Provider provider89 = builder79.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor90 = builder79.requestInterceptor;
        retrofit.RestAdapter.Builder builder91 = builder74.setRequestInterceptor(requestInterceptor90);
        retrofit.RestAdapter.Builder builder92 = builder73.setRequestInterceptor(requestInterceptor90);
        retrofit.RestAdapter.Builder builder93 = builder66.setRequestInterceptor(requestInterceptor90);
        retrofit.RestAdapter.Builder builder94 = builder48.setRequestInterceptor(requestInterceptor90);
        retrofit.client.Client.Provider provider95 = builder94.getclientProvider();
        retrofit.client.Client client96 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder97 = builder94.setClient(client96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(provider63);
        org.junit.Assert.assertNotNull(provider64);
        org.junit.Assert.assertNotNull(requestInterceptor65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(executor68);
        org.junit.Assert.assertNotNull(gsonConverter70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNull(executor75);
        org.junit.Assert.assertTrue("'" + logLevel78 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel78.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor80);
        org.junit.Assert.assertNotNull(gsonConverter82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "http://example.com/" + "'", str85, "http://example.com/");
        org.junit.Assert.assertNotNull(provider88);
        org.junit.Assert.assertNotNull(provider89);
        org.junit.Assert.assertNotNull(requestInterceptor90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNull(provider95);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = builder0.setRequestInterceptor(requestInterceptor13);
        java.util.concurrent.Executor executor15 = builder14.getcallbackExecutor();
        retrofit.converter.Converter converter16 = builder14.converter;
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        builder14.log = log17;
        log17.log("Retrofit-Idle");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString5();
        retrofit.client.Response response16 = serializedObjectSupporter13.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter13.deserializeObjectConverter5();
        builder12.converter = gsonConverter17;
        retrofit.client.Client.Provider provider19 = builder12.clientProvider;
        retrofit.Profiler profiler20 = builder12.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(profiler20);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.gethttpExecutor();
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder26 = builder22.setConverter((retrofit.converter.Converter) gsonConverter25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        builder22.serializedObjectSupporter = serializedObjectSupporter27;
        builder22.ensureSaneDefaults();
        retrofit.client.Client.Provider provider31 = builder22.clientProvider;
        retrofit.client.Client.Provider provider32 = builder22.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor33 = builder22.requestInterceptor;
        retrofit.RestAdapter.Builder builder34 = builder20.setRequestInterceptor(requestInterceptor33);
        java.util.concurrent.Executor executor35 = builder34.getcallbackExecutor();
        retrofit.converter.Converter converter36 = builder34.converter;
        retrofit.RestAdapter.Log log37 = retrofit.RestAdapter.Log.NONE;
        builder34.log = log37;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = builder39.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter41.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder43 = builder39.setConverter((retrofit.converter.Converter) gsonConverter42);
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        java.lang.String str45 = serializedObjectSupporter44.deserializeObjectString9();
        builder39.serializedObjectSupporter = serializedObjectSupporter44;
        builder39.ensureSaneDefaults();
        retrofit.client.Client.Provider provider48 = builder39.clientProvider;
        retrofit.client.Client.Provider provider49 = builder39.clientProvider;
        retrofit.RestAdapter.Log log50 = builder39.log;
        retrofit.RestAdapter.Builder builder51 = builder34.setLog(log50);
        retrofit.RestAdapter.Builder builder52 = builder17.setLog(log50);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNotNull(requestInterceptor33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNull(converter36);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
        org.junit.Assert.assertNotNull(provider48);
        org.junit.Assert.assertNotNull(provider49);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean9 = logLevel8.log();
        boolean boolean10 = logLevel8.log();
        retrofit.RestAdapter.Builder builder11 = builder0.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("Internal Server Error");
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = response6.reason;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Internal Server Error" + "'", str7, "Internal Server Error");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.Server server10 = builder0.server;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(server10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = response3.reason;
        retrofit.mime.TypedInput typedInput5 = response3.getBody();
        java.lang.String str6 = response3.reason;
        java.util.List<retrofit.client.Header> headerList7 = response3.getHeaders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(typedInput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder12 = builder8.setConverter((retrofit.converter.Converter) gsonConverter11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString9();
        builder8.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter13.deserializeObjectConverter8();
        java.lang.Class class17 = serializedObjectSupporter13.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter13.deserializeObjectConverter7();
        retrofit.RestAdapter.Builder builder19 = builder0.setConverter((retrofit.converter.Converter) gsonConverter18);
        java.util.concurrent.Executor executor20 = builder0.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler21 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder22 = builder0.setErrorHandler(errorHandler21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.RestAdapter.Builder builder13 = builder7.setServer("hi!");
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor15 = builder14.gethttpExecutor();
        java.util.concurrent.Executor executor16 = null;
        builder14.setcallbackExecutor(executor16);
        retrofit.RestAdapter.LogLevel logLevel18 = builder14.logLevel;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder23 = builder19.setConverter((retrofit.converter.Converter) gsonConverter22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString9();
        builder19.serializedObjectSupporter = serializedObjectSupporter24;
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider28 = builder19.clientProvider;
        retrofit.client.Client.Provider provider29 = builder19.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor30 = builder19.requestInterceptor;
        retrofit.RestAdapter.Builder builder31 = builder14.setRequestInterceptor(requestInterceptor30);
        retrofit.RestAdapter.Builder builder32 = builder13.setRequestInterceptor(requestInterceptor30);
        retrofit.RestAdapter restAdapter33 = builder32.build();
        java.util.concurrent.Executor executor34 = builder32.gethttpExecutor();
        retrofit.Profiler profiler35 = builder32.profiler;
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.RestAdapter.Builder builder42 = builder36.setServer("hi!");
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = builder43.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter45.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder47 = builder43.setConverter((retrofit.converter.Converter) gsonConverter46);
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString9();
        builder43.serializedObjectSupporter = serializedObjectSupporter48;
        builder43.ensureSaneDefaults();
        retrofit.client.Client.Provider provider52 = builder43.clientProvider;
        builder42.clientProvider = provider52;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.RestAdapter.Builder builder60 = builder54.setServer("hi!");
        retrofit.RestAdapter.Builder builder61 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor62 = builder61.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter63.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder65 = builder61.setConverter((retrofit.converter.Converter) gsonConverter64);
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        java.lang.String str67 = serializedObjectSupporter66.deserializeObjectString9();
        builder61.serializedObjectSupporter = serializedObjectSupporter66;
        builder61.ensureSaneDefaults();
        retrofit.client.Client.Provider provider70 = builder61.clientProvider;
        builder60.clientProvider = provider70;
        retrofit.RestAdapter.Builder builder72 = builder42.setClient(provider70);
        retrofit.RestAdapter restAdapter73 = builder42.build();
        java.util.concurrent.Executor executor74 = builder42.gethttpExecutor();
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder76 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor77 = builder76.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter78 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter79 = serializedObjectSupporter78.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder80 = builder76.setConverter((retrofit.converter.Converter) gsonConverter79);
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        java.lang.String str82 = serializedObjectSupporter81.deserializeObjectString9();
        builder76.serializedObjectSupporter = serializedObjectSupporter81;
        builder76.ensureSaneDefaults();
        retrofit.client.Client.Provider provider85 = builder76.clientProvider;
        retrofit.client.Client.Provider provider86 = builder76.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor87 = builder76.requestInterceptor;
        retrofit.RestAdapter.Builder builder88 = builder75.setRequestInterceptor(requestInterceptor87);
        builder88.ensureSaneDefaults();
        java.util.concurrent.Executor executor90 = builder88.gethttpExecutor();
        retrofit.RestAdapter.Builder builder91 = builder32.setExecutors(executor74, executor90);
        builder0.setcallbackExecutor(executor74);
        java.util.concurrent.Executor executor93 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor94 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(requestInterceptor30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(restAdapter33);
        org.junit.Assert.assertNotNull(executor34);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(executor44);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNotNull(provider52);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "http://example.com/" + "'", str67, "http://example.com/");
        org.junit.Assert.assertNotNull(provider70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(restAdapter73);
        org.junit.Assert.assertNotNull(executor74);
        org.junit.Assert.assertNull(executor77);
        org.junit.Assert.assertNotNull(gsonConverter79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "http://example.com/" + "'", str82, "http://example.com/");
        org.junit.Assert.assertNotNull(provider85);
        org.junit.Assert.assertNotNull(provider86);
        org.junit.Assert.assertNotNull(requestInterceptor87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(executor90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(executor93);
        org.junit.Assert.assertNull(executor94);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.concurrent.Executor executor8 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder0.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.gethttpExecutor();
        java.util.concurrent.Executor executor9 = null;
        builder7.setcallbackExecutor(executor9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString9();
        builder12.serializedObjectSupporter = serializedObjectSupporter17;
        builder12.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder12.clientProvider;
        retrofit.client.Client.Provider provider22 = builder12.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor23 = builder12.requestInterceptor;
        retrofit.RestAdapter.Builder builder24 = builder7.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter.Builder builder25 = builder6.setRequestInterceptor(requestInterceptor23);
        retrofit.RestAdapter restAdapter26 = builder25.build();
        java.util.concurrent.Executor executor27 = builder25.gethttpExecutor();
        retrofit.Profiler profiler28 = builder25.profiler;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = builder29.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder33 = builder29.setConverter((retrofit.converter.Converter) gsonConverter32);
        retrofit.RestAdapter.Builder builder35 = builder29.setServer("hi!");
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        builder36.serializedObjectSupporter = serializedObjectSupporter41;
        builder36.ensureSaneDefaults();
        retrofit.client.Client.Provider provider45 = builder36.clientProvider;
        builder35.clientProvider = provider45;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder51 = builder47.setConverter((retrofit.converter.Converter) gsonConverter50);
        retrofit.RestAdapter.Builder builder53 = builder47.setServer("hi!");
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor55 = builder54.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder58 = builder54.setConverter((retrofit.converter.Converter) gsonConverter57);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        java.lang.String str60 = serializedObjectSupporter59.deserializeObjectString9();
        builder54.serializedObjectSupporter = serializedObjectSupporter59;
        builder54.ensureSaneDefaults();
        retrofit.client.Client.Provider provider63 = builder54.clientProvider;
        builder53.clientProvider = provider63;
        retrofit.RestAdapter.Builder builder65 = builder35.setClient(provider63);
        retrofit.RestAdapter restAdapter66 = builder35.build();
        java.util.concurrent.Executor executor67 = builder35.gethttpExecutor();
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor70 = builder69.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter71 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter71.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder73 = builder69.setConverter((retrofit.converter.Converter) gsonConverter72);
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        java.lang.String str75 = serializedObjectSupporter74.deserializeObjectString9();
        builder69.serializedObjectSupporter = serializedObjectSupporter74;
        builder69.ensureSaneDefaults();
        retrofit.client.Client.Provider provider78 = builder69.clientProvider;
        retrofit.client.Client.Provider provider79 = builder69.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor80 = builder69.requestInterceptor;
        retrofit.RestAdapter.Builder builder81 = builder68.setRequestInterceptor(requestInterceptor80);
        builder81.ensureSaneDefaults();
        java.util.concurrent.Executor executor83 = builder81.gethttpExecutor();
        retrofit.RestAdapter.Builder builder84 = builder25.setExecutors(executor67, executor83);
        java.util.concurrent.Executor executor85 = builder25.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(executor27);
        org.junit.Assert.assertNull(profiler28);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertNotNull(provider63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(restAdapter66);
        org.junit.Assert.assertNotNull(executor67);
        org.junit.Assert.assertNull(executor70);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "http://example.com/" + "'", str75, "http://example.com/");
        org.junit.Assert.assertNotNull(provider78);
        org.junit.Assert.assertNotNull(provider79);
        org.junit.Assert.assertNotNull(requestInterceptor80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(executor83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(executor85);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.Server server3 = builder0.server;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder0.setConverter((retrofit.converter.Converter) gsonConverter9);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(requestInterceptor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = builder0.profiler;
        retrofit.RestAdapter.Builder builder20 = builder0.setServer("Retrofit-Idle");
        retrofit.ErrorHandler errorHandler21 = builder20.errorHandler;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder26 = builder22.setConverter((retrofit.converter.Converter) gsonConverter25);
        retrofit.RestAdapter.Builder builder28 = builder22.setServer("hi!");
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor30 = builder29.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder33 = builder29.setConverter((retrofit.converter.Converter) gsonConverter32);
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString9();
        builder29.serializedObjectSupporter = serializedObjectSupporter34;
        builder29.ensureSaneDefaults();
        retrofit.client.Client.Provider provider38 = builder29.clientProvider;
        builder28.clientProvider = provider38;
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor41 = builder40.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter42.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder44 = builder40.setConverter((retrofit.converter.Converter) gsonConverter43);
        retrofit.RestAdapter.Builder builder46 = builder40.setServer("hi!");
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor48 = builder47.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder51 = builder47.setConverter((retrofit.converter.Converter) gsonConverter50);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        java.lang.String str53 = serializedObjectSupporter52.deserializeObjectString9();
        builder47.serializedObjectSupporter = serializedObjectSupporter52;
        builder47.ensureSaneDefaults();
        retrofit.client.Client.Provider provider56 = builder47.clientProvider;
        builder46.clientProvider = provider56;
        retrofit.RestAdapter.Builder builder58 = builder28.setClient(provider56);
        java.util.concurrent.Executor executor59 = builder58.gethttpExecutor();
        retrofit.client.Client.Provider provider60 = builder58.getclientProvider();
        retrofit.RestAdapter.Builder builder61 = builder20.setClient(provider60);
        java.util.concurrent.Executor executor62 = builder20.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
        org.junit.Assert.assertNotNull(provider38);
        org.junit.Assert.assertNull(executor41);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertNotNull(provider56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNull(executor59);
        org.junit.Assert.assertNotNull(provider60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(executor62);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString9();
        builder3.serializedObjectSupporter = serializedObjectSupporter8;
        builder3.ensureSaneDefaults();
        retrofit.client.Client.Provider provider12 = builder3.clientProvider;
        retrofit.client.Client.Provider provider13 = builder3.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = builder3.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder19 = builder15.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString9();
        builder15.serializedObjectSupporter = serializedObjectSupporter20;
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider24 = builder15.clientProvider;
        retrofit.client.Client.Provider provider25 = builder15.getclientProvider();
        retrofit.RestAdapter.Builder builder27 = builder15.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel28;
        java.util.concurrent.Executor executor30 = builder27.callbackExecutor;
        builder3.callbackExecutor = executor30;
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor34 = builder33.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter35.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder37 = builder33.setConverter((retrofit.converter.Converter) gsonConverter36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        java.lang.String str39 = serializedObjectSupporter38.deserializeObjectString9();
        builder33.serializedObjectSupporter = serializedObjectSupporter38;
        builder33.ensureSaneDefaults();
        retrofit.client.Client.Provider provider42 = builder33.clientProvider;
        retrofit.client.Client.Provider provider43 = builder33.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor44 = builder33.requestInterceptor;
        retrofit.RestAdapter.Builder builder45 = builder32.setRequestInterceptor(requestInterceptor44);
        builder45.ensureSaneDefaults();
        java.util.concurrent.Executor executor47 = builder45.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder48 = builder2.setExecutors(executor30, executor47);
        retrofit.converter.Converter converter49 = builder2.converter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "http://example.com/" + "'", str39, "http://example.com/");
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNotNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(converter49);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.client.Client.Provider provider3 = null;
        builder0.clientProvider = provider3;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Log log7 = builder0.log;
        retrofit.RestAdapter.Log log8 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(log8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("OK");
        retrofit.client.Client.Provider provider6 = builder5.clientProvider;
        retrofit.client.Client.Provider provider7 = null;
        builder5.clientProvider = provider7;
        java.util.concurrent.Executor executor9 = null;
        builder5.sethttpExecutor(executor9);
        java.util.concurrent.Executor executor11 = builder5.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor5 = builder4.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder8 = builder4.setConverter((retrofit.converter.Converter) gsonConverter7);
        java.util.concurrent.Executor executor9 = null;
        builder4.setcallbackExecutor(executor9);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder15 = builder11.setConverter((retrofit.converter.Converter) gsonConverter14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString9();
        builder11.serializedObjectSupporter = serializedObjectSupporter16;
        builder11.ensureSaneDefaults();
        retrofit.client.Client.Provider provider20 = builder11.clientProvider;
        retrofit.client.Client.Provider provider21 = builder11.clientProvider;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.gethttpExecutor();
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = builder24.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder28 = builder24.setConverter((retrofit.converter.Converter) gsonConverter27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString9();
        builder24.serializedObjectSupporter = serializedObjectSupporter29;
        builder24.ensureSaneDefaults();
        retrofit.client.Client.Provider provider33 = builder24.clientProvider;
        retrofit.client.Client.Provider provider34 = builder24.getclientProvider();
        retrofit.RestAdapter.Builder builder36 = builder24.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.FULL;
        builder36.logLevel = logLevel37;
        java.util.concurrent.Executor executor39 = builder36.callbackExecutor;
        builder22.callbackExecutor = executor39;
        builder11.setcallbackExecutor(executor39);
        builder4.setcallbackExecutor(executor39);
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor44 = builder43.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter45.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder47 = builder43.setConverter((retrofit.converter.Converter) gsonConverter46);
        retrofit.RestAdapter.Builder builder49 = builder43.setServer("hi!");
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor51 = builder50.gethttpExecutor();
        java.util.concurrent.Executor executor52 = null;
        builder50.setcallbackExecutor(executor52);
        retrofit.RestAdapter.LogLevel logLevel54 = builder50.logLevel;
        retrofit.RestAdapter.Builder builder55 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor56 = builder55.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter58 = serializedObjectSupporter57.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder59 = builder55.setConverter((retrofit.converter.Converter) gsonConverter58);
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = new retrofit.SerializedObjectSupporter();
        java.lang.String str61 = serializedObjectSupporter60.deserializeObjectString9();
        builder55.serializedObjectSupporter = serializedObjectSupporter60;
        builder55.ensureSaneDefaults();
        retrofit.client.Client.Provider provider64 = builder55.clientProvider;
        retrofit.client.Client.Provider provider65 = builder55.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor66 = builder55.requestInterceptor;
        retrofit.RestAdapter.Builder builder67 = builder50.setRequestInterceptor(requestInterceptor66);
        retrofit.RestAdapter.Builder builder68 = builder49.setRequestInterceptor(requestInterceptor66);
        retrofit.RestAdapter restAdapter69 = builder68.build();
        java.util.concurrent.Executor executor70 = builder68.gethttpExecutor();
        retrofit.RestAdapter.Log log71 = builder68.log;
        retrofit.RestAdapter.Builder builder72 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor73 = builder72.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter75 = serializedObjectSupporter74.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder76 = builder72.setConverter((retrofit.converter.Converter) gsonConverter75);
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = new retrofit.SerializedObjectSupporter();
        java.lang.String str78 = serializedObjectSupporter77.deserializeObjectString9();
        builder72.serializedObjectSupporter = serializedObjectSupporter77;
        builder72.ensureSaneDefaults();
        retrofit.client.Client.Provider provider81 = builder72.clientProvider;
        retrofit.client.Client.Provider provider82 = builder72.getclientProvider();
        retrofit.RestAdapter.Builder builder84 = builder72.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel85 = retrofit.RestAdapter.LogLevel.FULL;
        builder84.logLevel = logLevel85;
        java.util.concurrent.Executor executor87 = builder84.callbackExecutor;
        builder68.callbackExecutor = executor87;
        retrofit.RestAdapter.Builder builder89 = builder0.setExecutors(executor39, executor87);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNotNull(provider21);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(provider33);
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor39);
        org.junit.Assert.assertNull(executor44);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor56);
        org.junit.Assert.assertNotNull(gsonConverter58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "http://example.com/" + "'", str61, "http://example.com/");
        org.junit.Assert.assertNotNull(provider64);
        org.junit.Assert.assertNotNull(provider65);
        org.junit.Assert.assertNotNull(requestInterceptor66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(restAdapter69);
        org.junit.Assert.assertNotNull(executor70);
        org.junit.Assert.assertNotNull(log71);
        org.junit.Assert.assertNull(executor73);
        org.junit.Assert.assertNotNull(gsonConverter75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "http://example.com/" + "'", str78, "http://example.com/");
        org.junit.Assert.assertNotNull(provider81);
        org.junit.Assert.assertNotNull(provider82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertTrue("'" + logLevel85 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel85.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor87);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.FULL;
        builder12.logLevel = logLevel13;
        java.util.concurrent.Executor executor15 = builder12.callbackExecutor;
        java.util.concurrent.Executor executor16 = builder12.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(executor16);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.Profiler profiler7 = builder0.profiler;
        retrofit.RestAdapter.Log log8 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(profiler7);
        org.junit.Assert.assertNull(log8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        retrofit.RestAdapter.Log log8 = builder0.log;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor10 = builder9.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder13 = builder9.setConverter((retrofit.converter.Converter) gsonConverter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString9();
        builder9.serializedObjectSupporter = serializedObjectSupporter14;
        builder9.ensureSaneDefaults();
        retrofit.client.Client.Provider provider18 = builder9.clientProvider;
        retrofit.client.Client.Provider provider19 = builder9.getclientProvider();
        retrofit.RestAdapter.Builder builder21 = builder9.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        java.lang.String str23 = serializedObjectSupporter22.deserializeObjectString9();
        java.lang.String str24 = serializedObjectSupporter22.deserializeObjectString5();
        retrofit.client.Response response25 = serializedObjectSupporter22.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter22.deserializeObjectConverter5();
        builder21.converter = gsonConverter26;
        retrofit.RestAdapter restAdapter28 = builder21.build();
        retrofit.RestAdapter.Log log29 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder30 = builder21.setLog(log29);
        builder0.log = log29;
        retrofit.client.Client.Provider provider32 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(provider18);
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(restAdapter28);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(provider32);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        java.lang.String str5 = response3.getReason();
        retrofit.mime.TypedInput typedInput6 = response3.body;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNotNull(typedInput6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        java.util.concurrent.Executor executor20 = null;
        builder17.httpExecutor = executor20;
        retrofit.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder23 = builder17.setClient(client22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter5.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        builder13.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = builder13.getcallbackExecutor();
        retrofit.converter.Converter converter16 = builder13.converter;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder21 = builder17.setConverter((retrofit.converter.Converter) gsonConverter20);
        java.util.concurrent.Executor executor22 = null;
        builder17.setcallbackExecutor(executor22);
        retrofit.Server server24 = builder17.server;
        java.util.concurrent.Executor executor25 = null;
        builder17.httpExecutor = executor25;
        builder17.ensureSaneDefaults();
        retrofit.RestAdapter.Log log28 = builder17.log;
        log28.log("");
        retrofit.RestAdapter.Builder builder31 = builder13.setLog(log28);
        retrofit.RestAdapter.Log log32 = builder13.log;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(converter16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(log32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.Server server7 = builder0.server;
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        java.util.concurrent.Executor executor10 = builder0.httpExecutor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter11 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.converter.Converter converter7 = builder0.converter;
        java.util.concurrent.Executor executor8 = builder0.gethttpExecutor();
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        retrofit.converter.Converter converter10 = builder0.converter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        retrofit.client.Client.Provider provider10 = builder0.clientProvider;
        retrofit.RestAdapter.Log log11 = builder0.log;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder16 = builder12.setConverter((retrofit.converter.Converter) gsonConverter15);
        java.util.concurrent.Executor executor17 = null;
        builder12.setcallbackExecutor(executor17);
        retrofit.Server server19 = builder12.server;
        java.util.concurrent.Executor executor20 = null;
        builder12.callbackExecutor = executor20;
        retrofit.Server server22 = builder12.server;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor24 = builder23.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder27 = builder23.setConverter((retrofit.converter.Converter) gsonConverter26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString9();
        builder23.serializedObjectSupporter = serializedObjectSupporter28;
        builder23.ensureSaneDefaults();
        retrofit.client.Client.Provider provider32 = builder23.clientProvider;
        builder12.setclientProvider(provider32);
        builder0.setclientProvider(provider32);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(server22);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertNotNull(provider32);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = response3.reason;
        retrofit.mime.TypedInput typedInput5 = response3.getBody();
        java.util.List<retrofit.client.Header> headerList6 = response3.getHeaders();
        java.lang.String str7 = response3.getReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(typedInput5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        java.util.concurrent.Executor executor20 = null;
        builder17.httpExecutor = executor20;
        retrofit.RequestInterceptor requestInterceptor22 = builder17.requestInterceptor;
        retrofit.client.Client.Provider provider23 = builder17.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(requestInterceptor22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        retrofit.converter.Converter converter14 = builder0.converter;
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        retrofit.client.Client.Provider provider30 = builder20.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor31 = builder20.requestInterceptor;
        retrofit.RestAdapter.Builder builder32 = builder17.setRequestInterceptor(requestInterceptor31);
        java.util.concurrent.Executor executor33 = builder17.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(requestInterceptor31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(executor33);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log6;
        log6.log("http://example.com/");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder9 = builder5.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString9();
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        builder5.ensureSaneDefaults();
        retrofit.client.Client.Provider provider14 = builder5.clientProvider;
        retrofit.client.Client.Provider provider15 = builder5.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor16 = builder5.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = builder0.setRequestInterceptor(requestInterceptor16);
        retrofit.Profiler profiler18 = null;
        builder17.profiler = profiler18;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor21 = builder20.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder24 = builder20.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString9();
        builder20.serializedObjectSupporter = serializedObjectSupporter25;
        builder20.ensureSaneDefaults();
        retrofit.client.Client.Provider provider29 = builder20.clientProvider;
        retrofit.client.Client.Provider provider30 = builder20.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor31 = builder20.requestInterceptor;
        retrofit.RestAdapter.Builder builder32 = builder17.setRequestInterceptor(requestInterceptor31);
        retrofit.Profiler profiler33 = builder32.profiler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(requestInterceptor16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://example.com/" + "'", str26, "http://example.com/");
        org.junit.Assert.assertNotNull(provider29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(requestInterceptor31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(profiler33);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder22 = builder18.setConverter((retrofit.converter.Converter) gsonConverter21);
        retrofit.RestAdapter.Builder builder24 = builder18.setServer("hi!");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder29 = builder25.setConverter((retrofit.converter.Converter) gsonConverter28);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        java.lang.String str31 = serializedObjectSupporter30.deserializeObjectString9();
        builder25.serializedObjectSupporter = serializedObjectSupporter30;
        builder25.ensureSaneDefaults();
        retrofit.client.Client.Provider provider34 = builder25.clientProvider;
        builder24.clientProvider = provider34;
        retrofit.RestAdapter.Builder builder36 = builder6.setClient(provider34);
        retrofit.RestAdapter restAdapter37 = builder6.build();
        java.util.concurrent.Executor executor38 = builder6.gethttpExecutor();
        retrofit.Profiler profiler39 = builder6.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString9();
        java.lang.String str42 = serializedObjectSupporter40.deserializeObjectString5();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString3();
        retrofit.client.Response response44 = serializedObjectSupporter40.deserializeObjectResponse2();
        builder6.serializedObjectSupporter = serializedObjectSupporter40;
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter40.deserializeObjectConverter8();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com/" + "'", str13, "http://example.com/");
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://example.com/" + "'", str31, "http://example.com/");
        org.junit.Assert.assertNotNull(provider34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(restAdapter37);
        org.junit.Assert.assertNotNull(executor38);
        org.junit.Assert.assertNull(profiler39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com/" + "'", str41, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com/" + "'", str43, "http://example.com/");
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(gsonConverter46);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList3 = response2.headers;
        retrofit.mime.TypedInput typedInput4 = response2.getBody();
        java.lang.String str5 = response2.reason;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str4 = response3.reason;
        retrofit.mime.TypedInput typedInput5 = response3.getBody();
        retrofit.mime.TypedInput typedInput6 = response3.body;
        java.lang.Class<?> wildcardClass7 = response3.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertNotNull(typedInput5);
        org.junit.Assert.assertNotNull(typedInput6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder6 = builder2.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString9();
        builder2.serializedObjectSupporter = serializedObjectSupporter7;
        builder2.ensureSaneDefaults();
        retrofit.client.Client.Provider provider11 = builder2.clientProvider;
        retrofit.client.Client.Provider provider12 = builder2.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor13 = builder2.requestInterceptor;
        retrofit.RestAdapter.Builder builder14 = builder0.setRequestInterceptor(requestInterceptor13);
        java.util.concurrent.Executor executor15 = builder14.getcallbackExecutor();
        retrofit.converter.Converter converter16 = builder14.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = builder14.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(provider12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString9();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder14 = builder10.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        builder10.ensureSaneDefaults();
        retrofit.client.Client.Provider provider19 = builder10.clientProvider;
        builder9.clientProvider = provider19;
        builder0.setclientProvider(provider19);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder26 = builder22.setConverter((retrofit.converter.Converter) gsonConverter25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString9();
        builder22.serializedObjectSupporter = serializedObjectSupporter27;
        builder22.ensureSaneDefaults();
        retrofit.client.Client.Provider provider31 = builder22.clientProvider;
        retrofit.client.Client.Provider provider32 = builder22.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor33 = builder22.requestInterceptor;
        builder0.requestInterceptor = requestInterceptor33;
        retrofit.Profiler profiler35 = builder0.profiler;
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter38.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder40 = builder36.setConverter((retrofit.converter.Converter) gsonConverter39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        java.lang.String str42 = serializedObjectSupporter41.deserializeObjectString9();
        builder36.serializedObjectSupporter = serializedObjectSupporter41;
        builder36.ensureSaneDefaults();
        retrofit.client.Client.Provider provider45 = builder36.clientProvider;
        retrofit.client.Client.Provider provider46 = builder36.getclientProvider();
        retrofit.RestAdapter.Builder builder48 = builder36.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        java.lang.String str50 = serializedObjectSupporter49.deserializeObjectString9();
        java.lang.String str51 = serializedObjectSupporter49.deserializeObjectString5();
        retrofit.client.Response response52 = serializedObjectSupporter49.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter49.deserializeObjectConverter5();
        builder48.converter = gsonConverter53;
        retrofit.RestAdapter restAdapter55 = builder48.build();
        retrofit.RestAdapter.Log log56 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder57 = builder48.setLog(log56);
        retrofit.RestAdapter.Builder builder58 = builder0.setLog(log56);
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean60 = logLevel59.log();
        builder0.logLevel = logLevel59;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(provider19);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://example.com/" + "'", str28, "http://example.com/");
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNotNull(requestInterceptor33);
        org.junit.Assert.assertNull(profiler35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNotNull(provider46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(restAdapter55);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = builder0.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder7 = builder3.setConverter((retrofit.converter.Converter) gsonConverter6);
        retrofit.RestAdapter.Builder builder8 = builder0.setConverter((retrofit.converter.Converter) gsonConverter6);
        java.util.concurrent.Executor executor9 = builder8.getcallbackExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder1 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor2 = builder1.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder5 = builder1.setConverter((retrofit.converter.Converter) gsonConverter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString9();
        builder1.serializedObjectSupporter = serializedObjectSupporter6;
        builder1.ensureSaneDefaults();
        retrofit.client.Client.Provider provider10 = builder1.clientProvider;
        retrofit.client.Client.Provider provider11 = builder1.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor12 = builder1.requestInterceptor;
        retrofit.RestAdapter.Builder builder13 = builder0.setRequestInterceptor(requestInterceptor12);
        builder13.ensureSaneDefaults();
        java.util.concurrent.Executor executor15 = builder13.gethttpExecutor();
        builder13.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor2);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(requestInterceptor12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executor15);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int9 = response8.getStatus();
        int int10 = response8.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor2 = null;
        builder0.setcallbackExecutor(executor2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder10 = builder6.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString9();
        builder6.serializedObjectSupporter = serializedObjectSupporter11;
        builder6.ensureSaneDefaults();
        retrofit.client.Client.Provider provider15 = builder6.clientProvider;
        retrofit.client.Client.Provider provider16 = builder6.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor17 = builder6.requestInterceptor;
        retrofit.RestAdapter.Builder builder18 = builder5.setRequestInterceptor(requestInterceptor17);
        builder0.requestInterceptor = requestInterceptor17;
        java.util.concurrent.Executor executor20 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler21 = null;
        builder0.profiler = profiler21;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor24 = builder23.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter25.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder27 = builder23.setConverter((retrofit.converter.Converter) gsonConverter26);
        retrofit.RestAdapter.Builder builder29 = builder23.setServer("hi!");
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter32.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder34 = builder30.setConverter((retrofit.converter.Converter) gsonConverter33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString9();
        builder30.serializedObjectSupporter = serializedObjectSupporter35;
        builder30.ensureSaneDefaults();
        retrofit.client.Client.Provider provider39 = builder30.clientProvider;
        builder29.clientProvider = provider39;
        retrofit.Profiler profiler41 = builder29.profiler;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor43 = builder42.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter44.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder46 = builder42.setConverter((retrofit.converter.Converter) gsonConverter45);
        java.util.concurrent.Executor executor47 = null;
        builder42.setcallbackExecutor(executor47);
        retrofit.Server server49 = builder42.server;
        java.util.concurrent.Executor executor50 = null;
        builder42.httpExecutor = executor50;
        builder42.ensureSaneDefaults();
        retrofit.RestAdapter.Log log53 = builder42.log;
        log53.log("");
        builder29.log = log53;
        log53.log("hi!");
        log53.log("OK");
        retrofit.RestAdapter.Builder builder61 = builder0.setLog(log53);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertNotNull(provider39);
        org.junit.Assert.assertNull(profiler41);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(gsonConverter45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(server49);
        org.junit.Assert.assertNotNull(log53);
        org.junit.Assert.assertNotNull(builder61);
    }
}

