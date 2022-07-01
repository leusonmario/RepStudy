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
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder2 = builder0.setClient(provider1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Profiler profiler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder3.setProfiler(profiler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
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
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0, "Retrofit-Idle");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(server3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setRequestInterceptor(requestInterceptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        org.junit.Assert.assertNull(provider1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Log log4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setLog(log4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder0.setClient(client3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        java.util.concurrent.Executor executor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setExecutors(executor5, executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.Profiler profiler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder3.setProfiler(profiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.BASIC;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        int int4 = response2.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(typedInput3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("http://example.com/");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder2.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder6.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList5 = response4.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response7 = serializedObjectSupporter6.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput8 = response7.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response9 = new retrofit.client.Response((int) (short) 10, "hi!", headerList5, typedInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.Log log6 = builder2.log;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(log6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.Server server7 = builder6.server;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        retrofit.client.Client.Provider provider9 = null;
        builder6.setclientProvider(provider9);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.NONE;
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response4 = serializedObjectSupporter3.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter3.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput6 = response5.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response7 = new retrofit.client.Response((-1), "Retrofit-", headerList2, typedInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(typedInput6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList5 = response4.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response7 = serializedObjectSupporter6.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput8 = response7.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response9 = new retrofit.client.Response((int) ' ', "hi!", headerList5, typedInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse3();
        int int4 = response3.status;
        java.util.List<retrofit.client.Header> headerList5 = response3.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response7 = serializedObjectSupporter6.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput8 = response7.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response9 = new retrofit.client.Response((int) (byte) -1, "Retrofit-", headerList5, typedInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setExecutors(executor4, executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = builder6.gethttpExecutor();
        retrofit.client.Client.Provider provider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder6.setClient(provider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        boolean boolean12 = logLevel10.log();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter4();
        builder0.converter = gsonConverter4;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.Class<?> wildcardClass1 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.converter.Converter converter5 = builder3.converter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = null;
        builder6.setclientProvider(provider11);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        int int6 = response5.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder3.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.Class<?> wildcardClass2 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.client.Client.Provider provider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setClient(provider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder3.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.converter.Converter converter4 = builder0.converter;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int0 = retrofit.RestAdapter.LOG_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4000 + "'", int0 == 4000);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.Profiler profiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder2.setProfiler(profiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.client.Response response11 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder8.converter = gsonConverter13;
        retrofit.Profiler profiler15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder8.setProfiler(profiler15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter4();
        builder0.converter = gsonConverter4;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int2 = response1.status;
        java.util.List<retrofit.client.Header> headerList3 = response1.getHeaders();
        java.lang.String str4 = response1.getReason();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        java.util.concurrent.Executor executor7 = null;
        builder0.sethttpExecutor(executor7);
        retrofit.RestAdapter restAdapter9 = builder0.build();
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log10;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        builder0.ensureSaneDefaults();
        java.lang.Class<?> wildcardClass11 = builder0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str5 = response4.reason;
        retrofit.mime.TypedInput typedInput6 = response4.getBody();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
        org.junit.Assert.assertNull(typedInput6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int3 = response2.getStatus();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder2 = builder0.setClient(client1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.reason;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RequestInterceptor requestInterceptor9 = builder8.requestInterceptor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(errorHandler6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = null;
        builder0.clientProvider = provider1;
        java.util.concurrent.Executor executor3 = null;
        builder0.httpExecutor = executor3;
        retrofit.Server server5 = builder0.server;
        org.junit.Assert.assertNull(server5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        java.util.concurrent.Executor executor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setExecutors(executor5, executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.Server server8 = builder2.server;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(server8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.util.concurrent.Executor executor11 = null;
        builder0.httpExecutor = executor11;
        java.util.concurrent.Executor executor13 = null;
        builder0.sethttpExecutor(executor13);
        retrofit.client.Client client15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder0.setClient(client15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.util.List<retrofit.client.Header> headerList3 = response2.headers;
        java.lang.String str4 = response2.getReason();
        int int5 = response2.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OK" + "'", str4, "OK");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        log5.log("hi!");
        log5.log("");
        log5.log("");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter4();
        builder0.converter = gsonConverter4;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        java.util.concurrent.Executor executor8 = builder0.gethttpExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setClient(provider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        java.util.concurrent.Executor executor7 = null;
        builder0.sethttpExecutor(executor7);
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.client.Client.Provider provider4 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder8.setClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.RestAdapter.LogLevel logLevel9 = builder0.logLevel;
        retrofit.Profiler profiler10 = builder0.profiler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        int int6 = response5.status;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList4 = response3.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        retrofit.Profiler profiler10 = builder9.profiler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        retrofit.ErrorHandler errorHandler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder6.setErrorHandler(errorHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.util.List<retrofit.client.Header> headerList7 = response6.headers;
        int int8 = response6.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        retrofit.Server server3 = builder0.server;
        retrofit.client.Client.Provider provider4 = builder0.getclientProvider();
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput7 = response6.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response8 = new retrofit.client.Response(0, "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList3, typedInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(typedInput7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        retrofit.Server server9 = builder6.server;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response12 = serializedObjectSupporter11.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter6();
        builder6.converter = gsonConverter13;
        retrofit.client.Client client15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder6.setClient(client15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        boolean boolean6 = logLevel5.log();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        retrofit.client.Client.Provider provider11 = builder6.clientProvider;
        retrofit.client.Client.Provider provider12 = builder6.getclientProvider();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(requestInterceptor5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter4();
        retrofit.client.Response response12 = serializedObjectSupporter10.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter10.deserializeObjectConverter3();
        retrofit.client.Response response14 = serializedObjectSupporter10.deserializeObjectResponse4();
        retrofit.client.Response response15 = serializedObjectSupporter10.deserializeObjectResponse1();
        retrofit.mime.TypedInput typedInput16 = response15.getBody();
        retrofit.client.Response response17 = new retrofit.client.Response(200, "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedInput16);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response18 = new retrofit.client.Response((int) (byte) 1, "Internal Server Error", (java.util.List<retrofit.client.Header>) headerList3, typedInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(typedInput16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str6 = response5.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.Profiler profiler9 = null;
        builder8.profiler = profiler9;
        java.util.concurrent.Executor executor11 = null;
        builder8.setcallbackExecutor(executor11);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
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
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        retrofit.Profiler profiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder12 = builder6.setProfiler(profiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        java.util.concurrent.Executor executor12 = null;
        java.util.concurrent.Executor executor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder14 = builder0.setExecutors(executor12, executor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput4 = response3.body;
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response7 = serializedObjectSupporter6.deserializeObjectResponse3();
        int int8 = response7.status;
        java.util.List<retrofit.client.Header> headerList9 = response7.getHeaders();
        retrofit.mime.TypedInput typedInput10 = response7.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response11 = new retrofit.client.Response((int) (short) -1, "Internal Server Error", headerList5, typedInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(typedInput10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.Profiler profiler3 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder4 = builder2.setProfiler(profiler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        java.util.concurrent.Executor executor7 = null;
        builder0.sethttpExecutor(executor7);
        retrofit.RestAdapter restAdapter9 = builder0.build();
        retrofit.RestAdapter.Builder builder11 = builder0.setServer("hi!");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("Retrofit-Idle");
        log0.log("http://example.com/");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str4 = response3.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Internal Server Error" + "'", str4, "Internal Server Error");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(converter12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int2 = response1.status;
        java.util.List<retrofit.client.Header> headerList3 = response1.getHeaders();
        retrofit.mime.TypedInput typedInput4 = response1.getBody();
        int int5 = response1.status;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider9 = builder8.clientProvider;
        retrofit.RequestInterceptor requestInterceptor10 = builder8.requestInterceptor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(requestInterceptor10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
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
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        builder0.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder3.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(errorHandler3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider9 = builder8.getclientProvider();
        retrofit.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder8.setClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        int int7 = response6.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-");
        retrofit.ErrorHandler errorHandler11 = builder0.errorHandler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(errorHandler11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.Profiler profiler12 = builder0.profiler;
        retrofit.Profiler profiler13 = builder0.profiler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        java.util.concurrent.Executor executor10 = builder9.httpExecutor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput7 = response6.getBody();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(typedInput7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-");
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter1();
        builder0.serializedObjectSupporter = serializedObjectSupporter11;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-");
        retrofit.client.Client.Provider provider11 = builder0.getclientProvider();
        retrofit.client.Client.Provider provider12 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        retrofit.Profiler profiler11 = builder0.profiler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(profiler11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(server4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder5 = builder3.setServer("hi!");
        java.util.concurrent.Executor executor6 = builder3.getcallbackExecutor();
        retrofit.client.Client.Provider provider7 = builder3.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel8 = builder3.logLevel;
        builder2.logLevel = logLevel8;
        retrofit.converter.Converter converter10 = builder2.converter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(converter10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        retrofit.Server server10 = builder2.server;
        retrofit.RestAdapter.Log log11 = builder2.log;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNull(log11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder5 = builder3.setServer("hi!");
        java.util.concurrent.Executor executor6 = builder3.getcallbackExecutor();
        retrofit.client.Client.Provider provider7 = builder3.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel8 = builder3.logLevel;
        builder2.logLevel = logLevel8;
        java.util.concurrent.Executor executor10 = builder2.callbackExecutor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = null;
        builder6.callbackExecutor = executor10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder14 = builder12.setServer("hi!");
        retrofit.client.Client.Provider provider15 = builder12.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder20 = builder17.setConverter((retrofit.converter.Converter) gsonConverter19);
        retrofit.RestAdapter.LogLevel logLevel21 = builder17.logLevel;
        retrofit.RestAdapter.Builder builder23 = builder17.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor24 = null;
        builder23.setcallbackExecutor(executor24);
        builder23.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter27 = builder23.build();
        retrofit.ErrorHandler errorHandler28 = restAdapter27.errorHandler;
        retrofit.converter.Converter converter29 = restAdapter27.converter;
        retrofit.client.Client.Provider provider30 = restAdapter27.getclientProvider();
        builder12.setclientProvider(provider30);
        retrofit.RestAdapter.Builder builder32 = builder6.setClient(provider30);
        retrofit.converter.Converter converter33 = builder32.converter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(restAdapter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(converter29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(converter33);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput5 = response4.body;
        java.lang.String str6 = response4.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.RequestInterceptor requestInterceptor9 = builder0.requestInterceptor;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel11 = builder0.logLevel;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(requestInterceptor9);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter restAdapter12 = builder0.build();
        java.util.concurrent.Executor executor13 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(executor13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        retrofit.client.Client.Provider provider11 = builder6.clientProvider;
        builder6.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.ErrorHandler errorHandler3 = builder0.errorHandler;
        org.junit.Assert.assertNull(errorHandler3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput5 = response4.body;
        java.lang.String str6 = response4.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response12 = serializedObjectSupporter11.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter6();
        builder6.converter = gsonConverter13;
        retrofit.Server server15 = builder6.server;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(server15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.lang.Class<?> wildcardClass11 = builder0.getClass();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        retrofit.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.setclientProvider(provider5);
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        java.util.concurrent.Executor executor9 = builder8.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = builder8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder0.server;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse3();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse3();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter5.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler9;
        java.util.concurrent.Executor executor11 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.ErrorHandler errorHandler6 = builder2.errorHandler;
        java.util.concurrent.Executor executor7 = null;
        builder2.httpExecutor = executor7;
        retrofit.Profiler profiler9 = builder2.profiler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNull(profiler9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.RestAdapter.LogLevel logLevel3 = builder0.logLevel;
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.RequestInterceptor requestInterceptor11 = builder6.requestInterceptor;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder15 = builder12.setConverter((retrofit.converter.Converter) gsonConverter14);
        retrofit.RestAdapter.Builder builder16 = builder6.setConverter((retrofit.converter.Converter) gsonConverter14);
        java.util.concurrent.Executor executor17 = builder16.callbackExecutor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(requestInterceptor11);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(executor17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder2.logLevel;
        boolean boolean7 = logLevel6.log();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.RequestInterceptor requestInterceptor8 = builder3.requestInterceptor;
        retrofit.converter.Converter converter9 = builder3.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter4();
        retrofit.client.Response response12 = serializedObjectSupporter10.deserializeObjectResponse2();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString7();
        retrofit.client.Response response15 = serializedObjectSupporter10.deserializeObjectResponse7();
        retrofit.Server server16 = serializedObjectSupporter10.deserializeObjectServer1();
        builder3.serializedObjectSupporter = serializedObjectSupporter10;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = serializedObjectSupporter10.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(server16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.client.Client.Provider provider8 = builder3.clientProvider;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        java.util.concurrent.Executor executor7 = null;
        builder0.sethttpExecutor(executor7);
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder11 = builder9.setServer("hi!");
        java.util.concurrent.Executor executor12 = null;
        builder9.sethttpExecutor(executor12);
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        java.util.concurrent.Executor executor17 = builder14.getcallbackExecutor();
        retrofit.client.Client.Provider provider18 = builder14.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel19 = builder14.logLevel;
        builder9.logLevel = logLevel19;
        retrofit.RestAdapter.Builder builder21 = builder0.setLogLevel(logLevel19);
        retrofit.RequestInterceptor requestInterceptor22 = builder0.requestInterceptor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(requestInterceptor22);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.Server server12 = restAdapter10.server;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(converter15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder2.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder2.errorHandler;
        retrofit.ErrorHandler errorHandler8 = builder2.errorHandler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNull(errorHandler8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler7 = builder6.profiler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(profiler7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput8 = response7.body;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(typedInput8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = builder0.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertNull(requestInterceptor5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        java.util.concurrent.Executor executor10 = builder2.gethttpExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        int int4 = response2.status;
        retrofit.mime.TypedInput typedInput5 = response2.body;
        java.lang.String str6 = response2.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(typedInput3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNotNull(typedInput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        int int5 = response4.getStatus();
        java.util.List<retrofit.client.Header> headerList6 = response4.headers;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput5 = response4.body;
        retrofit.mime.TypedInput typedInput6 = response4.body;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(typedInput5);
        org.junit.Assert.assertNull(typedInput6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput8 = response7.body;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(typedInput8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder9 = builder6.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.RestAdapter.Builder builder10 = builder2.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.RestAdapter.Log log11 = builder10.log;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(log11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = builder6.gethttpExecutor();
        java.util.concurrent.Executor executor8 = builder6.getcallbackExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.mime.TypedInput typedInput5 = response4.getBody();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(typedInput5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.client.Client.Provider provider6 = builder2.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder2.logLevel;
        retrofit.RestAdapter restAdapter7 = builder2.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder0.server;
        java.util.concurrent.Executor executor5 = builder0.callbackExecutor;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        retrofit.converter.Converter converter4 = builder2.converter;
        retrofit.RequestInterceptor requestInterceptor5 = builder2.requestInterceptor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(requestInterceptor5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.Class class7 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNotNull(requestInterceptor13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.RestAdapter restAdapter11 = builder6.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter5();
        builder6.converter = gsonConverter16;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter11);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.Profiler profiler11 = null;
        builder6.profiler = profiler11;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder6.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        java.util.concurrent.Executor executor11 = builder6.callbackExecutor;
        builder6.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(executor11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor9 = builder0.httpExecutor;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        int int4 = response2.status;
        retrofit.mime.TypedInput typedInput5 = response2.body;
        int int6 = response2.getStatus();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(typedInput3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNotNull(typedInput5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-");
        retrofit.Server server11 = builder10.server;
        retrofit.RequestInterceptor requestInterceptor12 = builder10.requestInterceptor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNull(requestInterceptor12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder8 = builder5.setConverter((retrofit.converter.Converter) gsonConverter7);
        retrofit.RestAdapter.LogLevel logLevel9 = builder5.logLevel;
        retrofit.RestAdapter.Builder builder11 = builder5.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder11.serializedObjectSupporter;
        java.util.concurrent.Executor executor13 = null;
        builder11.setcallbackExecutor(executor13);
        java.util.concurrent.Executor executor15 = null;
        builder11.callbackExecutor = executor15;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder19 = builder17.setServer("hi!");
        retrofit.client.Client.Provider provider20 = builder17.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel21 = builder17.logLevel;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter23.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder25 = builder22.setConverter((retrofit.converter.Converter) gsonConverter24);
        retrofit.RestAdapter.LogLevel logLevel26 = builder22.logLevel;
        retrofit.RestAdapter.Builder builder28 = builder22.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor29 = null;
        builder28.setcallbackExecutor(executor29);
        builder28.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter32 = builder28.build();
        retrofit.ErrorHandler errorHandler33 = restAdapter32.errorHandler;
        retrofit.converter.Converter converter34 = restAdapter32.converter;
        retrofit.client.Client.Provider provider35 = restAdapter32.getclientProvider();
        builder17.setclientProvider(provider35);
        retrofit.RestAdapter.Builder builder37 = builder11.setClient(provider35);
        builder0.clientProvider = provider35;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(restAdapter32);
        org.junit.Assert.assertNotNull(errorHandler33);
        org.junit.Assert.assertNotNull(converter34);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder2.logLevel;
        retrofit.ErrorHandler errorHandler7 = builder2.errorHandler;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder11 = builder8.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.RestAdapter.LogLevel logLevel12 = builder8.logLevel;
        retrofit.RestAdapter.Builder builder14 = builder8.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor15 = null;
        builder14.setcallbackExecutor(executor15);
        builder14.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter18 = builder14.build();
        java.util.concurrent.Executor executor19 = builder14.callbackExecutor;
        builder2.sethttpExecutor(executor19);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(restAdapter18);
        org.junit.Assert.assertNotNull(executor19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.Server server7 = builder3.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder3.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int2 = response1.status;
        int int3 = response1.getStatus();
        retrofit.mime.TypedInput typedInput4 = response1.getBody();
        java.lang.Class<?> wildcardClass5 = typedInput4.getClass();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.RequestInterceptor requestInterceptor3 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str7 = response6.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        java.util.concurrent.Executor executor7 = null;
        builder0.sethttpExecutor(executor7);
        retrofit.RestAdapter restAdapter9 = builder0.build();
        java.util.concurrent.Executor executor10 = null;
        builder0.setcallbackExecutor(executor10);
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(requestInterceptor12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.ErrorHandler errorHandler6 = builder2.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel7 = retrofit.RestAdapter.LogLevel.FULL;
        boolean boolean8 = logLevel7.log();
        retrofit.RestAdapter.Builder builder9 = builder2.setLogLevel(logLevel7);
        retrofit.RestAdapter restAdapter10 = builder9.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(restAdapter10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.Server server3 = builder0.server;
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.setclientProvider(provider5);
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder11 = builder9.setServer("hi!");
        retrofit.client.Client.Provider provider12 = builder9.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel13 = builder9.logLevel;
        java.util.concurrent.Executor executor14 = builder9.httpExecutor;
        retrofit.converter.Converter converter15 = builder9.converter;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder19 = builder16.setConverter((retrofit.converter.Converter) gsonConverter18);
        retrofit.RestAdapter.LogLevel logLevel20 = builder16.logLevel;
        retrofit.RestAdapter.Builder builder22 = builder16.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor23 = null;
        builder22.setcallbackExecutor(executor23);
        builder22.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter26 = builder22.build();
        retrofit.ErrorHandler errorHandler27 = restAdapter26.errorHandler;
        builder9.errorHandler = errorHandler27;
        builder0.errorHandler = errorHandler27;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder32 = builder30.setServer("hi!");
        retrofit.client.Client.Provider provider33 = builder30.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel34 = builder30.logLevel;
        java.util.concurrent.Executor executor35 = builder30.httpExecutor;
        retrofit.converter.Converter converter36 = builder30.converter;
        java.util.concurrent.Executor executor37 = null;
        builder30.sethttpExecutor(executor37);
        retrofit.RestAdapter restAdapter39 = builder30.build();
        java.util.concurrent.Executor executor40 = restAdapter39.gethttpExecutor();
        builder0.setcallbackExecutor(executor40);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(restAdapter26);
        org.junit.Assert.assertNotNull(errorHandler27);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNull(converter36);
        org.junit.Assert.assertNotNull(restAdapter39);
        org.junit.Assert.assertNotNull(executor40);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList2 = response1.headers;
        retrofit.mime.TypedInput typedInput3 = response1.body;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertNotNull(typedInput3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str8 = response7.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OK" + "'", str8, "OK");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel8 = builder3.logLevel;
        java.util.concurrent.Executor executor9 = builder3.gethttpExecutor();
        java.util.concurrent.Executor executor10 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor11 = builder3.gethttpExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        java.util.concurrent.Executor executor6 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.RestAdapter restAdapter11 = builder6.build();
        retrofit.ErrorHandler errorHandler12 = restAdapter11.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter11.new RestHandler();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter11);
        org.junit.Assert.assertNotNull(errorHandler12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter4();
        builder0.converter = gsonConverter4;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("Internal Server Error");
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        java.util.concurrent.Executor executor8 = builder2.callbackExecutor;
        java.util.concurrent.Executor executor9 = builder2.getcallbackExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.util.List<retrofit.client.Header> headerList6 = response5.headers;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.Server server12 = restAdapter10.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput2 = response1.body;
        java.util.List<retrofit.client.Header> headerList3 = response1.headers;
        int int4 = response1.getStatus();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(typedInput2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider9 = builder0.clientProvider;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.RequestInterceptor requestInterceptor8 = builder3.requestInterceptor;
        retrofit.converter.Converter converter9 = builder3.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter4();
        retrofit.client.Response response12 = serializedObjectSupporter10.deserializeObjectResponse2();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString7();
        retrofit.client.Response response15 = serializedObjectSupporter10.deserializeObjectResponse7();
        retrofit.Server server16 = serializedObjectSupporter10.deserializeObjectServer1();
        builder3.serializedObjectSupporter = serializedObjectSupporter10;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = serializedObjectSupporter10.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(server16);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.Class<?> wildcardClass6 = response5.getClass();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter restAdapter12 = builder0.build();
        retrofit.converter.Converter converter13 = restAdapter12.converter;
        retrofit.Server server14 = restAdapter12.server;
        retrofit.client.Client.Provider provider15 = restAdapter12.getclientProvider();
        retrofit.Profiler profiler16 = restAdapter12.profiler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.RestAdapter.Log log9 = builder8.log;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(converter12);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter4();
        builder0.converter = gsonConverter4;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("Internal Server Error");
        retrofit.client.Client.Provider provider10 = builder9.getclientProvider();
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor7 = builder3.requestInterceptor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(requestInterceptor7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder2.gethttpExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter9 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder9 = builder6.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.RestAdapter.Builder builder10 = builder2.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.client.Client.Provider provider11 = null;
        builder10.clientProvider = provider11;
        retrofit.converter.Converter converter13 = builder10.converter;
        retrofit.ErrorHandler errorHandler14 = builder10.errorHandler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.geterrorHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNotNull(converter14);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.RequestInterceptor requestInterceptor8 = builder3.requestInterceptor;
        retrofit.converter.Converter converter9 = builder3.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter4();
        retrofit.client.Response response12 = serializedObjectSupporter10.deserializeObjectResponse2();
        retrofit.client.Response response13 = serializedObjectSupporter10.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter10.deserializeObjectConverter4();
        java.lang.String str15 = serializedObjectSupporter10.deserializeObjectString8();
        retrofit.ErrorHandler errorHandler16 = serializedObjectSupporter10.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder17 = builder3.setErrorHandler(errorHandler16);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter restAdapter12 = builder0.build();
        retrofit.converter.Converter converter13 = restAdapter12.converter;
        retrofit.Server server14 = restAdapter12.server;
        java.util.concurrent.Executor executor15 = restAdapter12.httpExecutor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertNotNull(executor15);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.util.concurrent.Executor executor11 = null;
        builder0.httpExecutor = executor11;
        retrofit.converter.Converter converter13 = builder0.converter;
        retrofit.client.Client.Provider provider14 = builder0.getclientProvider();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput2 = response1.body;
        java.util.List<retrofit.client.Header> headerList3 = response1.getHeaders();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(typedInput2);
        org.junit.Assert.assertNotNull(headerList3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.setclientProvider(provider5);
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        retrofit.client.Client.Provider provider11 = builder6.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.HEADERS;
        boolean boolean13 = logLevel12.log();
        boolean boolean14 = logLevel12.log();
        builder6.logLevel = logLevel12;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.client.Response response11 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder8.converter = gsonConverter13;
        retrofit.RestAdapter restAdapter15 = builder8.build();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(restAdapter15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder10 = builder7.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder13 = builder7.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor14 = null;
        builder13.setcallbackExecutor(executor14);
        builder13.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter17 = builder13.build();
        retrofit.ErrorHandler errorHandler18 = restAdapter17.errorHandler;
        builder0.errorHandler = errorHandler18;
        retrofit.RequestInterceptor requestInterceptor20 = builder0.requestInterceptor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter17);
        org.junit.Assert.assertNotNull(errorHandler18);
        org.junit.Assert.assertNull(requestInterceptor20);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        java.util.concurrent.Executor executor4 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider5 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder14 = builder11.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.RestAdapter.LogLevel logLevel15 = builder11.logLevel;
        boolean boolean16 = logLevel15.log();
        restAdapter10.logLevel = logLevel15;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder9 = builder6.setConverter((retrofit.converter.Converter) gsonConverter8);
        retrofit.RestAdapter.Builder builder10 = builder2.setConverter((retrofit.converter.Converter) gsonConverter8);
        java.util.concurrent.Executor executor11 = builder10.callbackExecutor;
        java.util.concurrent.Executor executor12 = builder10.httpExecutor;
        retrofit.RestAdapter.Builder builder14 = builder10.setServer("hi!");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = null;
        builder0.clientProvider = provider1;
        java.util.concurrent.Executor executor3 = builder0.gethttpExecutor();
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(errorHandler4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel8 = builder3.logLevel;
        java.util.concurrent.Executor executor9 = builder3.gethttpExecutor();
        retrofit.converter.Converter converter10 = builder3.converter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.client.Response response11 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder8.converter = gsonConverter13;
        java.util.concurrent.Executor executor15 = builder8.gethttpExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput4 = response3.body;
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response7 = serializedObjectSupporter6.deserializeObjectResponse3();
        retrofit.client.Response response8 = serializedObjectSupporter6.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput9 = response8.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response10 = new retrofit.client.Response((int) (byte) 10, "http://example.com/", headerList5, typedInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(typedInput9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput2 = response1.body;
        java.util.List<retrofit.client.Header> headerList3 = response1.headers;
        retrofit.mime.TypedInput typedInput4 = response1.body;
        retrofit.mime.TypedInput typedInput5 = response1.getBody();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(typedInput2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertNotNull(typedInput5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.converter.Converter converter11 = restAdapter10.converter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(converter11);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.client.Client.Provider provider11 = builder6.clientProvider;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder15 = builder12.setConverter((retrofit.converter.Converter) gsonConverter14);
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        retrofit.RestAdapter.Builder builder18 = builder12.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder20 = builder12.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder24 = builder21.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.RestAdapter.LogLevel logLevel25 = builder21.logLevel;
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        log26.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder29 = builder21.setLog(log26);
        log26.log("hi!");
        builder20.log = log26;
        builder6.log = log26;
        java.util.concurrent.Executor executor34 = builder6.callbackExecutor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(executor34);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.Server server12 = restAdapter10.server;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.geterrorHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(server12);
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.Server server7 = builder3.server;
        retrofit.Profiler profiler8 = null;
        builder3.profiler = profiler8;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(server7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.Server server5 = builder0.server;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(server5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.util.List<retrofit.client.Header> headerList5 = response4.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder11 = builder8.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.RestAdapter.LogLevel logLevel12 = builder8.logLevel;
        builder6.logLevel = logLevel12;
        retrofit.RestAdapter restAdapter14 = builder6.build();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter14);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        java.util.concurrent.Executor executor6 = builder3.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.client.Response response9 = serializedObjectSupporter7.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter3();
        retrofit.client.Response response11 = serializedObjectSupporter7.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter7.deserializeObjectConverter3();
        builder3.converter = gsonConverter12;
        retrofit.ErrorHandler errorHandler14 = builder3.errorHandler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse3();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse3();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter5.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler9;
        retrofit.RestAdapter.LogLevel logLevel11 = builder0.logLevel;
        retrofit.RestAdapter.Log log12 = builder0.log;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(log12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.client.Response response11 = serializedObjectSupporter9.deserializeObjectResponse2();
        retrofit.client.Response response12 = serializedObjectSupporter9.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter4();
        builder8.converter = gsonConverter13;
        retrofit.client.Client.Provider provider15 = builder8.clientProvider;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        retrofit.RestAdapter.Log log11 = builder6.log;
        retrofit.ErrorHandler errorHandler12 = builder6.errorHandler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNull(errorHandler12);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-");
        retrofit.client.Client.Provider provider11 = builder0.getclientProvider();
        retrofit.Profiler profiler12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setProfiler(profiler12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.ErrorHandler errorHandler1 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNotNull(errorHandler1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter6 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        builder2.ensureSaneDefaults();
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = builder6.gethttpExecutor();
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder11 = builder8.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.RestAdapter.LogLevel logLevel12 = builder8.logLevel;
        retrofit.RestAdapter.Builder builder14 = builder8.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder16 = builder8.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder20 = builder17.setConverter((retrofit.converter.Converter) gsonConverter19);
        retrofit.RestAdapter.LogLevel logLevel21 = builder17.logLevel;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        log22.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder25 = builder17.setLog(log22);
        log22.log("hi!");
        builder16.log = log22;
        builder6.log = log22;
        log22.log("");
        log22.log("OK");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.util.concurrent.Executor executor11 = null;
        builder0.httpExecutor = executor11;
        java.util.concurrent.Executor executor13 = null;
        builder0.sethttpExecutor(executor13);
        java.util.concurrent.Executor executor15 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor16 = builder0.gethttpExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        retrofit.RestAdapter.Log log10 = builder2.log;
        java.util.concurrent.Executor executor11 = builder2.httpExecutor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(log10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        retrofit.Profiler profiler6 = builder0.profiler;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(errorHandler5);
        org.junit.Assert.assertNull(profiler6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response6 = serializedObjectSupporter5.deserializeObjectResponse3();
        retrofit.client.Response response7 = serializedObjectSupporter5.deserializeObjectResponse3();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler9 = serializedObjectSupporter5.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler9;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response12 = serializedObjectSupporter11.deserializeObjectResponse3();
        retrofit.client.Response response13 = serializedObjectSupporter11.deserializeObjectResponse3();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString3();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString4();
        retrofit.client.Response response16 = serializedObjectSupporter11.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter11.deserializeObjectConverter6();
        builder0.converter = gsonConverter17;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(gsonConverter17);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response3 = serializedObjectSupporter2.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput4 = response3.body;
        java.util.List<retrofit.client.Header> headerList5 = response3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response7 = serializedObjectSupporter6.deserializeObjectResponse3();
        int int8 = response7.status;
        java.lang.String str9 = response7.reason;
        java.lang.String str10 = response7.getReason();
        retrofit.mime.TypedInput typedInput11 = response7.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response12 = new retrofit.client.Response((int) (byte) -1, "hi!", headerList5, typedInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(typedInput4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OK" + "'", str9, "OK");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OK" + "'", str10, "OK");
        org.junit.Assert.assertNotNull(typedInput11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = null;
        builder0.clientProvider = provider1;
        java.util.concurrent.Executor executor3 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor4 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        java.util.concurrent.Executor executor6 = builder3.gethttpExecutor();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder10 = builder7.setConverter((retrofit.converter.Converter) gsonConverter9);
        retrofit.RestAdapter.LogLevel logLevel11 = builder7.logLevel;
        retrofit.RestAdapter.Builder builder13 = builder7.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor14 = null;
        builder13.setcallbackExecutor(executor14);
        java.util.concurrent.Executor executor16 = null;
        builder13.callbackExecutor = executor16;
        retrofit.RestAdapter.LogLevel logLevel18 = builder13.logLevel;
        retrofit.RestAdapter.Builder builder19 = builder3.setLogLevel(logLevel18);
        boolean boolean20 = logLevel18.log();
        boolean boolean21 = logLevel18.log();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(errorHandler6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Log log5 = retrofit.RestAdapter.Log.NONE;
        log5.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log5);
        retrofit.client.Client.Provider provider9 = builder8.clientProvider;
        retrofit.client.Client.Provider provider10 = builder8.getclientProvider();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.RestAdapter restAdapter11 = builder6.build();
        retrofit.ErrorHandler errorHandler12 = restAdapter11.errorHandler;
        java.util.concurrent.Executor executor13 = restAdapter11.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter11.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter11.getLogLevel();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter11);
        org.junit.Assert.assertNotNull(errorHandler12);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        int int6 = response5.status;
        java.util.List<retrofit.client.Header> headerList7 = response5.getHeaders();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-" + "'", str6, "Retrofit-");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        java.util.concurrent.Executor executor11 = builder6.getcallbackExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.converter.Converter converter6 = builder0.converter;
        java.util.concurrent.Executor executor7 = null;
        builder0.sethttpExecutor(executor7);
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder11 = builder9.setServer("hi!");
        java.util.concurrent.Executor executor12 = null;
        builder9.sethttpExecutor(executor12);
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        java.util.concurrent.Executor executor17 = builder14.getcallbackExecutor();
        retrofit.client.Client.Provider provider18 = builder14.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel19 = builder14.logLevel;
        builder9.logLevel = logLevel19;
        retrofit.RestAdapter restAdapter21 = builder9.build();
        retrofit.converter.Converter converter22 = restAdapter21.converter;
        retrofit.Server server23 = restAdapter21.server;
        retrofit.client.Client.Provider provider24 = restAdapter21.getclientProvider();
        builder0.setclientProvider(provider24);
        retrofit.converter.Converter converter26 = builder0.converter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter21);
        org.junit.Assert.assertNotNull(converter22);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertNotNull(provider24);
        org.junit.Assert.assertNull(converter26);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-");
        retrofit.Server server11 = builder10.server;
        java.util.concurrent.Executor executor12 = builder10.getcallbackExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response9 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter restAdapter12 = builder0.build();
        retrofit.converter.Converter converter13 = restAdapter12.converter;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter12.requestInterceptor;
        java.util.concurrent.Executor executor15 = restAdapter12.httpExecutor;
        retrofit.client.Client.Provider provider16 = restAdapter12.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(executor15);
        org.junit.Assert.assertNotNull(provider16);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter4();
        retrofit.client.Response response4 = serializedObjectSupporter2.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter3();
        retrofit.client.Response response6 = serializedObjectSupporter2.deserializeObjectResponse4();
        java.util.List<retrofit.client.Header> headerList7 = response6.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.client.Response response10 = serializedObjectSupporter8.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput11 = response10.getBody();
        int int12 = response10.status;
        retrofit.mime.TypedInput typedInput13 = response10.body;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response14 = new retrofit.client.Response(0, "", headerList7, typedInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(typedInput11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(typedInput13);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.httpExecutor = executor8;
        retrofit.Profiler profiler10 = builder6.profiler;
        java.util.concurrent.Executor executor11 = builder6.getcallbackExecutor();
        retrofit.Profiler profiler12 = null;
        builder6.profiler = profiler12;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(profiler10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.sethttpExecutor(executor7);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class6 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        retrofit.Server server10 = builder2.server;
        retrofit.client.Client.Provider provider11 = builder2.getclientProvider();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str9 = response8.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OK" + "'", str9, "OK");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        retrofit.ErrorHandler errorHandler6 = builder2.errorHandler;
        java.util.concurrent.Executor executor7 = null;
        builder2.httpExecutor = executor7;
        retrofit.Profiler profiler9 = null;
        builder2.profiler = profiler9;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNull(errorHandler6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(errorHandler11);
        org.junit.Assert.assertNotNull(converter12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(executor15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        int int4 = response3.status;
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.mime.TypedInput typedInput4 = response3.body;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(typedInput4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.client.Client.Provider provider5 = null;
        builder0.setclientProvider(provider5);
        retrofit.client.Client.Provider provider7 = builder0.getclientProvider();
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor10 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor11 = builder0.httpExecutor;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.sethttpExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setErrorHandler(errorHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestInterceptor6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        java.util.concurrent.Executor executor9 = null;
        builder6.callbackExecutor = executor9;
        retrofit.Server server11 = builder6.server;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder14 = builder12.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor15 = builder14.requestInterceptor;
        java.util.concurrent.Executor executor16 = null;
        builder14.callbackExecutor = executor16;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter19.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder21 = builder18.setConverter((retrofit.converter.Converter) gsonConverter20);
        retrofit.RestAdapter.Builder builder22 = builder14.setConverter((retrofit.converter.Converter) gsonConverter20);
        retrofit.client.Client.Provider provider23 = null;
        builder22.clientProvider = provider23;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder28 = builder25.setConverter((retrofit.converter.Converter) gsonConverter27);
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        retrofit.RestAdapter.Builder builder31 = builder25.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor32 = null;
        builder31.setcallbackExecutor(executor32);
        builder31.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter35 = builder31.build();
        retrofit.ErrorHandler errorHandler36 = restAdapter35.errorHandler;
        retrofit.converter.Converter converter37 = restAdapter35.converter;
        retrofit.client.Client.Provider provider38 = restAdapter35.getclientProvider();
        builder22.setclientProvider(provider38);
        retrofit.RestAdapter.Builder builder40 = builder6.setClient(provider38);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter41.deserializeObjectConverter4();
        retrofit.client.Response response43 = serializedObjectSupporter41.deserializeObjectResponse2();
        retrofit.client.Response response44 = serializedObjectSupporter41.deserializeObjectResponse4();
        retrofit.RequestInterceptor requestInterceptor45 = serializedObjectSupporter41.deserializeObjectRequestInterceptor1();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter41.deserializeObjectConverter7();
        retrofit.RestAdapter.Builder builder47 = builder6.setConverter((retrofit.converter.Converter) gsonConverter46);
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter49.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder51 = builder48.setConverter((retrofit.converter.Converter) gsonConverter50);
        retrofit.RestAdapter.LogLevel logLevel52 = builder48.logLevel;
        retrofit.RestAdapter.Builder builder54 = builder48.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor55 = null;
        builder54.setcallbackExecutor(executor55);
        builder54.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter58 = builder54.build();
        java.util.concurrent.Executor executor59 = builder54.callbackExecutor;
        builder47.setcallbackExecutor(executor59);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(server11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(restAdapter35);
        org.junit.Assert.assertNotNull(errorHandler36);
        org.junit.Assert.assertNotNull(converter37);
        org.junit.Assert.assertNotNull(provider38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(requestInterceptor45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(restAdapter58);
        org.junit.Assert.assertNotNull(executor59);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.client.Response response8 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.mime.TypedInput typedInput7 = response6.getBody();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(typedInput7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor3 = null;
        builder0.sethttpExecutor(executor3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("hi!");
        java.util.concurrent.Executor executor8 = builder5.getcallbackExecutor();
        retrofit.client.Client.Provider provider9 = builder5.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel10 = builder5.logLevel;
        builder0.logLevel = logLevel10;
        retrofit.RestAdapter restAdapter12 = builder0.build();
        retrofit.converter.Converter converter13 = restAdapter12.converter;
        retrofit.Server server14 = restAdapter12.server;
        java.lang.String str15 = restAdapter12.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter12.getcallbackExecutor();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(executor16);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter3.deserializeObjectConverter4();
        builder0.converter = gsonConverter4;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("Internal Server Error");
        java.util.concurrent.Executor executor10 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder14 = builder11.setConverter((retrofit.converter.Converter) gsonConverter13);
        retrofit.RestAdapter.LogLevel logLevel15 = builder11.logLevel;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        log16.log("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder19 = builder11.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel20 = builder11.logLevel;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder24 = builder21.setConverter((retrofit.converter.Converter) gsonConverter23);
        retrofit.RestAdapter.LogLevel logLevel25 = builder21.logLevel;
        retrofit.RestAdapter.Builder builder27 = builder21.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor28 = null;
        builder27.setcallbackExecutor(executor28);
        java.util.concurrent.Executor executor30 = null;
        builder27.callbackExecutor = executor30;
        retrofit.Server server32 = builder27.server;
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder35 = builder33.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor36 = builder35.requestInterceptor;
        java.util.concurrent.Executor executor37 = null;
        builder35.callbackExecutor = executor37;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter40.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder42 = builder39.setConverter((retrofit.converter.Converter) gsonConverter41);
        retrofit.RestAdapter.Builder builder43 = builder35.setConverter((retrofit.converter.Converter) gsonConverter41);
        retrofit.client.Client.Provider provider44 = null;
        builder43.clientProvider = provider44;
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter47.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder49 = builder46.setConverter((retrofit.converter.Converter) gsonConverter48);
        retrofit.RestAdapter.LogLevel logLevel50 = builder46.logLevel;
        retrofit.RestAdapter.Builder builder52 = builder46.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor53 = null;
        builder52.setcallbackExecutor(executor53);
        builder52.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter56 = builder52.build();
        retrofit.ErrorHandler errorHandler57 = restAdapter56.errorHandler;
        retrofit.converter.Converter converter58 = restAdapter56.converter;
        retrofit.client.Client.Provider provider59 = restAdapter56.getclientProvider();
        builder43.setclientProvider(provider59);
        retrofit.RestAdapter.Builder builder61 = builder27.setClient(provider59);
        builder11.setclientProvider(provider59);
        builder0.setclientProvider(provider59);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor10);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(server32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(requestInterceptor36);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(gsonConverter48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(restAdapter56);
        org.junit.Assert.assertNotNull(errorHandler57);
        org.junit.Assert.assertNotNull(converter58);
        org.junit.Assert.assertNotNull(provider59);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.client.Response response10 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = null;
        builder0.setcallbackExecutor(executor1);
        java.util.concurrent.Executor executor3 = builder0.gethttpExecutor();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str7 = response6.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.client.Response response9 = serializedObjectSupporter7.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter3();
        retrofit.client.Response response11 = serializedObjectSupporter7.deserializeObjectResponse4();
        retrofit.client.Response response12 = serializedObjectSupporter7.deserializeObjectResponse1();
        retrofit.mime.TypedInput typedInput13 = response12.getBody();
        retrofit.client.Response response14 = new retrofit.client.Response(200, "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedInput13);
        java.util.List<retrofit.client.Header> headerList15 = response14.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response17 = serializedObjectSupporter16.deserializeObjectResponse3();
        int int18 = response17.status;
        java.lang.String str19 = response17.reason;
        java.lang.String str20 = response17.getReason();
        retrofit.mime.TypedInput typedInput21 = response17.getBody();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response22 = new retrofit.client.Response((int) ' ', "Internal Server Error", headerList15, typedInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid status code: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(typedInput13);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OK" + "'", str19, "OK");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OK" + "'", str20, "OK");
        org.junit.Assert.assertNotNull(typedInput21);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        java.util.concurrent.Executor executor6 = builder3.gethttpExecutor();
        builder3.ensureSaneDefaults();
        retrofit.converter.Converter converter8 = builder3.converter;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = null;
        builder6.callbackExecutor = executor10;
        retrofit.RestAdapter restAdapter12 = builder6.build();
        retrofit.Server server13 = builder6.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter4();
        retrofit.client.Response response16 = serializedObjectSupporter14.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter14.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter14.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder20 = builder6.setConverter((retrofit.converter.Converter) gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor7 = null;
        builder6.setcallbackExecutor(executor7);
        builder6.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter10 = builder6.build();
        retrofit.RestAdapter.LogLevel logLevel11 = builder6.logLevel;
        java.util.concurrent.Executor executor12 = builder6.gethttpExecutor();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(executor12);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        java.util.concurrent.Executor executor4 = null;
        builder2.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder2.httpExecutor = executor6;
        retrofit.RestAdapter.Builder builder9 = builder2.setServer("Retrofit-");
        retrofit.RestAdapter restAdapter10 = builder2.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(requestInterceptor3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(restAdapter10);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        java.util.concurrent.Executor executor6 = builder3.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter7.deserializeObjectConverter4();
        retrofit.client.Response response9 = serializedObjectSupporter7.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter3();
        retrofit.client.Response response11 = serializedObjectSupporter7.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter7.deserializeObjectConverter3();
        builder3.converter = gsonConverter12;
        retrofit.RestAdapter.Log log14 = builder3.log;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNull(log14);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider3 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        java.util.concurrent.Executor executor6 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        java.util.concurrent.Executor executor8 = null;
        builder0.httpExecutor = executor8;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.ErrorHandler errorHandler6 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(errorHandler6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.Server server4 = builder3.server;
        retrofit.client.Client.Provider provider5 = builder3.clientProvider;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.RestAdapter.Log log7 = builder3.log;
        retrofit.RequestInterceptor requestInterceptor8 = builder3.requestInterceptor;
        retrofit.converter.Converter converter9 = builder3.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter10.deserializeObjectConverter4();
        retrofit.client.Response response12 = serializedObjectSupporter10.deserializeObjectResponse2();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString7();
        retrofit.client.Response response15 = serializedObjectSupporter10.deserializeObjectResponse7();
        retrofit.Server server16 = serializedObjectSupporter10.deserializeObjectServer1();
        builder3.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.String str18 = serializedObjectSupporter10.deserializeObjectString3();
        java.lang.String str19 = serializedObjectSupporter10.deserializeObjectString1();
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(log7);
        org.junit.Assert.assertNull(requestInterceptor8);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        log0.log("Internal Server Error");
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler5 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter8 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter1.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder3 = builder0.setConverter((retrofit.converter.Converter) gsonConverter2);
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("Retrofit-Idle");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder6.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder6.setcallbackExecutor(executor8);
        java.util.concurrent.Executor executor10 = null;
        builder6.callbackExecutor = executor10;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder14 = builder12.setServer("hi!");
        retrofit.client.Client.Provider provider15 = builder12.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder20 = builder17.setConverter((retrofit.converter.Converter) gsonConverter19);
        retrofit.RestAdapter.LogLevel logLevel21 = builder17.logLevel;
        retrofit.RestAdapter.Builder builder23 = builder17.setServer("Retrofit-Idle");
        java.util.concurrent.Executor executor24 = null;
        builder23.setcallbackExecutor(executor24);
        builder23.ensureSaneDefaults();
        retrofit.RestAdapter restAdapter27 = builder23.build();
        retrofit.ErrorHandler errorHandler28 = restAdapter27.errorHandler;
        retrofit.converter.Converter converter29 = restAdapter27.converter;
        retrofit.client.Client.Provider provider30 = restAdapter27.getclientProvider();
        builder12.setclientProvider(provider30);
        retrofit.RestAdapter.Builder builder32 = builder6.setClient(provider30);
        retrofit.Profiler profiler33 = builder6.profiler;
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(restAdapter27);
        org.junit.Assert.assertNotNull(errorHandler28);
        org.junit.Assert.assertNotNull(converter29);
        org.junit.Assert.assertNotNull(provider30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(profiler33);
    }
}

